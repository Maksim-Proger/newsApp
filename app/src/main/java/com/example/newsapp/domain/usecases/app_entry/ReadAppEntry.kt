package com.example.newsapp.domain.usecases.app_entry

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
    operator fun invoke() : Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}