package com.example.counterapp.di

import com.example.counterapp.data.datasource.CountDataSource
import com.example.counterapp.data.repository.CountRepositoryImpl
import com.example.counterapp.domain.model.Count
import com.example.counterapp.domain.repository.CountRepository
import com.example.counterapp.domain.usecase.DecrementUseCase
import com.example.counterapp.domain.usecase.GetCountUseCase
import com.example.counterapp.domain.usecase.IncrementUseCase
import com.example.counterapp.domain.usecase.ResetUseCase
import com.example.counterapp.presentation.count.CountViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule:List<Module> get() = listOf(dataModule,domainModule,presentationModule)

val dataModule = module {

    single { CountDataSource() }
    single<CountRepository> {
        CountRepositoryImpl(
            countApi = get()
        )
    }
}

val domainModule = module {

    factory { IncrementUseCase(repository = get()) }
    factory { DecrementUseCase(repository = get()) }
    factory { ResetUseCase(repository = get()) }
    factory { GetCountUseCase(repository = get()) }
}

val presentationModule = module {

    viewModel {
        CountViewModel(
            incrementUseCase = get(),
            decrementUseCase = get(),
            resetUseCase = get(),
            getCountUseCase = get()
        )
    }
}