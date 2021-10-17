package com.tcss559.client;
import com.tcss559.*;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
// comment

public class soapClient {
    public static void main(String[] args) throws Exception {
    	 // create wsdl url
        URL wsdlDocumentUrl = new URL("http://localhost:9010/ws/calc-soap?wsdl");
        QName calcSoapService = new QName("http://calc-soap/ws", "CalcSoapService");
        // create web service
        Service service = Service.create(wsdlDocumentUrl, calcSoapService);
        // get object of pointed service port
        Calculator calc1 = service.getPort(Calculator.class);
        // testing request
        System.out.println(calc1.multiply(2, 453350));
    }

}
