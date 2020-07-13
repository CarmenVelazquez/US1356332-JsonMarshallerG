
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
    "tankID"
})
public class TankFuel {

    @JsonProperty("value")
    private Integer value;
    @JsonProperty("tankID")
    private String tankID;

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The tankID
     */
    @JsonProperty("tankID")
    public String getTankID() {
        return tankID;
    }

    /**
     * 
     * @param tankID
     *     The tankID
     */
    @JsonProperty("tankID")
    public void setTankID(String tankID) {
        this.tankID = tankID;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(tankID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TankFuel) == false) {
            return false;
        }
        TankFuel rhs = ((TankFuel) other);
        return new EqualsBuilder().append(value, rhs.value).append(tankID, rhs.tankID).isEquals();
    }

}
