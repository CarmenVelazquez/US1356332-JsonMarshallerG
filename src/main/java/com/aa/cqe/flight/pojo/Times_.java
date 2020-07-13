
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
    "actualProj",
    "GTD",
    "payProj",
    "skdProj"
})
public class Times_ {

    @JsonProperty("actualProj")
    private String actualProj;
    @JsonProperty("GTD")
    private String gTD;
    @JsonProperty("payProj")
    private String payProj;
    @JsonProperty("skdProj")
    private String skdProj;

    /**
     * 
     * @return
     *     The actualProj
     */
    @JsonProperty("actualProj")
    public String getActualProj() {
        return actualProj;
    }

    /**
     * 
     * @param actualProj
     *     The actualProj
     */
    @JsonProperty("actualProj")
    public void setActualProj(String actualProj) {
        this.actualProj = actualProj;
    }

    /**
     * 
     * @return
     *     The gTD
     */
    @JsonProperty("GTD")
    public String getGTD() {
        return gTD;
    }

    /**
     * 
     * @param gTD
     *     The GTD
     */
    @JsonProperty("GTD")
    public void setGTD(String gTD) {
        this.gTD = gTD;
    }

    /**
     * 
     * @return
     *     The payProj
     */
    @JsonProperty("payProj")
    public String getPayProj() {
        return payProj;
    }

    /**
     * 
     * @param payProj
     *     The payProj
     */
    @JsonProperty("payProj")
    public void setPayProj(String payProj) {
        this.payProj = payProj;
    }

    /**
     * 
     * @return
     *     The skdProj
     */
    @JsonProperty("skdProj")
    public String getSkdProj() {
        return skdProj;
    }

    /**
     * 
     * @param skdProj
     *     The skdProj
     */
    @JsonProperty("skdProj")
    public void setSkdProj(String skdProj) {
        this.skdProj = skdProj;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actualProj).append(gTD).append(payProj).append(skdProj).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Times_) == false) {
            return false;
        }
        Times_ rhs = ((Times_) other);
        return new EqualsBuilder().append(actualProj, rhs.actualProj).append(gTD, rhs.gTD).append(payProj, rhs.payProj).append(skdProj, rhs.skdProj).isEquals();
    }

}
