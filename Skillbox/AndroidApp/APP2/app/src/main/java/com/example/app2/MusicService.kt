package com.example.app2

import android.content.Intent
import android.os.IBinder
import android.app.Service

class MusicService: Service() {
    override fun onBind(p0: Intent?):IBinder? {
        return null
    }
}