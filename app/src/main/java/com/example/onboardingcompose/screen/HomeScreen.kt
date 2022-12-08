package com.example.onboardingcompose.screen


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.*
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.onboardingcompose.navigation.BottomNavGraph
import com.example.onboardingcompose.navigation.NavigationItem


import com.example.onboardingcompose.navigation.SetupNavGraph


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {


    Image(
        painter = painterResource(id = R.drawable.blue), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
            .fillMaxWidth()

            .fillMaxHeight(),
        /*.background(
            Color.White
        )*/
        contentScale = ContentScale.FillBounds,

        )

    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFF008EFF),
                Color(0xFFFFFFFF)
            )
        )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {



            Text(
                text = " Hello Bhavanite,",
                modifier = Modifier.padding(start = 180.dp, top = 31.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Digvijay",
                modifier = Modifier.padding(start = 186.dp, top = 70.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "BCA",
                modifier = Modifier.padding(start = 186.dp, top = 110.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif
            )
            Image(
                painter = painterResource(id = R.drawable.logohome),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    //.background(color = Color.White)
                    .padding(top = 20.dp, bottom = 100.dp, start = 0.dp, end = 220.dp)
                    .fillMaxWidth().clickable { navController.navigate(Screen.website.route) }


            )


        }
        Box(modifier = Modifier.height(0.dp)) {


        }
        Column(
            verticalArrangement = Arrangement.spacedBy(25.dp),
            modifier = Modifier.fillMaxHeight()
        ) { Image(
            painter = painterResource(id = R.drawable.abhinavtransaprent),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 0.dp, bottom = 10.dp, start = 0.dp)
                .fillMaxWidth().clickable { navController.navigate(Screen.almanac.route) },
            contentScale =  ContentScale.FillWidth


        )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.placement.route) },
                    text = "Placements",
                    img = painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(NavigationItem.Navscreen.route) },
                    text = "Navigation",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_)
                )


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.payment.route) },
                    text = "FeePayment",
                    img = painterResource(id = R.drawable.fe1)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.antirag.route) },
                    text = "Anti-Ragging",
                    img = painterResource(id = R.drawable._a199798_b921_47c8_aa71_30d9330f37c2_removebg_preview)
                )


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.alumni.route) },
                    text = "Alumni",
                    img = painterResource(id = R.drawable.alumini)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.Question1.route) },
                    text = "FeedBack",
                    img = painterResource(id = R.drawable.feedbackreal)
                )

            }
            Box(modifier = Modifier.height(5.dp)) {

            }
        }

    }



    @Composable
    fun GradientEdge(
        startColor: Color, endColor: Color,
    ) {
        Box(
            modifier = Modifier
                .width(10.dp)
                .fillMaxHeight()
                .background(
                    brush = Brush.horizontalGradient(
                        0f to startColor, 1f to endColor,
                    )
                )
        )
    }


    @ExperimentalAnimationApi
    @ExperimentalPagerApi
    @Composable
    fun GradientB1(
        gradient: Brush,
        onClick: () -> Unit,
        text: String,
        img: Painter
    ) {
        Button(

            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 30.dp, start = 10.dp, end = 10.dp, bottom = 30.dp)
                .height(100.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(20.dp))
                //.fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick
        ) {

            Image(
                //painterResource(id = R.drawable.exam),
                painter = img,
                contentDescription = "Cart button icon",
                alignment = Alignment.Center,
                modifier = Modifier.height(80.dp)

            )
            Text(
                text = text,
                color = Color.Blue,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = bab,
            )
        }
    }
}

/*@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun NavigationController(navController: NavHostController,startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {

        composable(NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(NavigationItem.Notifications.route) {
            actscreen(navController = navController)
        }

        composable(NavigationItem.Settings.route) {
            exam(navController = navController)
        }



    }


}*/


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun Navigation() {


    val navController = rememberNavController()

    Scaffold(
        bottomBar = {


            BottomBar(navController)

        }) {
        BottomNavGraph(navController = navController)
    }

}

@Composable
fun BottomBar(
    navController: NavController
) {

    val items = listOf(
        NavigationItem.Home,
        NavigationItem.academics,
        NavigationItem.Activities,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val bottomBarDestination = items.any { it.route == currentRoute }

    if (bottomBarDestination) {
        BottomNavigation(backgroundColor = Color(0xCC5AD)) {

            items.forEach {
                BottomNavigationItem(selected = currentRoute == it.route,
                    label = {
                        Text(
                            text = it.label,
                            color = if (currentRoute == it.route) Color.Black else Color.Black
                        )
                    },
                    icon = {
                        Icon(
                            imageVector = it.Icon, contentDescription = null,
                            tint = if (currentRoute == it.route) Color(0xFFA83FFE) else Color(
                                0xFF4027DE
                            )
                        )

                    },

                    onClick = {
                        if (currentRoute != it.route) {

                            navController.graph?.startDestinationRoute?.let {
                                navController.popBackStack(it, true)
                            }

                            navController.navigate(it.route) {
                                popUpTo(navController.graph.findStartDestination().id)
                                launchSingleTop = true
                            }

                        }

                    })

            }
        }
    }

}


@Composable
fun Settings() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Settings")

        }
    }
}



