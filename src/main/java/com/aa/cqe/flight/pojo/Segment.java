
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
    "order",
    "endPoint",
    "endPointICAO",
    "coordinates",
    "endPointOrdinal",
    "rptdAlt",
    "rptdTime",
    "rptdFuel",
    "distance",
    "useInds",
    "segmentIndicators",
    "altitude",
    "time",
    "fuel"
})
public class Segment {

    @JsonProperty("order")
    private Integer order;
    @JsonProperty("endPoint")
    private String endPoint;
    @JsonProperty("endPointICAO")
    private String endPointICAO;
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonProperty("endPointOrdinal")
    private Integer endPointOrdinal;
    @JsonProperty("rptdAlt")
    private Integer rptdAlt;
    @JsonProperty("rptdTime")
    private String rptdTime;
    @JsonProperty("rptdFuel")
    private Integer rptdFuel;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("useInds")
    private String useInds;
    @JsonProperty("segmentIndicators")
    private SegmentIndicators segmentIndicators;
    @JsonProperty("altitude")
    private Integer altitude;
    @JsonProperty("time")
    private String time;
    @JsonProperty("fuel")
    private Integer fuel;

    /**
     * 
     * @return
     *     The order
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The endPoint
     */
    @JsonProperty("endPoint")
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * 
     * @param endPoint
     *     The endPoint
     */
    @JsonProperty("endPoint")
    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * 
     * @return
     *     The endPointICAO
     */
    @JsonProperty("endPointICAO")
    public String getEndPointICAO() {
        return endPointICAO;
    }

    /**
     * 
     * @param endPointICAO
     *     The endPointICAO
     */
    @JsonProperty("endPointICAO")
    public void setEndPointICAO(String endPointICAO) {
        this.endPointICAO = endPointICAO;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The endPointOrdinal
     */
    @JsonProperty("endPointOrdinal")
    public Integer getEndPointOrdinal() {
        return endPointOrdinal;
    }

    /**
     * 
     * @param endPointOrdinal
     *     The endPointOrdinal
     */
    @JsonProperty("endPointOrdinal")
    public void setEndPointOrdinal(Integer endPointOrdinal) {
        this.endPointOrdinal = endPointOrdinal;
    }

    /**
     * 
     * @return
     *     The rptdAlt
     */
    @JsonProperty("rptdAlt")
    public Integer getRptdAlt() {
        return rptdAlt;
    }

    /**
     * 
     * @param rptdAlt
     *     The rptdAlt
     */
    @JsonProperty("rptdAlt")
    public void setRptdAlt(Integer rptdAlt) {
        this.rptdAlt = rptdAlt;
    }

    /**
     * 
     * @return
     *     The rptdTime
     */
    @JsonProperty("rptdTime")
    public String getRptdTime() {
        return rptdTime;
    }

    /**
     * 
     * @param rptdTime
     *     The rptdTime
     */
    @JsonProperty("rptdTime")
    public void setRptdTime(String rptdTime) {
        this.rptdTime = rptdTime;
    }

    /**
     * 
     * @return
     *     The rptdFuel
     */
    @JsonProperty("rptdFuel")
    public Integer getRptdFuel() {
        return rptdFuel;
    }

    /**
     * 
     * @param rptdFuel
     *     The rptdFuel
     */
    @JsonProperty("rptdFuel")
    public void setRptdFuel(Integer rptdFuel) {
        this.rptdFuel = rptdFuel;
    }

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The useInds
     */
    @JsonProperty("useInds")
    public String getUseInds() {
        return useInds;
    }

    /**
     * 
     * @param useInds
     *     The useInds
     */
    @JsonProperty("useInds")
    public void setUseInds(String useInds) {
        this.useInds = useInds;
    }

    /**
     * 
     * @return
     *     The segmentIndicators
     */
    @JsonProperty("segmentIndicators")
    public SegmentIndicators getSegmentIndicators() {
        return segmentIndicators;
    }

    /**
     * 
     * @param segmentIndicators
     *     The segmentIndicators
     */
    @JsonProperty("segmentIndicators")
    public void setSegmentIndicators(SegmentIndicators segmentIndicators) {
        this.segmentIndicators = segmentIndicators;
    }

    /**
     * 
     * @return
     *     The altitude
     */
    @JsonProperty("altitude")
    public Integer getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    @JsonProperty("altitude")
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The fuel
     */
    @JsonProperty("fuel")
    public Integer getFuel() {
        return fuel;
    }

    /**
     * 
     * @param fuel
     *     The fuel
     */
    @JsonProperty("fuel")
    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(order).append(endPoint).append(endPointICAO).append(coordinates).append(endPointOrdinal).append(rptdAlt).append(rptdTime).append(rptdFuel).append(distance).append(useInds).append(segmentIndicators).append(altitude).append(time).append(fuel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segment) == false) {
            return false;
        }
        Segment rhs = ((Segment) other);
        return new EqualsBuilder().append(order, rhs.order).append(endPoint, rhs.endPoint).append(endPointICAO, rhs.endPointICAO).append(coordinates, rhs.coordinates).append(endPointOrdinal, rhs.endPointOrdinal).append(rptdAlt, rhs.rptdAlt).append(rptdTime, rhs.rptdTime).append(rptdFuel, rhs.rptdFuel).append(distance, rhs.distance).append(useInds, rhs.useInds).append(segmentIndicators, rhs.segmentIndicators).append(altitude, rhs.altitude).append(time, rhs.time).append(fuel, rhs.fuel).isEquals();
    }

}
