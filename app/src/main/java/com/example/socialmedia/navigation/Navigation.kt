package com.example.socialmedia.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.socialmedia.R
import com.example.socialmedia.ui.theme.MyFont

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = RouteScreen.Home.name) {

        //home
        composable(route = RouteScreen.Home.name) {

        }

        //reels
        composable(route = RouteScreen.Reels.name) {

        }

        //search
        composable(route = RouteScreen.Search.name) {

        }

        //show story
        composable(route = RouteScreen.ShowStory.name) {

        }


    }


    Scaffold(topBar = { TopBar()}, bottomBar = { MyBottomBar(navController = navController) }) {

    }


}


@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(text = "Social Media", fontFamily = MyFont.settikef)
         SendIcon()

    }
}


@Composable
fun MyBottomBar(navController: NavController) {

    val bottomNavItems = listOf(
        BottomNavItems(
            name = "Home",
            route = RouteScreen.Home.name,
            icon = R.drawable.round_home_24
        ),
        BottomNavItems(
            name = "Reels",
            route = RouteScreen.Reels.name,
            icon = R.drawable.round_image_search_24,
        ),
        BottomNavItems(
            name = "Search",
            route = RouteScreen.Search.name,
            icon = R.drawable.round_search_24,
        ),
    )

    NavigationBar() {
        val backStackEntry = navController.currentBackStackEntryAsState()


        bottomNavItems.forEach() { item ->
            val selected = item.route == backStackEntry.value?.destination?.route

            NavigationBarItem(
                selected = selected,
                onClick = { navController.navigate(item.route) },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = ""
                    )
                },
                label = { Text(text = item.name) })


        }
    }


}

@Preview
@Composable
fun SendIcon() {

    Box(modifier = Modifier.size(40.dp)) {
        Icon(
            modifier= Modifier.rotate(-25F),
            imageVector = Icons.Rounded.Send,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.primary
        )
        Surface(
            modifier = Modifier
                .size(15.dp)
                .offset(x = 8.dp, y = 13.dp),
            color = MaterialTheme.colorScheme.error,
            shape = CircleShape
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                  Text(text = "3", fontSize = 10.sp)

            }
        }
    }


}