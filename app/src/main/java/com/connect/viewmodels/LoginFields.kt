package com.connect.viewmodels

import androidx.databinding.ObservableField

class LoginFields {
    var number: String? = null
    var otp: String? = null
    var numberError = ObservableField<String>()


    fun isNumberValid(setMessage: Boolean): Boolean {
        return if (number != null && number?.length!! > 9) {
            numberError.set("") // numberError is observable so need to cheange
            numberError.set(null)
            true
        } else {
            if (setMessage) {
                numberError.set(null)
                numberError.set("Please enter 10 digit number")
            }
            false
        }
    }
}