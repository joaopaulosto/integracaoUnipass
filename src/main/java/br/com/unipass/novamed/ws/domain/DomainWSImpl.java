
package br.com.unipass.novamed.ws.domain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DomainWSImpl", targetNamespace = "http://impl.ws.wsdomain.unipass.com.br/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DomainWSImpl {


    /**
     * 
     * @param originalData
     * @param domainId
     * @param unipass
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipassSignatureRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipassSignatureResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipassSignature/Fault/WebServiceException")
    })
    public ValidateUnipassResponse validateUnipassSignature(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "unipass", partName = "unipass")
        String unipass,
        @WebParam(name = "originalData", partName = "originalData")
        String originalData)
        throws WebServiceException
    ;

    /**
     * 
     * @param domainId
     * @param unipass
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipassRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipassResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateUnipass/Fault/WebServiceException")
    })
    public ValidateUnipassResponse validateUnipass(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "unipass", partName = "unipass")
        String unipass)
        throws WebServiceException
    ;

    /**
     * 
     * @param captchaResponse
     * @param challenge
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateCaptchaResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateCaptchaHtmlRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateCaptchaHtmlResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/validateCaptchaHtml/Fault/WebServiceException")
    })
    public ValidateCaptchaResponse validateCaptchaHtml(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "challenge", partName = "challenge")
        String challenge,
        @WebParam(name = "captchaResponse", partName = "captchaResponse")
        String captchaResponse)
        throws WebServiceException
    ;

    /**
     * 
     * @param adminRelationshipId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.StatisticsResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatisticsForLastDaysRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatisticsForLastDaysResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatisticsForLastDays/Fault/WebServiceException")
    })
    public StatisticsResponse getStatisticsForLastDays(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "adminRelationshipId", partName = "adminRelationshipId")
        long adminRelationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param domainId
     * @param payload
     * @param unipass
     * @param finalUserIP
     * @param userInfo
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/registerUserInDomainRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/registerUserInDomainResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/registerUserInDomain/Fault/WebServiceException")
    })
    public ValidateUnipassResponse registerUserInDomain(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "unipass", partName = "unipass")
        String unipass,
        @WebParam(name = "userInfo", partName = "userInfo")
        String userInfo,
        @WebParam(name = "payload", partName = "payload")
        String payload)
        throws WebServiceException
    ;

    /**
     * 
     * @param relationshipId
     * @param domainId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/removeUserFromDomainRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/removeUserFromDomainResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/removeUserFromDomain/Fault/WebServiceException")
    })
    public ValidateUnipassResponse removeUserFromDomain(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "relationshipId", partName = "relationshipId")
        long relationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param theme
     * @param messageError
     * @param finalUserIP
     * @param language
     * @param includeNoscript
     * @return
     *     returns br.com.unipass.novamed.ws.domain.CreateCaptchaResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/createCaptchaHtmlRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/createCaptchaHtmlResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/createCaptchaHtml/Fault/WebServiceException")
    })
    public CreateCaptchaResponse createCaptchaHtml(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "messageError", partName = "messageError")
        String messageError,
        @WebParam(name = "theme", partName = "theme")
        String theme,
        @WebParam(name = "language", partName = "language")
        String language,
        @WebParam(name = "includeNoscript", partName = "includeNoscript")
        boolean includeNoscript)
        throws WebServiceException
    ;

    /**
     * 
     * @param relationshipId
     * @param domainId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.UserDetailsResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getUserDetailsRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getUserDetailsResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getUserDetails/Fault/WebServiceException")
    })
    public UserDetailsResponse getUserDetails(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "relationshipId", partName = "relationshipId")
        long relationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param adminRelationshipId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.StatisticsResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatisticsRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatisticsResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/getStatistics/Fault/WebServiceException")
    })
    public StatisticsResponse getStatistics(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "adminRelationshipId", partName = "adminRelationshipId")
        long adminRelationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ResponseWS
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/testeZabbixRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/testeZabbixResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/testeZabbix/Fault/WebServiceException")
    })
    public ResponseWS testeZabbix(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP)
        throws WebServiceException
    ;

    /**
     * 
     * @param adminRelationshipId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.DownloadLogFileResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/downloadLogFileRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/downloadLogFileResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/downloadLogFile/Fault/WebServiceException")
    })
    public DownloadLogFileResponse downloadLogFile(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "adminRelationshipId", partName = "adminRelationshipId")
        long adminRelationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param relationshipId
     * @param tag
     * @param domainId
     * @param data
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.SendDataToDeviceResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/sendDataToDeviceRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/sendDataToDeviceResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/sendDataToDevice/Fault/WebServiceException")
    })
    public SendDataToDeviceResponse sendDataToDevice(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "relationshipId", partName = "relationshipId")
        long relationshipId,
        @WebParam(name = "data", partName = "data")
        String data,
        @WebParam(name = "tag", partName = "tag")
        String tag)
        throws WebServiceException
    ;

    /**
     * 
     * @param unipass
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/loginPresentationDomainRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/loginPresentationDomainResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/loginPresentationDomain/Fault/WebServiceException")
    })
    public ValidateUnipassResponse loginPresentationDomain(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "unipass", partName = "unipass")
        String unipass)
        throws WebServiceException
    ;

    /**
     * 
     * @param relationshipId
     * @param domainId
     * @param finalUserIP
     * @return
     *     returns br.com.unipass.novamed.ws.domain.SendDataToDomainResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/readDataFromDeviceRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/readDataFromDeviceResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/readDataFromDevice/Fault/WebServiceException")
    })
    public SendDataToDomainResponse readDataFromDevice(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "relationshipId", partName = "relationshipId")
        long relationshipId)
        throws WebServiceException
    ;

    /**
     * 
     * @param relationshipId
     * @param domainId
     * @param payload
     * @param finalUserIP
     * @param userInfo
     * @return
     *     returns br.com.unipass.novamed.ws.domain.ValidateUnipassResponse
     * @throws WebServiceException
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/updateUserInDomainRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/updateUserInDomainResponse", fault = {
        @FaultAction(className = WebServiceException.class, value = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/updateUserInDomain/Fault/WebServiceException")
    })
    public ValidateUnipassResponse updateUserInDomain(
        @WebParam(name = "finalUserIP", partName = "finalUserIP")
        String finalUserIP,
        @WebParam(name = "domainId", partName = "domainId")
        int domainId,
        @WebParam(name = "userInfo", partName = "userInfo")
        String userInfo,
        @WebParam(name = "payload", partName = "payload")
        String payload,
        @WebParam(name = "relationshipId", partName = "relationshipId")
        long relationshipId)
        throws WebServiceException
    ;

    /**
     * 
     */
    @WebMethod
    @Action(input = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/initRequest", output = "http://impl.ws.wsdomain.unipass.com.br/DomainWSImpl/initResponse")
    public void init();

}