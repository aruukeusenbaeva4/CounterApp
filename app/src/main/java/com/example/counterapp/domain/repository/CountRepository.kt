package com.example.counterapp.domain.repository

import com.example.counterapp.domain.model.Count

interface CountRepository {

    fun increment()

    fun decrement()

    fun getCount() : Count

    fun reset()

}