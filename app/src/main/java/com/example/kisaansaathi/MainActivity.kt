@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class
)

package com.example.kisaansaathi

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kisaansaathi.ui.theme.KisaanSaathiTheme
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            KisaanSaathiTheme {
                // A surface container using the 'background' color from the theme
                Box(
//                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
//                    color = MaterialTheme.colorScheme.background
                ) {
                    KissanSaathi()
                }
            }
        }
    }
}


@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun KissanSaathi(){
    Frontend()
}

@Preview(showBackground = true)
@Composable
fun KisaanSaathiTheme(){
    KissanSaathi()
}



