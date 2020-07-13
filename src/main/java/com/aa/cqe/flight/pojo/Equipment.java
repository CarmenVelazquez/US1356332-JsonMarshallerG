
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
    "assignedTail",
    "skdEquipType",
    "assignedEquipType",
    "skdNumericEquipType",
    "assignedNumericEquipType",
    "specialEquipInds",
    "aircraftRegistrationNbr",
    "maintTurnCode",
    "equipReq",
    "skdSASEquip",
    "adjustedLandingCycles",
    "aircraftSELCALCode",
    "totalShipTime",
    "totalShipCycles",
    "wifiCapability",
    "fastWifi",
    "powerPorts",
    "sasEquipCode"
})
public class Equipment {

    @JsonProperty("assignedTail")
    private String assignedTail;
    @JsonProperty("skdEquipType")
    private String skdEquipType;
    @JsonProperty("assignedEquipType")
    private String assignedEquipType;
    @JsonProperty("skdNumericEquipType")
    private String skdNumericEquipType;
    @JsonProperty("assignedNumericEquipType")
    private String assignedNumericEquipType;
    @JsonProperty("specialEquipInds")
    private String specialEquipInds;
    @JsonProperty("aircraftRegistrationNbr")
    private String aircraftRegistrationNbr;
    @JsonProperty("maintTurnCode")
    private String maintTurnCode;
    @JsonProperty("equipReq")
    private String equipReq;
    @JsonProperty("skdSASEquip")
    private String skdSASEquip;
    @JsonProperty("adjustedLandingCycles")
    private Integer adjustedLandingCycles;
    @JsonProperty("aircraftSELCALCode")
    private String aircraftSELCALCode;
    @JsonProperty("totalShipTime")
    private String totalShipTime;
    @JsonProperty("totalShipCycles")
    private Integer totalShipCycles;
    @JsonProperty("wifiCapability")
    private String wifiCapability;
    @JsonProperty("fastWifi")
    private String fastWifi;
    @JsonProperty("powerPorts")
    private String powerPorts;
    @JsonProperty("sasEquipCode")
    private String sasEquipCode;

    /**
     * 
     * @return
     *     The assignedTail
     */
    @JsonProperty("assignedTail")
    public String getAssignedTail() {
        return assignedTail;
    }

    /**
     * 
     * @param assignedTail
     *     The assignedTail
     */
    @JsonProperty("assignedTail")
    public void setAssignedTail(String assignedTail) {
        this.assignedTail = assignedTail;
    }

    /**
     * 
     * @return
     *     The skdEquipType
     */
    @JsonProperty("skdEquipType")
    public String getSkdEquipType() {
        return skdEquipType;
    }

    /**
     * 
     * @param skdEquipType
     *     The skdEquipType
     */
    @JsonProperty("skdEquipType")
    public void setSkdEquipType(String skdEquipType) {
        this.skdEquipType = skdEquipType;
    }

    /**
     * 
     * @return
     *     The assignedEquipType
     */
    @JsonProperty("assignedEquipType")
    public String getAssignedEquipType() {
        return assignedEquipType;
    }

    /**
     * 
     * @param assignedEquipType
     *     The assignedEquipType
     */
    @JsonProperty("assignedEquipType")
    public void setAssignedEquipType(String assignedEquipType) {
        this.assignedEquipType = assignedEquipType;
    }

    /**
     * 
     * @return
     *     The skdNumericEquipType
     */
    @JsonProperty("skdNumericEquipType")
    public String getSkdNumericEquipType() {
        return skdNumericEquipType;
    }

    /**
     * 
     * @param skdNumericEquipType
     *     The skdNumericEquipType
     */
    @JsonProperty("skdNumericEquipType")
    public void setSkdNumericEquipType(String skdNumericEquipType) {
        this.skdNumericEquipType = skdNumericEquipType;
    }

    /**
     * 
     * @return
     *     The assignedNumericEquipType
     */
    @JsonProperty("assignedNumericEquipType")
    public String getAssignedNumericEquipType() {
        return assignedNumericEquipType;
    }

    /**
     * 
     * @param assignedNumericEquipType
     *     The assignedNumericEquipType
     */
    @JsonProperty("assignedNumericEquipType")
    public void setAssignedNumericEquipType(String assignedNumericEquipType) {
        this.assignedNumericEquipType = assignedNumericEquipType;
    }

    /**
     * 
     * @return
     *     The specialEquipInds
     */
    @JsonProperty("specialEquipInds")
    public String getSpecialEquipInds() {
        return specialEquipInds;
    }

    /**
     * 
     * @param specialEquipInds
     *     The specialEquipInds
     */
    @JsonProperty("specialEquipInds")
    public void setSpecialEquipInds(String specialEquipInds) {
        this.specialEquipInds = specialEquipInds;
    }

    /**
     * 
     * @return
     *     The aircraftRegistrationNbr
     */
    @JsonProperty("aircraftRegistrationNbr")
    public String getAircraftRegistrationNbr() {
        return aircraftRegistrationNbr;
    }

    /**
     * 
     * @param aircraftRegistrationNbr
     *     The aircraftRegistrationNbr
     */
    @JsonProperty("aircraftRegistrationNbr")
    public void setAircraftRegistrationNbr(String aircraftRegistrationNbr) {
        this.aircraftRegistrationNbr = aircraftRegistrationNbr;
    }

    /**
     * 
     * @return
     *     The maintTurnCode
     */
    @JsonProperty("maintTurnCode")
    public String getMaintTurnCode() {
        return maintTurnCode;
    }

    /**
     * 
     * @param maintTurnCode
     *     The maintTurnCode
     */
    @JsonProperty("maintTurnCode")
    public void setMaintTurnCode(String maintTurnCode) {
        this.maintTurnCode = maintTurnCode;
    }

    /**
     * 
     * @return
     *     The equipReq
     */
    @JsonProperty("equipReq")
    public String getEquipReq() {
        return equipReq;
    }

    /**
     * 
     * @param equipReq
     *     The equipReq
     */
    @JsonProperty("equipReq")
    public void setEquipReq(String equipReq) {
        this.equipReq = equipReq;
    }

    /**
     * 
     * @return
     *     The skdSASEquip
     */
    @JsonProperty("skdSASEquip")
    public String getSkdSASEquip() {
        return skdSASEquip;
    }

    /**
     * 
     * @param skdSASEquip
     *     The skdSASEquip
     */
    @JsonProperty("skdSASEquip")
    public void setSkdSASEquip(String skdSASEquip) {
        this.skdSASEquip = skdSASEquip;
    }

    /**
     * 
     * @return
     *     The adjustedLandingCycles
     */
    @JsonProperty("adjustedLandingCycles")
    public Integer getAdjustedLandingCycles() {
        return adjustedLandingCycles;
    }

    /**
     * 
     * @param adjustedLandingCycles
     *     The adjustedLandingCycles
     */
    @JsonProperty("adjustedLandingCycles")
    public void setAdjustedLandingCycles(Integer adjustedLandingCycles) {
        this.adjustedLandingCycles = adjustedLandingCycles;
    }

    /**
     * 
     * @return
     *     The aircraftSELCALCode
     */
    @JsonProperty("aircraftSELCALCode")
    public String getAircraftSELCALCode() {
        return aircraftSELCALCode;
    }

    /**
     * 
     * @param aircraftSELCALCode
     *     The aircraftSELCALCode
     */
    @JsonProperty("aircraftSELCALCode")
    public void setAircraftSELCALCode(String aircraftSELCALCode) {
        this.aircraftSELCALCode = aircraftSELCALCode;
    }

    /**
     * 
     * @return
     *     The totalShipTime
     */
    @JsonProperty("totalShipTime")
    public String getTotalShipTime() {
        return totalShipTime;
    }

    /**
     * 
     * @param totalShipTime
     *     The totalShipTime
     */
    @JsonProperty("totalShipTime")
    public void setTotalShipTime(String totalShipTime) {
        this.totalShipTime = totalShipTime;
    }

    /**
     * 
     * @return
     *     The totalShipCycles
     */
    @JsonProperty("totalShipCycles")
    public Integer getTotalShipCycles() {
        return totalShipCycles;
    }

    /**
     * 
     * @param totalShipCycles
     *     The totalShipCycles
     */
    @JsonProperty("totalShipCycles")
    public void setTotalShipCycles(Integer totalShipCycles) {
        this.totalShipCycles = totalShipCycles;
    }

    /**
     * 
     * @return
     *     The wifiCapability
     */
    @JsonProperty("wifiCapability")
    public String getWifiCapability() {
        return wifiCapability;
    }

    /**
     * 
     * @param wifiCapability
     *     The wifiCapability
     */
    @JsonProperty("wifiCapability")
    public void setWifiCapability(String wifiCapability) {
        this.wifiCapability = wifiCapability;
    }

    /**
     * 
     * @return
     *     The fastWifi
     */
    @JsonProperty("fastWifi")
    public String getFastWifi() {
        return fastWifi;
    }

    /**
     * 
     * @param fastWifi
     *     The fastWifi
     */
    @JsonProperty("fastWifi")
    public void setFastWifi(String fastWifi) {
        this.fastWifi = fastWifi;
    }

    /**
     * 
     * @return
     *     The powerPorts
     */
    @JsonProperty("powerPorts")
    public String getPowerPorts() {
        return powerPorts;
    }

    /**
     * 
     * @param powerPorts
     *     The powerPorts
     */
    @JsonProperty("powerPorts")
    public void setPowerPorts(String powerPorts) {
        this.powerPorts = powerPorts;
    }

    /**
     * 
     * @return
     *     The sasEquipCode
     */
    @JsonProperty("sasEquipCode")
    public String getSasEquipCode() {
        return sasEquipCode;
    }

    /**
     * 
     * @param sasEquipCode
     *     The sasEquipCode
     */
    @JsonProperty("sasEquipCode")
    public void setSasEquipCode(String sasEquipCode) {
        this.sasEquipCode = sasEquipCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(assignedTail).append(skdEquipType).append(assignedEquipType).append(skdNumericEquipType).append(assignedNumericEquipType).append(specialEquipInds).append(aircraftRegistrationNbr).append(maintTurnCode).append(equipReq).append(skdSASEquip).append(adjustedLandingCycles).append(aircraftSELCALCode).append(totalShipTime).append(totalShipCycles).append(wifiCapability).append(fastWifi).append(powerPorts).append(sasEquipCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Equipment) == false) {
            return false;
        }
        Equipment rhs = ((Equipment) other);
        return new EqualsBuilder().append(assignedTail, rhs.assignedTail).append(skdEquipType, rhs.skdEquipType).append(assignedEquipType, rhs.assignedEquipType).append(skdNumericEquipType, rhs.skdNumericEquipType).append(assignedNumericEquipType, rhs.assignedNumericEquipType).append(specialEquipInds, rhs.specialEquipInds).append(aircraftRegistrationNbr, rhs.aircraftRegistrationNbr).append(maintTurnCode, rhs.maintTurnCode).append(equipReq, rhs.equipReq).append(skdSASEquip, rhs.skdSASEquip).append(adjustedLandingCycles, rhs.adjustedLandingCycles).append(aircraftSELCALCode, rhs.aircraftSELCALCode).append(totalShipTime, rhs.totalShipTime).append(totalShipCycles, rhs.totalShipCycles).append(wifiCapability, rhs.wifiCapability).append(fastWifi, rhs.fastWifi).append(powerPorts, rhs.powerPorts).append(sasEquipCode, rhs.sasEquipCode).isEquals();
    }

}
