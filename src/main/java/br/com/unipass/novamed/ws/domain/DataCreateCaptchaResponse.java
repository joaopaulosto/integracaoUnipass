
package br.com.unipass.novamed.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataCreateCaptchaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCreateCaptchaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://impl.ws.wsdomain.unipass.com.br/}abstractDTO">
 *       &lt;sequence>
 *         &lt;element name="captchaHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCreateCaptchaResponse", propOrder = {
    "captchaHtml"
})
public class DataCreateCaptchaResponse
    extends AbstractDTO
{

    protected String captchaHtml;

    /**
     * Gets the value of the captchaHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptchaHtml() {
        return captchaHtml;
    }

    /**
     * Sets the value of the captchaHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptchaHtml(String value) {
        this.captchaHtml = value;
    }

}
