
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
    "altitude",
    "vfrOnTop"
})
public class VisualFlightRules {

    @JsonProperty("altitude")
    private String altitude;
    @JsonProperty("vfrOnTop")
    private Boolean vfrOnTop;

    /**
     * 
     * @return
     *     The altitude
     */
    @JsonProperty("altitude")
    public String getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    @JsonProperty("altitude")
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    /**
     * 
     * @return
     *     The vfrOnTop
     */
    @JsonProperty("vfrOnTop")
    public Boolean getVfrOnTop() {
        return vfrOnTop;
    }

    /**
     * 
     * @param vfrOnTop
     *     The vfrOnTop
     */
    @JsonProperty("vfrOnTop")
    public void setVfrOnTop(Boolean vfrOnTop) {
        this.vfrOnTop = vfrOnTop;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(altitude).append(vfrOnTop).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VisualFlightRules) == false) {
            return false;
        }
        VisualFlightRules rhs = ((VisualFlightRules) other);
        return new EqualsBuilder().append(altitude, rhs.altitude).append(vfrOnTop, rhs.vfrOnTop).isEquals();
    }

}
