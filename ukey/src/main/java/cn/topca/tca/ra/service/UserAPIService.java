package cn.topca.tca.ra.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-13T17:48:42.318+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "UserAPIService", 
                  wsdlLocation = "http://demo.topca.cn/TopCA/services/userAPI?wsdl",
                  targetNamespace = "http://service.ra.tca.topca.cn/") 
public class UserAPIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ra.tca.topca.cn/", "UserAPIService");
    public final static QName UserAPIServicePort = new QName("http://service.ra.tca.topca.cn/", "UserAPIServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://demo.topca.cn/TopCA/services/userAPI?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserAPIService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://demo.topca.cn/TopCA/services/userAPI?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserAPIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserAPIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserAPIService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns UserAPIServicePortType
     */
    @WebEndpoint(name = "UserAPIServicePort")
    public UserAPIServicePortType getUserAPIServicePort() {
        return super.getPort(UserAPIServicePort, UserAPIServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserAPIServicePortType
     */
    @WebEndpoint(name = "UserAPIServicePort")
    public UserAPIServicePortType getUserAPIServicePort(WebServiceFeature... features) {
        return super.getPort(UserAPIServicePort, UserAPIServicePortType.class, features);
    }

}
