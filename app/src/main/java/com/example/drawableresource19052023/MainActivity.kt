package com.example.drawableresource19052023

import android.graphics.drawable.ClipDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var buttonClip: Button? = null
    private var imgClip: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClip = findViewById(R.id.button_clip)
        imgClip = findViewById(R.id.image_view_clip)

        buttonClip?.setOnClickListener {
            val drawable: ClipDrawable? = imgClip?.drawable as? ClipDrawable
            if (drawable != null) {
                drawable.level = drawable.level + 200
            }
        }
    }
}