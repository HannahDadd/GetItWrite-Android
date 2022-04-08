package com.example.getitwrite.views

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getitwrite.R
import androidx.compose.ui.layout.ContentScale




@Composable
fun showLogin() {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Image(painter = painterResource(id = R.drawable.sitting), modifier = Modifier.fillMaxWidth(), contentDescription = "", contentScale = ContentScale.FillWidth)
        Text("Login", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
            TextField(
                value = email.value,
                maxLines = 1,
                onValueChange = { email.value = it },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = password.value,
                maxLines = 1,
                onValueChange = { password.value = it },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )
            TextButton(onClick = {/**/}) {
                Text("Forgot Password?", color = Colours.Dark_Readable, fontWeight = FontWeight.Bold, textAlign = TextAlign.End)
            }
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /* ... */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Colours.Dark_Readable, contentColor = Color.White)
        ) {
            Text("LOGIN", Modifier.padding(10.dp), fontWeight = FontWeight.Bold)
        }
        TextButton(onClick = {/**/}) {
            Text("Don't have an account? Sign Up", color = Colours.Dark_Readable, fontWeight = FontWeight.Bold)
        }
    }
}

object Colours{
    val Dark_Readable = Color(0xFF729B79)
    val signOutGrey = Color(0xFF444444)
}