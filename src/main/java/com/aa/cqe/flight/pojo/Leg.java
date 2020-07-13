
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
    "stations",
    "costs",
    "departureArrival",
    "equipment",
    "times",
    "linkage",
    "paxCounts",
    "planners",
    "enroute",
    "fuel",
    "status",
    "performance",
    "payloadAndWeights",
    "type",
    "flightPlanStatus",
    "reason",
    "codeShareInfo",
    "flifo"
})
public class Leg {

    @JsonProperty("stations")
    private Stations stations;
    @JsonProperty("costs")
    private Costs costs;
    @JsonProperty("departureArrival")
    private DepartureArrival departureArrival;
    @JsonProperty("equipment")
    private Equipment equipment;
    @JsonProperty("times")
    private Times times;
    @JsonProperty("linkage")
    private Linkage linkage;
    @JsonProperty("paxCounts")
    private PaxCounts paxCounts;
    @JsonProperty("planners")
    private Planners planners;
    @JsonProperty("enroute")
    private Enroute enroute;
    @JsonProperty("fuel")
    private Fuel fuel;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("performance")
    private Performance performance;
    @JsonProperty("payloadAndWeights")
    private PayloadAndWeights payloadAndWeights;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("flightPlanStatus")
    private FlightPlanStatus flightPlanStatus;
    @JsonProperty("reason")
    private Reason reason;
    @JsonProperty("codeShareInfo")
    private CodeShareInfo codeShareInfo;
    @JsonProperty("flifo")
    private Flifo flifo;

    /**
     * 
     * @return
     *     The stations
     */
    @JsonProperty("stations")
    public Stations getStations() {
        return stations;
    }

    /**
     * 
     * @param stations
     *     The stations
     */
    @JsonProperty("stations")
    public void setStations(Stations stations) {
        this.stations = stations;
    }

    /**
     * 
     * @return
     *     The costs
     */
    @JsonProperty("costs")
    public Costs getCosts() {
        return costs;
    }

    /**
     * 
     * @param costs
     *     The costs
     */
    @JsonProperty("costs")
    public void setCosts(Costs costs) {
        this.costs = costs;
    }

    /**
     * 
     * @return
     *     The departureArrival
     */
    @JsonProperty("departureArrival")
    public DepartureArrival getDepartureArrival() {
        return departureArrival;
    }

    /**
     * 
     * @param departureArrival
     *     The departureArrival
     */
    @JsonProperty("departureArrival")
    public void setDepartureArrival(DepartureArrival departureArrival) {
        this.departureArrival = departureArrival;
    }

    /**
     * 
     * @return
     *     The equipment
     */
    @JsonProperty("equipment")
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * 
     * @param equipment
     *     The equipment
     */
    @JsonProperty("equipment")
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * 
     * @return
     *     The times
     */
    @JsonProperty("times")
    public Times getTimes() {
        return times;
    }

    /**
     * 
     * @param times
     *     The times
     */
    @JsonProperty("times")
    public void setTimes(Times times) {
        this.times = times;
    }

    /**
     * 
     * @return
     *     The linkage
     */
    @JsonProperty("linkage")
    public Linkage getLinkage() {
        return linkage;
    }

    /**
     * 
     * @param linkage
     *     The linkage
     */
    @JsonProperty("linkage")
    public void setLinkage(Linkage linkage) {
        this.linkage = linkage;
    }

    /**
     * 
     * @return
     *     The paxCounts
     */
    @JsonProperty("paxCounts")
    public PaxCounts getPaxCounts() {
        return paxCounts;
    }

    /**
     * 
     * @param paxCounts
     *     The paxCounts
     */
    @JsonProperty("paxCounts")
    public void setPaxCounts(PaxCounts paxCounts) {
        this.paxCounts = paxCounts;
    }

    /**
     * 
     * @return
     *     The planners
     */
    @JsonProperty("planners")
    public Planners getPlanners() {
        return planners;
    }

    /**
     * 
     * @param planners
     *     The planners
     */
    @JsonProperty("planners")
    public void setPlanners(Planners planners) {
        this.planners = planners;
    }

    /**
     * 
     * @return
     *     The enroute
     */
    @JsonProperty("enroute")
    public Enroute getEnroute() {
        return enroute;
    }

    /**
     * 
     * @param enroute
     *     The enroute
     */
    @JsonProperty("enroute")
    public void setEnroute(Enroute enroute) {
        this.enroute = enroute;
    }

    /**
     * 
     * @return
     *     The fuel
     */
    @JsonProperty("fuel")
    public Fuel getFuel() {
        return fuel;
    }

    /**
     * 
     * @param fuel
     *     The fuel
     */
    @JsonProperty("fuel")
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The performance
     */
    @JsonProperty("performance")
    public Performance getPerformance() {
        return performance;
    }

    /**
     * 
     * @param performance
     *     The performance
     */
    @JsonProperty("performance")
    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    /**
     * 
     * @return
     *     The payloadAndWeights
     */
    @JsonProperty("payloadAndWeights")
    public PayloadAndWeights getPayloadAndWeights() {
        return payloadAndWeights;
    }

    /**
     * 
     * @param payloadAndWeights
     *     The payloadAndWeights
     */
    @JsonProperty("payloadAndWeights")
    public void setPayloadAndWeights(PayloadAndWeights payloadAndWeights) {
        this.payloadAndWeights = payloadAndWeights;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The flightPlanStatus
     */
    @JsonProperty("flightPlanStatus")
    public FlightPlanStatus getFlightPlanStatus() {
        return flightPlanStatus;
    }

    /**
     * 
     * @param flightPlanStatus
     *     The flightPlanStatus
     */
    @JsonProperty("flightPlanStatus")
    public void setFlightPlanStatus(FlightPlanStatus flightPlanStatus) {
        this.flightPlanStatus = flightPlanStatus;
    }

    /**
     * 
     * @return
     *     The reason
     */
    @JsonProperty("reason")
    public Reason getReason() {
        return reason;
    }

    /**
     * 
     * @param reason
     *     The reason
     */
    @JsonProperty("reason")
    public void setReason(Reason reason) {
        this.reason = reason;
    }

    /**
     * 
     * @return
     *     The codeShareInfo
     */
    @JsonProperty("codeShareInfo")
    public CodeShareInfo getCodeShareInfo() {
        return codeShareInfo;
    }

    /**
     * 
     * @param codeShareInfo
     *     The codeShareInfo
     */
    @JsonProperty("codeShareInfo")
    public void setCodeShareInfo(CodeShareInfo codeShareInfo) {
        this.codeShareInfo = codeShareInfo;
    }

    /**
     * 
     * @return
     *     The flifo
     */
    @JsonProperty("flifo")
    public Flifo getFlifo() {
        return flifo;
    }

    /**
     * 
     * @param flifo
     *     The flifo
     */
    @JsonProperty("flifo")
    public void setFlifo(Flifo flifo) {
        this.flifo = flifo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stations).append(costs).append(departureArrival).append(equipment).append(times).append(linkage).append(paxCounts).append(planners).append(enroute).append(fuel).append(status).append(performance).append(payloadAndWeights).append(type).append(flightPlanStatus).append(reason).append(codeShareInfo).append(flifo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leg) == false) {
            return false;
        }
        Leg rhs = ((Leg) other);
        return new EqualsBuilder().append(stations, rhs.stations).append(costs, rhs.costs).append(departureArrival, rhs.departureArrival).append(equipment, rhs.equipment).append(times, rhs.times).append(linkage, rhs.linkage).append(paxCounts, rhs.paxCounts).append(planners, rhs.planners).append(enroute, rhs.enroute).append(fuel, rhs.fuel).append(status, rhs.status).append(performance, rhs.performance).append(payloadAndWeights, rhs.payloadAndWeights).append(type, rhs.type).append(flightPlanStatus, rhs.flightPlanStatus).append(reason, rhs.reason).append(codeShareInfo, rhs.codeShareInfo).append(flifo, rhs.flifo).isEquals();
    }

}
