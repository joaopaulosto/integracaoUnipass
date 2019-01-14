
package br.com.unipass.novamed.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://impl.ws.wsdomain.unipass.com.br/}responseWS">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://impl.ws.wsdomain.unipass.com.br/}dataUserDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDetailsResponse", propOrder = {
    "data"
})
public class UserDetailsResponse
    extends ResponseWS
{

    protected DataUserDetailsResponse data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataUserDetailsResponse }
     *     
     */
    public DataUserDetailsResponse getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUserDetailsResponse }
     *     
     */
    public void setData(DataUserDetailsResponse value) {
        this.data = value;
    }

}
