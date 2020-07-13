
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
    "longitudeDMS",
    "longitudeDecimal",
    "longitudeRadians"
})
public class Longitude {

    @JsonProperty("longitudeDMS")
    private LongitudeDMS longitudeDMS;
    @JsonProperty("longitudeDecimal")
    private Double longitudeDecimal;
    @JsonProperty("longitudeRadians")
    private Double longitudeRadians;

    /**
     * 
     * @return
     *     The longitudeDMS
     */
    @JsonProperty("longitudeDMS")
    public LongitudeDMS getLongitudeDMS() {
        return longitudeDMS;
    }

    /**
     * 
     * @param longitudeDMS
     *     The longitudeDMS
     */
    @JsonProperty("longitudeDMS")
    public void setLongitudeDMS(LongitudeDMS longitudeDMS) {
        this.longitudeDMS = longitudeDMS;
    }

    /**
     * 
     * @return
     *     The longitudeDecimal
     */
    @JsonProperty("longitudeDecimal")
    public Double getLongitudeDecimal() {
        return longitudeDecimal;
    }

    /**
     * 
     * @param longitudeDecimal
     *     The longitudeDecimal
     */
    @JsonProperty("longitudeDecimal")
    public void setLongitudeDecimal(Double longitudeDecimal) {
        this.longitudeDecimal = longitudeDecimal;
    }

    /**
     * 
     * @return
     *     The longitudeRadians
     */
    @JsonProperty("longitudeRadians")
    public Double getLongitudeRadians() {
        return longitudeRadians;
    }

    /**
     * 
     * @param longitudeRadians
     *     The longitudeRadians
     */
    @JsonProperty("longitudeRadians")
    public void setLongitudeRadians(Double longitudeRadians) {
        this.longitudeRadians = longitudeRadians;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longitudeDMS).append(longitudeDecimal).append(longitudeRadians).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Longitude) == false) {
            return false;
        }
        Longitude rhs = ((Longitude) other);
        return new EqualsBuilder().append(longitudeDMS, rhs.longitudeDMS).append(longitudeDecimal, rhs.longitudeDecimal).append(longitudeRadians, rhs.longitudeRadians).isEquals();
    }

}
