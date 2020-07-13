
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
    "point",
    "ptICAO",
    "coord",
    "ptOrdnl",
    "rptdAlt",
    "rptdTime",
    "rptdFuel",
    "dist",
    "useInds",
    "segInd",
    "alt",
    "time",
    "fuel"
})
public class Seg {

    @JsonProperty("order")
    private Integer order;
    @JsonProperty("point")
    private String point;
    @JsonProperty("ptICAO")
    private String ptICAO;
    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("ptOrdnl")
    private Integer ptOrdnl;
    @JsonProperty("rptdAlt")
    private Integer rptdAlt;
    @JsonProperty("rptdTime")
    private String rptdTime;
    @JsonProperty("rptdFuel")
    private Integer rptdFuel;
    @JsonProperty("dist")
    private Integer dist;
    @JsonProperty("useInds")
    private String useInds;
    @JsonProperty("segInd")
    private SegInd segInd;
    @JsonProperty("alt")
    private Integer alt;
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
     *     The point
     */
    @JsonProperty("point")
    public String getPoint() {
        return point;
    }

    /**
     * 
     * @param point
     *     The point
     */
    @JsonProperty("point")
    public void setPoint(String point) {
        this.point = point;
    }

    /**
     * 
     * @return
     *     The ptICAO
     */
    @JsonProperty("ptICAO")
    public String getPtICAO() {
        return ptICAO;
    }

    /**
     * 
     * @param ptICAO
     *     The ptICAO
     */
    @JsonProperty("ptICAO")
    public void setPtICAO(String ptICAO) {
        this.ptICAO = ptICAO;
    }

    /**
     * 
     * @return
     *     The coord
     */
    @JsonProperty("coord")
    public Coord getCoord() {
        return coord;
    }

    /**
     * 
     * @param coord
     *     The coord
     */
    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     * 
     * @return
     *     The ptOrdnl
     */
    @JsonProperty("ptOrdnl")
    public Integer getPtOrdnl() {
        return ptOrdnl;
    }

    /**
     * 
     * @param ptOrdnl
     *     The ptOrdnl
     */
    @JsonProperty("ptOrdnl")
    public void setPtOrdnl(Integer ptOrdnl) {
        this.ptOrdnl = ptOrdnl;
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
     *     The dist
     */
    @JsonProperty("dist")
    public Integer getDist() {
        return dist;
    }

    /**
     * 
     * @param dist
     *     The dist
     */
    @JsonProperty("dist")
    public void setDist(Integer dist) {
        this.dist = dist;
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
     *     The segInd
     */
    @JsonProperty("segInd")
    public SegInd getSegInd() {
        return segInd;
    }

    /**
     * 
     * @param segInd
     *     The segInd
     */
    @JsonProperty("segInd")
    public void setSegInd(SegInd segInd) {
        this.segInd = segInd;
    }

    /**
     * 
     * @return
     *     The alt
     */
    @JsonProperty("alt")
    public Integer getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt
     *     The alt
     */
    @JsonProperty("alt")
    public void setAlt(Integer alt) {
        this.alt = alt;
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
        return new HashCodeBuilder().append(order).append(point).append(ptICAO).append(coord).append(ptOrdnl).append(rptdAlt).append(rptdTime).append(rptdFuel).append(dist).append(useInds).append(segInd).append(alt).append(time).append(fuel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Seg) == false) {
            return false;
        }
        Seg rhs = ((Seg) other);
        return new EqualsBuilder().append(order, rhs.order).append(point, rhs.point).append(ptICAO, rhs.ptICAO).append(coord, rhs.coord).append(ptOrdnl, rhs.ptOrdnl).append(rptdAlt, rhs.rptdAlt).append(rptdTime, rhs.rptdTime).append(rptdFuel, rhs.rptdFuel).append(dist, rhs.dist).append(useInds, rhs.useInds).append(segInd, rhs.segInd).append(alt, rhs.alt).append(time, rhs.time).append(fuel, rhs.fuel).isEquals();
    }

}
