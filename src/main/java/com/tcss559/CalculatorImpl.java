package com.tcss559;
 
import jakarta.jws.WebService;


@WebService(portName = "CalcSoapPort", serviceName = "CalcSoapService", 
endpointInterface = "com.tcss559.Calculator", targetNamespace = "http://calc-soap/ws")
public class CalculatorImpl implements Calculator {
 
    @Override
    public int add(int a, int b) {
        return a + b;
    }
 
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
 
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
 
    @Override
    public int divide(int a, int b) {
        return a / b;
    }
 
}