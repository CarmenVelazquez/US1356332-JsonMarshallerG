
package com.aa.cqe.flight.pojo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Flight Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "flightEvent"
})
public class FlightSchemaV1 {

    @JsonProperty("flightEvent")
    private FlightEvent flightEvent;

    /**
     * 
     * @return
     *     The flightEvent
     */
    @JsonProperty("flightEvent")
    public FlightEvent getFlightEvent() {
        return flightEvent;
    }

    /**
     * 
     * @param flightEvent
     *     The flightEvent
     */
    @JsonProperty("flightEvent")
    public void setFlightEvent(FlightEvent flightEvent) {
        this.flightEvent = flightEvent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightEvent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSchemaV1) == false) {
            return false;
        }
        FlightSchemaV1 rhs = ((FlightSchemaV1) other);
        return new EqualsBuilder().append(flightEvent, rhs.flightEvent).isEquals();
    }

}
