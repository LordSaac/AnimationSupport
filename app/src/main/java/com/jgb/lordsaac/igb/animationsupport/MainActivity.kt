package com.jgb.lordsaac.igb.animationsupport


import android.os.Bundle

import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

import com.jgb.lordsaac.igb.supportanimation.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var img = findViewById(R.id.imageView)
    }

    fun clickButton (v: View){
        // Add textView for effect vibrate

        // AnimationTextView.animateVibrationTV(tv_hello,this)
       // AnimationTextView.animateVibrationTV(tv_hello2,this)
    }


    fun clickButton2(v: View){
        // Add view for effect out
       // AnimationView.animationOut(content_view,this)
    }
}
