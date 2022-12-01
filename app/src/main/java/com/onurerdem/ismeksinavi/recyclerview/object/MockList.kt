package com.onurerdem.ismeksinavi.recyclerview.`object`

import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel

object MockList {

    fun getMockedAnswerList(): List<AnswerModel> {
        val answerModel1 = AnswerModel(
            "Çok seviyorum.",
        )
        val answerModel2 = AnswerModel(
            "Seviyorum.",
        )
        val answerModel3 = AnswerModel(
            "Biraz seviyorum.",
        )
        val answerModel4 = AnswerModel(
            "Nötr",
        )
        val answerModel5 = AnswerModel(
            "Biraz sevmiyorum.",
        )
        val answerModel6 = AnswerModel(
            "Sevmiyorum.",
        )
        val answerModel7 = AnswerModel(
            "Hiç sevmiyorum.",
        )

        val answerList: ArrayList<AnswerModel> = ArrayList()
        answerList.add(answerModel1)
        answerList.add(answerModel2)
        answerList.add(answerModel3)
        answerList.add(answerModel4)
        answerList.add(answerModel5)
        answerList.add(answerModel6)
        answerList.add(answerModel7)
        return answerList
    }
}