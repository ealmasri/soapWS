package com.tcss559;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;


@WebService(targetNamespace = "http://calc-soap/ws")
@SOAPBinding(
		  style = SOAPBinding.Style.RPC,
		  use = SOAPBinding.Use.LITERAL,
		  parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface Calculator {
    @WebMethod
    @WebResult(name = "result")
    int add(int a, int b);
 
    @WebMethod
    int subtract(int a, int b);
 
    @WebMethod
    int multiply(int a, int b);
 
    @WebMethod
    int divide(int a, int b);
}