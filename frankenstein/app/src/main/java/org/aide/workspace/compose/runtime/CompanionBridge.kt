package org.aide.workspace.compose.runtime

import android.content.Context

/**
 * Outline only. Talking to the real companion is your problem to solve
 * (service discovery, permissions, AIDL contract drift, signing, …).
 *
 * Official companion APK: releases/companion-runtime.apk
 */
class CompanionBridge(private val context: Context) {
    fun statusLine(): String {
        // Intentionally incomplete — no bind implementation shipped in bones.
        return "not connected (bones)"
    }
}
