package com.example.newsapp.presentation.navgraph

sealed class Route(
    val route: String
) {
    // Основные направления навигации
    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen : Route(route = "homeScreen")
    object SearchScreen : Route(route = "searchScreen")
    object BookmarkScreen : Route(route = "bookmarkScreen")
    object DetailsScreen : Route(route = "detailsScreen")

    // дополнительные направления навигации
    object AppStartNavigation : Route(route = "appStartNavigation")
    object NewsNavigation : Route(route = "NewsNavigation")
    object NewsNavigationScreen : Route(route = "NewsNavigationScreen")
}