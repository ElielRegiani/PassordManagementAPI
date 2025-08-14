package com.password_management.passordmanagementapi.repository.repository.password

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.password_management.passordmanagementapi.repository.config.PanFeignClientConfig
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(
    name = "panClient",
    url = "\${pan.user.reset-password.url}",
    configuration = [PanFeignClientConfig::class]
)
interface ResetPasswordClient {

    @PutMapping(
        path = ["/user/forgot-password"],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun resetPassword(
        @RequestBody request: ForgotPasswordRequest
    )
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForgotPasswordRequest(
    val newPassword: String,
    val validationType : String,
    val login: String
)