
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
    "flight"
})
public class FlightEvent {

    @JsonProperty("flight")
    private Flight flight;

    /**
     * 
     * @return
     *     The flight
     */
    @JsonProperty("flight")
    public Flight getFlight() {
        return flight;
    }

    /**
     * 
     * @param flight
     *     The flight
     */
    @JsonProperty("flight")
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightEvent) == false) {
            return false;
        }
        FlightEvent rhs = ((FlightEvent) other);
        return new EqualsBuilder().append(flight, rhs.flight).isEquals();
    }

}
