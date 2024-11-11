package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.target.ImageViewTarget

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        val imageView: ImageView = findViewById(R.id.imageView)

        Glide.with(this)
            .asGif()
            .load(R.drawable.filledeyelogo)
            .into(object : ImageViewTarget<GifDrawable>(imageView) {
                override fun setResource(resource: GifDrawable?) {
                    resource?.let {
                        it.setLoopCount(1)
                        it.start()

                        it.registerAnimationCallback(object : Animatable2Compat.AnimationCallback() {
                            override fun onAnimationEnd(drawable: android.graphics.drawable.Drawable?) {
                                val intent = Intent(this@LogoActivity, Main0Activity::class.java)
                                startActivity(intent)
                                finish()
                            }
                        })
                    }
                    imageView.setImageDrawable(resource)
                }
            })
    }
}