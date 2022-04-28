package com.maideasy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MaidForYouApplication

fun main(args: Array<String>) {
    runApplication<MaidForYouApplication>(*args)
}
