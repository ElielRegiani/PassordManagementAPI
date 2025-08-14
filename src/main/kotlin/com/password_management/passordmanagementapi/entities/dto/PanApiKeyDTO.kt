package com.password_management.passordmanagementapi.entities.dto

import org.springframework.stereotype.Component

@Component
data class PanApiKeyDTO(
    val apiKey: String = "123"
)
