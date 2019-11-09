package org.tyaa.simplespringbootapp

import org.springframework.stereotype.Service

@Service
class FirstService {
    fun getHello(name : String) = "hello $name"
}