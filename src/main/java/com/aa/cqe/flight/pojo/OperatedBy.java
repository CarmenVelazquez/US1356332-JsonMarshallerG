
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
    "flightNbr",
    "airlineName"
})
public class OperatedBy {

    @JsonProperty("IATA")
    private String iATA;
    @JsonProperty("flightNbr")
    private String flightNbr;
    @JsonProperty("airlineName")
    private String airlineName;

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
     *     The flightNbr
     */
    @JsonProperty("flightNbr")
    public String getFlightNbr() {
        return flightNbr;
    }

    /**
     * 
     * @param flightNbr
     *     The flightNbr
     */
    @JsonProperty("flightNbr")
    public void setFlightNbr(String flightNbr) {
        this.flightNbr = flightNbr;
    }

    /**
     * 
     * @return
     *     The airlineName
     */
    @JsonProperty("airlineName")
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * 
     * @param airlineName
     *     The airlineName
     */
    @JsonProperty("airlineName")
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iATA).append(flightNbr).append(airlineName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatedBy) == false) {
            return false;
        }
        OperatedBy rhs = ((OperatedBy) other);
        return new EqualsBuilder().append(iATA, rhs.iATA).append(flightNbr, rhs.flightNbr).append(airlineName, rhs.airlineName).isEquals();
    }

}
