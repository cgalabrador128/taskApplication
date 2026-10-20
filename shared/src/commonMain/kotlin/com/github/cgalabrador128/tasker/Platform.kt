package com.github.cgalabrador128.tasker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform