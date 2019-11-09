package org.tyaa.simplespringbootapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

class SecondService: ServiceInterface {
    @Value(value = "\${service.message.text}")
    private lateinit var text: String
    private var count = 1
    override fun getHello(name: String) : String {
        count++
        return "$text $name ($count)"
    }
}