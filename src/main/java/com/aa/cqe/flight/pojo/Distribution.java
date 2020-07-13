
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
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
    "tankFuel"
})
public class Distribution {

    @JsonProperty("tankFuel")
    private List<TankFuel> tankFuel = new ArrayList<TankFuel>();

    /**
     * 
     * @return
     *     The tankFuel
     */
    @JsonProperty("tankFuel")
    public List<TankFuel> getTankFuel() {
        return tankFuel;
    }

    /**
     * 
     * @param tankFuel
     *     The tankFuel
     */
    @JsonProperty("tankFuel")
    public void setTankFuel(List<TankFuel> tankFuel) {
        this.tankFuel = tankFuel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tankFuel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distribution) == false) {
            return false;
        }
        Distribution rhs = ((Distribution) other);
        return new EqualsBuilder().append(tankFuel, rhs.tankFuel).isEquals();
    }

}
