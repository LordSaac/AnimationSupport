package com.jgb.lordsaac.igb.animationsupport

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jgb.lordsaac.igb.supportanimation.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun clickButton (v: View){
        // Add textView for effect vibrate
       AnimationTextView.animateVibrationTV(tv_hello,this)
        AnimationTextView.animateVibrationTV(tv_hello2,this)
    }


    fun clickButton2(v: View){
        // Add view for effect out
       AnimationView.animationOut(content_view,this)
    }
}
