package com.example.kodeina

import android.app.Application
import com.example.kodeina.data.db.Database
import com.example.kodeina.data.db.DatabaseFakeImplementation
import com.example.kodeina.data.db.QuoteDao
import com.example.kodeina.data.repository.QuoteRepository
import com.example.kodeina.data.repository.QuoteRepositoryImplementation
import com.example.kodeina.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesAplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImplementation() }//wszedzie do interfejsu database wstrzykujemy databasefakeimplementation
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImplementation(instance()) }
        //bind<QuotesViewModelFactory>() with provider { QuotesViewModelFactory(instance()) } //za każdym razem inna instancja (odwrotność singletonu)
        bind() from provider { QuotesViewModelFactory(instance()) } //za każdym razem inna instancja (odwrotność singletonu)
    }
}