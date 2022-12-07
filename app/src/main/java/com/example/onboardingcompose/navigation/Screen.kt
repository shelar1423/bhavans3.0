package com.example.onboardingcompose.navigation


//import androidx.compose.material.icons.filled.Book

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String,) {
    object Welcome : Screen(route = "welcome_screen")
    object SplashScreen : Screen(route = "splash_screen")
    //object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")

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
    object placement:Screen(route = "placement")
    object payment:Screen(route = "payment")
    object alumni:Screen(route = "alumni")

    object HomeScreen:Screen(route = "home_screen")
 object  syllabi:Screen(route = "syllabi")
    object  almanac:Screen(route = "almanac")
    object  website:Screen(route = "website")
    object  marquee:Screen(route = "marquee")
    object  linktree:Screen(route = "linktree")

}
sealed class NavigationItem(val route: String, val label: String,val Icon: ImageVector) {
    object Navscreen :Screen(route = "nav1")

    object Home : NavigationItem("Home", "Home", Icons.Default.Home)
    object academics :
        NavigationItem("academics", "Academics", Icons.Default.Book)

    object Activities : NavigationItem("Activities","Activities",Icons.Default.Info)
    companion object Navigation1



}


//in my device book was not working
public val Icons.Filled.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = materialIcon(name = "Filled.Book") {
            materialPath {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(-2.5f, -1.5f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        return _book!!
    }

private var _book: ImageVector? = null