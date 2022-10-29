package com.example.onboardingcompose.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")
    object ug1 : Screen(route = "ug1")
    object pg1 : Screen(route = "pg1")
    object ph1 : Screen(route = "ph1")

}