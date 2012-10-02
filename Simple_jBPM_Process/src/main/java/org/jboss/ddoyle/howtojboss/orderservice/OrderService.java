package org.jboss.ddoyle.howtojboss.orderservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.12-patch-02
 * Tue Oct 02 09:32:46 CEST 2012
 * Generated source version: 2.2.12-patch-02
 * 
 */
 
@WebService(targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/OrderService/", name = "OrderService")
@XmlSeeAlso({ObjectFactory.class})
public interface OrderService {

    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "PlaceOrder", targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/OrderService/", className = "org.jboss.ddoyle.howtojboss.orderservice.PlaceOrderType")
    @WebMethod(operationName = "PlaceOrder", action = "http://www.jboss.org/ddoyle/howtojboss/OrderService/PlaceOrder")
    @ResponseWrapper(localName = "PlaceOrderResponse", targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/OrderService/", className = "org.jboss.ddoyle.howtojboss.orderservice.PlaceOrderResponseType")
    public java.lang.String placeOrder(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String in
    );
}
