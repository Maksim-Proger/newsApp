package com.example.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс для управления локальными данными
 * Интерфейс определяет две функции: сохранение и чтение данных.
 */

interface LocalUserManager {
    suspend fun saveAppEntry()
    fun readAppEntry(): Flow<Boolean>
}