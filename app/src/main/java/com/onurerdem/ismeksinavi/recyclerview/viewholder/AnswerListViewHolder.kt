package com.onurerdem.ismeksinavi.recyclerview.viewholder

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.onurerdem.ismeksinavi.R
import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel

class AnswerListViewHolder (answerView : View): RecyclerView.ViewHolder(answerView){

    fun bindAnswers(answerModel : AnswerModel) {
        val answer = itemView.findViewById(R.id.btAnswer) as Button

        answer.text = answerModel.answer
    }
}