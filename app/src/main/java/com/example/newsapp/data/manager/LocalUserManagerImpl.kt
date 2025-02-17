package com.example.newsapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.newsapp.domain.manager.LocalUserManager
import com.example.newsapp.util.Constants
import com.example.newsapp.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Реализация интерфейса
 * Реализация интерфейса LocalUserManager использует DataStore для хранения и получения данных.
 * saveAppEntry сохраняет данные в DataStore.
 * readAppEntry читает данные из DataStore и возвращает их в виде потока.
 */

class LocalUserManagerImpl(
    private val context: Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

/**
 * DataStore и PreferencesKey
 * Определение DataStore для хранения данных в контексте приложения.
 * Использование ключей для доступа к сохранённым значениям.
 */

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}