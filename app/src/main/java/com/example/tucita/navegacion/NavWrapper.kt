package com.example.tucita.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tucita.pantallas.login.Login

@Composable
fun NavWrapper(){
    //Creamos un controlador de navegacion
    val navController = rememberNavController()
    //Creamos un NavHost
    NavHost(navController= navController, startDestination = Login){

        //Pantallas login
        composable<Login>{
            Login{
                navController.navigate(Inicio)
            }
        }
        composable<Recuperar> {

        }
        composable<Registro> {

        }

        //Pantallas citas
        composable<Inicio> {

        }
        composable<MisCitas> {

        }
        composable<Servicios> {

        }
        composable<DetalleCita> {

        }
        composable<CrearCita> {

        }
        composable<Confirmacion> {

        }
        composable<Historial> {

        }

        //Pantallas perfil
        composable<Configuracion> {

        }
        composable<Notificaciones> {

        }
        composable<Perfil> {

        }

        //Pantallas modo administrador
        composable<Panel> {

        }
        composable<MCitas> {

        }
        composable<MServicios> {

        }
        composable<MUsuarios> {

        }
        composable<MNotificaciones> {

        }
        composable<MProfesionales> {

        }
        composable<MRoles> {

        }
        composable<MAplicacion> {

        }


    }
}