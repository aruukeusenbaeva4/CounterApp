package com.example.counterapp.data.datasource

import com.example.counterapp.data.model.CountDto

class CountDataSource {

    private var count = 0
    private var countOfIncrement = 0
    private var countOfDecrement = 0
    private var typeOfOperation = 0

    fun increment(){
        count++
        countOfIncrement++
        typeOfOperation = 1
    }

    fun decrement(){
        count--
        countOfDecrement++
        typeOfOperation = 2
    }

    fun reset(){
        count = 0
        typeOfOperation = 3
    }

    fun getCount () = CountDto(
        count = count,
        countOfDecrement = countOfDecrement,
        countOfIncrement =  countOfIncrement,
        typeOfOperation = typeOfOperation,

    )
}