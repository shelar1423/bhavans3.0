package com.example.onboardingcompose.navigation


//import androidx.compose.material.icons.filled.Book

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String,) {

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

    object placement:Screen(route = "placement")
    object payment:Screen(route = "payment")
    object alumni:Screen(route = "alumni")
    object feedback:Screen(route = "feedback")

    object HomeScreen:Screen(route = "Home_screen/{name}")
 object  syllabi:Screen(route = "syllabi")
    object  almanac:Screen(route = "almanac")
    object  website:Screen(route = "website")
    object  marquee:Screen(route = "marquee")
    object  linktree:Screen(route = "linktree")
    object  fourthscreen:Screen(route = "fourth")

    object Welcome : Screen(route = "welcome_screen")
    object name:Screen(route = "name")
    object academicsScreen:Screen(route = "acadscreen")
    object downloads:Screen(route = "downloads")
    object b1:Screen(route = "b1")
    object b2:Screen(route = "b2")
    object b3:Screen(route = "b3")
    object b4:Screen(route = "b4")
    object b5:Screen(route = "b5")
    object b6:Screen(route = "b6")

    object b12:Screen(route = "b12")
    object b13:Screen(route = "b13")
    object b14:Screen(route = "b14")
    object b15:Screen(route = "b15")
    object b16:Screen(route = "b16")
    object	b21	:Screen	(route ="b21")

    object	b23	:Screen	(route ="b23")
    object	b24	:Screen	(route ="b24")
    object	b25	:Screen	(route ="b25")
    object	b26	:Screen	(route ="b26")
    object	b31	:Screen	(route ="b31")
    object	b32	:Screen	(route ="b32")

    object	b34	:Screen	(route ="b34")
    object	b35	:Screen	(route ="b35")
    object	b36	:Screen	(route ="b36")
    object	b41	:Screen	(route ="b41")
    object	b42	:Screen	(route ="b42")
    object	b43	:Screen	(route ="b43")

    object	b45	:Screen	(route ="b45")
    object	b46	:Screen	(route ="b46")
    object	b51	:Screen	(route ="b51")
    object	b52	:Screen	(route ="b52")
    object	b53	:Screen	(route ="b53")
    object	b54	:Screen	(route ="b54")

    object	b56	:Screen	(route ="b56")
    object	b61	:Screen	(route ="b61")
    object	b62	:Screen	(route ="b62")
    object	b63	:Screen	(route ="b63")
    object	b64	:Screen	(route ="b64")
    object	b65	:Screen	(route ="b65")







    //question papers
    object bcomg:Screen(route = "bcomg")
    object bcomh:Screen(route = "bcomh")
    object bcomc:Screen(route = "bcomc")
    object bca:Screen(route = "bca")
    object bba:Screen(route = "bba")
    object ba:Screen(route = "ba")
    object bscl:Screen(route = "bscl")
    object bscp:Screen(route = "bscp")
    object mscc :Screen(route = "mscc")
    object mba1 :Screen(route = "mba")
    object mscm :Screen(route = "mscm")
    object mcom :Screen(route = "mcom")
    object mscb :Screen(route = "mscb")
    object phdp :Screen(route = "phdp")
    object phdm :Screen(route = "phdm")
    object phdb :Screen(route = "phdb")
    object phdma :Screen(route = "phdma")
    object Navscreen :Screen(route = "nav1")


}
sealed class NavigationItem(val route: String, val label: String,val Icon: ImageVector) {

    object Home : NavigationItem("Home/{name}", "Home", Icons.Default.Home)
    object academics :
        NavigationItem("academics", "Academics", Icons.Default.Book)

    object Activities : NavigationItem("Activities","Papers",Icons.Default.LibraryBooks)
    companion object Navigation1




}

