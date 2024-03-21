package com.example.passphraser.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passphraser.R

@Preview(showBackground = true)
@Composable
fun MainScreenV() {

// Container
    Box(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text("Pass Phraser",
                fontSize = 28.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(6.dp))

            Image(painter = painterResource(R.mipmap.ic_launcher_foreground),
                contentDescription = "Image content description",
                Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Box(modifier = Modifier
                    .width(200.dp)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.outline,
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(8.dp)) {
                Text(text = "viewModel.generatedPassword",
                    fontSize = 18.sp,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.padding(16.dp))
            Text("Desired Length: "/*${viewModel.desiredPasswordLength}*/,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Slider(value = 1F,
                onValueChange = {/**/ },
                /*
                value = viewModel.desiredPasswordLength.toFloat(),
                onValueChange = {
                    viewModel.desiredPasswordLength = it.toInt()
                },
                 */
                valueRange = 10f..16f,
                steps = 0.1f.toInt(),
                modifier = Modifier.width(200.dp),
                colors = SliderDefaults.colors(
                    activeTickColor = Color.Transparent,
                    inactiveTickColor = Color.Transparent,
                    inactiveTrackColor = MaterialTheme.colorScheme.secondary,
                    activeTrackColor = MaterialTheme.colorScheme.tertiary,
                    thumbColor = MaterialTheme.colorScheme.primary
                )
            )

            Spacer(modifier = Modifier.height(22.dp))

            Button(colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                onClick = { /*viewModel.generateRandomPassword()*/ }) {
                Spacer(modifier = Modifier.height(50.dp))
                Text("Generate Passphrase")
            }

            Spacer(modifier = Modifier.padding(bottom = 26.dp))
        }
    }
}