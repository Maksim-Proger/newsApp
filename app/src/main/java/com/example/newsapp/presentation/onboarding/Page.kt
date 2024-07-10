package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int // TODO что это за анатация?
)

// Список страниц вступительных экранов
val pages = listOf<Page>(
    Page(
        "Lorem ipsum is simply dummy",
        "Lorem ipsum is simply dummy text of the printing and typesetting inddustry",
        R.drawable.onboarding1
    ),
    Page(
        "Lorem ipsum is simply dummy",
        "Lorem ipsum is simply dummy text of the printing and typesetting inddustry",
        R.drawable.onboarding2
    ),
    Page(
        "Lorem ipsum is simply dummy",
        "Lorem ipsum is simply dummy text of the printing and typesetting inddustry",
        R.drawable.onboarding3
    ),
)