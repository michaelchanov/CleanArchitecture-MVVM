package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.models.UserName
import com.example.cleanarchitecture.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository : UserRepository) {
    fun execute(): UserName {
        return userRepository.getName()
    }
}