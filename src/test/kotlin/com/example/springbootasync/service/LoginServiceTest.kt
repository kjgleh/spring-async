package com.example.springbootasync.service

import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class LoginServiceTest(
    @MockK private val messageService: MessageService,
) {

    @InjectMockKs
    private lateinit var sut: LoginService

    @Test
    @DisplayName("")
    fun `test`() {
        // Arranger
        every {
            messageService.sendMessage("hello")
        } returns "test"

        // Act
        sut.loginCompletableFuture()

        // Assert
        verify {
            messageService.sendMessage("hello")
        }

    }
}