package com.example.tucita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tucita.navegacion.NavWrapper
import com.example.tucita.ui.theme.TuCitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TuCitaTheme(dynamicColor = true) {
                NavWrapper()
            }
        }
    }
}
