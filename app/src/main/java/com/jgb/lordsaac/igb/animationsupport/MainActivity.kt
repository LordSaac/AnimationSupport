package com.jgb.lordsaac.igb.animationsupport


import android.os.Bundle

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.jgb.lordsaac.igb.supportanimation.*
import com.jgb.lordsaac.igb.supportanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //in onCreate() replace setContentView() with:

    }

    fun clickButton (v: View){
        // Add textView for effect vibrate
        val recycler_view =  findViewById(R.id.tv_hello) as TextView
        AnimationTextView.animateVibrationTV(recycler_view,this)
        AnimationTextView.animateVibrationTV(recycler_view,this)
    }


    fun clickButton2(v: View){
        val recycler_view =  findViewById(R.id.tv_hello) as TextView
        // Add view for effect out
        AnimationView.animationOut(recycler_view,this)
    }
}
