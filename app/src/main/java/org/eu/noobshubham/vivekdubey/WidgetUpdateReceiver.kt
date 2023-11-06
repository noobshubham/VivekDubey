package org.eu.noobshubham.vivekdubey

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class WidgetUpdateReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // Handle the alarm and update the widget's data here
        if (context != null) {
            // Perform actions like refreshing widget data
            // You can update the widget data and UI in response to this alarm
        }
    }
}
