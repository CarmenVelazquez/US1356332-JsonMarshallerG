
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
    "flightPlanReleaseCount",
    "flightPlanRevisionNbr"
})
public class FlightPlanStatus {

    @JsonProperty("flightPlanReleaseCount")
    private String flightPlanReleaseCount;
    @JsonProperty("flightPlanRevisionNbr")
    private String flightPlanRevisionNbr;

    /**
     * 
     * @return
     *     The flightPlanReleaseCount
     */
    @JsonProperty("flightPlanReleaseCount")
    public String getFlightPlanReleaseCount() {
        return flightPlanReleaseCount;
    }

    /**
     * 
     * @param flightPlanReleaseCount
     *     The flightPlanReleaseCount
     */
    @JsonProperty("flightPlanReleaseCount")
    public void setFlightPlanReleaseCount(String flightPlanReleaseCount) {
        this.flightPlanReleaseCount = flightPlanReleaseCount;
    }

    /**
     * 
     * @return
     *     The flightPlanRevisionNbr
     */
    @JsonProperty("flightPlanRevisionNbr")
    public String getFlightPlanRevisionNbr() {
        return flightPlanRevisionNbr;
    }

    /**
     * 
     * @param flightPlanRevisionNbr
     *     The flightPlanRevisionNbr
     */
    @JsonProperty("flightPlanRevisionNbr")
    public void setFlightPlanRevisionNbr(String flightPlanRevisionNbr) {
        this.flightPlanRevisionNbr = flightPlanRevisionNbr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightPlanReleaseCount).append(flightPlanRevisionNbr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightPlanStatus) == false) {
            return false;
        }
        FlightPlanStatus rhs = ((FlightPlanStatus) other);
        return new EqualsBuilder().append(flightPlanReleaseCount, rhs.flightPlanReleaseCount).append(flightPlanRevisionNbr, rhs.flightPlanRevisionNbr).isEquals();
    }

}
