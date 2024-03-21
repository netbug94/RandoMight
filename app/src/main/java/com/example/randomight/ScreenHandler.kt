package com.example.randomight

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.platform.LocalConfiguration
import com.example.randomight.view.MainScreenH
import com.example.randomight.view.MainScreenV

object ScreenHandler {
    @Composable
    fun ScreenChange() {
        var orientation by remember { mutableIntStateOf(Configuration.ORIENTATION_PORTRAIT) }
        val configuration = LocalConfiguration.current

        LaunchedEffect(configuration) {
            snapshotFlow { configuration.orientation }
                .collect { orientation = it }
        }
        when (orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                MainScreenH()
            }
            else -> {
                MainScreenV()
            }
        }
    }
}