package org.tyaa.simplespringbootapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class SimpleSpringbootAppApplication {
	@Bean
	@ConditionalOnExpression("#{'\${service.type}'=='simple'}")
	fun firstService(): ServiceInterface = FirstService()

	@Bean
	@ConditionalOnExpression("#{'\${service.type}'=='advance'}")
	fun secondService(): ServiceInterface = SecondService()
}

@Controller
class FirstController {

	@Autowired
	lateinit var service: ServiceInterface

	@RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
	@ResponseBody
	fun hello(@PathVariable name: String) = service.getHello(name)
}

fun main(args: Array<String>) {
	runApplication<SimpleSpringbootAppApplication>(*args)
}
