package com.example.loginapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapplication.R
import com.example.loginapplication.composables.HeadingTextComponent
import com.example.loginapplication.composables.MyTextField
import com.example.loginapplication.composables.NormalTextComponent
import com.example.loginapplication.composables.PasswordTextFieldComponent

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NormalTextComponent(value = "hello there,")
            HeadingTextComponent(value = "Create an Account")
            Spacer( modifier = Modifier.padding(20.dp) )
            MyTextField(labelValue = "First Name", painterResource(id = R.drawable.profile_icon))
            MyTextField(
                labelValue = "Last Name",
                painterResource = painterResource(id = R.drawable.profile_icon)
            )
            MyTextField(
                labelValue = "Email",
                painterResource = painterResource(id = R.drawable.mail_icon)
            )
            PasswordTextFieldComponent(
                labelValue = "Password",
                painterResource = painterResource(id = R.drawable.icon_password)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SignUpScreen()
}