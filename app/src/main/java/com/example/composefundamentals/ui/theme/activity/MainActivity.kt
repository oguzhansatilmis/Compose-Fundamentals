package com.example.composefundamentals.ui.theme.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.composefundamentals.ui.theme.demo.instagram.InstagramUi
import com.example.composefundamentals.ui.theme.demo.twitter.ProfileInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier
            ) {
                ProfileInfo("asd","asd","qasd")
                ProfileInfo("asd123","asd","qasd")
                ProfileInfo("asd123","asd","qasd")
                ProfileInfo("asd123","asd","qasd")
                ProfileInfo("asd123","asd","qasd")
            }
        }
    }
}

private fun deneme3(){
    println("asdasdsa")
}
private fun deneme5(){
    println("qweqwewqewqewq")
}





