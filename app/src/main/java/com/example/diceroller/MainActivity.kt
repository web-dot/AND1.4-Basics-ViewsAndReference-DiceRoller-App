package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // adding functionality to the button
        //1. get reference of the button using Resource id
        val rollButton: Button = findViewById(R.id.button)
        //2. add event listener
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result
     * */
    private fun rollDice() {
        // Create new Dice objecct with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        //val range : IntRange = 1..numSides
        val range = 1..numSides // same as above, the system derives the type of range variable
        return range.random()
    }
}