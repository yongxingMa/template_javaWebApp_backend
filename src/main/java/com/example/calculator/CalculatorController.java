package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public ResponseEntity<CalculatorResponse> add(@RequestBody CalculatorRequest request) {
        double result = calculatorService.add(request.getNum1(), request.getNum2());
        return ResponseEntity.ok(new CalculatorResponse(result, true));
    }

    @PostMapping("/subtract")
    public ResponseEntity<CalculatorResponse> subtract(@RequestBody CalculatorRequest request) {
        double result = calculatorService.subtract(request.getNum1(), request.getNum2());
        return ResponseEntity.ok(new CalculatorResponse(result, true));
    }

    @PostMapping("/multiply")
    public ResponseEntity<CalculatorResponse> multiply(@RequestBody CalculatorRequest request) {
        double result = calculatorService.multiply(request.getNum1(), request.getNum2());
        return ResponseEntity.ok(new CalculatorResponse(result, true));
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestBody CalculatorRequest request) {
        if (request.getNum2() == 0) {
            return ResponseEntity.badRequest().body("Divisor cannot be zero");
        }
        double result = calculatorService.divide(request.getNum1(), request.getNum2());
        return ResponseEntity.ok(new CalculatorResponse(result, true));
    }
}