package com.nukesz.microservices

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.nukesz.microservices")
                .mainClass(Application.javaClass)
                .start()
    }
}