
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
    "above"
})
public class SimpleAltitude_ {

    @JsonProperty("value")
    private String value;
    @JsonProperty("above")
    private Boolean above;

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
     *     The above
     */
    @JsonProperty("above")
    public Boolean getAbove() {
        return above;
    }

    /**
     * 
     * @param above
     *     The above
     */
    @JsonProperty("above")
    public void setAbove(Boolean above) {
        this.above = above;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(above).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleAltitude_) == false) {
            return false;
        }
        SimpleAltitude_ rhs = ((SimpleAltitude_) other);
        return new EqualsBuilder().append(value, rhs.value).append(above, rhs.above).isEquals();
    }

}
