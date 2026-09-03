package org.aide.workspace.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.aide.workspace.compose.runtime.CompanionBridge

/**
 * Bones only — not the shipping Ultra UI / agent.
 * Official app: releases/frankenstein-ultra.apk
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bridge = CompanionBridge(this)
        setContent {
            Text(
                text = "Frankenstein bones\nCompanion: ${bridge.statusLine()}",
                modifier = Modifier.padding(24.dp),
            )
        }
    }
}
