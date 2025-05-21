package com.example.tipcalcualtor

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.tipcalcualtor.ui.theme.TipCalculatorTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.text.NumberFormat


@RunWith(AndroidJUnit4::class)
class TipUITests {

    @get:Rule
    val composeTestsRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestsRule.setContent {
            TipCalculatorTheme {
                TipTimeLayout()
            }
        }
        composeTestsRule.onNodeWithText("Bill Amount")
            .performTextInput("10")
        composeTestsRule.onNodeWithText("Tip Percentage").performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestsRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
            "No node with this text was found."
        )
    }
}