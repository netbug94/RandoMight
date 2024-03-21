package com.example.randomight.engine_logic

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WordSelector : ViewModel() {

    private val wordBankBridge = LocalWordBank.words

    var passwordLength by mutableIntStateOf(0)

    var selectedWord by mutableStateOf<String?>("")

    fun wordSelect() {
        val matchingWords = wordBankBridge.filter { it.length == passwordLength }
        selectedWord = if (matchingWords.isNotEmpty()) {
            matchingWords.random()
        } else {
            null
        }
    }
}