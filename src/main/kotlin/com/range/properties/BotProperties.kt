package com.range.properties

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("discord")
data class BotProperties(
    val token: String,
)