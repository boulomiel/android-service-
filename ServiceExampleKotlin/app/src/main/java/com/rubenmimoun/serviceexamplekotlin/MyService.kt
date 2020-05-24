package com.rubenmimoun.serviceexamplekotlin

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

class MyService : Service() {

    private var mp : MediaPlayer? = null

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        Toast.makeText(this, "service created", Toast.LENGTH_SHORT).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI)
        mp!!.isLooping = true
        mp!!.start()
        Toast.makeText(this, "service started", Toast.LENGTH_SHORT).show()

        return START_STICKY
    }


    override fun onDestroy() {
        Toast.makeText(this, "service stopped", Toast.LENGTH_SHORT).show()

        mp!!.stop()
    }

}
