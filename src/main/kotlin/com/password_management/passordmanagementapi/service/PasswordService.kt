package com.password_management.passordmanagementapi.service

import com.password_management.passordmanagementapi.entities.enum.ValydationType
import com.password_management.passordmanagementapi.repository.repository.password.ForgotPasswordRequest
import com.password_management.passordmanagementapi.repository.repository.password.ResetPasswordClient
import org.springframework.stereotype.Service

@Service
class PasswordService(
    private val resetPasswordClient: ResetPasswordClient
) {

    fun newDefinePassword() {
        resetPasswordClient.resetPassword(ForgotPasswordRequest(
            newPassword = "123",
            validationType = ValydationType.BIOMETRY.toString(),
            login = "login"
        ))
    }
}