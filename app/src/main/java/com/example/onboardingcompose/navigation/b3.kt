package com.example.onboardingcompose.screen

import android.os.Build
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.bab
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun b3(navController: NavHostController,
              welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    Text(
        text = " END DESTINATION,",
        modifier = Modifier.padding(start = 160.dp, top = 29.dp),
        color = Color.White,
        fontSize = 25.sp,
        fontFamily = FontFamily.SansSerif
    )

    Image(
        painter = painterResource(id = R.drawable.llines), contentDescription = null,
        modifier = Modifier
            .padding(top = 220.dp)
            .fillMaxWidth()

            .fillMaxHeight()
        /*.background(
            Color.White
        )*/,
        contentScale = ContentScale.FillBounds,

        )

    val gradient =
        Brush.horizontalGradient(listOf(Color(0xFFB4D3CB),
            Color(0x673AB7)))

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxHeight()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.nav),
                contentDescription = null,
                //alignment = Alignment.TopCenter,
                modifier = Modifier
                    .padding(top = 0.dp, bottom = 1.dp)

                    .background(color = Color.Transparent)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .fillMaxSize(),

                contentScale = ContentScale.FillWidth,
            )


            Image(
                painter = painterResource(id = R.drawable.navtext),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    //.background(color = Color.White)
                    .padding(top = 40.dp, bottom = 100.dp, start = 10.dp)
                    .fillMaxWidth()
                    .fillMaxSize()
                    .fillMaxHeight()


            )

        }
        Box(modifier = Modifier.height(75.dp)){

        }
        Column(verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.fillMaxHeight()) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()) {

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b31.route) },
                    text = "COMMERCE" ,
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b32.route) },
                    text = "Library",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))

            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b33.route) },
                    text = "MBA",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b34.route) },
                    text = "BIO CHEM",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b35.route) },
                    text = "IT",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))

                GradientB2(gradient = gradient,
                    onClick = { navController.navigate(Screen.b36.route) },
                    text = "SCIENCE",
                    img = painterResource(id = R.drawable.images_removebg_preview__2_))
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
        color: Color,
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
            androidx.compose.material.Text(
                text = text,
                color = Color.Blue,

                fontWeight = FontWeight.ExtraBold,
                fontFamily = bab,
            )
        }
    }
}


@ExperimentalCoilApi
@Composable
fun b31( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
@ExperimentalCoilApi
@Composable
fun b32( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
@ExperimentalCoilApi
@Composable
fun b33( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
@ExperimentalCoilApi
@Composable
fun b34( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
@ExperimentalCoilApi
@Composable
fun b35( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
@ExperimentalCoilApi
@Composable
fun b36( navHostController: NavHostController,
              modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context).data(data = R.drawable.giftry).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
    )
}
