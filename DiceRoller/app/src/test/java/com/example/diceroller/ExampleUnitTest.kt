package com.example.diceroller


import org.junit.Assert.*
import org.junit.Test

/**
 * Local unit test, which will execute on the development machine (host).
*/
class ExampleUnitTest {
    @Test
    fun generatesNumber() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

}