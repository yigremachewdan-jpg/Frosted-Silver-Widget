package com.d.frostedsilver

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class FrostedWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        manager: AppWidgetManager,
        ids: IntArray
    ) {
        val now = Date()
        val clockFormat = SimpleDateFormat("h:mm", Locale.getDefault())
        val dateFormat = SimpleDateFormat("EEE, MMM d", Locale.getDefault())

        ids.forEach { id ->
            val views = RemoteViews(
                context.packageName,
                R.layout.widget_frosted
            )
            views.setTextViewText(R.id.clock, clockFormat.format(now))
            views.setTextViewText(R.id.date, dateFormat.format(now))
            manager.updateAppWidget(id, views)
        }
    }
}
