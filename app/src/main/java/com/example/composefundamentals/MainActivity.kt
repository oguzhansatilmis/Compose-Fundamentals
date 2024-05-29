package com.example.composefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.composefundamentals.ui.theme.state.DialogScreen
import com.example.composefundamentals.ui.theme.state.ScaffoldExample
import com.example.composefundamentals.ui.theme.state.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier
            ) {

                DialogScreen()
            }
        }
    }
}





