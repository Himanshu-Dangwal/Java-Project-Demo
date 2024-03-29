package com.example.demo;

public class Calculator {
    public double performOperation(double operand1, double operand2, String operation) {
        Operation op;
        switch (operation) {
            case "add":
                op = new Addition();
                break;
            case "subtract":
                op = new Subtraction();
                break;
            case "multiply":
                op = new Multiplication();
                break;
            case "divide":
                op = new Division();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        return op.calculate(operand1, operand2);
    }
}

