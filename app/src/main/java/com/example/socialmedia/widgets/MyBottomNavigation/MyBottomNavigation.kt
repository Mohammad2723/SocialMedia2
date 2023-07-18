package com.example.socialmedia.widgets.MyBottomNavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.socialmedia.R
import com.example.socialmedia.navigation.BottomNavItems
import com.example.socialmedia.navigation.RouteScreen


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
        BottomNavItems(
            name = "Profile",
            route = RouteScreen.Profile.name,
            icon = R.drawable.round_person_24
        ),
        BottomNavItems(
            name = "Add",
            route = RouteScreen.Add.name,
            icon = R.drawable.round_add_24
        )
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