
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
    "STD",
    "STA",
    "LTD",
    "LTA",
    "PTD",
    "PTA",
    "ETO",
    "EON",
    "skdTaxiOut",
    "skdTaxiIn",
    "latestTaxiOut",
    "latestTaxiIn",
    "actualOut",
    "actualOff",
    "actualOn",
    "actualIn",
    "depGMTAdjustment",
    "arrGMTAdjustment",
    "OGT",
    "legDepDOM",
    "legArrDOM",
    "autoETDAccumMins",
    "flightPlanCalcTm",
    "flightPlanOut",
    "flightPlanOff",
    "flightPlanOn",
    "flightPlanIn",
    "doorOpen",
    "acarsin",
    "paxDepOffSet",
    "paxArrOffSet",
    "skdBoardingStart",
    "latestBoardStart",
    "doorCloseTm"
})
public class Times {

    @JsonProperty("STD")
    private String sTD;
    @JsonProperty("STA")
    private String sTA;
    @JsonProperty("LTD")
    private String lTD;
    @JsonProperty("LTA")
    private String lTA;
    @JsonProperty("PTD")
    private String pTD;
    @JsonProperty("PTA")
    private String pTA;
    @JsonProperty("ETO")
    private String eTO;
    @JsonProperty("EON")
    private String eON;
    @JsonProperty("skdTaxiOut")
    private String skdTaxiOut;
    @JsonProperty("skdTaxiIn")
    private String skdTaxiIn;
    @JsonProperty("latestTaxiOut")
    private String latestTaxiOut;
    @JsonProperty("latestTaxiIn")
    private String latestTaxiIn;
    @JsonProperty("actualOut")
    private String actualOut;
    @JsonProperty("actualOff")
    private String actualOff;
    @JsonProperty("actualOn")
    private String actualOn;
    @JsonProperty("actualIn")
    private String actualIn;
    @JsonProperty("depGMTAdjustment")
    private String depGMTAdjustment;
    @JsonProperty("arrGMTAdjustment")
    private String arrGMTAdjustment;
    @JsonProperty("OGT")
    private String oGT;
    @JsonProperty("legDepDOM")
    private String legDepDOM;
    @JsonProperty("legArrDOM")
    private String legArrDOM;
    @JsonProperty("autoETDAccumMins")
    private String autoETDAccumMins;
    @JsonProperty("flightPlanCalcTm")
    private String flightPlanCalcTm;
    @JsonProperty("flightPlanOut")
    private String flightPlanOut;
    @JsonProperty("flightPlanOff")
    private String flightPlanOff;
    @JsonProperty("flightPlanOn")
    private String flightPlanOn;
    @JsonProperty("flightPlanIn")
    private String flightPlanIn;
    @JsonProperty("doorOpen")
    private String doorOpen;
    @JsonProperty("acarsin")
    private String acarsin;
    @JsonProperty("paxDepOffSet")
    private String paxDepOffSet;
    @JsonProperty("paxArrOffSet")
    private String paxArrOffSet;
    @JsonProperty("skdBoardingStart")
    private String skdBoardingStart;
    @JsonProperty("latestBoardStart")
    private String latestBoardStart;
    @JsonProperty("doorCloseTm")
    private String doorCloseTm;

    /**
     * 
     * @return
     *     The sTD
     */
    @JsonProperty("STD")
    public String getSTD() {
        return sTD;
    }

    /**
     * 
     * @param sTD
     *     The STD
     */
    @JsonProperty("STD")
    public void setSTD(String sTD) {
        this.sTD = sTD;
    }

    /**
     * 
     * @return
     *     The sTA
     */
    @JsonProperty("STA")
    public String getSTA() {
        return sTA;
    }

    /**
     * 
     * @param sTA
     *     The STA
     */
    @JsonProperty("STA")
    public void setSTA(String sTA) {
        this.sTA = sTA;
    }

    /**
     * 
     * @return
     *     The lTD
     */
    @JsonProperty("LTD")
    public String getLTD() {
        return lTD;
    }

    /**
     * 
     * @param lTD
     *     The LTD
     */
    @JsonProperty("LTD")
    public void setLTD(String lTD) {
        this.lTD = lTD;
    }

    /**
     * 
     * @return
     *     The lTA
     */
    @JsonProperty("LTA")
    public String getLTA() {
        return lTA;
    }

    /**
     * 
     * @param lTA
     *     The LTA
     */
    @JsonProperty("LTA")
    public void setLTA(String lTA) {
        this.lTA = lTA;
    }

    /**
     * 
     * @return
     *     The pTD
     */
    @JsonProperty("PTD")
    public String getPTD() {
        return pTD;
    }

    /**
     * 
     * @param pTD
     *     The PTD
     */
    @JsonProperty("PTD")
    public void setPTD(String pTD) {
        this.pTD = pTD;
    }

    /**
     * 
     * @return
     *     The pTA
     */
    @JsonProperty("PTA")
    public String getPTA() {
        return pTA;
    }

    /**
     * 
     * @param pTA
     *     The PTA
     */
    @JsonProperty("PTA")
    public void setPTA(String pTA) {
        this.pTA = pTA;
    }

    /**
     * 
     * @return
     *     The eTO
     */
    @JsonProperty("ETO")
    public String getETO() {
        return eTO;
    }

    /**
     * 
     * @param eTO
     *     The ETO
     */
    @JsonProperty("ETO")
    public void setETO(String eTO) {
        this.eTO = eTO;
    }

    /**
     * 
     * @return
     *     The eON
     */
    @JsonProperty("EON")
    public String getEON() {
        return eON;
    }

    /**
     * 
     * @param eON
     *     The EON
     */
    @JsonProperty("EON")
    public void setEON(String eON) {
        this.eON = eON;
    }

    /**
     * 
     * @return
     *     The skdTaxiOut
     */
    @JsonProperty("skdTaxiOut")
    public String getSkdTaxiOut() {
        return skdTaxiOut;
    }

    /**
     * 
     * @param skdTaxiOut
     *     The skdTaxiOut
     */
    @JsonProperty("skdTaxiOut")
    public void setSkdTaxiOut(String skdTaxiOut) {
        this.skdTaxiOut = skdTaxiOut;
    }

    /**
     * 
     * @return
     *     The skdTaxiIn
     */
    @JsonProperty("skdTaxiIn")
    public String getSkdTaxiIn() {
        return skdTaxiIn;
    }

    /**
     * 
     * @param skdTaxiIn
     *     The skdTaxiIn
     */
    @JsonProperty("skdTaxiIn")
    public void setSkdTaxiIn(String skdTaxiIn) {
        this.skdTaxiIn = skdTaxiIn;
    }

    /**
     * 
     * @return
     *     The latestTaxiOut
     */
    @JsonProperty("latestTaxiOut")
    public String getLatestTaxiOut() {
        return latestTaxiOut;
    }

    /**
     * 
     * @param latestTaxiOut
     *     The latestTaxiOut
     */
    @JsonProperty("latestTaxiOut")
    public void setLatestTaxiOut(String latestTaxiOut) {
        this.latestTaxiOut = latestTaxiOut;
    }

    /**
     * 
     * @return
     *     The latestTaxiIn
     */
    @JsonProperty("latestTaxiIn")
    public String getLatestTaxiIn() {
        return latestTaxiIn;
    }

    /**
     * 
     * @param latestTaxiIn
     *     The latestTaxiIn
     */
    @JsonProperty("latestTaxiIn")
    public void setLatestTaxiIn(String latestTaxiIn) {
        this.latestTaxiIn = latestTaxiIn;
    }

    /**
     * 
     * @return
     *     The actualOut
     */
    @JsonProperty("actualOut")
    public String getActualOut() {
        return actualOut;
    }

    /**
     * 
     * @param actualOut
     *     The actualOut
     */
    @JsonProperty("actualOut")
    public void setActualOut(String actualOut) {
        this.actualOut = actualOut;
    }

    /**
     * 
     * @return
     *     The actualOff
     */
    @JsonProperty("actualOff")
    public String getActualOff() {
        return actualOff;
    }

    /**
     * 
     * @param actualOff
     *     The actualOff
     */
    @JsonProperty("actualOff")
    public void setActualOff(String actualOff) {
        this.actualOff = actualOff;
    }

    /**
     * 
     * @return
     *     The actualOn
     */
    @JsonProperty("actualOn")
    public String getActualOn() {
        return actualOn;
    }

    /**
     * 
     * @param actualOn
     *     The actualOn
     */
    @JsonProperty("actualOn")
    public void setActualOn(String actualOn) {
        this.actualOn = actualOn;
    }

    /**
     * 
     * @return
     *     The actualIn
     */
    @JsonProperty("actualIn")
    public String getActualIn() {
        return actualIn;
    }

    /**
     * 
     * @param actualIn
     *     The actualIn
     */
    @JsonProperty("actualIn")
    public void setActualIn(String actualIn) {
        this.actualIn = actualIn;
    }

    /**
     * 
     * @return
     *     The depGMTAdjustment
     */
    @JsonProperty("depGMTAdjustment")
    public String getDepGMTAdjustment() {
        return depGMTAdjustment;
    }

    /**
     * 
     * @param depGMTAdjustment
     *     The depGMTAdjustment
     */
    @JsonProperty("depGMTAdjustment")
    public void setDepGMTAdjustment(String depGMTAdjustment) {
        this.depGMTAdjustment = depGMTAdjustment;
    }

    /**
     * 
     * @return
     *     The arrGMTAdjustment
     */
    @JsonProperty("arrGMTAdjustment")
    public String getArrGMTAdjustment() {
        return arrGMTAdjustment;
    }

    /**
     * 
     * @param arrGMTAdjustment
     *     The arrGMTAdjustment
     */
    @JsonProperty("arrGMTAdjustment")
    public void setArrGMTAdjustment(String arrGMTAdjustment) {
        this.arrGMTAdjustment = arrGMTAdjustment;
    }

    /**
     * 
     * @return
     *     The oGT
     */
    @JsonProperty("OGT")
    public String getOGT() {
        return oGT;
    }

    /**
     * 
     * @param oGT
     *     The OGT
     */
    @JsonProperty("OGT")
    public void setOGT(String oGT) {
        this.oGT = oGT;
    }

    /**
     * 
     * @return
     *     The legDepDOM
     */
    @JsonProperty("legDepDOM")
    public String getLegDepDOM() {
        return legDepDOM;
    }

    /**
     * 
     * @param legDepDOM
     *     The legDepDOM
     */
    @JsonProperty("legDepDOM")
    public void setLegDepDOM(String legDepDOM) {
        this.legDepDOM = legDepDOM;
    }

    /**
     * 
     * @return
     *     The legArrDOM
     */
    @JsonProperty("legArrDOM")
    public String getLegArrDOM() {
        return legArrDOM;
    }

    /**
     * 
     * @param legArrDOM
     *     The legArrDOM
     */
    @JsonProperty("legArrDOM")
    public void setLegArrDOM(String legArrDOM) {
        this.legArrDOM = legArrDOM;
    }

    /**
     * 
     * @return
     *     The autoETDAccumMins
     */
    @JsonProperty("autoETDAccumMins")
    public String getAutoETDAccumMins() {
        return autoETDAccumMins;
    }

    /**
     * 
     * @param autoETDAccumMins
     *     The autoETDAccumMins
     */
    @JsonProperty("autoETDAccumMins")
    public void setAutoETDAccumMins(String autoETDAccumMins) {
        this.autoETDAccumMins = autoETDAccumMins;
    }

    /**
     * 
     * @return
     *     The flightPlanCalcTm
     */
    @JsonProperty("flightPlanCalcTm")
    public String getFlightPlanCalcTm() {
        return flightPlanCalcTm;
    }

    /**
     * 
     * @param flightPlanCalcTm
     *     The flightPlanCalcTm
     */
    @JsonProperty("flightPlanCalcTm")
    public void setFlightPlanCalcTm(String flightPlanCalcTm) {
        this.flightPlanCalcTm = flightPlanCalcTm;
    }

    /**
     * 
     * @return
     *     The flightPlanOut
     */
    @JsonProperty("flightPlanOut")
    public String getFlightPlanOut() {
        return flightPlanOut;
    }

    /**
     * 
     * @param flightPlanOut
     *     The flightPlanOut
     */
    @JsonProperty("flightPlanOut")
    public void setFlightPlanOut(String flightPlanOut) {
        this.flightPlanOut = flightPlanOut;
    }

    /**
     * 
     * @return
     *     The flightPlanOff
     */
    @JsonProperty("flightPlanOff")
    public String getFlightPlanOff() {
        return flightPlanOff;
    }

    /**
     * 
     * @param flightPlanOff
     *     The flightPlanOff
     */
    @JsonProperty("flightPlanOff")
    public void setFlightPlanOff(String flightPlanOff) {
        this.flightPlanOff = flightPlanOff;
    }

    /**
     * 
     * @return
     *     The flightPlanOn
     */
    @JsonProperty("flightPlanOn")
    public String getFlightPlanOn() {
        return flightPlanOn;
    }

    /**
     * 
     * @param flightPlanOn
     *     The flightPlanOn
     */
    @JsonProperty("flightPlanOn")
    public void setFlightPlanOn(String flightPlanOn) {
        this.flightPlanOn = flightPlanOn;
    }

    /**
     * 
     * @return
     *     The flightPlanIn
     */
    @JsonProperty("flightPlanIn")
    public String getFlightPlanIn() {
        return flightPlanIn;
    }

    /**
     * 
     * @param flightPlanIn
     *     The flightPlanIn
     */
    @JsonProperty("flightPlanIn")
    public void setFlightPlanIn(String flightPlanIn) {
        this.flightPlanIn = flightPlanIn;
    }

    /**
     * 
     * @return
     *     The doorOpen
     */
    @JsonProperty("doorOpen")
    public String getDoorOpen() {
        return doorOpen;
    }

    /**
     * 
     * @param doorOpen
     *     The doorOpen
     */
    @JsonProperty("doorOpen")
    public void setDoorOpen(String doorOpen) {
        this.doorOpen = doorOpen;
    }

    /**
     * 
     * @return
     *     The acarsin
     */
    @JsonProperty("acarsin")
    public String getAcarsin() {
        return acarsin;
    }

    /**
     * 
     * @param acarsin
     *     The acarsin
     */
    @JsonProperty("acarsin")
    public void setAcarsin(String acarsin) {
        this.acarsin = acarsin;
    }

    /**
     * 
     * @return
     *     The paxDepOffSet
     */
    @JsonProperty("paxDepOffSet")
    public String getPaxDepOffSet() {
        return paxDepOffSet;
    }

    /**
     * 
     * @param paxDepOffSet
     *     The paxDepOffSet
     */
    @JsonProperty("paxDepOffSet")
    public void setPaxDepOffSet(String paxDepOffSet) {
        this.paxDepOffSet = paxDepOffSet;
    }

    /**
     * 
     * @return
     *     The paxArrOffSet
     */
    @JsonProperty("paxArrOffSet")
    public String getPaxArrOffSet() {
        return paxArrOffSet;
    }

    /**
     * 
     * @param paxArrOffSet
     *     The paxArrOffSet
     */
    @JsonProperty("paxArrOffSet")
    public void setPaxArrOffSet(String paxArrOffSet) {
        this.paxArrOffSet = paxArrOffSet;
    }

    /**
     * 
     * @return
     *     The skdBoardingStart
     */
    @JsonProperty("skdBoardingStart")
    public String getSkdBoardingStart() {
        return skdBoardingStart;
    }

    /**
     * 
     * @param skdBoardingStart
     *     The skdBoardingStart
     */
    @JsonProperty("skdBoardingStart")
    public void setSkdBoardingStart(String skdBoardingStart) {
        this.skdBoardingStart = skdBoardingStart;
    }

    /**
     * 
     * @return
     *     The latestBoardStart
     */
    @JsonProperty("latestBoardStart")
    public String getLatestBoardStart() {
        return latestBoardStart;
    }

    /**
     * 
     * @param latestBoardStart
     *     The latestBoardStart
     */
    @JsonProperty("latestBoardStart")
    public void setLatestBoardStart(String latestBoardStart) {
        this.latestBoardStart = latestBoardStart;
    }

    /**
     * 
     * @return
     *     The doorCloseTm
     */
    @JsonProperty("doorCloseTm")
    public String getDoorCloseTm() {
        return doorCloseTm;
    }

    /**
     * 
     * @param doorCloseTm
     *     The doorCloseTm
     */
    @JsonProperty("doorCloseTm")
    public void setDoorCloseTm(String doorCloseTm) {
        this.doorCloseTm = doorCloseTm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sTD).append(sTA).append(lTD).append(lTA).append(pTD).append(pTA).append(eTO).append(eON).append(skdTaxiOut).append(skdTaxiIn).append(latestTaxiOut).append(latestTaxiIn).append(actualOut).append(actualOff).append(actualOn).append(actualIn).append(depGMTAdjustment).append(arrGMTAdjustment).append(oGT).append(legDepDOM).append(legArrDOM).append(autoETDAccumMins).append(flightPlanCalcTm).append(flightPlanOut).append(flightPlanOff).append(flightPlanOn).append(flightPlanIn).append(doorOpen).append(acarsin).append(paxDepOffSet).append(paxArrOffSet).append(skdBoardingStart).append(latestBoardStart).append(doorCloseTm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Times) == false) {
            return false;
        }
        Times rhs = ((Times) other);
        return new EqualsBuilder().append(sTD, rhs.sTD).append(sTA, rhs.sTA).append(lTD, rhs.lTD).append(lTA, rhs.lTA).append(pTD, rhs.pTD).append(pTA, rhs.pTA).append(eTO, rhs.eTO).append(eON, rhs.eON).append(skdTaxiOut, rhs.skdTaxiOut).append(skdTaxiIn, rhs.skdTaxiIn).append(latestTaxiOut, rhs.latestTaxiOut).append(latestTaxiIn, rhs.latestTaxiIn).append(actualOut, rhs.actualOut).append(actualOff, rhs.actualOff).append(actualOn, rhs.actualOn).append(actualIn, rhs.actualIn).append(depGMTAdjustment, rhs.depGMTAdjustment).append(arrGMTAdjustment, rhs.arrGMTAdjustment).append(oGT, rhs.oGT).append(legDepDOM, rhs.legDepDOM).append(legArrDOM, rhs.legArrDOM).append(autoETDAccumMins, rhs.autoETDAccumMins).append(flightPlanCalcTm, rhs.flightPlanCalcTm).append(flightPlanOut, rhs.flightPlanOut).append(flightPlanOff, rhs.flightPlanOff).append(flightPlanOn, rhs.flightPlanOn).append(flightPlanIn, rhs.flightPlanIn).append(doorOpen, rhs.doorOpen).append(acarsin, rhs.acarsin).append(paxDepOffSet, rhs.paxDepOffSet).append(paxArrOffSet, rhs.paxArrOffSet).append(skdBoardingStart, rhs.skdBoardingStart).append(latestBoardStart, rhs.latestBoardStart).append(doorCloseTm, rhs.doorCloseTm).isEquals();
    }

}
