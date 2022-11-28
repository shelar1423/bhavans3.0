package com.example.onboardingcompose.screen


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.*
import com.example.onboardingcompose.ui.theme.Blue700
import com.example.onboardingcompose.util.OnBoardingPage
import com.example.onboardingcompose.util.slider
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
import androidx.navigation.NavController


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {

    Image(
        painter = painterResource(id = R.drawable.whitegrad), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
            .fillMaxWidth()

            .fillMaxHeight()
        /*.background(
            Color.White
        )*/,
        contentScale = ContentScale.FillWidth,

        )

    val gradient =
        Brush.horizontalGradient(listOf(Color(0xFF28D8A3),
            Color(0xFF00BEB2)))

    Column(modifier = Modifier
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

                    .background(color = Color.Transparent)
                //.fillMaxWidth()
                //.fillMaxHeight()
                //.fillMaxSize(),
                ,
                contentScale = ContentScale.FillWidth,
            )

            Text(text = " Hello Bhavanite,",
                modifier = Modifier.padding(start = 10.dp, top = 25.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif)
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
        Box(modifier = Modifier.height(75.dp)){

        }
        Column(verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.fillMaxHeight()) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()) {

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.result.route) },
                    text = "Results",
                    img = painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview))

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.Question1.route) },
                    text = "Previous Year Q.P",
                    img = painterResource(id = R.drawable.exam))

            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.Welcome.route) },
                    text = "Feedback",
                    img = painterResource(id = R.drawable.feedbackreal))

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.Navscreen.route) },
                    text = "Navigation",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.notification.route) },
                    text = "Notification",
                    img = painterResource(id = R.drawable._61788c1_816e_4ce1_8030_6cd54350dc1b_removebg_preview))

                GradientB1(gradient = gradient,
                    onClick = { navController.navigate(Screen.Question1.route) },
                    text = "Anti-Ragging",
                    img = painterResource(id = R.drawable._a199798_b921_47c8_aa71_30d9330f37c2_removebg_preview))
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

/*
private enum class MarqueeLayers { MainText, SecondaryText, EdgesGradient }
private data class TextLayoutInfo(val textWidth: Int, val containerWidth: Int)
@ExperimentalAnimationApi
@ExperimentalPagerApi
@get:Composable
val Colors.myExtraColor: Color
    get() = if (isLight) Color.Blue else Color.Green


 */

