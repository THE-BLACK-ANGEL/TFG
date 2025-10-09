package com.example.tucita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tucita.ui.theme.TuCitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bienvenida(modifier = Modifier)
        }
    }
}

//Funcion para la pantalla de bienvenida e inicio de sesion
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
            Text(text = "Bienvenid@s a TuCita")
            //TextField para el correo electronico
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo electrónico")}
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

@Preview(showBackground = true)
@Composable
fun PreviewAllAplication() {
    TuCitaTheme {
        Bienvenida()
    }
}