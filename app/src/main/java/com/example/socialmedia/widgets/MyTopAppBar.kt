package com.example.socialmedia.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmedia.ui.theme.MyFont

@Preview
@Composable
fun TopBar() {
    Row(
        modifier = Modifier.padding(top = 10.dp)
            .fillMaxWidth()
            .height(45.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(text = "Social Media", fontFamily = MyFont.settikef, fontSize = 25.sp)
        SendIcon()

    }
}
@Preview
@Composable
fun SendIcon() {

    Box(modifier = Modifier.size(45.dp)) {
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