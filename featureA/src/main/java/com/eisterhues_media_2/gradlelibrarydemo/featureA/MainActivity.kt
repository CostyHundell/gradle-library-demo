package com.eisterhues_media_2.gradlelibrarydemo.featureA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.eisterhues_media_2.mylibrary.ImageManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageLibrary = ImageManager()
        imageLibrary.init(this)

        main_layout.background = imageLibrary.getImage(Constant.URL)
                ?: resources.getDrawable(R.drawable.android_cake, null)
    }
}
