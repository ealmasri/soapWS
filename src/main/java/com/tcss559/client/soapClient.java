package com.tcss559.client;
import com.tcss559.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class soapClient {
    public static void main(String[] args) throws Exception {
    	 // create wsdl url
        URL wsdlDocumentUrl = new URL("http://34.89.119.124:8080/soapWS/ws/calc?wsdl");
        QName calcSoapService = new QName("http://tcss559.com/", "calcService");
        // create web service
        Service service = Service.create(wsdlDocumentUrl, calcSoapService);
        // get object of pointed service port
        calc calc1 = service.getPort(calc.class);
        // testing request
        System.out.println(calc1.multiply(2, 453350));
    }

}
