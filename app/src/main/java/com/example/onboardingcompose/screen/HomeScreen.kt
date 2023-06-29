package com.example.onboardingcompose.screen


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.BottomNavGraph
import com.example.onboardingcompose.navigation.NavigationItem
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.bab
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import java.text.SimpleDateFormat
import java.util.*


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel(),name:String?

) {
    val homefont = FontFamily(
        Font(R.font.home))
    val list = listOf(
        "Don’t let what you cannot do interfere with what you can do.",
        "Make each day your masterpiece.",
        "Arise, awake, and stop not till the goal is reached",
        "Life is not a problem to be solved, but a reality to be experienced.",
        "Be a warrior not a worrier",
        "You do not find the happy life. You make it.",
        "The most wasted of days is one without laughter",
        "Happiness is not by chance, but by choice",
        "Impossible is for the unwilling",
        "Don’t let yesterday take up too much of today",
        "Nothing is impossible. The word itself says “I’m possible!"
        )
    val randomElement = list.random()
    val handler = LocalUriHandler.current



    Image(
        painter = painterResource(id = R.drawable.finalbghome), contentDescription = null,
        modifier = Modifier
            .padding(top = 0.dp)
            .fillMaxHeight()
            .fillMaxWidth(),
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
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)) {
            Box(modifier = Modifier
                .width(100.dp)
                .padding(top = 20.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.logohome),
                    contentDescription = null,
                    //alignment = Alignment.BottomStart,
                    modifier = Modifier
                        //.background(color = Color.White)
                        // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)
                       // .fillMaxWidth()
                       // .height(150.dp).width(120.dp)
                        .clickable { navController.navigate(Screen.website.route) }


                )

            }

            Box(modifier = Modifier.fillMaxWidth()) {
                Column() {
Row(modifier = Modifier.fillMaxWidth()){
    Box(modifier = Modifier.weight(7f)) {


        Text(
            text = " Hello Bhavanite,",
            modifier = Modifier.padding(top = 10.dp),
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = homefont
        )
    }
    Box(modifier = Modifier.weight(2f)) {
        Image(
            painter = painterResource(id = R.drawable.iicon),
            contentDescription = null,
            // alignment = Alignment.TopEnd,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 10.dp, end = 5.dp)
                // .fillMaxWidth()
                .height(35.dp)
                .width(60.dp)
                .clickable { navController.navigate(Screen.faq.route) }


        )
    }
    }
                        Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = randomElement,
                        modifier = Modifier.padding(start = 10.dp, top = 0.dp,end=15.dp),
                        color = Color.White,
                        fontSize = 17.sp,
                        fontFamily = homefont,

                        )


                }
            }


        }
        /*
        Box(modifier = Modifier.fillMaxWidth()) {



            Text(
                text = " Hello Bhavanite,",
                modifier = Modifier.padding(start = 160.dp, top = 29.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = homefont
            )

            Text(
                text = randomElement,
                modifier = Modifier.padding(start = 170.dp, top = 80.dp,end=15.dp),
                color = Color.White,
                fontSize = 17.sp,
                fontFamily = homefont,

                )

            Image(
                painter = painterResource(id = R.drawable.logohome),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    //.background(color = Color.White)
                    .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)
                    .fillMaxWidth()
                    .clickable { navController.navigate(Screen.website.route) }


            )


        }

         */
        Box(modifier = Modifier.height(0.dp)) {


        }
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.fillMaxHeight()
        ) { Image(
            painter = painterResource(id = R.drawable.newlink1),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 0.dp, bottom = 0.dp, start = 0.dp)
                .fillMaxWidth()
                .clickable {
                    handler.openUri("https://linktr.ee/BhavansCollege")
                },
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
                    img = painterResource(id = R.drawable.placement)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.TabLayout.route) },
                    text = "Navigation",
                    img = painterResource(id = R.drawable.icon360)
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
                    img = painterResource(id = R.drawable.feepayment)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.antirag.route) },
                    text = "Anti-Ragging",
                    img = painterResource(id = R.drawable.antiragfinal)
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
                    img = painterResource(id = R.drawable.aluminifinal)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.devcon.route) },
                    text = "FeedBack",
                    img = painterResource(id = R.drawable.feedbackfinal)
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
Column() {
    Image(
        //painterResource(id = R.drawable.exam),
        painter = img,
        contentDescription = "Cart button icon",
        alignment = Alignment.Center,
        modifier = Modifier
            .height(180.dp)
            .width(180.dp)

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
        BottomNavigation(backgroundColor = Color.Transparent, elevation = 0.dp){

            items.forEach {
                BottomNavigationItem(selected = currentRoute == it.route,
                    label = {
                        Text(
                            text = it.label,
                            fontWeight = FontWeight.SemiBold,
                            color = if (currentRoute == it.route) Color.Black else Color.Black
                        )
                    },
                    icon = {
                        Icon(
                            imageVector = it.Icon, contentDescription = null,
                            tint = if (currentRoute == it.route) Color(0xFFFF0623) else Color(
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

                    }        )

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



