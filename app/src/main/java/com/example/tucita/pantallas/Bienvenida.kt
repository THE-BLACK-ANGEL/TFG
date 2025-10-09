package com.example.tucita.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.tucita.R

@Composable
fun Bienvenida (modifier: Modifier = Modifier){
    //Variable mutable para el correo electronico
    var email by remember { mutableStateOf("") }
    //Variable mutable para la contraseña
    var password by remember { mutableStateOf("") }
    //Variable para la visibilidad de la contraseña
    var passwordVisible by remember { mutableStateOf(false) }

    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            //Logo de la app que colocaremos en la pantalla de bienvenida
            Image(
                contentDescription = "Logo de la app",
                painter = painterResource(id = R.drawable.logo),
                modifier = Modifier.width(200.dp)
            )
            //TextField para el correo electronico
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo electrónico")},
                modifier = modifier
            )
            //TextField para la contraseña
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña")},
                //CONTINUAR DESDE AQUÍ --> PONER ICONOS EN EL PROYECTO DE GOOGLE ,
                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            imageVector = if(passwordVisible) Icons.Default.Clear else Icons.Default.Lock,
                            contentDescription = if (passwordVisible) "Ocultar Contraseña" else "Mostrar Contraseña"
                        )
                    }
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()
            )
            //Boton para iniciar sesion
            Button(onClick = { /*TODO*/ }){
                Text(text = "Iniciar Sesión")
            }
            //Boton para registrarse
            Button(onClick = { /*TODO*/ }){
                Text(text = "Registrarse")
            }
        }
    }
}