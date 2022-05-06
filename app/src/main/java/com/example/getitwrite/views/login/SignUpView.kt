package com.example.getitwrite.views.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getitwrite.R

@Composable
fun showSignUp() {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var confirmPassword = remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Image(painter = painterResource(id = R.drawable.building), modifier = Modifier.fillMaxWidth(), contentDescription = "", contentScale = ContentScale.FillWidth)
        Text("Sign Up", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
            TextField(
                value = email.value,
                maxLines = 1,
                onValueChange = { email.value = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Email") }
            )
            TextField(
                value = password.value,
                maxLines = 1,
                onValueChange = { password.value = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Password") }
            )
            TextField(
                value = confirmPassword.value,
                maxLines = 1,
                onValueChange = { confirmPassword.value = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Password") }
            )
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /* ... */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Colours.Dark_Readable, contentColor = Color.White)
        ) {
            Text("SIGN UP", Modifier.padding(10.dp), fontWeight = FontWeight.Bold)
        }
    }
}
