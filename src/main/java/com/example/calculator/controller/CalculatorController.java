package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import java.util.Scanner;

public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide):");
        String operation = scanner.next();

        try {
            double result = calculatorService.calculate(num1, num2, operation);
            System.out.print("Result: " + result);
        } catch (Exception e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
