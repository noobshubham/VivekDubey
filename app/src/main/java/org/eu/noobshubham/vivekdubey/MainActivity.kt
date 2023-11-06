package org.eu.noobshubham.vivekdubey

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iconImageView = findViewById<ImageView>(R.id.iconImageView)

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val intent = Intent(applicationContext, WidgetUpdateReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(applicationContext, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        val interval = 30 * 60 * 1000 // 30 minutes in milliseconds
        val triggerAtMillis = SystemClock.elapsedRealtime() + interval

        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME, triggerAtMillis, interval.toLong(), pendingIntent)

        iconImageView.setOnClickListener {
            val destinationUrl = "https://internshala.com/internship/detail/android-app-development-work-from-home-job-internship-at-vivek-dubey1698335192" // Replace with the actual URL from your data
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(destinationUrl))
            this.startActivity(intent)
        }

    }
}