package com.example.kisaansaathi

sealed class Screens (val screen:String){
    data object Home:Screens("home")
    data object Notification:Screens("notification")
    data object Profile:Screens("profile")
    data object Settings:Screens("settings")
    data object Search:Screens("search")
    data object Posts:Screens("posts")
}