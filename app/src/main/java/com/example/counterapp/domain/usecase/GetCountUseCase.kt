package com.example.counterapp.domain.usecase

import com.example.counterapp.domain.repository.CountRepository

class GetCountUseCase (
    private val repository: CountRepository
){
    operator fun invoke() = repository.getCount()
}