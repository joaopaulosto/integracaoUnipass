
package br.com.unipass.novamed.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadLogFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadLogFileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://impl.ws.wsdomain.unipass.com.br/}responseWS">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://impl.ws.wsdomain.unipass.com.br/}dataDownloadLogFileResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadLogFileResponse", propOrder = {
    "data"
})
public class DownloadLogFileResponse
    extends ResponseWS
{

    protected DataDownloadLogFileResponse data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataDownloadLogFileResponse }
     *     
     */
    public DataDownloadLogFileResponse getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDownloadLogFileResponse }
     *     
     */
    public void setData(DataDownloadLogFileResponse value) {
        this.data = value;
    }

}
