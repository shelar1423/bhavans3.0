package com.example.onboardingcompose.screen


import android.graphics.LinearGradient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2


@Composable
fun GradientButton(
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
        shape = RoundedCornerShape(20.dp),
        onClick = {onClick}) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 25.sp,
            )
        }
    }

}

@Composable
fun GradientButton2(
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
        shape = RoundedCornerShape(20.dp),
        onClick = {onClick}) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 20.dp, bottom = 20.dp, start = 10.dp, end = 10.dp)
                .height(60.dp)
                .width(150.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 30.sp,
            )
        }
    }

}
@Preview
@Composable
fun GradientPreview() {
    GradientButton(
        text = "Button",
        textColor = Color.Black,
        gradient = Brush.horizontalGradient(
            colors = listOf(
               c1, c2
            )
        )
    ) {

    }
}