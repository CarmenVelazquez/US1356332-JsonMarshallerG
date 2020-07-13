
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
    "crewConnectionQualifiers",
    "cockpitPositions",
    "faPositions",
    "operatingCrewForOtherLeg",
    "cockpitCrewCount",
    "faCrewCount",
    "dhCockpitCrewCount",
    "dhfaCrewCount"
})
public class Crew {

    @JsonProperty("crewConnectionQualifiers")
    private String crewConnectionQualifiers;
    @JsonProperty("cockpitPositions")
    private String cockpitPositions;
    @JsonProperty("faPositions")
    private String faPositions;
    @JsonProperty("operatingCrewForOtherLeg")
    private String operatingCrewForOtherLeg;
    @JsonProperty("cockpitCrewCount")
    private Integer cockpitCrewCount;
    @JsonProperty("faCrewCount")
    private Integer faCrewCount;
    @JsonProperty("dhCockpitCrewCount")
    private Integer dhCockpitCrewCount;
    @JsonProperty("dhfaCrewCount")
    private Integer dhfaCrewCount;

    /**
     * 
     * @return
     *     The crewConnectionQualifiers
     */
    @JsonProperty("crewConnectionQualifiers")
    public String getCrewConnectionQualifiers() {
        return crewConnectionQualifiers;
    }

    /**
     * 
     * @param crewConnectionQualifiers
     *     The crewConnectionQualifiers
     */
    @JsonProperty("crewConnectionQualifiers")
    public void setCrewConnectionQualifiers(String crewConnectionQualifiers) {
        this.crewConnectionQualifiers = crewConnectionQualifiers;
    }

    /**
     * 
     * @return
     *     The cockpitPositions
     */
    @JsonProperty("cockpitPositions")
    public String getCockpitPositions() {
        return cockpitPositions;
    }

    /**
     * 
     * @param cockpitPositions
     *     The cockpitPositions
     */
    @JsonProperty("cockpitPositions")
    public void setCockpitPositions(String cockpitPositions) {
        this.cockpitPositions = cockpitPositions;
    }

    /**
     * 
     * @return
     *     The faPositions
     */
    @JsonProperty("faPositions")
    public String getFaPositions() {
        return faPositions;
    }

    /**
     * 
     * @param faPositions
     *     The faPositions
     */
    @JsonProperty("faPositions")
    public void setFaPositions(String faPositions) {
        this.faPositions = faPositions;
    }

    /**
     * 
     * @return
     *     The operatingCrewForOtherLeg
     */
    @JsonProperty("operatingCrewForOtherLeg")
    public String getOperatingCrewForOtherLeg() {
        return operatingCrewForOtherLeg;
    }

    /**
     * 
     * @param operatingCrewForOtherLeg
     *     The operatingCrewForOtherLeg
     */
    @JsonProperty("operatingCrewForOtherLeg")
    public void setOperatingCrewForOtherLeg(String operatingCrewForOtherLeg) {
        this.operatingCrewForOtherLeg = operatingCrewForOtherLeg;
    }

    /**
     * 
     * @return
     *     The cockpitCrewCount
     */
    @JsonProperty("cockpitCrewCount")
    public Integer getCockpitCrewCount() {
        return cockpitCrewCount;
    }

    /**
     * 
     * @param cockpitCrewCount
     *     The cockpitCrewCount
     */
    @JsonProperty("cockpitCrewCount")
    public void setCockpitCrewCount(Integer cockpitCrewCount) {
        this.cockpitCrewCount = cockpitCrewCount;
    }

    /**
     * 
     * @return
     *     The faCrewCount
     */
    @JsonProperty("faCrewCount")
    public Integer getFaCrewCount() {
        return faCrewCount;
    }

    /**
     * 
     * @param faCrewCount
     *     The faCrewCount
     */
    @JsonProperty("faCrewCount")
    public void setFaCrewCount(Integer faCrewCount) {
        this.faCrewCount = faCrewCount;
    }

    /**
     * 
     * @return
     *     The dhCockpitCrewCount
     */
    @JsonProperty("dhCockpitCrewCount")
    public Integer getDhCockpitCrewCount() {
        return dhCockpitCrewCount;
    }

    /**
     * 
     * @param dhCockpitCrewCount
     *     The dhCockpitCrewCount
     */
    @JsonProperty("dhCockpitCrewCount")
    public void setDhCockpitCrewCount(Integer dhCockpitCrewCount) {
        this.dhCockpitCrewCount = dhCockpitCrewCount;
    }

    /**
     * 
     * @return
     *     The dhfaCrewCount
     */
    @JsonProperty("dhfaCrewCount")
    public Integer getDhfaCrewCount() {
        return dhfaCrewCount;
    }

    /**
     * 
     * @param dhfaCrewCount
     *     The dhfaCrewCount
     */
    @JsonProperty("dhfaCrewCount")
    public void setDhfaCrewCount(Integer dhfaCrewCount) {
        this.dhfaCrewCount = dhfaCrewCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crewConnectionQualifiers).append(cockpitPositions).append(faPositions).append(operatingCrewForOtherLeg).append(cockpitCrewCount).append(faCrewCount).append(dhCockpitCrewCount).append(dhfaCrewCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Crew) == false) {
            return false;
        }
        Crew rhs = ((Crew) other);
        return new EqualsBuilder().append(crewConnectionQualifiers, rhs.crewConnectionQualifiers).append(cockpitPositions, rhs.cockpitPositions).append(faPositions, rhs.faPositions).append(operatingCrewForOtherLeg, rhs.operatingCrewForOtherLeg).append(cockpitCrewCount, rhs.cockpitCrewCount).append(faCrewCount, rhs.faCrewCount).append(dhCockpitCrewCount, rhs.dhCockpitCrewCount).append(dhfaCrewCount, rhs.dhfaCrewCount).isEquals();
    }

}
