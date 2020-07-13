
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
    "F",
    "Y",
    "C",
    "P",
    "unused"
})
public class CabinCapacity {

    @JsonProperty("F")
    private Integer f;
    @JsonProperty("Y")
    private Integer y;
    @JsonProperty("C")
    private Integer c;
    @JsonProperty("P")
    private Integer p;
    @JsonProperty("unused")
    private String unused;

    /**
     * 
     * @return
     *     The f
     */
    @JsonProperty("F")
    public Integer getF() {
        return f;
    }

    /**
     * 
     * @param f
     *     The F
     */
    @JsonProperty("F")
    public void setF(Integer f) {
        this.f = f;
    }

    /**
     * 
     * @return
     *     The y
     */
    @JsonProperty("Y")
    public Integer getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The Y
     */
    @JsonProperty("Y")
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * 
     * @return
     *     The c
     */
    @JsonProperty("C")
    public Integer getC() {
        return c;
    }

    /**
     * 
     * @param c
     *     The C
     */
    @JsonProperty("C")
    public void setC(Integer c) {
        this.c = c;
    }

    /**
     * 
     * @return
     *     The p
     */
    @JsonProperty("P")
    public Integer getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The P
     */
    @JsonProperty("P")
    public void setP(Integer p) {
        this.p = p;
    }

    /**
     * 
     * @return
     *     The unused
     */
    @JsonProperty("unused")
    public String getUnused() {
        return unused;
    }

    /**
     * 
     * @param unused
     *     The unused
     */
    @JsonProperty("unused")
    public void setUnused(String unused) {
        this.unused = unused;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(f).append(y).append(c).append(p).append(unused).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CabinCapacity) == false) {
            return false;
        }
        CabinCapacity rhs = ((CabinCapacity) other);
        return new EqualsBuilder().append(f, rhs.f).append(y, rhs.y).append(c, rhs.c).append(p, rhs.p).append(unused, rhs.unused).isEquals();
    }

}
