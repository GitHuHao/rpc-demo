package com.bigdata.rpc.webservice.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-04-25T12:55:10.906+08:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "BookServiceImplService",
                  wsdlLocation = "http://127.0.0.1:8080/book/ws?wsdl",
                  targetNamespace = "http://service.original.webservice.bigdata.com/")
public class BookServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.original.webservice.bigdata.com/", "BookServiceImplService");
    public final static QName BookServiceImplPort = new QName("http://service.original.webservice.bigdata.com/", "BookServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8080/book/ws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8080/book/ws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BookServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BookServiceImpl
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookServiceImpl getBookServiceImplPort() {
        return super.getPort(BookServiceImplPort, BookServiceImpl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookServiceImpl
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookServiceImpl getBookServiceImplPort(WebServiceFeature... features) {
        return super.getPort(BookServiceImplPort, BookServiceImpl.class, features);
    }

}
