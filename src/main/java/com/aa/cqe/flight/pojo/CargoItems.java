
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
    "cargoItem"
})
public class CargoItems {

    @JsonProperty("cargoItem")
    private List<CargoItem> cargoItem = new ArrayList<CargoItem>();

    /**
     * 
     * @return
     *     The cargoItem
     */
    @JsonProperty("cargoItem")
    public List<CargoItem> getCargoItem() {
        return cargoItem;
    }

    /**
     * 
     * @param cargoItem
     *     The cargoItem
     */
    @JsonProperty("cargoItem")
    public void setCargoItem(List<CargoItem> cargoItem) {
        this.cargoItem = cargoItem;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cargoItem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CargoItems) == false) {
            return false;
        }
        CargoItems rhs = ((CargoItems) other);
        return new EqualsBuilder().append(cargoItem, rhs.cargoItem).isEquals();
    }

}
