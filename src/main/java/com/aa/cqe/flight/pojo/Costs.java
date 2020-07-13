
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
    "goodwill",
    "cancellation",
    "timesCancelled",
    "revenue"
})
public class Costs {

    @JsonProperty("goodwill")
    private Integer goodwill;
    @JsonProperty("cancellation")
    private Integer cancellation;
    @JsonProperty("timesCancelled")
    private Integer timesCancelled;
    @JsonProperty("revenue")
    private Integer revenue;

    /**
     * 
     * @return
     *     The goodwill
     */
    @JsonProperty("goodwill")
    public Integer getGoodwill() {
        return goodwill;
    }

    /**
     * 
     * @param goodwill
     *     The goodwill
     */
    @JsonProperty("goodwill")
    public void setGoodwill(Integer goodwill) {
        this.goodwill = goodwill;
    }

    /**
     * 
     * @return
     *     The cancellation
     */
    @JsonProperty("cancellation")
    public Integer getCancellation() {
        return cancellation;
    }

    /**
     * 
     * @param cancellation
     *     The cancellation
     */
    @JsonProperty("cancellation")
    public void setCancellation(Integer cancellation) {
        this.cancellation = cancellation;
    }

    /**
     * 
     * @return
     *     The timesCancelled
     */
    @JsonProperty("timesCancelled")
    public Integer getTimesCancelled() {
        return timesCancelled;
    }

    /**
     * 
     * @param timesCancelled
     *     The timesCancelled
     */
    @JsonProperty("timesCancelled")
    public void setTimesCancelled(Integer timesCancelled) {
        this.timesCancelled = timesCancelled;
    }

    /**
     * 
     * @return
     *     The revenue
     */
    @JsonProperty("revenue")
    public Integer getRevenue() {
        return revenue;
    }

    /**
     * 
     * @param revenue
     *     The revenue
     */
    @JsonProperty("revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(goodwill).append(cancellation).append(timesCancelled).append(revenue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Costs) == false) {
            return false;
        }
        Costs rhs = ((Costs) other);
        return new EqualsBuilder().append(goodwill, rhs.goodwill).append(cancellation, rhs.cancellation).append(timesCancelled, rhs.timesCancelled).append(revenue, rhs.revenue).isEquals();
    }

}
