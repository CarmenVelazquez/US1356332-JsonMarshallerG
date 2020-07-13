
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
    "order",
    "thruCode",
    "thruTime"
})
public class Acar {

    @JsonProperty("order")
    private Integer order;
    @JsonProperty("thruCode")
    private String thruCode;
    @JsonProperty("thruTime")
    private String thruTime;

    /**
     * 
     * @return
     *     The order
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The thruCode
     */
    @JsonProperty("thruCode")
    public String getThruCode() {
        return thruCode;
    }

    /**
     * 
     * @param thruCode
     *     The thruCode
     */
    @JsonProperty("thruCode")
    public void setThruCode(String thruCode) {
        this.thruCode = thruCode;
    }

    /**
     * 
     * @return
     *     The thruTime
     */
    @JsonProperty("thruTime")
    public String getThruTime() {
        return thruTime;
    }

    /**
     * 
     * @param thruTime
     *     The thruTime
     */
    @JsonProperty("thruTime")
    public void setThruTime(String thruTime) {
        this.thruTime = thruTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(order).append(thruCode).append(thruTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Acar) == false) {
            return false;
        }
        Acar rhs = ((Acar) other);
        return new EqualsBuilder().append(order, rhs.order).append(thruCode, rhs.thruCode).append(thruTime, rhs.thruTime).isEquals();
    }

}
