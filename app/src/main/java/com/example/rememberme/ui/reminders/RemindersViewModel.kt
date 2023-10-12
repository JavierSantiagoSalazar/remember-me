package com.example.rememberme.ui.reminders

import androidx.lifecycle.ViewModel
import com.example.rememberme.domain.Reminders.Reminder

class RemindersViewModel : ViewModel() {

    data class UIState(
        val reminders: List<Reminder>,
        val loading: Boolean,
        val error: Error,
    )
}
