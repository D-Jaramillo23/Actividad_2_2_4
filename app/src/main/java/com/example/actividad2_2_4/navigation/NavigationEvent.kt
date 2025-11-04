package com.example.actividad2_2_4.navigation

sealed class NavigationEvent {

    data class NavigateTo(
        val route: Screen,
        val popUpToRoute: Screen? = null,
        val inclusive: Boolean = flase,
        val singleTop: Boolean = false,
    ) : NavigationEvent()


    object PopBackStack : NavigationEvent ()

    object NavigateUp : NavigationEvent ()
}