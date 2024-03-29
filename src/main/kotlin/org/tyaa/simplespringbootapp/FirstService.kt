package org.tyaa.simplespringbootapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

class FirstService: ServiceInterface {
    @Value(value = "\${service.message.text}")
    private lateinit var text: String
    // Try: java -jar simple-springboot-app-0.0.1-SNAPSHOT.jar --spring.profiles.active="production"
    override fun getHello(name : String) = "$text $name"
}