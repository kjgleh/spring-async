package com.example.springbootasync.service

import io.github.oshai.kotlinlogging.KotlinLogging
import java.util.concurrent.CompletableFuture
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class LoginService(
    private val messageService: MessageService,
) {

    fun loginAsync() {
        logger.info { "login start" }

        messageService.sendMessageAsync("hello")
            .thenAccept { logger.info { "result: $it" } }

        logger.info { "login end" }
    }

    fun loginCompletableFuture() {
        logger.info { "login start" }

        CompletableFuture.supplyAsync {
            messageService.sendMessage("hello")
        }.thenAccept {
            logger.info { "result: $it" }
        }

        logger.info { "login end" }
    }
}