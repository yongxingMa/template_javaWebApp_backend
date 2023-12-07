package com.example.calculator;

public class CalculatorResponse {

    private double result;
    private boolean success;

    public CalculatorResponse(double result, boolean success) {
        this.result = result;
        this.success = success;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}