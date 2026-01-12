package com.example.counterapp.domain.usecase

import com.example.counterapp.domain.repository.CountRepository

class ResetUseCase (
    private val repository: CountRepository
){
    operator fun invoke() = repository.reset()
}