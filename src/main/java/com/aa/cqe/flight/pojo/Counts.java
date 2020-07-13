
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
    "paxDataItems",
    "cockpitCrew",
    "TSOB",
    "localJumpSeat",
    "thruJumpSeat",
    "facrew"
})
public class Counts {

    @JsonProperty("paxDataItems")
    private String paxDataItems;
    @JsonProperty("cockpitCrew")
    private Integer cockpitCrew;
    @JsonProperty("TSOB")
    private Integer tSOB;
    @JsonProperty("localJumpSeat")
    private Integer localJumpSeat;
    @JsonProperty("thruJumpSeat")
    private Integer thruJumpSeat;
    @JsonProperty("facrew")
    private Integer facrew;

    /**
     * 
     * @return
     *     The paxDataItems
     */
    @JsonProperty("paxDataItems")
    public String getPaxDataItems() {
        return paxDataItems;
    }

    /**
     * 
     * @param paxDataItems
     *     The paxDataItems
     */
    @JsonProperty("paxDataItems")
    public void setPaxDataItems(String paxDataItems) {
        this.paxDataItems = paxDataItems;
    }

    /**
     * 
     * @return
     *     The cockpitCrew
     */
    @JsonProperty("cockpitCrew")
    public Integer getCockpitCrew() {
        return cockpitCrew;
    }

    /**
     * 
     * @param cockpitCrew
     *     The cockpitCrew
     */
    @JsonProperty("cockpitCrew")
    public void setCockpitCrew(Integer cockpitCrew) {
        this.cockpitCrew = cockpitCrew;
    }

    /**
     * 
     * @return
     *     The tSOB
     */
    @JsonProperty("TSOB")
    public Integer getTSOB() {
        return tSOB;
    }

    /**
     * 
     * @param tSOB
     *     The TSOB
     */
    @JsonProperty("TSOB")
    public void setTSOB(Integer tSOB) {
        this.tSOB = tSOB;
    }

    /**
     * 
     * @return
     *     The localJumpSeat
     */
    @JsonProperty("localJumpSeat")
    public Integer getLocalJumpSeat() {
        return localJumpSeat;
    }

    /**
     * 
     * @param localJumpSeat
     *     The localJumpSeat
     */
    @JsonProperty("localJumpSeat")
    public void setLocalJumpSeat(Integer localJumpSeat) {
        this.localJumpSeat = localJumpSeat;
    }

    /**
     * 
     * @return
     *     The thruJumpSeat
     */
    @JsonProperty("thruJumpSeat")
    public Integer getThruJumpSeat() {
        return thruJumpSeat;
    }

    /**
     * 
     * @param thruJumpSeat
     *     The thruJumpSeat
     */
    @JsonProperty("thruJumpSeat")
    public void setThruJumpSeat(Integer thruJumpSeat) {
        this.thruJumpSeat = thruJumpSeat;
    }

    /**
     * 
     * @return
     *     The facrew
     */
    @JsonProperty("facrew")
    public Integer getFacrew() {
        return facrew;
    }

    /**
     * 
     * @param facrew
     *     The facrew
     */
    @JsonProperty("facrew")
    public void setFacrew(Integer facrew) {
        this.facrew = facrew;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(paxDataItems).append(cockpitCrew).append(tSOB).append(localJumpSeat).append(thruJumpSeat).append(facrew).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Counts) == false) {
            return false;
        }
        Counts rhs = ((Counts) other);
        return new EqualsBuilder().append(paxDataItems, rhs.paxDataItems).append(cockpitCrew, rhs.cockpitCrew).append(tSOB, rhs.tSOB).append(localJumpSeat, rhs.localJumpSeat).append(thruJumpSeat, rhs.thruJumpSeat).append(facrew, rhs.facrew).isEquals();
    }

}
