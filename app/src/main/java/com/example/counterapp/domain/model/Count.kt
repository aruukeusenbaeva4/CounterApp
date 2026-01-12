package com.example.counterapp.domain.model

data class Count(
    val count: Int,
    val countOfIncrement: Int,
    val countOfDecrement: Int,
    val typeOfOperation: TypeOfOperations
)
