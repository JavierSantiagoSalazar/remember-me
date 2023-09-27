package com.example.rememberme.onBoarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rememberme.Board
import com.example.rememberme.databinding.BoardItemBinding

class OnBoardingViewPagerAdapter(
    private val boardList: List<Board>,
    private val listener: () -> Unit
) : RecyclerView.Adapter<OnBoardingViewPagerAdapter.BoardViewHolder>() {

    inner class BoardViewHolder(private val binding: BoardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(board: Board) {
            with(binding) {
                onBoardingImage.setImageResource(board.image)
                tvTittle.text = board.title
                tvMessage.text = board.description
                btnContinue.setOnClickListener { listener() }

                if (adapterPosition == 0) {
                    arrowBack.visibility = View.INVISIBLE
                    btnContinue.visibility = View.INVISIBLE
                } else {
                    arrowForward.visibility = View.INVISIBLE
                    btnContinue.visibility = View.VISIBLE
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(
            BoardItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.bind(boardList[position])
    }

    override fun getItemCount(): Int = boardList.size

}
