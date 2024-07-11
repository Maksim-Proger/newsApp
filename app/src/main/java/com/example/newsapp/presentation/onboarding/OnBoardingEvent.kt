package com.example.newsapp.presentation.onboarding

/**
 * События
 * Определение событий для ViewModel, которые инициируют определённые действия (в данном случае сохранение данных).
 * Данные события отправляются из пользовательского интерфейса во ViewModel
 */

sealed class OnBoardingEvent {
    object SaveAppEntry: OnBoardingEvent()
}