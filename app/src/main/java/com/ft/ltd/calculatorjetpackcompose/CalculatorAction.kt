package com.ft.ltd.calculatorjetpackcompose

sealed class CalculatorAction{
    data class Number(val number: Long): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
