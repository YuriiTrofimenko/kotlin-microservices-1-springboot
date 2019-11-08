package org.tyaa.simplespringbootapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleSpringbootAppApplication

fun main(args: Array<String>) {
	runApplication<SimpleSpringbootAppApplication>(*args)
}
