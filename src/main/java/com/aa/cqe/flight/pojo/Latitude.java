
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
    "hemisphere",
    "degrees",
    "minutes"
})
public class Latitude {

    @JsonProperty("hemisphere")
    private String hemisphere;
    @JsonProperty("degrees")
    private String degrees;
    @JsonProperty("minutes")
    private String minutes;

    /**
     * 
     * @return
     *     The hemisphere
     */
    @JsonProperty("hemisphere")
    public String getHemisphere() {
        return hemisphere;
    }

    /**
     * 
     * @param hemisphere
     *     The hemisphere
     */
    @JsonProperty("hemisphere")
    public void setHemisphere(String hemisphere) {
        this.hemisphere = hemisphere;
    }

    /**
     * 
     * @return
     *     The degrees
     */
    @JsonProperty("degrees")
    public String getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The degrees
     */
    @JsonProperty("degrees")
    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    /**
     * 
     * @return
     *     The minutes
     */
    @JsonProperty("minutes")
    public String getMinutes() {
        return minutes;
    }

    /**
     * 
     * @param minutes
     *     The minutes
     */
    @JsonProperty("minutes")
    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hemisphere).append(degrees).append(minutes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Latitude) == false) {
            return false;
        }
        Latitude rhs = ((Latitude) other);
        return new EqualsBuilder().append(hemisphere, rhs.hemisphere).append(degrees, rhs.degrees).append(minutes, rhs.minutes).isEquals();
    }

}
