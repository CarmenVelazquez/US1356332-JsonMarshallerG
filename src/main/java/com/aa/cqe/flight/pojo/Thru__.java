
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
    "paxCount",
    "childCount",
    "infantCount",
    "excessWeight",
    "ttlPsgrWgt"
})
public class Thru__ {

    @JsonProperty("paxCount")
    private Integer paxCount;
    @JsonProperty("childCount")
    private Integer childCount;
    @JsonProperty("infantCount")
    private Integer infantCount;
    @JsonProperty("excessWeight")
    private Integer excessWeight;
    @JsonProperty("ttlPsgrWgt")
    private Integer ttlPsgrWgt;

    /**
     * 
     * @return
     *     The paxCount
     */
    @JsonProperty("paxCount")
    public Integer getPaxCount() {
        return paxCount;
    }

    /**
     * 
     * @param paxCount
     *     The paxCount
     */
    @JsonProperty("paxCount")
    public void setPaxCount(Integer paxCount) {
        this.paxCount = paxCount;
    }

    /**
     * 
     * @return
     *     The childCount
     */
    @JsonProperty("childCount")
    public Integer getChildCount() {
        return childCount;
    }

    /**
     * 
     * @param childCount
     *     The childCount
     */
    @JsonProperty("childCount")
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    /**
     * 
     * @return
     *     The infantCount
     */
    @JsonProperty("infantCount")
    public Integer getInfantCount() {
        return infantCount;
    }

    /**
     * 
     * @param infantCount
     *     The infantCount
     */
    @JsonProperty("infantCount")
    public void setInfantCount(Integer infantCount) {
        this.infantCount = infantCount;
    }

    /**
     * 
     * @return
     *     The excessWeight
     */
    @JsonProperty("excessWeight")
    public Integer getExcessWeight() {
        return excessWeight;
    }

    /**
     * 
     * @param excessWeight
     *     The excessWeight
     */
    @JsonProperty("excessWeight")
    public void setExcessWeight(Integer excessWeight) {
        this.excessWeight = excessWeight;
    }

    /**
     * 
     * @return
     *     The ttlPsgrWgt
     */
    @JsonProperty("ttlPsgrWgt")
    public Integer getTtlPsgrWgt() {
        return ttlPsgrWgt;
    }

    /**
     * 
     * @param ttlPsgrWgt
     *     The ttlPsgrWgt
     */
    @JsonProperty("ttlPsgrWgt")
    public void setTtlPsgrWgt(Integer ttlPsgrWgt) {
        this.ttlPsgrWgt = ttlPsgrWgt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(paxCount).append(childCount).append(infantCount).append(excessWeight).append(ttlPsgrWgt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thru__) == false) {
            return false;
        }
        Thru__ rhs = ((Thru__) other);
        return new EqualsBuilder().append(paxCount, rhs.paxCount).append(childCount, rhs.childCount).append(infantCount, rhs.infantCount).append(excessWeight, rhs.excessWeight).append(ttlPsgrWgt, rhs.ttlPsgrWgt).isEquals();
    }

}
