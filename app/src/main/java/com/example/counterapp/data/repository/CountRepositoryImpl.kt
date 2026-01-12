package com.example.counterapp.data.repository

import com.example.counterapp.data.datasource.CountDataSource
import com.example.counterapp.data.mapper.toDomain
import com.example.counterapp.domain.model.Count
import com.example.counterapp.domain.repository.CountRepository

class CountRepositoryImpl(
    private val countApi: CountDataSource
): CountRepository {

    override fun increment() {
        countApi.increment()
    }

    override fun decrement() {
        countApi.decrement()

    }

    override fun getCount(): Count {
        return countApi.getCount().toDomain()
    }

    override fun reset() {
        countApi.reset()

    }
}