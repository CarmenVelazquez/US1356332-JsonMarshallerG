
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
    "operatingPilot",
    "deadheadPilot",
    "operatingFA",
    "deadheadFA"
})
public class CrewChanges {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operatingPilot")
    private Boolean operatingPilot;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deadheadPilot")
    private Boolean deadheadPilot;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operatingFA")
    private Boolean operatingFA;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deadheadFA")
    private Boolean deadheadFA;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The operatingPilot
     */
    @JsonProperty("operatingPilot")
    public Boolean getOperatingPilot() {
        return operatingPilot;
    }

    /**
     * 
     * (Required)
     * 
     * @param operatingPilot
     *     The operatingPilot
     */
    @JsonProperty("operatingPilot")
    public void setOperatingPilot(Boolean operatingPilot) {
        this.operatingPilot = operatingPilot;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The deadheadPilot
     */
    @JsonProperty("deadheadPilot")
    public Boolean getDeadheadPilot() {
        return deadheadPilot;
    }

    /**
     * 
     * (Required)
     * 
     * @param deadheadPilot
     *     The deadheadPilot
     */
    @JsonProperty("deadheadPilot")
    public void setDeadheadPilot(Boolean deadheadPilot) {
        this.deadheadPilot = deadheadPilot;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The operatingFA
     */
    @JsonProperty("operatingFA")
    public Boolean getOperatingFA() {
        return operatingFA;
    }

    /**
     * 
     * (Required)
     * 
     * @param operatingFA
     *     The operatingFA
     */
    @JsonProperty("operatingFA")
    public void setOperatingFA(Boolean operatingFA) {
        this.operatingFA = operatingFA;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The deadheadFA
     */
    @JsonProperty("deadheadFA")
    public Boolean getDeadheadFA() {
        return deadheadFA;
    }

    /**
     * 
     * (Required)
     * 
     * @param deadheadFA
     *     The deadheadFA
     */
    @JsonProperty("deadheadFA")
    public void setDeadheadFA(Boolean deadheadFA) {
        this.deadheadFA = deadheadFA;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(operatingPilot).append(deadheadPilot).append(operatingFA).append(deadheadFA).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrewChanges) == false) {
            return false;
        }
        CrewChanges rhs = ((CrewChanges) other);
        return new EqualsBuilder().append(operatingPilot, rhs.operatingPilot).append(deadheadPilot, rhs.deadheadPilot).append(operatingFA, rhs.operatingFA).append(deadheadFA, rhs.deadheadFA).isEquals();
    }

}
