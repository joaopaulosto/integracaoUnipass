
package br.com.unipass.novamed.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractDTO")
@XmlSeeAlso({
    DataValidateCaptchaResponse.class,
    DataValidateUnipassResponse.class,
    DataSendDataToDeviceResponse.class,
    DataStatisticsListResponse.class,
    DataStatisticsResponse.class,
    ResponseWS.class,
    DataCreateCaptchaResponse.class,
    DataUserDetailsResponse.class,
    DataSendDataToDomainResponse.class,
    DataDownloadLogFileResponse.class
})
public class AbstractDTO {


}
