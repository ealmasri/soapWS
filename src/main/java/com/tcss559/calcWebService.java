package com.tcss559;
 
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebResult;

import javax.xml.ws.Endpoint;

@WebService(
		portName = "CalcSoapPort",
		serviceName = "CalcSoapService", 
		endpointInterface = "com.tcss559.calcSoapService", 
		targetNamespace = "http://calc-soap/ws" )
@SOAPBinding(
		  style = SOAPBinding.Style.DOCUMENT,
		  use = SOAPBinding.Use.LITERAL,
		  parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class calcWebService  {
 
    @WebMethod
    @WebResult(name = "result")
    public int add(int a, int b) {
        return a + b;
    }
 
    @WebMethod
    @WebResult(name = "result")
    public int subtract(int a, int b) {
        return a - b;
    }
 
    @WebMethod
    @WebResult(name = "result")
    public int multiply(int a, int b) {
        return a * b;
    }
 
    @WebMethod
    @WebResult(name = "result")
    public int divide(int a, int b) {
        return a / b;
    }
    
    /*public static void main(String[] args ){
        Endpoint.publish("http://0.0.0.0/calcService", new calcWebService());
    }*/
 
}