
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
    "bagCount",
    "frtWeight",
    "bagWeight",
    "containerWeight",
    "mailWeight",
    "otherWeight"
})
public class Local_ {

    @JsonProperty("bagCount")
    private Integer bagCount;
    @JsonProperty("frtWeight")
    private Integer frtWeight;
    @JsonProperty("bagWeight")
    private Integer bagWeight;
    @JsonProperty("containerWeight")
    private Integer containerWeight;
    @JsonProperty("mailWeight")
    private Integer mailWeight;
    @JsonProperty("otherWeight")
    private Integer otherWeight;

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

    /**
     * 
     * @return
     *     The frtWeight
     */
    @JsonProperty("frtWeight")
    public Integer getFrtWeight() {
        return frtWeight;
    }

    /**
     * 
     * @param frtWeight
     *     The frtWeight
     */
    @JsonProperty("frtWeight")
    public void setFrtWeight(Integer frtWeight) {
        this.frtWeight = frtWeight;
    }

    /**
     * 
     * @return
     *     The bagWeight
     */
    @JsonProperty("bagWeight")
    public Integer getBagWeight() {
        return bagWeight;
    }

    /**
     * 
     * @param bagWeight
     *     The bagWeight
     */
    @JsonProperty("bagWeight")
    public void setBagWeight(Integer bagWeight) {
        this.bagWeight = bagWeight;
    }

    /**
     * 
     * @return
     *     The containerWeight
     */
    @JsonProperty("containerWeight")
    public Integer getContainerWeight() {
        return containerWeight;
    }

    /**
     * 
     * @param containerWeight
     *     The containerWeight
     */
    @JsonProperty("containerWeight")
    public void setContainerWeight(Integer containerWeight) {
        this.containerWeight = containerWeight;
    }

    /**
     * 
     * @return
     *     The mailWeight
     */
    @JsonProperty("mailWeight")
    public Integer getMailWeight() {
        return mailWeight;
    }

    /**
     * 
     * @param mailWeight
     *     The mailWeight
     */
    @JsonProperty("mailWeight")
    public void setMailWeight(Integer mailWeight) {
        this.mailWeight = mailWeight;
    }

    /**
     * 
     * @return
     *     The otherWeight
     */
    @JsonProperty("otherWeight")
    public Integer getOtherWeight() {
        return otherWeight;
    }

    /**
     * 
     * @param otherWeight
     *     The otherWeight
     */
    @JsonProperty("otherWeight")
    public void setOtherWeight(Integer otherWeight) {
        this.otherWeight = otherWeight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bagCount).append(frtWeight).append(bagWeight).append(containerWeight).append(mailWeight).append(otherWeight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Local_) == false) {
            return false;
        }
        Local_ rhs = ((Local_) other);
        return new EqualsBuilder().append(bagCount, rhs.bagCount).append(frtWeight, rhs.frtWeight).append(bagWeight, rhs.bagWeight).append(containerWeight, rhs.containerWeight).append(mailWeight, rhs.mailWeight).append(otherWeight, rhs.otherWeight).isEquals();
    }

}
