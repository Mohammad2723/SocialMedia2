package com.example.socialmedia.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialmedia.screen.Add
import com.example.socialmedia.screen.Home
import com.example.socialmedia.screen.Profile
import com.example.socialmedia.screen.Reels
import com.example.socialmedia.screen.Search
import com.example.socialmedia.widgets.MyBottomBar
import com.example.socialmedia.widgets.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()


    Scaffold( bottomBar = { MyBottomBar(navController = navController) }) {
        NavHost(navController = navController, startDestination = RouteScreen.Home.name) {

            //home
            composable(route = RouteScreen.Home.name) {
                Home(navController = navController)
            }

            //reels
            composable(route = RouteScreen.Reels.name) {
                Reels(navController = navController)
            }

            //search
            composable(route = RouteScreen.Search.name) {
                Search(navController = navController)

            }

            //show story
            composable(route = RouteScreen.ShowStory.name) {

            }


            //profile
            composable(route = RouteScreen.Profile.name) {
                Profile(navController = navController)
            }

            //Add
            composable(route = RouteScreen.Add.name) {
              Add(navController = navController)
            }


        }
    }

}





