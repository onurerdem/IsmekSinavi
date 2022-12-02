package com.onurerdem.ismeksinavi

import android.R
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.green
import androidx.core.graphics.toColor
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.onurerdem.ismeksinavi.databinding.ActivityMainBinding
import com.onurerdem.ismeksinavi.recyclerview.`object`.MockList
import com.onurerdem.ismeksinavi.recyclerview.adapter.AnswerAdapter
import com.onurerdem.ismeksinavi.recyclerview.model.AnswerModel
import com.onurerdem.ismeksinavi.recyclerview.viewholder.AnswerListViewHolder


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvAnswers.layoutManager = LinearLayoutManager(this, GridLayoutManager.VERTICAL, false)

        val adapter = AnswerAdapter(MockList.getMockedAnswerList() as ArrayList<AnswerModel>)

        binding.rvAnswers.adapter = adapter

        adapter.setOnAnswerClickListener(object : AnswerAdapter.onAnswerClickListener{
            override fun onAnswerClick(position: Int) {
                var count = position + 1
                Toast.makeText(this@MainActivity, "$count. seçeneği seçtiniz.",Toast.LENGTH_SHORT).show()
            }

        })
    }
}