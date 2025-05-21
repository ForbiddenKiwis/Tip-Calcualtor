package com.example.tipcalcualtor

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculatorTip_20PercentNoRoundup() {
        val amount = 20.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}