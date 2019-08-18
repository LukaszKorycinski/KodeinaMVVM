package com.example.kodeina.data.db

import androidx.lifecycle.LiveData
import com.example.kodeina.data.model.Quote

interface QuoteDao {
    fun addQuotes(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}