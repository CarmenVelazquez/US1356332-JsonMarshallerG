
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
    "localF",
    "thruF",
    "localY",
    "thruY"
})
public class XRider {

    @JsonProperty("localF")
    private Integer localF;
    @JsonProperty("thruF")
    private Integer thruF;
    @JsonProperty("localY")
    private Integer localY;
    @JsonProperty("thruY")
    private Integer thruY;

    /**
     * 
     * @return
     *     The localF
     */
    @JsonProperty("localF")
    public Integer getLocalF() {
        return localF;
    }

    /**
     * 
     * @param localF
     *     The localF
     */
    @JsonProperty("localF")
    public void setLocalF(Integer localF) {
        this.localF = localF;
    }

    /**
     * 
     * @return
     *     The thruF
     */
    @JsonProperty("thruF")
    public Integer getThruF() {
        return thruF;
    }

    /**
     * 
     * @param thruF
     *     The thruF
     */
    @JsonProperty("thruF")
    public void setThruF(Integer thruF) {
        this.thruF = thruF;
    }

    /**
     * 
     * @return
     *     The localY
     */
    @JsonProperty("localY")
    public Integer getLocalY() {
        return localY;
    }

    /**
     * 
     * @param localY
     *     The localY
     */
    @JsonProperty("localY")
    public void setLocalY(Integer localY) {
        this.localY = localY;
    }

    /**
     * 
     * @return
     *     The thruY
     */
    @JsonProperty("thruY")
    public Integer getThruY() {
        return thruY;
    }

    /**
     * 
     * @param thruY
     *     The thruY
     */
    @JsonProperty("thruY")
    public void setThruY(Integer thruY) {
        this.thruY = thruY;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(localF).append(thruF).append(localY).append(thruY).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XRider) == false) {
            return false;
        }
        XRider rhs = ((XRider) other);
        return new EqualsBuilder().append(localF, rhs.localF).append(thruF, rhs.thruF).append(localY, rhs.localY).append(thruY, rhs.thruY).isEquals();
    }

}
