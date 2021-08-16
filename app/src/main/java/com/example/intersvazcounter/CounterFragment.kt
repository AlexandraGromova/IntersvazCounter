package com.example.intersvazcounter

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.coroutines.selects.select


class CounterFragment : Fragment(R.layout.fragment_counter) {
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val model: CounterViewModel by viewModels()
        button = view.findViewById(R.id.button)
        textView = view.findViewById(R.id.textView)

        button.setOnClickListener {
            model.increment()
        }
        model.count.observe(this, { count ->
            textView.text = count.toString()
        })
    }
}