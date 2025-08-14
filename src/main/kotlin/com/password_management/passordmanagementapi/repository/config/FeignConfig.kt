package com.password_management.passordmanagementapi.repository.config

import feign.Logger
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClientsConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@EnableFeignClients(basePackages = ["com.password_management.passordmanagementapi.repository"])
@Import(FeignClientsConfiguration::class)
class FeignConfig {

    @Bean
    fun feignLoggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }
}