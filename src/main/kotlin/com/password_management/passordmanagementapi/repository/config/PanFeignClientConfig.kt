package com.password_management.passordmanagementapi.repository.config

import com.password_management.passordmanagementapi.entities.dto.PanApiKeyDTO
import feign.RequestInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PanFeignClientConfig {

    @Bean
    fun panCLientInterceptor(panApiKeyDTO: PanApiKeyDTO): RequestInterceptor {
        return RequestInterceptor { template ->
            template.header("x-api-key", panApiKeyDTO.apiKey)
            template.header("x-sistema-origem", "PassordManagementAPI")
        }
    }
}