package com.example.newsapp.domain.usecases

import com.example.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

/**
 * Классы для управления операциями
 * Этот класс определяет операцию чтения данных (readAppEntry) через интерфейс LocalUserManager.
 * Функция invoke возвращает поток данных типа Flow<Boolean>.
 */

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() : Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}