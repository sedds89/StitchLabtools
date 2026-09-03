package org.aide.runtimepack.core

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Bones only — not the shipping Victor service.
 * Official APK: releases/companion-runtime.apk
 */
class PackService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        // Incomplete on purpose. Wire AIDL / permissions yourself if you insist.
        return null
    }
}
