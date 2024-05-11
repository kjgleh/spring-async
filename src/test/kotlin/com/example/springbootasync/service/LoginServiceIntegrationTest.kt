package com.example.springbootasync.service

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LoginServiceIntegrationTest @Autowired constructor(
    private val sut: LoginService,
) {

    @Test
    @DisplayName("")
    fun `test_async`() {
        // Arrange

        // Act
        sut.loginAsync()

        Thread.sleep(6000)

        // Assert

    }

    @Test
    @DisplayName("")
    fun `test_completableFuture`() {
        // Arrange

        // Act
        sut.loginCompletableFuture()

        Thread.sleep(6000)

        // Assert

    }
}