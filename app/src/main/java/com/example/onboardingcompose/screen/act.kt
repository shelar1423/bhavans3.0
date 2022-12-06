import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.protobuf.Value
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.NavigationItem
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.screen.GradientB1
import com.example.onboardingcompose.screen.GradientB2
import com.example.onboardingcompose.screen.GradientB3
import com.example.onboardingcompose.screen.MarqueenText
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable

fun act(navController: NavHostController,
        welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {

    val scrollState = rememberScrollState()
    var shouldAnimate by remember {
        mutableStateOf(true)
    }

    Image(
        painter = painterResource(id = R.drawable.bgacad), contentDescription = null,
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
                Color(0xFFB97AC4),
                Color(0xFF80A6ED)
            )
        )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()

    ) {   Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.topacad),
                contentDescription = null,
                //alignment = Alignment.TopCenter,
                modifier = Modifier
                    .padding(top = 0.dp, bottom = 1.dp)

                    .background(color = Color.Transparent)
                .fillMaxWidth(),
                //.fillMaxHeight()
                //.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )
        Image(
            painter = painterResource(id = R.drawable.quote),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 230.dp, bottom = 10.dp, start = 1.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth


        )







    }
        Box(modifier = Modifier.height(60.dp)) {

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

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.result.route) },
                    text = "Results",
                   // img = painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview)
                )

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.Question1.route) },
                    text = "Previous Year Q.P",
                   // img = painterResource(id = R.drawable.exam)
                )

            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.notification.route) },
                    text = "Notification",
                    //  img = painterResource(id = R.drawable._61788c1_816e_4ce1_8030_6cd54350dc1b_removebg_preview)
                )

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.almanac.route) },
                    text = "Almanac",
                   // img = painterResource(id = R.drawable.images_removebg_preview__2_)
                )
            }

            }
        }

    }
