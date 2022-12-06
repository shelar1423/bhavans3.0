package com.example.onboardingcompose.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.R
import com.example.onboardingcompose.ui.theme.OnBoardingComposeTheme
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2


@Composable
fun meeeeee() {

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
            Text(text = "Kulapathi Dr. K. M. Munshi founded Bharatiya Vidya Bhavan on 7 November 1938 with the blessings of Mahatma Gandhi. Over a period of time, Bhavans has grown into a secular, apolitical, cultural and educational organization. It has around 367 constituent institutions, 119 centers in India and 8 centers overseas. About 22,000 members have committed themselves to the Bhavan's ideal \" Vasudhaiva Kutumbakam \" (The World is One Family) and lives by its code.",
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(scroll)
                    ,
                fontSize = 20.sp,
                color=Color.Black,
            overflow = TextOverflow.Clip)
            Spacer(modifier = Modifier.height(50.dp))
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
                    Image(
                        painter = painterResource(R.drawable.pl1),
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
                        text = "Placements",
                        textColor = Color.Black,
                        gradient = Brush.horizontalGradient(
                            colors = listOf(c2, c1)

                        )
                    ) { }
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
                       // onClick = { navController.navigate(NavigationItem.Navscreen.route) },
                        gradient = Brush.horizontalGradient(
                            colors = listOf(c2, c1)

                        )
                    ) { }
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
                        gradient = Brush.horizontalGradient(
                            colors = listOf(c2, c1)

                        )
                    ) { }
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
                        gradient = Brush.horizontalGradient(
                            colors = listOf(c2, c1)

                        )
                    ) { }
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
                        gradient = Brush.horizontalGradient(
                            colors = listOf(c2, c1)

                        )
                    ) { }
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
fun GBhome123(
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
        shape = RoundedCornerShape(topEnd = 30.dp, bottomStart = 30.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
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
@Preview(showBackground = true)
@Composable
fun DefaultPrev1() {
    OnBoardingComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box {
                meeeeee()
            }
        }

    }
}