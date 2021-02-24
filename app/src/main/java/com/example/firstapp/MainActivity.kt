package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button = findViewById(R.id.btnClique)

        this.button.setOnClickListener({ clique(it) })
    }

    fun clique(view: View) {
        var random = Random()
        var list: MutableSet<String> = mutableSetOf()

        while (list.size < 6) {
            var number = random.nextInt(60).toString()
            list.add(number)
        }

        Log.d("FIRSTAPP", list.toString())
    }
}