package com.example.socialmedia.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = RouteScreen.Home.name ){

        //home
        composable(route = RouteScreen.Home.name  ){

        }

        //reels
        composable(route = RouteScreen.Reels.name   ){

        }

        //search
        composable(route = RouteScreen.Search.name  ){

        }

        //show story
        composable(route = RouteScreen.ShowStory.name ){

        }


    }
    
    
    Scaffold(bottomBar = {}) {
        
    }



}


@Composable
fun MyBottomBar(navController: NavController){


    BottomAppBar() {



    }

}