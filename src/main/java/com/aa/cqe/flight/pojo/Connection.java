
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
    "flightConnection",
    "crewPaxBothInd",
    "prevNextInd",
    "crew"
})
public class Connection {

    @JsonProperty("flightConnection")
    private FlightConnection flightConnection;
    @JsonProperty("crewPaxBothInd")
    private String crewPaxBothInd;
    @JsonProperty("prevNextInd")
    private String prevNextInd;
    @JsonProperty("crew")
    private Crew crew;

    /**
     * 
     * @return
     *     The flightConnection
     */
    @JsonProperty("flightConnection")
    public FlightConnection getFlightConnection() {
        return flightConnection;
    }

    /**
     * 
     * @param flightConnection
     *     The flightConnection
     */
    @JsonProperty("flightConnection")
    public void setFlightConnection(FlightConnection flightConnection) {
        this.flightConnection = flightConnection;
    }

    /**
     * 
     * @return
     *     The crewPaxBothInd
     */
    @JsonProperty("crewPaxBothInd")
    public String getCrewPaxBothInd() {
        return crewPaxBothInd;
    }

    /**
     * 
     * @param crewPaxBothInd
     *     The crewPaxBothInd
     */
    @JsonProperty("crewPaxBothInd")
    public void setCrewPaxBothInd(String crewPaxBothInd) {
        this.crewPaxBothInd = crewPaxBothInd;
    }

    /**
     * 
     * @return
     *     The prevNextInd
     */
    @JsonProperty("prevNextInd")
    public String getPrevNextInd() {
        return prevNextInd;
    }

    /**
     * 
     * @param prevNextInd
     *     The prevNextInd
     */
    @JsonProperty("prevNextInd")
    public void setPrevNextInd(String prevNextInd) {
        this.prevNextInd = prevNextInd;
    }

    /**
     * 
     * @return
     *     The crew
     */
    @JsonProperty("crew")
    public Crew getCrew() {
        return crew;
    }

    /**
     * 
     * @param crew
     *     The crew
     */
    @JsonProperty("crew")
    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightConnection).append(crewPaxBothInd).append(prevNextInd).append(crew).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return new EqualsBuilder().append(flightConnection, rhs.flightConnection).append(crewPaxBothInd, rhs.crewPaxBothInd).append(prevNextInd, rhs.prevNextInd).append(crew, rhs.crew).isEquals();
    }

}
