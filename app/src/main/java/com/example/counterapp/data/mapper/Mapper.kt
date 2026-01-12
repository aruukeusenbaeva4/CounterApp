package com.example.counterapp.data.mapper

import com.example.counterapp.data.model.CountDto
import com.example.counterapp.domain.model.Count
import com.example.counterapp.domain.model.TypeOfOperations

fun CountDto.toDomain() = Count(
    count = count.orDefault(),
    countOfDecrement = countOfDecrement.orDefault(),
    countOfIncrement = countOfIncrement.orDefault(),
    typeOfOperation = TypeOfOperations.toTypeOfOperations(typeOfOperation),
)

fun  Int?.orDefault() = this ?: 0

