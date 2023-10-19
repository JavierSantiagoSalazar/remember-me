package com.example.rememberme.ui.reminders

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rememberme.R
import com.example.rememberme.databinding.FragmentRemindersBinding

class RemindersFragment : Fragment(R.layout.fragment_reminders) {

    private val adapter = RemindersAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentRemindersBinding.bind(view).apply {
            recyclerReminders.adapter = adapter
        }
    }
}
