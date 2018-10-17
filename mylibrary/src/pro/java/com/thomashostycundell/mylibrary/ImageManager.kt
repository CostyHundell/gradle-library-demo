package com.thomashostycundell.mylibrary

import android.content.Context
import android.graphics.drawable.Drawable
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView

class ImageManager {
    var context: Context? = null

    fun init(context: Context) {
        Fresco.initialize(context)
        this.context = context
    }

    fun getImage(urlString: String): Drawable? {
        val im = SimpleDraweeView(context!!)
        im.setImageURI(urlString)
        return im.drawable
    }
}