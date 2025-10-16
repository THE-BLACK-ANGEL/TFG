package com.example.tucita.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tucita.pantallas.login.Login
import com.example.tucita.pantallas.citas.Inicio

@Composable
fun NavWrapper(){
    //Creamos un controlador de navegacion
    val navController = rememberNavController()
    //Creamos un NavHost
    NavHost(navController= navController, startDestination = Login){
        composable<Login>{
            Login{
                navController.navigate(Inicio)
            }
        }
        composable<Inicio>{
            Inicio()
        }
    }
}