
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
    "mtowWeightAndMldgWeight"
})
public class MaxWeights {

    @JsonProperty("mtowWeightAndMldgWeight")
    private List<String> mtowWeightAndMldgWeight = new ArrayList<String>();

    /**
     * 
     * @return
     *     The mtowWeightAndMldgWeight
     */
    @JsonProperty("mtowWeightAndMldgWeight")
    public List<String> getMtowWeightAndMldgWeight() {
        return mtowWeightAndMldgWeight;
    }

    /**
     * 
     * @param mtowWeightAndMldgWeight
     *     The mtowWeightAndMldgWeight
     */
    @JsonProperty("mtowWeightAndMldgWeight")
    public void setMtowWeightAndMldgWeight(List<String> mtowWeightAndMldgWeight) {
        this.mtowWeightAndMldgWeight = mtowWeightAndMldgWeight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mtowWeightAndMldgWeight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaxWeights) == false) {
            return false;
        }
        MaxWeights rhs = ((MaxWeights) other);
        return new EqualsBuilder().append(mtowWeightAndMldgWeight, rhs.mtowWeightAndMldgWeight).isEquals();
    }

}
