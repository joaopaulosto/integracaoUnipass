
package br.com.unipass.novamed.ws.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataStatisticsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataStatisticsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://impl.ws.wsdomain.unipass.com.br/}abstractDTO">
 *       &lt;sequence>
 *         &lt;element name="statisticsList" type="{http://impl.ws.wsdomain.unipass.com.br/}dataStatisticsListResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataStatisticsResponse", propOrder = {
    "statisticsList"
})
public class DataStatisticsResponse
    extends AbstractDTO
{

    @XmlElement(nillable = true)
    protected List<DataStatisticsListResponse> statisticsList;

    /**
     * Gets the value of the statisticsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataStatisticsListResponse }
     * 
     * 
     */
    public List<DataStatisticsListResponse> getStatisticsList() {
        if (statisticsList == null) {
            statisticsList = new ArrayList<DataStatisticsListResponse>();
        }
        return this.statisticsList;
    }

}
