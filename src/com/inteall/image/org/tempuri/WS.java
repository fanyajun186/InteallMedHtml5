
package com.inteall.image.org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
//@WebServiceClient(name = "WS", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://42.96.149.47:1086/sdk/WS.asmx?wsdl")
@WebServiceClient(name = "WS", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://api.bjszrk.com/sdk/WS.asmx?wsdl")
public class WS
    extends Service
{

    private final static URL WS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.inteall.image.org.tempuri.WS.class.getName());
    
    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.inteall.image.org.tempuri.WS.class.getResource(".");
//            url = new URL(baseUrl, "http://42.96.149.47:1086/sdk/WS.asmx?wsdl");
              url=new URL(baseUrl,"http://api.bjszrk.com/sdk/WS.asmx?wsdl");  //2��22�ű�� 
        } catch (MalformedURLException e) {
//            logger.warning("Failed to create URL for the wsdl Location: 'http://42.96.149.47:1086/sdk/WS.asmx?wsdl', retrying as a local file");
            logger.warning("Failed to create URL for the wsdl Location: 'http://api.bjszrk.com/sdk/WS.asmx?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WS_WSDL_LOCATION = url;
    }

    public WS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WS() {
        super(WS_WSDL_LOCATION, new QName("http://tempuri.org/", "WS"));
    }

    /**
     * 
     * @return
     *     returns WSSoap
     */
    @WebEndpoint(name = "WSSoap")
    public WSSoap getWSSoap() {
        return super.getPort(new QName("http://tempuri.org/", "WSSoap"), WSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSSoap
     */
    @WebEndpoint(name = "WSSoap")
    public WSSoap getWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSSoap"), WSSoap.class, features);
    }

}