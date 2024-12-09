package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculatorService.calculate(2, 3, "add"));
    }

    @Test
    public void testDivisionByZero() {
        try {
            calculatorService.calculate(2, 0, "divide");
        } catch (Exception e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}
