package com.example.yahtzee

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Button in the layout
        val rollButton: Button = findViewById(R.id.button)

        //  Roll Dice when button is pressed
        rollButton.setOnClickListener { rollDice() }
        //  Roll the dice when the app starts
        rollDice()
    }


    private fun rollDice() {
        val diceCount = 5
        val diceSides = 6
        val diceImageIds = arrayOf(R.id.dice1, R.id.dice2, R.id.dice3, R.id.dice4, R.id.dice5)

        val diceList = List(diceCount) { Dice(diceSides) }
        val diceRolls = diceList.map { it.roll() }

        for (i in diceImageIds.indices) {
            val diceImage: ImageView = findViewById(diceImageIds[i])
            val drawableResource = when (diceRolls[i]) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription = diceRolls[i].toString()
        }
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }


}