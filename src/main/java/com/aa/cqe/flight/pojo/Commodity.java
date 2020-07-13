
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
    "bagType",
    "bagCount"
})
public class Commodity {

    @JsonProperty("value")
    private String value;
    @JsonProperty("bagType")
    private String bagType;
    @JsonProperty("bagCount")
    private Integer bagCount;

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
     *     The bagType
     */
    @JsonProperty("bagType")
    public String getBagType() {
        return bagType;
    }

    /**
     * 
     * @param bagType
     *     The bagType
     */
    @JsonProperty("bagType")
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    /**
     * 
     * @return
     *     The bagCount
     */
    @JsonProperty("bagCount")
    public Integer getBagCount() {
        return bagCount;
    }

    /**
     * 
     * @param bagCount
     *     The bagCount
     */
    @JsonProperty("bagCount")
    public void setBagCount(Integer bagCount) {
        this.bagCount = bagCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(bagType).append(bagCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Commodity) == false) {
            return false;
        }
        Commodity rhs = ((Commodity) other);
        return new EqualsBuilder().append(value, rhs.value).append(bagType, rhs.bagType).append(bagCount, rhs.bagCount).isEquals();
    }

}
