package com.example.kodeina.data.db

class DatabaseFakeImplementation: Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImplemantation()
}