package com.example.socialmedia.model

import com.example.socialmedia.R

data class User(val username:String , val profilePic:Int , val story:Int , val post:Int ){
    companion object{
        val fakeData = listOf(
            User(username = "ebrahimi2723", profilePic = R.drawable.profile1, story = R.drawable.story1, post = R.drawable.post1),
            User(username = "sunFlower", profilePic = R.drawable.profile2, story = R.drawable.story2, post = R.drawable.post2),
            User(username = "ysn-ebr", profilePic = R.drawable.profile3, story = R.drawable.story3, post = R.drawable.post3),
            User(username = "mhd", profilePic = R.drawable.profile4, story = R.drawable.story4, post = R.drawable.post4),
            User(username = "zhr", profilePic = R.drawable.profile5, story = R.drawable.story5, post = R.drawable.post5),
            User(username = "m-r", profilePic = R.drawable.profile6, story = R.drawable.story6, post = R.drawable.post6),
            User(username = "ha__bib", profilePic = R.drawable.profile7, story = R.drawable.story7, post = R.drawable.post7),
            User(username = "Razi", profilePic = R.drawable.profile8, story = R.drawable.story8, post = R.drawable.post8),
            User(username = "mohammad", profilePic = R.drawable.profile9, story = R.drawable.story9, post = R.drawable.post9),
            User(username = "lila", profilePic = R.drawable.profile10, story = R.drawable.story10, post = R.drawable.post10)
        )
    }
}