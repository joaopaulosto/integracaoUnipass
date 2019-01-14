
package br.com.unipass.novamed.ws.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.unipass.novamed.ws.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebServiceException_QNAME = new QName("http://impl.ws.wsdomain.unipass.com.br/", "WebServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.unipass.novamed.ws.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link DataValidateCaptchaResponse }
     * 
     */
    public DataValidateCaptchaResponse createDataValidateCaptchaResponse() {
        return new DataValidateCaptchaResponse();
    }

    /**
     * Create an instance of {@link StatisticsResponse }
     * 
     */
    public StatisticsResponse createStatisticsResponse() {
        return new StatisticsResponse();
    }

    /**
     * Create an instance of {@link SendDataToDeviceResponse }
     * 
     */
    public SendDataToDeviceResponse createSendDataToDeviceResponse() {
        return new SendDataToDeviceResponse();
    }

    /**
     * Create an instance of {@link ValidateUnipassResponse }
     * 
     */
    public ValidateUnipassResponse createValidateUnipassResponse() {
        return new ValidateUnipassResponse();
    }

    /**
     * Create an instance of {@link DataValidateUnipassResponse }
     * 
     */
    public DataValidateUnipassResponse createDataValidateUnipassResponse() {
        return new DataValidateUnipassResponse();
    }

    /**
     * Create an instance of {@link ResponseWS }
     * 
     */
    public ResponseWS createResponseWS() {
        return new ResponseWS();
    }

    /**
     * Create an instance of {@link DataSendDataToDeviceResponse }
     * 
     */
    public DataSendDataToDeviceResponse createDataSendDataToDeviceResponse() {
        return new DataSendDataToDeviceResponse();
    }

    /**
     * Create an instance of {@link ValidateCaptchaResponse }
     * 
     */
    public ValidateCaptchaResponse createValidateCaptchaResponse() {
        return new ValidateCaptchaResponse();
    }

    /**
     * Create an instance of {@link DownloadLogFileResponse }
     * 
     */
    public DownloadLogFileResponse createDownloadLogFileResponse() {
        return new DownloadLogFileResponse();
    }

    /**
     * Create an instance of {@link DataStatisticsListResponse }
     * 
     */
    public DataStatisticsListResponse createDataStatisticsListResponse() {
        return new DataStatisticsListResponse();
    }

    /**
     * Create an instance of {@link SendDataToDomainResponse }
     * 
     */
    public SendDataToDomainResponse createSendDataToDomainResponse() {
        return new SendDataToDomainResponse();
    }

    /**
     * Create an instance of {@link DataStatisticsResponse }
     * 
     */
    public DataStatisticsResponse createDataStatisticsResponse() {
        return new DataStatisticsResponse();
    }

    /**
     * Create an instance of {@link CreateCaptchaResponse }
     * 
     */
    public CreateCaptchaResponse createCreateCaptchaResponse() {
        return new CreateCaptchaResponse();
    }

    /**
     * Create an instance of {@link DataCreateCaptchaResponse }
     * 
     */
    public DataCreateCaptchaResponse createDataCreateCaptchaResponse() {
        return new DataCreateCaptchaResponse();
    }

    /**
     * Create an instance of {@link DataUserDetailsResponse }
     * 
     */
    public DataUserDetailsResponse createDataUserDetailsResponse() {
        return new DataUserDetailsResponse();
    }

    /**
     * Create an instance of {@link DataSendDataToDomainResponse }
     * 
     */
    public DataSendDataToDomainResponse createDataSendDataToDomainResponse() {
        return new DataSendDataToDomainResponse();
    }

    /**
     * Create an instance of {@link DataDownloadLogFileResponse }
     * 
     */
    public DataDownloadLogFileResponse createDataDownloadLogFileResponse() {
        return new DataDownloadLogFileResponse();
    }

    /**
     * Create an instance of {@link AbstractDTO }
     * 
     */
    public AbstractDTO createAbstractDTO() {
        return new AbstractDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.wsdomain.unipass.com.br/", name = "WebServiceException")
    public JAXBElement<FaultInfo> createWebServiceException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_WebServiceException_QNAME, FaultInfo.class, null, value);
    }

}
