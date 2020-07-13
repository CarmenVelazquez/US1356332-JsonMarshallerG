
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
    "firstFuelerRmk",
    "secondFuelerRmk",
    "melCdlRemark",
    "fuelSlipText"
})
public class RemarkText {

    @JsonProperty("firstFuelerRmk")
    private String firstFuelerRmk;
    @JsonProperty("secondFuelerRmk")
    private String secondFuelerRmk;
    @JsonProperty("melCdlRemark")
    private String melCdlRemark;
    @JsonProperty("fuelSlipText")
    private String fuelSlipText;

    /**
     * 
     * @return
     *     The firstFuelerRmk
     */
    @JsonProperty("firstFuelerRmk")
    public String getFirstFuelerRmk() {
        return firstFuelerRmk;
    }

    /**
     * 
     * @param firstFuelerRmk
     *     The firstFuelerRmk
     */
    @JsonProperty("firstFuelerRmk")
    public void setFirstFuelerRmk(String firstFuelerRmk) {
        this.firstFuelerRmk = firstFuelerRmk;
    }

    /**
     * 
     * @return
     *     The secondFuelerRmk
     */
    @JsonProperty("secondFuelerRmk")
    public String getSecondFuelerRmk() {
        return secondFuelerRmk;
    }

    /**
     * 
     * @param secondFuelerRmk
     *     The secondFuelerRmk
     */
    @JsonProperty("secondFuelerRmk")
    public void setSecondFuelerRmk(String secondFuelerRmk) {
        this.secondFuelerRmk = secondFuelerRmk;
    }

    /**
     * 
     * @return
     *     The melCdlRemark
     */
    @JsonProperty("melCdlRemark")
    public String getMelCdlRemark() {
        return melCdlRemark;
    }

    /**
     * 
     * @param melCdlRemark
     *     The melCdlRemark
     */
    @JsonProperty("melCdlRemark")
    public void setMelCdlRemark(String melCdlRemark) {
        this.melCdlRemark = melCdlRemark;
    }

    /**
     * 
     * @return
     *     The fuelSlipText
     */
    @JsonProperty("fuelSlipText")
    public String getFuelSlipText() {
        return fuelSlipText;
    }

    /**
     * 
     * @param fuelSlipText
     *     The fuelSlipText
     */
    @JsonProperty("fuelSlipText")
    public void setFuelSlipText(String fuelSlipText) {
        this.fuelSlipText = fuelSlipText;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstFuelerRmk).append(secondFuelerRmk).append(melCdlRemark).append(fuelSlipText).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemarkText) == false) {
            return false;
        }
        RemarkText rhs = ((RemarkText) other);
        return new EqualsBuilder().append(firstFuelerRmk, rhs.firstFuelerRmk).append(secondFuelerRmk, rhs.secondFuelerRmk).append(melCdlRemark, rhs.melCdlRemark).append(fuelSlipText, rhs.fuelSlipText).isEquals();
    }

}
