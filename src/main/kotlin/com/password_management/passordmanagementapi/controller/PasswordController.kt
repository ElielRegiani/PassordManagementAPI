package com.password_management.passordmanagementapi.controller

import com.password_management.passordmanagementapi.service.PasswordService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class PasswordController(
    val passwordService: PasswordService
) {

    @PostMapping(path = ["/define/password"])
    fun definePassword(): ResponseEntity<Any> {
        this.passwordService.newDefinePassword()
        return ResponseEntity.ok().build()
    }
}