package com.example.kisaansaathi

import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Home() {
    val videoUri = Uri.parse("android.resource://com.example.kisaansaathi/raw/video")
    Column {
    Spacer(modifier = Modifier.height(70.dp))
        VideoPlayer(videoUri =videoUri)
        HomeDataCard()
    }
}

