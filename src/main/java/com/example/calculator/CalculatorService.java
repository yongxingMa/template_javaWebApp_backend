package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(int num1, int num2) {
        return num1 + num2;
    }

    public double subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}