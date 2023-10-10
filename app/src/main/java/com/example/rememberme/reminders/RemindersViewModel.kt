package com.example.rememberme.reminders

import androidx.lifecycle.ViewModel
import com.example.rememberme.Reminder

class RemindersViewModel : ViewModel() {

    data class UIState(
        val reminders: List<Reminder>,
        val loading: Boolean,
        val error: Error,
    )
}
