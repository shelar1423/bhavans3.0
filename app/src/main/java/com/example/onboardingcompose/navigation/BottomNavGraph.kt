package com.example.onboardingcompose.navigation

import act

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onboardingcompose.screen.*
import com.example.onboardingcompose.screen.quespaper.bcap
import com.example.onboardingcompose.screen.quespaper.newqp
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun BottomNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        route = Graph.BOTTOM_NAV_GRAPH,
        startDestination = NavigationItem.Home.route
    ) {
        composable(NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(NavigationItem.academics.route) {
            act(navController = navController)
        }

        composable(NavigationItem.Activities.route) {
            exam(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Papers.route) {
            Papers(navController = navController)
        }
        composable(route= Screen.Question1.route) {
            newqp(navController = navController)
        }


        composable(route = NavigationItem.Navscreen.route)
        {
            Navscreen(navController = navController)
        }
        composable(route = Screen.antirag.route)
        {
            antirag(navController = navController)
        }
        composable(route = Screen.commerce.route){
            WebViewPage(navController = navController, url = "https://www.google.com/maps/place/CommerceBlockBVC,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana+500094/data=!4m2!3m1!1s0x3bcb9b102ac29611:0xf3f87c17db4e78e2?sa=X&ved=2ahUKEwivi7e7-dD7AhWU1jgGHYyaDZkQ8gF6BAgUEAE")
        }
        composable(route = Screen.it.route)
        {
            it(navController=navController, url ="https://www.google.com/maps/place/IT+block/@17.4894723,78.5349013,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb9bde49a8c001:0x71aa806707fc2879!8m2!3d17.4894723!4d78.5349013?hl=en-IN")
        }
        composable(route = Screen.mba.route)
        {
            mba(navController=navController, url ="https://www.google.com/maps/place/MBA+block/@17.4887849,78.5339989,90m/data=!3m1!1e3!4m22!1m16!4m15!1m6!1m2!1s0x3bcb9b102ac29611:0xf3f87c17db4e78e2!2sCommerceBlockBVC,+BHAVAN'S+VIVEKANANDA+COLLEGE,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana!2m2!1d78.5347303!2d17.4892123!1m6!1m2!1s0x3bcb9b0fcc30cadd:0x4c09f90816ab32d7!2sLibrary+Block+Bhavan's+vivekanada+college,+692,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana+500094!2m2!1d78.5345619!2d17.4881206!3e2!3m4!1s0x3bcb9b0fd89865f5:0x97bbfef9f60d690a!8m2!3d17.4889935!4d78.5338783")
        }
        composable(route = Screen.bio.route)
        {
            bio(navController=navController, url ="https://www.google.com/maps/place/BVC+Bio-Chemistry+Block(Bhavan's+vivekananda+college)/@17.4894289,78.5342312,103m/data=!3m1!1e3!4m23!1m17!4m16!1m3!2m2!1d78.534212!2d17.489389!1m6!1m2!1s0x3bcb9b102ac29611:0xf3f87c17db4e78e2!2sCommerceBlockBVC,+BHAVAN'S+VIVEKANANDA+COLLEGE,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana!2m2!1d78.5347303!2d17.4892123!1m3!2m2!1d78.5344166!2d17.4893294!3e2!3m4!1s0x3bcb9b01118e2fdb:0x712327daf6f357cd!8m2!3d17.4892746!4d78.5343893")
        }
        composable(route = Screen.science.route)
        {
            science(navController=navController, url ="https://www.google.com/maps/place/Science+Department,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana+500094/@17.4892872,78.5342693,103m/data=!3m1!1e3!4m18!1m12!4m11!1m3!2m2!1d78.534212!2d17.489389!1m6!1m2!1s0x3bcb9b102ac29611:0xf3f87c17db4e78e2!2sCommerceBlockBVC,+BHAVAN'S+VIVEKANANDA+COLLEGE,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana!2m2!1d78.5347303!2d17.4892123!3m4!1s0x3bcb9b1028b9d8a9:0x44950189f15ae74a!8m2!3d17.4893655!4d78.5342409")
        }
        composable(route = Screen.lib.route)
        {
            lib(navController=navController, url ="https://www.google.com/maps/place/Library+Block+Bhavan's+vivekanada+college/@17.48866,78.5344046,180m/data=!3m1!1e3!4m22!1m16!4m15!1m6!1m2!1s0x3bcb9b102ac29611:0xf3f87c17db4e78e2!2sCommerceBlockBVC,+BHAVAN'S+VIVEKANANDA+COLLEGE,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana!2m2!1d78.5347303!2d17.4892123!1m6!1m2!1s0x3bcb9b0fcc30cadd:0x4c09f90816ab32d7!2sLibrary+Block+Bhavan's+vivekanada+college,+692,+New+Kranthi+Nagar,+Sainikpuri,+Secunderabad,+Telangana+500094!2m2!1d78.5345619!2d17.4881206!3e2!3m4!1s0x3bcb9b0fcc30cadd:0x4c09f90816ab32d7!8m2!3d17.4881206!4d78.5345619")
        }
        composable(route = Screen.result.route)
        {
            result(navController=navController, url ="http://www.bvcexams.com/Examination%20Results.html")
        }
        composable(route = Screen.notification.route)
        {
            notification(navController=navController, url ="http://www.bvcexams.com/Examination%20Notifications.html")
        }
        composable(route = Screen.bcap.route)
        {
            bcap(navController=navController, url ="https://drive.google.com/file/d/1FmCZM6hfayerRX8eugK8b3as3muzCGCj/view?usp=sharing")
        }
        composable(route = Screen.placement.route)
        {
            bcap(navController=navController, url ="https://www.bhavansvc.ac.in/placementcell.html")
        }
        composable(route = Screen.payment.route)
        {
            bcap(navController=navController, url ="https://www.feepayr.com/")
        }
        composable(route = Screen.alumni.route)
        {
            bcap(navController=navController, url ="https://alumni.bhavansvc.ac.in/")
        }
        composable(route = Screen.syllabi.route){
            WebViewPage(navController = navController, url = "https://www.bhavansvc.ac.in/syllabi.html")
        }
        composable(route = Screen.almanac.route){
            WebViewPage(navController = navController, url = "https://www.bhavansvc.ac.in/almanac.html")
        }
        composable(route = Screen.website.route)
        {
            website(navController=navController, url ="https://www.bhavansvc.ac.in/")
        }
        composable(route = Screen.linktree.route)
        {
            linktree(navController=navController, url ="https://koji.to/k/7DIs")
        }
    }

}

