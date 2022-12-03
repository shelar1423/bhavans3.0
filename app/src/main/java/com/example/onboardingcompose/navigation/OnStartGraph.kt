package com.example.onboardingcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.onboardingcompose.screen.Navigation
import com.example.onboardingcompose.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
fun NavGraphBuilder.onStartGraph(
    navController: NavHostController,
) {

    navigation(
        route = Graph.ON_START_GRAPH,
        startDestination = Screen.Welcome.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            Navigation()
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
    }

}