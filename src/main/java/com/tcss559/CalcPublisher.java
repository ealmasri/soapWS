package com.tcss559;
 
import jakarta.xml.ws.Endpoint;
 
public class CalcPublisher {
 
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9010/ws/calc", new CalculatorImpl());
    }
 
}