package com.example.helloworld

import android.content.Context
import android.widget.Toast

/**
 * Created by jintoga on 05/01/2018.
 */
object HelloWorld {
    fun show(context: Context) {
        Toast.makeText(context, "Hello World!", Toast.LENGTH_LONG).show()
    }
}