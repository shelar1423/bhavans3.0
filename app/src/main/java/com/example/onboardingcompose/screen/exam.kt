package com.example.onboardingcompose.screen

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.NavigationItem
import com.example.onboardingcompose.navigation.NavigationItem.Activities.route
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import java.text.SimpleDateFormat
import java.util.*

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun exam(navController: NavHostController,
         welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val dummyValue = remember { mutableStateOf("")}
    Box (modifier = Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment. CenterHorizontally
        ) {
            Text(
                // on below line we are specifying text to display.
                text = "Current Date and Time in Android",

                // on below line we are specifying
                // modifier to fill max width.
                modifier = Modifier.fillMaxWidth(),

                // on below line we are
                // specifying text alignment.
                textAlign = TextAlign.Center,

                // on below line we are
                // specifying color for our text.
                color = Color.Black,

                // on below line we are specifying font weight
                fontWeight = FontWeight.Bold,

                // on below line we are updating font size.
                fontSize = 25.sp,
            )

            // on below line we are creating a spacer.
            Spacer(modifier = Modifier.height(20.dp))

            // on below line we are creating and initializing
            // variable for simple date format.
            val sdf = SimpleDateFormat("'Date\n'dd-MM-yyyy '\n\nand\n\nTime\n'HH:mm:ss z")

            // on below line we are creating a variable for
            // current date and time and calling a simple
            // date format in it.
            val currentDateAndTime = sdf.format(Date())

            Text(
                // on below line we are
                // specifying text to display.
                text = currentDateAndTime,

                // on below line we are specifying
                // modifier to fill max width.
                modifier = Modifier.fillMaxWidth(),

                // on below line we are
                // specifying text alignment.
                textAlign = TextAlign.Center,

                // on below line we are specifying
                // color for our text.
                color = Color.Black,

                // on below line we are specifying font weight
                fontWeight = FontWeight.Bold,

                // on below line we are updating font size.
                fontSize = 25.sp,
            )

        }
    }
    }
