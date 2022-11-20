package com.example.lab3.ui

interface InterfaceAdapter {
    fun getType(): Int

    companion object {
        const val USER_TYPE: Int = 1
        const val IMAGE_TYPE: Int = 2
    }
}