package com.example.onboardingcompose.screen

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.NavigationItem
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun exam(navController: NavHostController,
         welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFFFFFF),
                Color(0xFFFFFF)
            )
        )

   Image(
        painter = painterResource(id = R.drawable.homeicon), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
            .fillMaxWidth()

            .fillMaxHeight(),
        /*.background(
            Color.White
        )*/
        contentScale = ContentScale.FillBounds,

        )
    /*Box(modifier = Modifier.height(110.dp)) {

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


            GradientB4(
                gradient = gradient,
                onClick = { /*TODO*/ },
                text = "Navigation",
                img = painterResource(id = R.drawable.images_removebg_preview__2_)
            )
            GradientB4(
                gradient = gradient,
                onClick = { /*TODO*/ },
                text = "Navigation",
                img = painterResource(id = R.drawable.images_removebg_preview__2_)
            )
        }
    }*/
    Box(modifier = Modifier.height(110.dp)) {

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

            GradientB4(
                gradient = gradient,
                onClick = { navController.navigate(Screen.placement.route) },
                text = "Placements",
                img = painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview)
            )
            GradientB4(
                gradient = gradient,
                onClick = { navController.navigate(NavigationItem.Navscreen.route) },
                text = "Navigation",
                img = painterResource(id = R.drawable.images_removebg_preview__2_)
            )


        }

        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {

            GradientB4(
                gradient = gradient,
                onClick = { navController.navigate(Screen.payment.route) },
                text = "FeePayment",
                img = painterResource(id = R.drawable.fe1)
            )
            GradientB4(
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

            GradientB4(
                gradient = gradient,
                onClick = { navController.navigate(Screen.alumni.route) },
                text = "Alumni",
                img = painterResource(id = R.drawable.alumini)
            )
            GradientB4(
                gradient = gradient,
                onClick = { navController.navigate(Screen.Question1.route) },
                text = "FeedBack",
                img = painterResource(id = R.drawable.feedbackreal)
            )

        }
    }

}