package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        // update the screen with the dice roll(code used before adding ImageView)
        //val resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()

        // update screen with the dice image
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        //val range : IntRange = 1..numSides
        val range = 1..numSides // same as above, the system derives the type of range variable
        return range.random()
    }
}

/**
 * creating a lucky number Dice game in kotlin
 *
 *
 * fun main() {
 * val dice = Dice(6)
 * val diceSide = dice.roll()
 *
 *if(diceSide == luckyNumber){
 *    println("You win")
 *    }
 *
 *
 *    // in place of if, if else, a when state ment can be used, like below
 *
 *     when(diceSide){
 *     luckyNumber -> println("you win")
 *     1 -> println("you rolled 1, try again")
 *     2 -> println("you rolled 2, try again")
 *     3 -> println("you rolled 3, try again")
 *     6 -> println("you rolled 6, try again")
 *     5 -> println("you rolled 5, try again")
}
 *
 * }
 *
 * class Dice(val numSides: Int){
 * fun roll(): Int{
 * val numRange = 1..numSides
 * val diceRollResult = numRange.random()
 * return diceRollResult
 *  }
 * }
 *
 * */