package com.onurerdem.ismeksinavi.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurerdem.ismeksinavi.R
import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel
import com.onurerdem.ismeksinavi.recyclerview.viewholder.AnswerListViewHolder

class AnswerAdapter(val answerList: ArrayList<AnswerModel>) : RecyclerView.Adapter<AnswerListViewHolder>() {
    private lateinit var answerListener : onAnswerClickListener

    interface onAnswerClickListener{
        fun onAnswerClick(position: Int)
    }

    fun setOnAnswerClickListener(listener: onAnswerClickListener){
        answerListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerListViewHolder {
        return AnswerListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.answers,
                parent,
                false
            ), answerListener
        )
    }

    override fun getItemCount(): Int {
        return answerList.size
    }

    override fun onBindViewHolder(holder: AnswerListViewHolder, position: Int) {
        holder.bindAnswers(answerList[position])
    }
}