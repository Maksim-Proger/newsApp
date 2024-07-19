package com.example.newsapp.domain.usecases.app_entry

import com.example.newsapp.domain.manager.LocalUserManager

/**
 * Классы для управления операциями
 * Этот класс определяет операцию сохранения данных (saveAppEntry) через интерфейс LocalUserManager.
 * invoke позволяет использовать объект класса как функцию.
 */

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}