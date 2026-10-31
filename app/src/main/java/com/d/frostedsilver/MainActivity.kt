package com.d.frostedsilver

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val info = TextView(this).apply {
            text = "Frosted Silver Widget\n\n" +
                "Long-press your home screen → Widgets → " +
                "Frosted Silver Widget.\n\n" +
                "Default weather location: Addis Ababa.\n\n" +
                "Live weather and music controls are not " +
                "implemented in this prototype yet."
            textSize = 18f
            setPadding(32, 48, 32, 48)
        }

        setContentView(info)
    }
}
