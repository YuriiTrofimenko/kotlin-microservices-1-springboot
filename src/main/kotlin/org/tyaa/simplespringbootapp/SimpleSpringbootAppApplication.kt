package org.tyaa.simplespringbootapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class SimpleSpringbootAppApplication

@Controller
class FirstController(val firstService: FirstService) {
	@RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
	@ResponseBody
	fun hello(@PathVariable name: String) = firstService.getHello(name)
}

fun main(args: Array<String>) {
	runApplication<SimpleSpringbootAppApplication>(*args)
}
