package com.example.kodeina.ui.quotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kodeina.data.model.Quote
import com.example.kodeina.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun addQuote(quote:Quote) = quoteRepository.addQuotes(quote)
    fun getQuotes() = quoteRepository.getQuotes()

}