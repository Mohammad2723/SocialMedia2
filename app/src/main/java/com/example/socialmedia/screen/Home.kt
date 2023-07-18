package com.example.socialmedia.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.socialmedia.ui.theme.MyFont

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
          
        Text(text = "Home" , fontFamily = MyFont.settikef, fontSize = 30.sp)
        
        
    }


}