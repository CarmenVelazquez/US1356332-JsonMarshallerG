
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
    "code",
    "time",
    "resFlt",
    "resSta"
})
public class Thru {

    @JsonProperty("order")
    private Integer order;
    @JsonProperty("code")
    private String code;
    @JsonProperty("time")
    private String time;
    @JsonProperty("resFlt")
    private String resFlt;
    @JsonProperty("resSta")
    private String resSta;

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
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The resFlt
     */
    @JsonProperty("resFlt")
    public String getResFlt() {
        return resFlt;
    }

    /**
     * 
     * @param resFlt
     *     The resFlt
     */
    @JsonProperty("resFlt")
    public void setResFlt(String resFlt) {
        this.resFlt = resFlt;
    }

    /**
     * 
     * @return
     *     The resSta
     */
    @JsonProperty("resSta")
    public String getResSta() {
        return resSta;
    }

    /**
     * 
     * @param resSta
     *     The resSta
     */
    @JsonProperty("resSta")
    public void setResSta(String resSta) {
        this.resSta = resSta;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(order).append(code).append(time).append(resFlt).append(resSta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thru) == false) {
            return false;
        }
        Thru rhs = ((Thru) other);
        return new EqualsBuilder().append(order, rhs.order).append(code, rhs.code).append(time, rhs.time).append(resFlt, rhs.resFlt).append(resSta, rhs.resSta).isEquals();
    }

}
