package com.example.onboardingcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onboardingcompose.screen.Navigation
import com.example.onboardingcompose.viewmodel.SplashViewModel
import com.google.accompanist.pager.ExperimentalPagerApi


@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun RootNavGraph(
    navController: NavHostController,
    splashViewModel: SplashViewModel
) {

    NavHost(
        navController = navController,
        route = Graph.ROOT_NAV_GRAPH,
        startDestination = Graph.ON_START_GRAPH
    ) {
        SetupNavGraph(navController = navController)
        onStartGraph(navController = navController, splashViewModel = splashViewModel)
        composable(route = Graph.BOTTOM_NAV_GRAPH) {
            Navigation()
        }
    }


}


object Graph {
    const val ROOT_NAV_GRAPH = "set_up_nav_graph"
    const val BOTTOM_NAV_GRAPH = "bottom_nav_graph"
    const val NavGraph = "nav_graph"
    const val ON_START_GRAPH = "on_start_graph"
}