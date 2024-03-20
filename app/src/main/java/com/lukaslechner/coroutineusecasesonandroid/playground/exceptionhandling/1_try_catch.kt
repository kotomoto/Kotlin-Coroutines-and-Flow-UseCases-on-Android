package com.lukaslechner.coroutineusecasesonandroid.playground.exceptionhandling

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun main() {
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            launch {
                throwingFunction()
            }
        } catch (e: Exception) {
            println("Caught: $e")
        }
    }

    Thread.sleep(100)
}

private fun throwingFunction() {
    throw RuntimeException()
}