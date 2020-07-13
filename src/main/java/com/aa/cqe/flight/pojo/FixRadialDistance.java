
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
    "value",
    "radial",
    "distance"
})
public class FixRadialDistance {

    @JsonProperty("value")
    private String value;
    @JsonProperty("radial")
    private Integer radial;
    @JsonProperty("distance")
    private Integer distance;

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The radial
     */
    @JsonProperty("radial")
    public Integer getRadial() {
        return radial;
    }

    /**
     * 
     * @param radial
     *     The radial
     */
    @JsonProperty("radial")
    public void setRadial(Integer radial) {
        this.radial = radial;
    }

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(radial).append(distance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixRadialDistance) == false) {
            return false;
        }
        FixRadialDistance rhs = ((FixRadialDistance) other);
        return new EqualsBuilder().append(value, rhs.value).append(radial, rhs.radial).append(distance, rhs.distance).isEquals();
    }

}
