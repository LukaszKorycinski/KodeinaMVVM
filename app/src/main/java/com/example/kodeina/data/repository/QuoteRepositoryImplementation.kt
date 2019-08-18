package com.example.kodeina.data.repository

import androidx.lifecycle.LiveData
import com.example.kodeina.data.db.QuoteDao
import com.example.kodeina.data.model.Quote

class QuoteRepositoryImplementation(private val quoteDao:QuoteDao) : QuoteRepository{
    override fun addQuotes(quote: Quote) {
        quoteDao.addQuotes(quote)
    }

    override fun getQuotes(): LiveData<List<Quote>> = quoteDao.getQuotes()
}