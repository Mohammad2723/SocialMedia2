package com.example.socialmedia.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.socialmedia.model.User

@Composable
fun StorySection(users: List<User>) {

    LazyRow() {
        items(items = users) { user ->
            Story(user = user)
        }
    }

}


@Composable
fun Story(user: User) {
    Surface(
        modifier = Modifier
            .width(45.dp)
            .height(70.dp)
            .padding(3.dp)
            .border(width = 1.dp, color = Color(0xffD65DB1), shape = RoundedCornerShape(10.dp)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = user.profilePic),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
    }
}