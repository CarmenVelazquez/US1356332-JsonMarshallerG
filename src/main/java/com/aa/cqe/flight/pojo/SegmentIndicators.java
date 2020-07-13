
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
    "VOR",
    "altChangePermitted",
    "firBoundary",
    "speedAltitudeChange",
    "gateway",
    "fltPlanOutputPoint",
    "decSoutputPoint",
    "reclearPoint",
    "overwaterGateway",
    "etPoverwaterPoint",
    "endpointRestrictedAirway",
    "blockedPoint",
    "endpointWithAltRestriction"
})
public class SegmentIndicators {

    @JsonProperty("VOR")
    private Boolean vOR;
    @JsonProperty("altChangePermitted")
    private Boolean altChangePermitted;
    @JsonProperty("firBoundary")
    private Boolean firBoundary;
    @JsonProperty("speedAltitudeChange")
    private Boolean speedAltitudeChange;
    @JsonProperty("gateway")
    private Boolean gateway;
    @JsonProperty("fltPlanOutputPoint")
    private Boolean fltPlanOutputPoint;
    @JsonProperty("decSoutputPoint")
    private Boolean decSoutputPoint;
    @JsonProperty("reclearPoint")
    private Boolean reclearPoint;
    @JsonProperty("overwaterGateway")
    private Boolean overwaterGateway;
    @JsonProperty("etPoverwaterPoint")
    private Boolean etPoverwaterPoint;
    @JsonProperty("endpointRestrictedAirway")
    private Boolean endpointRestrictedAirway;
    @JsonProperty("blockedPoint")
    private Boolean blockedPoint;
    @JsonProperty("endpointWithAltRestriction")
    private Boolean endpointWithAltRestriction;

    /**
     * 
     * @return
     *     The vOR
     */
    @JsonProperty("VOR")
    public Boolean getVOR() {
        return vOR;
    }

    /**
     * 
     * @param vOR
     *     The VOR
     */
    @JsonProperty("VOR")
    public void setVOR(Boolean vOR) {
        this.vOR = vOR;
    }

    /**
     * 
     * @return
     *     The altChangePermitted
     */
    @JsonProperty("altChangePermitted")
    public Boolean getAltChangePermitted() {
        return altChangePermitted;
    }

    /**
     * 
     * @param altChangePermitted
     *     The altChangePermitted
     */
    @JsonProperty("altChangePermitted")
    public void setAltChangePermitted(Boolean altChangePermitted) {
        this.altChangePermitted = altChangePermitted;
    }

    /**
     * 
     * @return
     *     The firBoundary
     */
    @JsonProperty("firBoundary")
    public Boolean getFirBoundary() {
        return firBoundary;
    }

    /**
     * 
     * @param firBoundary
     *     The firBoundary
     */
    @JsonProperty("firBoundary")
    public void setFirBoundary(Boolean firBoundary) {
        this.firBoundary = firBoundary;
    }

    /**
     * 
     * @return
     *     The speedAltitudeChange
     */
    @JsonProperty("speedAltitudeChange")
    public Boolean getSpeedAltitudeChange() {
        return speedAltitudeChange;
    }

    /**
     * 
     * @param speedAltitudeChange
     *     The speedAltitudeChange
     */
    @JsonProperty("speedAltitudeChange")
    public void setSpeedAltitudeChange(Boolean speedAltitudeChange) {
        this.speedAltitudeChange = speedAltitudeChange;
    }

    /**
     * 
     * @return
     *     The gateway
     */
    @JsonProperty("gateway")
    public Boolean getGateway() {
        return gateway;
    }

    /**
     * 
     * @param gateway
     *     The gateway
     */
    @JsonProperty("gateway")
    public void setGateway(Boolean gateway) {
        this.gateway = gateway;
    }

    /**
     * 
     * @return
     *     The fltPlanOutputPoint
     */
    @JsonProperty("fltPlanOutputPoint")
    public Boolean getFltPlanOutputPoint() {
        return fltPlanOutputPoint;
    }

    /**
     * 
     * @param fltPlanOutputPoint
     *     The fltPlanOutputPoint
     */
    @JsonProperty("fltPlanOutputPoint")
    public void setFltPlanOutputPoint(Boolean fltPlanOutputPoint) {
        this.fltPlanOutputPoint = fltPlanOutputPoint;
    }

    /**
     * 
     * @return
     *     The decSoutputPoint
     */
    @JsonProperty("decSoutputPoint")
    public Boolean getDecSoutputPoint() {
        return decSoutputPoint;
    }

    /**
     * 
     * @param decSoutputPoint
     *     The decSoutputPoint
     */
    @JsonProperty("decSoutputPoint")
    public void setDecSoutputPoint(Boolean decSoutputPoint) {
        this.decSoutputPoint = decSoutputPoint;
    }

    /**
     * 
     * @return
     *     The reclearPoint
     */
    @JsonProperty("reclearPoint")
    public Boolean getReclearPoint() {
        return reclearPoint;
    }

    /**
     * 
     * @param reclearPoint
     *     The reclearPoint
     */
    @JsonProperty("reclearPoint")
    public void setReclearPoint(Boolean reclearPoint) {
        this.reclearPoint = reclearPoint;
    }

    /**
     * 
     * @return
     *     The overwaterGateway
     */
    @JsonProperty("overwaterGateway")
    public Boolean getOverwaterGateway() {
        return overwaterGateway;
    }

    /**
     * 
     * @param overwaterGateway
     *     The overwaterGateway
     */
    @JsonProperty("overwaterGateway")
    public void setOverwaterGateway(Boolean overwaterGateway) {
        this.overwaterGateway = overwaterGateway;
    }

    /**
     * 
     * @return
     *     The etPoverwaterPoint
     */
    @JsonProperty("etPoverwaterPoint")
    public Boolean getEtPoverwaterPoint() {
        return etPoverwaterPoint;
    }

    /**
     * 
     * @param etPoverwaterPoint
     *     The etPoverwaterPoint
     */
    @JsonProperty("etPoverwaterPoint")
    public void setEtPoverwaterPoint(Boolean etPoverwaterPoint) {
        this.etPoverwaterPoint = etPoverwaterPoint;
    }

    /**
     * 
     * @return
     *     The endpointRestrictedAirway
     */
    @JsonProperty("endpointRestrictedAirway")
    public Boolean getEndpointRestrictedAirway() {
        return endpointRestrictedAirway;
    }

    /**
     * 
     * @param endpointRestrictedAirway
     *     The endpointRestrictedAirway
     */
    @JsonProperty("endpointRestrictedAirway")
    public void setEndpointRestrictedAirway(Boolean endpointRestrictedAirway) {
        this.endpointRestrictedAirway = endpointRestrictedAirway;
    }

    /**
     * 
     * @return
     *     The blockedPoint
     */
    @JsonProperty("blockedPoint")
    public Boolean getBlockedPoint() {
        return blockedPoint;
    }

    /**
     * 
     * @param blockedPoint
     *     The blockedPoint
     */
    @JsonProperty("blockedPoint")
    public void setBlockedPoint(Boolean blockedPoint) {
        this.blockedPoint = blockedPoint;
    }

    /**
     * 
     * @return
     *     The endpointWithAltRestriction
     */
    @JsonProperty("endpointWithAltRestriction")
    public Boolean getEndpointWithAltRestriction() {
        return endpointWithAltRestriction;
    }

    /**
     * 
     * @param endpointWithAltRestriction
     *     The endpointWithAltRestriction
     */
    @JsonProperty("endpointWithAltRestriction")
    public void setEndpointWithAltRestriction(Boolean endpointWithAltRestriction) {
        this.endpointWithAltRestriction = endpointWithAltRestriction;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vOR).append(altChangePermitted).append(firBoundary).append(speedAltitudeChange).append(gateway).append(fltPlanOutputPoint).append(decSoutputPoint).append(reclearPoint).append(overwaterGateway).append(etPoverwaterPoint).append(endpointRestrictedAirway).append(blockedPoint).append(endpointWithAltRestriction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentIndicators) == false) {
            return false;
        }
        SegmentIndicators rhs = ((SegmentIndicators) other);
        return new EqualsBuilder().append(vOR, rhs.vOR).append(altChangePermitted, rhs.altChangePermitted).append(firBoundary, rhs.firBoundary).append(speedAltitudeChange, rhs.speedAltitudeChange).append(gateway, rhs.gateway).append(fltPlanOutputPoint, rhs.fltPlanOutputPoint).append(decSoutputPoint, rhs.decSoutputPoint).append(reclearPoint, rhs.reclearPoint).append(overwaterGateway, rhs.overwaterGateway).append(etPoverwaterPoint, rhs.etPoverwaterPoint).append(endpointRestrictedAirway, rhs.endpointRestrictedAirway).append(blockedPoint, rhs.blockedPoint).append(endpointWithAltRestriction, rhs.endpointWithAltRestriction).isEquals();
    }

}
