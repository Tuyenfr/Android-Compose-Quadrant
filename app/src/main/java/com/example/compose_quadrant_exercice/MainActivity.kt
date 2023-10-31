package com.example.compose_quadrant_exercice

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_quadrant_exercice.ui.theme.ComposeQuadrantExerciceTheme
import com.example.compose_quadrant_exercice.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantExerciceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorScheme.background
                ) {
                    Greeting(
                        stringResource(R.string.TitleTopLeft),
                        stringResource(R.string.TextTopLeft),
                        stringResource(R.string.TitleTopRight),
                        stringResource(R.string.TextTopRight),
                        stringResource(R.string.TitleBottomLeft),
                        stringResource(R.string.TextBottomLeft),
                        stringResource(R.string.TitleBottomRight),
                        stringResource(R.string.TextBottomRight)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(titleTopLeft: String, textTopLeft: String, titleTopRight: String, textTopRight: String, titleBottomLeft: String, textBottomLeft: String, titleBottomRight: String, textBottomRight: String, modifier: Modifier = Modifier)
{
    val color1 = Color(0xFFEADDFF)
    val color2 = Color(0xFFD0BCFF)
    val color3 = Color(0xFFB69DF8)
    val color4 = Color(0xFFF6EDFF)

    Column(modifier = modifier.fillMaxSize())
    {
        Row {
            Column(
                modifier = modifier
                    .fillMaxWidth(0.5f)
            ) {
                Column(modifier = modifier
                    .fillMaxHeight(0.5f)
                    .background(color1)) {
                    Column(
                        modifier = modifier
                            .fillMaxHeight(1f)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        )
                        {
                            Column {
                                Text(
                                    text = titleTopLeft,
                                    modifier = modifier.padding(bottom = 16.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Column {
                                Text(
                                    text = textTopLeft,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Justify
                                )
                            }
                        }
                    }
                }

                Column(modifier = modifier
                    .fillMaxHeight(1f)
                    .background(color2)) {
                    Column(
                        modifier = modifier
                            .fillMaxHeight(1f)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        )
                        {
                            Column {
                                Text(
                                    text = titleBottomLeft,
                                    modifier = modifier.padding(bottom = 16.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Column {
                                Text(
                                    text = textBottomLeft,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Justify
                                )
                            }
                        }
                    }
                }

            }

            Column(
                modifier = modifier
                    .fillMaxWidth(1f)
            ) {
                Column(modifier = modifier
                    .fillMaxHeight(0.5f)
                    .background(color3)) {
                    Column(
                        modifier = modifier
                            .fillMaxHeight(1f)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        )
                        {
                            Column {
                                Text(
                                    text = titleTopRight,
                                    modifier = modifier.padding(bottom = 16.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Column {
                                Text(
                                    text = textTopRight,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Justify
                                )
                            }
                        }
                    }
                }

                Column(modifier = modifier
                    .fillMaxHeight(1f)
                    .background(color4)) {
                    Column(
                        modifier = modifier
                            .fillMaxHeight(1f)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        )
                        {
                            Column {
                                Text(
                                    text = titleBottomRight,
                                    modifier = modifier.padding(bottom = 16.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Column {
                                Text(
                                    text = textBottomRight,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Justify
                                )
                            }
                        }
                    }
                }

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantExerciceTheme {
        Greeting(
            stringResource(R.string.TitleTopLeft),
            stringResource(R.string.TextTopLeft),
            stringResource(R.string.TitleTopRight),
            stringResource(R.string.TextTopRight),
            stringResource(R.string.TitleBottomLeft),
            stringResource(R.string.TextBottomLeft),
            stringResource(R.string.TitleBottomRight),
            stringResource(R.string.TextBottomRight)
        )
    }
}