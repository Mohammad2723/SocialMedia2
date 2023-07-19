package com.example.socialmedia.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.socialmedia.model.User
import com.example.socialmedia.ui.theme.MyFont
import com.example.socialmedia.widgets.PostSection
import com.example.socialmedia.widgets.Story
import com.example.socialmedia.widgets.StorySection
import com.example.socialmedia.widgets.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {

Scaffold(topBar = { TopBar()}, modifier = Modifier.padding(bottom = 85.dp)) {
Column(modifier = Modifier.fillMaxSize()) {
    val users = User.fakeData
    Spacer(modifier = Modifier.height(45.dp))
    StorySection(users =users )
    Spacer(modifier = Modifier.height(5.dp))
    PostSection()
}


}


}