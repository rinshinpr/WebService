
/*
 * 
 */

package org.jboss.ddoyle.howtojboss.orderservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12-patch-02
 * Tue Oct 02 09:32:46 CEST 2012
 * Generated source version: 2.2.12-patch-02
 * 
 */


@WebServiceClient(name = "OrderService", 
                  wsdlLocation = "file:/Users/mccloud/TestSetups/HowToJBoss-jBPM5_WebServices_integration/wsdl/OrderService/OrderService.wsdl",
                  targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/OrderService/") 
public class OrderService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.jboss.org/ddoyle/howtojboss/OrderService/", "OrderService");
    public final static QName OrderServiceSOAP = new QName("http://www.jboss.org/ddoyle/howtojboss/OrderService/", "OrderServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mccloud/TestSetups/HowToJBoss-jBPM5_WebServices_integration/wsdl/OrderService/OrderService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/mccloud/TestSetups/HowToJBoss-jBPM5_WebServices_integration/wsdl/OrderService/OrderService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public OrderService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServiceSOAP")
    public OrderService getOrderServiceSOAP() {
        return super.getPort(OrderServiceSOAP, OrderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServiceSOAP")
    public OrderService getOrderServiceSOAP(WebServiceFeature... features) {
        return super.getPort(OrderServiceSOAP, OrderService.class, features);
    }

}
