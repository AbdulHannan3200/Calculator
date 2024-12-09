package com.example.calculator;

import com.example.calculator.controller.CalculatorController;

public class App {
    public static void main(String[] args) {
        System.out.println("Calculator App Started!");
        new CalculatorController().start();
    }
}
