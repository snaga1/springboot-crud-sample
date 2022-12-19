package com.example.crudsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudSampleApplication

fun main(args: Array<String>) {
	runApplication<CrudSampleApplication>(*args)
}
