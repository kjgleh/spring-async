package com.example.springbootasync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
class SpringbootAsyncApplication

fun main(args: Array<String>) {
    runApplication<SpringbootAsyncApplication>(*args)
}
