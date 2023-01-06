package com.ft.ltd.calculatorjetpackcompose

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val result: String = "0",
    val operation: CalculatorOperation? = null

)
