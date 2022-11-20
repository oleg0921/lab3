package com.example.lab3.ui.model

import com.example.lab3.ui.InterfaceAdapter

data class Image(
    val id: Int = 0,
    val name: String? = null,
    val time: String? = null,
) : InterfaceAdapter {

    override fun getType(): Int {
        return InterfaceAdapter.IMAGE_TYPE
    }
}
