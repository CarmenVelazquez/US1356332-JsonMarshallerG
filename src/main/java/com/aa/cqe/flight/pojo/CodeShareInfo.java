
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "marketCode",
    "operatedBy",
    "partnerFlight"
})
public class CodeShareInfo {

    @JsonProperty("marketCode")
    private String marketCode;
    @JsonProperty("operatedBy")
    private OperatedBy operatedBy;
    @JsonProperty("partnerFlight")
    private List<PartnerFlight> partnerFlight = new ArrayList<PartnerFlight>();

    /**
     * 
     * @return
     *     The marketCode
     */
    @JsonProperty("marketCode")
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 
     * @param marketCode
     *     The marketCode
     */
    @JsonProperty("marketCode")
    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    /**
     * 
     * @return
     *     The operatedBy
     */
    @JsonProperty("operatedBy")
    public OperatedBy getOperatedBy() {
        return operatedBy;
    }

    /**
     * 
     * @param operatedBy
     *     The operatedBy
     */
    @JsonProperty("operatedBy")
    public void setOperatedBy(OperatedBy operatedBy) {
        this.operatedBy = operatedBy;
    }

    /**
     * 
     * @return
     *     The partnerFlight
     */
    @JsonProperty("partnerFlight")
    public List<PartnerFlight> getPartnerFlight() {
        return partnerFlight;
    }

    /**
     * 
     * @param partnerFlight
     *     The partnerFlight
     */
    @JsonProperty("partnerFlight")
    public void setPartnerFlight(List<PartnerFlight> partnerFlight) {
        this.partnerFlight = partnerFlight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketCode).append(operatedBy).append(partnerFlight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeShareInfo) == false) {
            return false;
        }
        CodeShareInfo rhs = ((CodeShareInfo) other);
        return new EqualsBuilder().append(marketCode, rhs.marketCode).append(operatedBy, rhs.operatedBy).append(partnerFlight, rhs.partnerFlight).isEquals();
    }

}
