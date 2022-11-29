package com.example.onboardingcompose.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")
    object ug1 : Screen(route = "ug1")
    object pg1 : Screen(route = "pg1")
    object ph1 : Screen(route = "ph1")
    object hm2 : Screen(route = "ph1")
    object Navscreen :Screen(route = "nav1")
    object commerce:Screen(route = "comblock")
    object it:Screen(route = "it")
    object mba:Screen(route = "mba")
    object lib:Screen(route = "lib")
    object bio:Screen(route = "bio")
    object science:Screen(route = "science")
    object result:Screen(route = "result")
    object notification:Screen(route = "notification")
    object antirag:Screen(route = "antirag")


}