
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
    "planned",
    "thru",
    "downline"
})
public class PaxCounts {

    @JsonProperty("planned")
    private Integer planned;
    @JsonProperty("thru")
    private Integer thru;
    @JsonProperty("downline")
    private Integer downline;

    /**
     * 
     * @return
     *     The planned
     */
    @JsonProperty("planned")
    public Integer getPlanned() {
        return planned;
    }

    /**
     * 
     * @param planned
     *     The planned
     */
    @JsonProperty("planned")
    public void setPlanned(Integer planned) {
        this.planned = planned;
    }

    /**
     * 
     * @return
     *     The thru
     */
    @JsonProperty("thru")
    public Integer getThru() {
        return thru;
    }

    /**
     * 
     * @param thru
     *     The thru
     */
    @JsonProperty("thru")
    public void setThru(Integer thru) {
        this.thru = thru;
    }

    /**
     * 
     * @return
     *     The downline
     */
    @JsonProperty("downline")
    public Integer getDownline() {
        return downline;
    }

    /**
     * 
     * @param downline
     *     The downline
     */
    @JsonProperty("downline")
    public void setDownline(Integer downline) {
        this.downline = downline;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(planned).append(thru).append(downline).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaxCounts) == false) {
            return false;
        }
        PaxCounts rhs = ((PaxCounts) other);
        return new EqualsBuilder().append(planned, rhs.planned).append(thru, rhs.thru).append(downline, rhs.downline).isEquals();
    }

}
