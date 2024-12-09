package com.example.calculator.service;

import com.example.calculator.exception.CalculationException;

public class CalculatorService {
    public double calculate(double num1, double num2, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return num1 + num2;
            case "subtract": return num1 - num2;
            case "multiply": return num1 * num2;
            case "divide":
                if (num2 == 0) throw new CalculationException("Division by zero is not allowed");
                return num1 / num2;
            default:
                throw new CalculationException("Invalid operation");
        }
    }
}
