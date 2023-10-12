package com.example.rememberme.onBoarding

import android.content.Context
import com.example.rememberme.R
import com.example.rememberme.domain.Board

object BoardListProvider {

    fun getData(context: Context): List<Board> {
        return listOf(
            Board(
                image = R.drawable.man_thinking,
                title = context.getString(R.string.on_boarding_title_welcome),
                description = context.getString(R.string.on_boarding_description_welcome),
            ),
            Board(
                image = R.drawable.developing_man,
                title = context.getString(R.string.on_boarding_title_enjoy),
                description = context.getString(R.string.on_boarding_description_enjoy),
            ),
        )
    }
}
