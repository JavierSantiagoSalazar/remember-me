package com.example.rememberme.reminders

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rememberme.R
import com.example.rememberme.common.basicDiffUtil
import com.example.rememberme.common.inflate
import com.example.rememberme.databinding.ItemReminderBinding
import com.example.rememberme.domain.Reminder

class RemindersAdapter :
    ListAdapter<Reminder, RemindersAdapter.ViewHolder>(basicDiffUtil { old, new -> old.id == new.id }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.item_reminder)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val reminder = getItem(position)
        holder.bind(reminder)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemReminderBinding.bind(view)
        fun bind(reminder: Reminder) = with(binding) {
            tvReminder.text = reminder.reminder
            tvHour.text = reminder.hour
            tvDate.text = reminder.date
            tvAlarm.text = reminder.alarm
            tvImportance.text = reminder.importance
        }
    }
}
