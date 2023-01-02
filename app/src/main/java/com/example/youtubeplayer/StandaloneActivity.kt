package academy.learnprogramming.youtubeplayer

import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubeplayer.R
import com.example.youtubeplayer.YOUTUBE_PLAYLIST
import com.example.youtubeplayer.YOUTUBE_VIDEO_ID
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_standalone.*

class StandaloneActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standalone)

       btnplayvideo.setOnClickListener(this)
        btnplaylist.setOnClickListener(this)

//        btnPlayVideo.setOnClickListener(object :  View.OnClickListener {
//            override fun onClick(p0: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        })
//        btnPlayVideo.setOnClickListener(View.OnClickListener { v ->
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        })

//        val listener = View.OnClickListener { v ->
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//        btnPlayVideo.setOnClickListener(listener)
//        btnPlaylist.setOnClickListener(listener)
    }

    override fun onClick(view: View) {
        val intent = when (view.id) {
            R.id.btnplayvideo -> YouTubeStandalonePlayer.createVideoIntent(
                    this, getString(R.string.GOOGLE_API_KEY), YOUTUBE_VIDEO_ID)
            R.id.btnplaylist -> YouTubeStandalonePlayer.createPlaylistIntent(
                    this, getString(R.string.GOOGLE_API_KEY), YOUTUBE_PLAYLIST)
            else -> throw IllegalArgumentException("Undefined button clicked")
        }
        startActivity(intent)
    }
}