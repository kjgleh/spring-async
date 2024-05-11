package com.example.springbootasync.service

import io.github.oshai.kotlinlogging.KotlinLogging
import java.time.LocalDateTime
import java.util.concurrent.CompletableFuture
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class MessageService {

    @Async("asyncExecutor")
    fun sendMessageAsync(message: String): CompletableFuture<String> {
        (1..5).forEach {
            Thread.sleep(1000)
            logger.info { "$it...." }
        }
        logger.info { "send: $message" }

        val result = "sent at: ${LocalDateTime.now()}"

        return CompletableFuture.completedFuture(result)
    }

    fun sendMessage(message: String): String {
        (1..5).forEach {
            Thread.sleep(1000)
            logger.info { "$it...." }
        }
        logger.info { "send: $message" }

        val result = "sent at: ${LocalDateTime.now()}"

        return result
    }
}