package com.example.youtubeplayer

import academy.learnprogramming.youtubeplayer.StandaloneActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity(): AppCompatActivity(), OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnplaysingle.setOnClickListener(this)
        btnstanalone.setOnClickListener(this)
    }
    override fun onClick(View: View?) {
       val intent= when(View?.id){
           R.id.btnplaysingle-> Intent(this, YoutubeActivity::class.java)
           R.id.btnstanalone-> Intent(this,StandaloneActivity::class.java)
           else-> throw java.lang.IllegalArgumentException("Undified click button")
       }
        startActivity(intent)
    }

}