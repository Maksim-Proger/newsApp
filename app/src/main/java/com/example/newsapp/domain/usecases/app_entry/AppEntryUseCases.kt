package com.example.newsapp.domain.usecases.app_entry

/**
 * Data Class для операций
 * Этот data class агрегирует операции чтения и сохранения, что упрощает их передачу в зависимости.
 */

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)
