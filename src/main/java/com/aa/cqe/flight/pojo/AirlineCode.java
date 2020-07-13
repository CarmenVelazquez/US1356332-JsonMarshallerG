
package com.aa.cqe.flight.pojo;

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
    "IATA",
    "ICAO"
})
public class AirlineCode {

    @JsonProperty("IATA")
    private String iATA;
    @JsonProperty("ICAO")
    private String iCAO;

    /**
     * 
     * @return
     *     The iATA
     */
    @JsonProperty("IATA")
    public String getIATA() {
        return iATA;
    }

    /**
     * 
     * @param iATA
     *     The IATA
     */
    @JsonProperty("IATA")
    public void setIATA(String iATA) {
        this.iATA = iATA;
    }

    /**
     * 
     * @return
     *     The iCAO
     */
    @JsonProperty("ICAO")
    public String getICAO() {
        return iCAO;
    }

    /**
     * 
     * @param iCAO
     *     The ICAO
     */
    @JsonProperty("ICAO")
    public void setICAO(String iCAO) {
        this.iCAO = iCAO;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iATA).append(iCAO).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirlineCode) == false) {
            return false;
        }
        AirlineCode rhs = ((AirlineCode) other);
        return new EqualsBuilder().append(iATA, rhs.iATA).append(iCAO, rhs.iCAO).isEquals();
    }

}
