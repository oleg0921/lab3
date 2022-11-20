package com.example.lab3.ui.model

import com.example.lab3.ui.InterfaceAdapter

data class User(
    val id: Int = 0,
    val name: String? = null,
    val age: Int = 0,
    val status: String? = null,
    val email: String? = null,
    val onlineStatus: Boolean = false
) : InterfaceAdapter {

    override fun getType(): Int {
        return InterfaceAdapter.USER_TYPE
    }
}
