package com.example.onboardingcompose.util

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.ButtonBlue

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String,

) {
    object First : OnBoardingPage(
        image = R.drawable.bvcreal,
        title = "Bhavans",
        description = "Welcome to the official Bhavan's App"
    )

    object Second : OnBoardingPage(
        image = R.drawable.preqp,
        title = "Question Papers",
        description = "You can access previous year question papers"
    )

    object Third : OnBoardingPage(
        image = R.drawable.nav1,
        title = "Navigation",
        description = "Makes your navigation in the college much easier"
    )

    object Fourth : OnBoardingPage(
        image = R.drawable.manymore,
        title = "",
        description = "And Many More!!... "
    )
}
