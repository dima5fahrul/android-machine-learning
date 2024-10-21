package com.example.generativeaismartreply

data class Message(
    val text: String,
    val isLocalUser: Boolean,
    val timestamp: Long
)