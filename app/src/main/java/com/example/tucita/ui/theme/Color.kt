package com.example.tucita.ui.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF14B894),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD1FAF1),
    onPrimaryContainer = Color(0xFF052E25),

    secondary = Color(0xFF2981A3),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFD6ECF5),
    onSecondaryContainer = Color(0xFF0A2029),

    tertiary = Color(0xFF2943A3),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFD6DDF5),
    onTertiaryContainer = Color(0xFF0A1129),

    error = Color(0xFFC72E0F),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFD5CC),
    onErrorContainer = Color(0xFF330900),

    background = Color(0xFFFCFDFD),
    onBackground = Color(0xFF171C1B),
    surface = Color(0xFFFCFDFD),
    onSurface = Color(0xFF171C1B),
    surfaceVariant = Color(0xFFDEEDEA),
    onSurfaceVariant = Color(0xFF36635A),

    outline = Color(0xFF66998E),
    outlineVariant = Color(0xFFBDDBD5),

    inverseSurface = Color(0xFF2E3836),
    inverseOnSurface = Color(0xFFF1F4F3),
    inversePrimary = Color(0xFFA3F5E3),

    scrim = Color(0xFF000000),
    // shadow no tiene propiedad directa en ColorScheme
)

private val DarkColorScheme = lightColorScheme(
    primary = Color(0xFFA3F5E3),
    onPrimary = Color(0xFF0A5C4A),
    primaryContainer = Color(0xFF0F8A6F),
    onPrimaryContainer = Color(0xFFD1FAF1),

    secondary = Color(0xFFADD9EB),
    onSecondary = Color(0xFF144052),
    secondaryContainer = Color(0xFF1F607A),
    onSecondaryContainer = Color(0xFFD6ECF5),

    tertiary = Color(0xFFADBBEB),
    onTertiary = Color(0xFF142252),
    tertiaryContainer = Color(0xFF1F327A),
    onTertiaryContainer = Color(0xFFD6DDF5),

    error = Color(0xFFF5B1A3),
    onError = Color(0xFF661100),
    errorContainer = Color(0xFF991900),
    onErrorContainer = Color(0xFFFFD5CC),

    background = Color(0xFF0E1110),
    onBackground = Color(0xFFE3E8E7),
    surface = Color(0xFF0E1110),
    onSurface = Color(0xFFE3E8E7),
    surfaceVariant = Color(0xFF36635A),
    onSurfaceVariant = Color(0xFFBDDBD5),

    outline = Color(0xFF85ADA5),
    outlineVariant = Color(0xFF36635A),

    inverseSurface = Color(0xFFE3E8E7),
    inverseOnSurface = Color(0xFF2E3836),
    inversePrimary = Color(0xFF14B894),

    scrim = Color(0xFF000000),
    // shadow no tiene propiedad directa en ColorScheme
)