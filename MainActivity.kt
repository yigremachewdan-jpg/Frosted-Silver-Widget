package com.d.frostedsilver

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val info = TextView(this).apply {
            text = "Frosted Silver Widget\n\nAdd the widget from your home screen:\nLong-press home screen → Widgets → Frosted Silver Widget.\n\nDefault weather location: Addis Ababa.\n\nThis starter build provides the visual layout. Live weather and media-session controls are the next integration step."
            textSize = 18f
            setPadding(32, 48, 32, 48)
        }
        setContentView(info)
    }
}
