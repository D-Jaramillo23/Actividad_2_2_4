package com.example.actividad2_2_4.navigation
//Sealed class para definir rutas tipo-safe en la navegación

sealed class Screen(val route: String) {
    data object Home : Screen("home-page")
    data object Profile: Screen("profile_page")
    data object Settings : Screen("settings_page")
    data class Detail(val itemId: String) : Screen("deatail_page/{itemId}") {
        fun buildRoute(): String {
            return route.replace("{itemId}", itemId)
        }
    }
}