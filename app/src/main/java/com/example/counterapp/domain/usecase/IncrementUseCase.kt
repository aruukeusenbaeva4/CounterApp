package com.example.counterapp.domain.usecase

import com.example.counterapp.domain.repository.CountRepository

class IncrementUseCase (
    private val repository: CountRepository
){
    operator fun invoke() = repository.increment()
}