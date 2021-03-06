
package com.company.modellayer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SockModelService", targetNamespace = "http://ModelLayer.company.com/", wsdlLocation = "http://localhost:8080/ws/sock?wsdl")
public class SockModelService
    extends Service
{

    private final static URL SOCKMODELSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOCKMODELSERVICE_EXCEPTION;
    private final static QName SOCKMODELSERVICE_QNAME = new QName("http://ModelLayer.company.com/", "SockModelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/sock?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOCKMODELSERVICE_WSDL_LOCATION = url;
        SOCKMODELSERVICE_EXCEPTION = e;
    }

    public SockModelService() {
        super(__getWsdlLocation(), SOCKMODELSERVICE_QNAME);
    }

    public SockModelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOCKMODELSERVICE_QNAME, features);
    }

    public SockModelService(URL wsdlLocation) {
        super(wsdlLocation, SOCKMODELSERVICE_QNAME);
    }

    public SockModelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOCKMODELSERVICE_QNAME, features);
    }

    public SockModelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SockModelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISockModel
     */
    @WebEndpoint(name = "SockModelPort")
    public ISockModel getSockModelPort() {
        return super.getPort(new QName("http://ModelLayer.company.com/", "SockModelPort"), ISockModel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISockModel
     */
    @WebEndpoint(name = "SockModelPort")
    public ISockModel getSockModelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ModelLayer.company.com/", "SockModelPort"), ISockModel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOCKMODELSERVICE_EXCEPTION!= null) {
            throw SOCKMODELSERVICE_EXCEPTION;
        }
        return SOCKMODELSERVICE_WSDL_LOCATION;
    }

}
