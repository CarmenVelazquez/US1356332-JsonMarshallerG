
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
    "visualFlightRules"
})
public class RequestedAltitude {

    @JsonProperty("simpleAltitude")
    private SimpleAltitude simpleAltitude;
    @JsonProperty("blockedAltitude")
    private BlockedAltitude blockedAltitude;
    @JsonProperty("visualFlightRules")
    private VisualFlightRules visualFlightRules;

    /**
     * 
     * @return
     *     The simpleAltitude
     */
    @JsonProperty("simpleAltitude")
    public SimpleAltitude getSimpleAltitude() {
        return simpleAltitude;
    }

    /**
     * 
     * @param simpleAltitude
     *     The simpleAltitude
     */
    @JsonProperty("simpleAltitude")
    public void setSimpleAltitude(SimpleAltitude simpleAltitude) {
        this.simpleAltitude = simpleAltitude;
    }

    /**
     * 
     * @return
     *     The blockedAltitude
     */
    @JsonProperty("blockedAltitude")
    public BlockedAltitude getBlockedAltitude() {
        return blockedAltitude;
    }

    /**
     * 
     * @param blockedAltitude
     *     The blockedAltitude
     */
    @JsonProperty("blockedAltitude")
    public void setBlockedAltitude(BlockedAltitude blockedAltitude) {
        this.blockedAltitude = blockedAltitude;
    }

    /**
     * 
     * @return
     *     The visualFlightRules
     */
    @JsonProperty("visualFlightRules")
    public VisualFlightRules getVisualFlightRules() {
        return visualFlightRules;
    }

    /**
     * 
     * @param visualFlightRules
     *     The visualFlightRules
     */
    @JsonProperty("visualFlightRules")
    public void setVisualFlightRules(VisualFlightRules visualFlightRules) {
        this.visualFlightRules = visualFlightRules;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleAltitude).append(blockedAltitude).append(visualFlightRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestedAltitude) == false) {
            return false;
        }
        RequestedAltitude rhs = ((RequestedAltitude) other);
        return new EqualsBuilder().append(simpleAltitude, rhs.simpleAltitude).append(blockedAltitude, rhs.blockedAltitude).append(visualFlightRules, rhs.visualFlightRules).isEquals();
    }

}
