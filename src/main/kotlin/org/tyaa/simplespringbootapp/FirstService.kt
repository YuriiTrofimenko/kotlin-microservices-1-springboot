package org.tyaa.simplespringbootapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class FirstService {
    @Value(value = "\${service.message.text}")
    private lateinit var text: String

    @Value(value = "\${service.message.suffix}")
    private lateinit var suffix: String

    fun getHello(name : String) = "$text $name$suffix"
}