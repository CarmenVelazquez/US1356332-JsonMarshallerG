
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
    "highestQual",
    "CAT1",
    "CAT2",
    "CAT3",
    "restricted"
})
public class LandingQuals {

    @JsonProperty("highestQual")
    private String highestQual;
    @JsonProperty("CAT1")
    private String cAT1;
    @JsonProperty("CAT2")
    private String cAT2;
    @JsonProperty("CAT3")
    private String cAT3;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restricted")
    private Boolean restricted;

    /**
     * 
     * @return
     *     The highestQual
     */
    @JsonProperty("highestQual")
    public String getHighestQual() {
        return highestQual;
    }

    /**
     * 
     * @param highestQual
     *     The highestQual
     */
    @JsonProperty("highestQual")
    public void setHighestQual(String highestQual) {
        this.highestQual = highestQual;
    }

    /**
     * 
     * @return
     *     The cAT1
     */
    @JsonProperty("CAT1")
    public String getCAT1() {
        return cAT1;
    }

    /**
     * 
     * @param cAT1
     *     The CAT1
     */
    @JsonProperty("CAT1")
    public void setCAT1(String cAT1) {
        this.cAT1 = cAT1;
    }

    /**
     * 
     * @return
     *     The cAT2
     */
    @JsonProperty("CAT2")
    public String getCAT2() {
        return cAT2;
    }

    /**
     * 
     * @param cAT2
     *     The CAT2
     */
    @JsonProperty("CAT2")
    public void setCAT2(String cAT2) {
        this.cAT2 = cAT2;
    }

    /**
     * 
     * @return
     *     The cAT3
     */
    @JsonProperty("CAT3")
    public String getCAT3() {
        return cAT3;
    }

    /**
     * 
     * @param cAT3
     *     The CAT3
     */
    @JsonProperty("CAT3")
    public void setCAT3(String cAT3) {
        this.cAT3 = cAT3;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The restricted
     */
    @JsonProperty("restricted")
    public Boolean getRestricted() {
        return restricted;
    }

    /**
     * 
     * (Required)
     * 
     * @param restricted
     *     The restricted
     */
    @JsonProperty("restricted")
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(highestQual).append(cAT1).append(cAT2).append(cAT3).append(restricted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingQuals) == false) {
            return false;
        }
        LandingQuals rhs = ((LandingQuals) other);
        return new EqualsBuilder().append(highestQual, rhs.highestQual).append(cAT1, rhs.cAT1).append(cAT2, rhs.cAT2).append(cAT3, rhs.cAT3).append(restricted, rhs.restricted).isEquals();
    }

}
