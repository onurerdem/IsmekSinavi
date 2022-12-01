package com.onurerdem.ismeksinavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.onurerdem.ismeksinavi.databinding.ActivityMainBinding
import com.onurerdem.ismeksinavi.recyclerview.`object`.MockList
import com.onurerdem.ismeksinavi.recyclerview.adapter.AnswerAdapter
import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvAnswers.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)

        val adapter = AnswerAdapter(MockList.getMockedAnswerList() as ArrayList<AnswerModel>)

        binding.rvAnswers.adapter = adapter

    }
}