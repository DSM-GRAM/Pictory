package com.gram.pictory.Activity

import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_post_next.*
import kotlinx.android.synthetic.main.snippet_top_postbar.*
import org.jetbrains.anko.imageBitmap
import org.jetbrains.anko.imageURI


class PostNextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.gram.pictory.R.layout.activity_post_next)

        postEditText.setHorizontallyScrolling(false)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)


        val path = intent.getStringExtra("path")
        if (path.contains("noPath")) imageView2.setImageResource(com.gram.pictory.R.drawable.ic_launcher_background)
        else imageView2.imageURI = Uri.parse(path)

        imageView2.imageBitmap = (imageView2.drawable as BitmapDrawable).bitmap

        tvPost.setOnClickListener {
            finish()
        }
    }

}
