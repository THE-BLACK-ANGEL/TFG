package com.example.tucita.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tucita.pantallas.Bienvenida
import com.example.tucita.pantallas.Inicio

@Composable
fun NavWrapper(){
    //Creamos un controlador de navegacion
    val navController = rememberNavController()
    //Creamos un NavHost
    NavHost(navController= navController, startDestination = Login){
        composable<Login>{
            Bienvenida{
                navController.navigate(Inicio)
            }
        }
        composable<Inicio>{
            Inicio()
        }
    }
}