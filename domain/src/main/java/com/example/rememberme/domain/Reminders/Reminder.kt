package com.example.rememberme.domain.Reminders

data class Reminder(
    val id: Int,
    val reminder: String,
    val hour: String,
    val date: String,
    val importance: String,
    val alarm: String,
)
