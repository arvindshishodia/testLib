package com.library.sizedp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.library.sizedp.ui.theme.FirstLibraryProjectTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstLibraryProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting1("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, modifier: Modifier = Modifier) {
    val mContext = LocalContext.current
    val pix:Float= mContext.resources.getDimension(com.intuit.sdp.R.dimen._32sdp)
    Text(
        text = "Hello Splash library$name! "+pix,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    FirstLibraryProjectTheme {
        Greeting("Android")
    }
}