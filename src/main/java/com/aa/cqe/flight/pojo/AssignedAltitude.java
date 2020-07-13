
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
    "simpleAltitude",
    "blockedAltitude",
    "visualFlightRules",
    "altitudeFixAltitude"
})
public class AssignedAltitude {

    @JsonProperty("simpleAltitude")
    private SimpleAltitude_ simpleAltitude;
    @JsonProperty("blockedAltitude")
    private BlockedAltitude_ blockedAltitude;
    @JsonProperty("visualFlightRules")
    private VisualFlightRules_ visualFlightRules;
    @JsonProperty("altitudeFixAltitude")
    private AltitudeFixAltitude altitudeFixAltitude;

    /**
     * 
     * @return
     *     The simpleAltitude
     */
    @JsonProperty("simpleAltitude")
    public SimpleAltitude_ getSimpleAltitude() {
        return simpleAltitude;
    }

    /**
     * 
     * @param simpleAltitude
     *     The simpleAltitude
     */
    @JsonProperty("simpleAltitude")
    public void setSimpleAltitude(SimpleAltitude_ simpleAltitude) {
        this.simpleAltitude = simpleAltitude;
    }

    /**
     * 
     * @return
     *     The blockedAltitude
     */
    @JsonProperty("blockedAltitude")
    public BlockedAltitude_ getBlockedAltitude() {
        return blockedAltitude;
    }

    /**
     * 
     * @param blockedAltitude
     *     The blockedAltitude
     */
    @JsonProperty("blockedAltitude")
    public void setBlockedAltitude(BlockedAltitude_ blockedAltitude) {
        this.blockedAltitude = blockedAltitude;
    }

    /**
     * 
     * @return
     *     The visualFlightRules
     */
    @JsonProperty("visualFlightRules")
    public VisualFlightRules_ getVisualFlightRules() {
        return visualFlightRules;
    }

    /**
     * 
     * @param visualFlightRules
     *     The visualFlightRules
     */
    @JsonProperty("visualFlightRules")
    public void setVisualFlightRules(VisualFlightRules_ visualFlightRules) {
        this.visualFlightRules = visualFlightRules;
    }

    /**
     * 
     * @return
     *     The altitudeFixAltitude
     */
    @JsonProperty("altitudeFixAltitude")
    public AltitudeFixAltitude getAltitudeFixAltitude() {
        return altitudeFixAltitude;
    }

    /**
     * 
     * @param altitudeFixAltitude
     *     The altitudeFixAltitude
     */
    @JsonProperty("altitudeFixAltitude")
    public void setAltitudeFixAltitude(AltitudeFixAltitude altitudeFixAltitude) {
        this.altitudeFixAltitude = altitudeFixAltitude;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleAltitude).append(blockedAltitude).append(visualFlightRules).append(altitudeFixAltitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssignedAltitude) == false) {
            return false;
        }
        AssignedAltitude rhs = ((AssignedAltitude) other);
        return new EqualsBuilder().append(simpleAltitude, rhs.simpleAltitude).append(blockedAltitude, rhs.blockedAltitude).append(visualFlightRules, rhs.visualFlightRules).append(altitudeFixAltitude, rhs.altitudeFixAltitude).isEquals();
    }

}
