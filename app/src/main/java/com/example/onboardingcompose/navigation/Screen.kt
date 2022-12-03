package com.example.onboardingcompose.navigation

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.onboardingcompose.R
import com.example.onboardingcompose.util.OnBoardingPage.First.image

sealed class Screen(val route: String,) {
    object Welcome : Screen(route = "welcome_screen")
    //object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")
    object ug1 : Screen(route = "ug1")
    object pg1 : Screen(route = "pg1")
    object ph1 : Screen(route = "ph1")
    object hm2 : Screen(route = "ph1")
    //object Navscreen :Screen(route = "nav1")
    object commerce:Screen(route = "comblock")
    object it:Screen(route = "it")
    object mba:Screen(route = "mba")
    object lib:Screen(route = "lib")
    object bio:Screen(route = "bio")
    object science:Screen(route = "science")
    object result:Screen(route = "result")
    object notification:Screen(route = "notification")
    object antirag:Screen(route = "antirag")
    object bcap:Screen(route = "bcap")

    object HomeScreen:Screen(route = "home_screen")


}
sealed class NavigationItem(val route: String, val label: String,val Icon: ImageVector) {
    object Navscreen :Screen(route = "nav1")

    object Home : NavigationItem("Home", "Home", Icons.Default.Home)
    object academics :
        NavigationItem("academics", "Academics", Icons.Default.Book)

    object Activities : NavigationItem("Activities","Activities",Icons.Default.Info)
    companion object Navigation1



}
