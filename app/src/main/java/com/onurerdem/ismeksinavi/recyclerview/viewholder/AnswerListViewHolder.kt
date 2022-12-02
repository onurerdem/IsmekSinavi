package com.onurerdem.ismeksinavi.recyclerview.viewholder

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.onurerdem.ismeksinavi.R
import com.onurerdem.ismeksinavi.recyclerview.adapter.AnswerAdapter
import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel

class AnswerListViewHolder (answerView : View, listener: AnswerAdapter.onAnswerClickListener): RecyclerView.ViewHolder(answerView){

    fun bindAnswers(answerModel : AnswerModel) {
        val answer = itemView.findViewById(R.id.btAnswer) as TextView

        answer.text = answerModel.answer
    }

    init {
        answerView.setOnClickListener {
            listener.onAnswerClick(adapterPosition)
        }
    }
}