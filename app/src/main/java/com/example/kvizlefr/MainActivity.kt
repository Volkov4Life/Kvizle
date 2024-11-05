package com.example.kvizlefr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kvizlefr.ui.theme.KvizleFrTheme
import android.util.Log


//NOVI TAG DEFINIRAN, lahko filtriramo pr logganju s tem
private const val TAG = "MyActivity"


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "on Create called")
        enableEdgeToEdge()
        setContent {
            KvizleFrTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }


    //Te override fje najds zgori code -> override methods, in jih naspammas
    //Basically ce uporabljas app, ce ga zapres, ce ga resumas etc
    //Basically statemanager, hranis stanje uporabnika, tle pridejo ViewModel, UIState in StateFlow
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "On Start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "On Resume called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "On Restart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "On Destroy called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "On Stop called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KvizleFrTheme {
        Greeting("Prvi test")
    }
}