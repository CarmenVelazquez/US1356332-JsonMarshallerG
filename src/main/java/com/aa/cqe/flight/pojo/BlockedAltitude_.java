
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
    "min",
    "max"
})
public class BlockedAltitude_ {

    @JsonProperty("min")
    private String min;
    @JsonProperty("max")
    private String max;

    /**
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(min).append(max).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockedAltitude_) == false) {
            return false;
        }
        BlockedAltitude_ rhs = ((BlockedAltitude_) other);
        return new EqualsBuilder().append(min, rhs.min).append(max, rhs.max).isEquals();
    }

}
