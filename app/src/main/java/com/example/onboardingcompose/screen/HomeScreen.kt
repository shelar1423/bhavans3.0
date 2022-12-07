package com.example.onboardingcompose.screen


import android.content.Intent
import android.net.Uri
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {
Image(
painter = painterResource(id = R.drawable.newbg1), contentDescription = null,
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
            Color(0xFF28D8A3),
            Color(0xFF00BEB2)
        )
    )

Column(
modifier = Modifier
.verticalScroll(rememberScrollState())
.fillMaxHeight()
) {
    Box(modifier = Modifier.fillMaxWidth()) {

        Image(
            painter = painterResource(id = R.drawable.jdjl),
            contentDescription = null,
            //alignment = Alignment.TopCenter,
            modifier = Modifier
                .padding(top = 0.dp, bottom = 1.dp)

                .background(color = Color.Transparent),
            //.fillMaxWidth()
            //.fillMaxHeight()
            //.fillMaxSize(),
            contentScale = ContentScale.FillWidth,
        )

        Text(
            text = " Hello Bhavanite,",
            modifier = Modifier.padding(start = 10.dp, top = 25.dp),
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
                .padding(top = 40.dp, bottom = 100.dp, start = 270.dp)
                .fillMaxWidth()


        )

    }
    val scroll = rememberScrollState(0)

    Box(modifier = Modifier.height(25.dp)) {

    }
    Box(modifier = Modifier.height(20.dp))
    /*
    Box(modifier = Modifier.height(45.dp)) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "About Bhavans",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 35.sp,
            fontWeight=FontWeight.ExtraBold,
            textDecoration =TextDecoration.Underline ,
            style = TextStyle(
                color = Color.Red,
            fontFamily = FontFamily.Cursive),
            overflow = TextOverflow.Visible)
    }
    Box(modifier = Modifier.height(180.dp)) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "           Kulapathi Dr. K. M. Munshi founded Bharatiya Vidya Bhavan on 7 November 1938 with the blessings of Mahatma Gandhi. About 22,000 members have committed themselves to the Bhavan's ideal \" Vasudhaiva Kutumbakam \" (The World is One Family) and lives by its code.",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            style = TextStyle(
                color = Color.Black,
            fontFamily = FontFamily.SansSerif),
            overflow = TextOverflow.Ellipsis)
    }


    Box(modifier = Modifier.height(45.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Quick Links",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 35.sp,
            fontWeight=FontWeight.ExtraBold,
            textDecoration =TextDecoration.Underline ,
            style = TextStyle(
                color = Color.Red,
                fontFamily = FontFamily.Cursive),
            overflow = TextOverflow.Visible)
    }

     */
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.fillMaxHeight()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(2f)) {

            }
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Placements",
                    textColor = Color.Black,
                    onClick = { navController.navigate(Screen.placement.route) },
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Navigation",
                    textColor = Color.Black,
                    onClick = { navController.navigate(NavigationItem.Navscreen.route) },
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                )
            }
            Column(Modifier.weight(2f)) {
                Image(
                    painter = painterResource(R.drawable.images_removebg_preview__2_),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                )
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(2f)) {
                Image(
                    painter = painterResource(R.drawable.fe1),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                )
            }
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Payment",
                    textColor = Color.Black,
                    onClick = { navController.navigate(Screen.payment.route) },
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                )
            }


        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Anti-Ragging",
                    textColor = Color.Black,
                    onClick = { navController.navigate(Screen.antirag.route) },
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                )
            }
            Column(Modifier.weight(2f)) {
                Image(
                    painter = painterResource(R.drawable._a199798_b921_47c8_aa71_30d9330f37c2_removebg_preview),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                )
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(2f)) {
                Image(
                    painter = painterResource(R.drawable.al1),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                )
            }
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Alumni",
                    textColor = Color.Black,
                    onClick = { navController.navigate(Screen.alumni.route) },
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                )
            }


        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.weight(8f)) {
                GBhome(
                    text = "Feedback",
                    textColor = Color.Black,
                    gradient = Brush.horizontalGradient(
                        colors = listOf(c2, c1)

                    )
                ) { }
            }
            Column(Modifier.weight(2f)) {
                Image(
                    painter = painterResource(R.drawable.feedbackreal),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                )
            }

        }
    }/*
        Card(
            elevation = 10.dp,
            border = BorderStroke(1.dp, Color.Blue),
            modifier = Modifier.padding(10.dp),
            backgroundColor = Color.Black,
            contentColor = Color.White
        ) {
            Column() {
                Text(text = "Contact Us", fontSize = 20.sp,color = Color.White)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Bhavan's Vivekananda College of Science, Humanities & Commerce Sainikpuri, Secunderabad -\n" +
                        "500 094.", fontSize = 10.sp,color = Color.White)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "e-mail: bvc@bhavansvc.ac.in",fontSize = 10.sp,color = Color.White)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Phno: 040-27111611, , 27115878, 27114468", fontSize = 10.sp,color = Color.White)
            }

        }
        */

    Box(modifier = Modifier.height(90.dp))
}
Box(modifier = Modifier.height(90.dp))

}
@Composable
fun GBhome(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        //shape = RoundedCornerShape(topEnd = 30.dp, bottomStart = 30.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                .width(1000.dp)
                .height(40.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 25.sp, textAlign = TextAlign.Center,
                fontWeight = FontWeight.Normal,
                fontFamily=FontFamily.Monospace
            )
        }
    }

}

//my try
/*
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen123(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {
    val context = LocalContext.current
    val webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))


    Image(
        painter = painterResource(id = R.drawable.whitegrad), contentDescription = null,
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
                Color(0xFF28D8A3),
                Color(0xFF00BEB2)
            )
        )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.jdjl),
                contentDescription = null,
                //alignment = Alignment.TopCenter,
                modifier = Modifier
                    .padding(top = 0.dp, bottom = 1.dp)

                    .background(color = Color.Transparent),
                //.fillMaxWidth()
                //.fillMaxHeight()
                //.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )

            Text(
                text = " Hello Bhavanite,",
                modifier = Modifier.padding(start = 10.dp, top = 25.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif
            )
            Image(
                painter = painterResource(id = R.drawable.logohome),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    .clickable { navController.navigate(Screen.website.route) }
                    //.background(color = Color.White)
                    .padding(top = 40.dp, bottom = 100.dp, start = 270.dp)
                    .fillMaxWidth()


            )

        }
        Box(modifier = Modifier.height(75.dp)) {
Text(text = "Here quotations for the day will come",Modifier.size(20.dp))
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.result.route) },
                    text = "Results",
                    img = painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview)
                )

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.Question1.route) },
                    text = "Previous Year Q.P",
                    img = painterResource(id = R.drawable.exam)
                )

            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.Welcome.route) },
                    text = "Feedback",
                    img = painterResource(id = R.drawable.feedbackreal)
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
                    onClick = { navController.navigate(Screen.notification.route) },
                    text = "Notification",
                    img = painterResource(id = R.drawable._61788c1_816e_4ce1_8030_6cd54350dc1b_removebg_preview)
                )

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.antirag.route) },
                    text = "Anti-Ragging",
                    img = painterResource(id = R.drawable._a199798_b921_47c8_aa71_30d9330f37c2_removebg_preview)
                )
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

 */

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
        BottomNavigation(backgroundColor = Color(0xD08FE1)) {

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
                            tint = if (currentRoute == it.route) Color(0xFFDA1D1D) else Color(
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



