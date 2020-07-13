
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
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
    "crewChanges",
    "landingQuals",
    "crewmember"
})
public class CrewData {

    @JsonProperty("crewChanges")
    private CrewChanges crewChanges;
    @JsonProperty("landingQuals")
    private LandingQuals landingQuals;
    @JsonProperty("crewmember")
    private List<Crewmember> crewmember = new ArrayList<Crewmember>();

    /**
     * 
     * @return
     *     The crewChanges
     */
    @JsonProperty("crewChanges")
    public CrewChanges getCrewChanges() {
        return crewChanges;
    }

    /**
     * 
     * @param crewChanges
     *     The crewChanges
     */
    @JsonProperty("crewChanges")
    public void setCrewChanges(CrewChanges crewChanges) {
        this.crewChanges = crewChanges;
    }

    /**
     * 
     * @return
     *     The landingQuals
     */
    @JsonProperty("landingQuals")
    public LandingQuals getLandingQuals() {
        return landingQuals;
    }

    /**
     * 
     * @param landingQuals
     *     The landingQuals
     */
    @JsonProperty("landingQuals")
    public void setLandingQuals(LandingQuals landingQuals) {
        this.landingQuals = landingQuals;
    }

    /**
     * 
     * @return
     *     The crewmember
     */
    @JsonProperty("crewmember")
    public List<Crewmember> getCrewmember() {
        return crewmember;
    }

    /**
     * 
     * @param crewmember
     *     The crewmember
     */
    @JsonProperty("crewmember")
    public void setCrewmember(List<Crewmember> crewmember) {
        this.crewmember = crewmember;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crewChanges).append(landingQuals).append(crewmember).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrewData) == false) {
            return false;
        }
        CrewData rhs = ((CrewData) other);
        return new EqualsBuilder().append(crewChanges, rhs.crewChanges).append(landingQuals, rhs.landingQuals).append(crewmember, rhs.crewmember).isEquals();
    }

}
