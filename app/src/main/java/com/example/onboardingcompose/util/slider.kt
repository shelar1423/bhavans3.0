package com.example.onboardingcompose.util



import androidx.annotation.DrawableRes
import com.example.onboardingcompose.R

sealed class slider(
    @DrawableRes
    val image: Int,
    //val title: String,
   // val description: String
) {
    object First : slider(
        image = R.drawable.b3)
       /* title = "Welcome",
        description = "to the official Bhavan's App"
    )*/

    object Second : slider(
        image = R.drawable.bvcreal,
        //title = "Coordination",
        //description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    //object Third : slider(
      //  image = R.drawable.b2,
      //  title = "Dialogue",
        //description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    //)
}

