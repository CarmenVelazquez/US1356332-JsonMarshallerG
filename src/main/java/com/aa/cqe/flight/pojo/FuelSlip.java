
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
    "fuelDensity",
    "bondedFuelStatus",
    "allowedTankFuelDiff",
    "totalPlanFuel",
    "distribution",
    "remarkText"
})
public class FuelSlip {

    @JsonProperty("fuelDensity")
    private String fuelDensity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bondedFuelStatus")
    private Boolean bondedFuelStatus;
    @JsonProperty("allowedTankFuelDiff")
    private Integer allowedTankFuelDiff;
    @JsonProperty("totalPlanFuel")
    private Integer totalPlanFuel;
    @JsonProperty("distribution")
    private Distribution distribution;
    @JsonProperty("remarkText")
    private RemarkText remarkText;

    /**
     * 
     * @return
     *     The fuelDensity
     */
    @JsonProperty("fuelDensity")
    public String getFuelDensity() {
        return fuelDensity;
    }

    /**
     * 
     * @param fuelDensity
     *     The fuelDensity
     */
    @JsonProperty("fuelDensity")
    public void setFuelDensity(String fuelDensity) {
        this.fuelDensity = fuelDensity;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bondedFuelStatus
     */
    @JsonProperty("bondedFuelStatus")
    public Boolean getBondedFuelStatus() {
        return bondedFuelStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @param bondedFuelStatus
     *     The bondedFuelStatus
     */
    @JsonProperty("bondedFuelStatus")
    public void setBondedFuelStatus(Boolean bondedFuelStatus) {
        this.bondedFuelStatus = bondedFuelStatus;
    }

    /**
     * 
     * @return
     *     The allowedTankFuelDiff
     */
    @JsonProperty("allowedTankFuelDiff")
    public Integer getAllowedTankFuelDiff() {
        return allowedTankFuelDiff;
    }

    /**
     * 
     * @param allowedTankFuelDiff
     *     The allowedTankFuelDiff
     */
    @JsonProperty("allowedTankFuelDiff")
    public void setAllowedTankFuelDiff(Integer allowedTankFuelDiff) {
        this.allowedTankFuelDiff = allowedTankFuelDiff;
    }

    /**
     * 
     * @return
     *     The totalPlanFuel
     */
    @JsonProperty("totalPlanFuel")
    public Integer getTotalPlanFuel() {
        return totalPlanFuel;
    }

    /**
     * 
     * @param totalPlanFuel
     *     The totalPlanFuel
     */
    @JsonProperty("totalPlanFuel")
    public void setTotalPlanFuel(Integer totalPlanFuel) {
        this.totalPlanFuel = totalPlanFuel;
    }

    /**
     * 
     * @return
     *     The distribution
     */
    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * 
     * @param distribution
     *     The distribution
     */
    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    /**
     * 
     * @return
     *     The remarkText
     */
    @JsonProperty("remarkText")
    public RemarkText getRemarkText() {
        return remarkText;
    }

    /**
     * 
     * @param remarkText
     *     The remarkText
     */
    @JsonProperty("remarkText")
    public void setRemarkText(RemarkText remarkText) {
        this.remarkText = remarkText;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fuelDensity).append(bondedFuelStatus).append(allowedTankFuelDiff).append(totalPlanFuel).append(distribution).append(remarkText).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FuelSlip) == false) {
            return false;
        }
        FuelSlip rhs = ((FuelSlip) other);
        return new EqualsBuilder().append(fuelDensity, rhs.fuelDensity).append(bondedFuelStatus, rhs.bondedFuelStatus).append(allowedTankFuelDiff, rhs.allowedTankFuelDiff).append(totalPlanFuel, rhs.totalPlanFuel).append(distribution, rhs.distribution).append(remarkText, rhs.remarkText).isEquals();
    }

}
