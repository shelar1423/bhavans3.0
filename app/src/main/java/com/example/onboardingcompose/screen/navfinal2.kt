package com.example.onboardingcompose.screen

import android.widget.Toast
import android.widget.Toolbar
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
import view360

@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun navfinal2() {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.navbg123), contentDescription = null,
            modifier = Modifier
                .padding(top = 1.dp)
                .fillMaxWidth()

                .fillMaxHeight(),
/*.background(
    Color.White
)*/
            contentScale = ContentScale.FillBounds,

            )

    }
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(2.dp),
    horizontalAlignment = Alignment.CenterHorizontally){

        Image(
            painter = painterResource(id = R.drawable.navigationhead1), contentDescription = null,
            modifier = Modifier
                .padding(top = 0.dp)
                .fillMaxWidth()
                .height(120.dp)

        )
        DisplayJCSpinner()
    }

}

