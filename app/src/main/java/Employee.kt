package com.example.fragment
import java.io.Serializable

class Fragment(
    val name: String,
    val email: String
) : Serializable {

    init {
        var string = email
    }
}