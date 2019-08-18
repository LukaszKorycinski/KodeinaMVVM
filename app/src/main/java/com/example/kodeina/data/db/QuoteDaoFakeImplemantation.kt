package com.example.kodeina.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kodeina.data.model.Quote

class QuoteDaoFakeImplemantation : QuoteDao {

    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()


    init {
        quotes.value = quoteList
    }

    override fun addQuotes(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    override fun getQuotes(): LiveData<List<Quote>> = quotes as LiveData<List<Quote>>
}