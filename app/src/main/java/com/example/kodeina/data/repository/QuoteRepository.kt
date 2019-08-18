package com.example.kodeina.data.repository

import androidx.lifecycle.LiveData
import com.example.kodeina.data.model.Quote

interface QuoteRepository {
    fun addQuotes(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}