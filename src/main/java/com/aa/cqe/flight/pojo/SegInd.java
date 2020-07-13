
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
    "altChgOk",
    "FIR",
    "spdAltChgOk",
    "gate",
    "fltPlnPt",
    "decsPt",
    "reclear",
    "owGate",
    "etPt",
    "endRestrAwy",
    "blocked",
    "ptAltRestr"
})
public class SegInd {

    @JsonProperty("VOR")
    private Boolean vOR;
    @JsonProperty("altChgOk")
    private Boolean altChgOk;
    @JsonProperty("FIR")
    private Boolean fIR;
    @JsonProperty("spdAltChgOk")
    private Boolean spdAltChgOk;
    @JsonProperty("gate")
    private Boolean gate;
    @JsonProperty("fltPlnPt")
    private Boolean fltPlnPt;
    @JsonProperty("decsPt")
    private Boolean decsPt;
    @JsonProperty("reclear")
    private Boolean reclear;
    @JsonProperty("owGate")
    private Boolean owGate;
    @JsonProperty("etPt")
    private Boolean etPt;
    @JsonProperty("endRestrAwy")
    private Boolean endRestrAwy;
    @JsonProperty("blocked")
    private Boolean blocked;
    @JsonProperty("ptAltRestr")
    private Boolean ptAltRestr;

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
     *     The altChgOk
     */
    @JsonProperty("altChgOk")
    public Boolean getAltChgOk() {
        return altChgOk;
    }

    /**
     * 
     * @param altChgOk
     *     The altChgOk
     */
    @JsonProperty("altChgOk")
    public void setAltChgOk(Boolean altChgOk) {
        this.altChgOk = altChgOk;
    }

    /**
     * 
     * @return
     *     The fIR
     */
    @JsonProperty("FIR")
    public Boolean getFIR() {
        return fIR;
    }

    /**
     * 
     * @param fIR
     *     The FIR
     */
    @JsonProperty("FIR")
    public void setFIR(Boolean fIR) {
        this.fIR = fIR;
    }

    /**
     * 
     * @return
     *     The spdAltChgOk
     */
    @JsonProperty("spdAltChgOk")
    public Boolean getSpdAltChgOk() {
        return spdAltChgOk;
    }

    /**
     * 
     * @param spdAltChgOk
     *     The spdAltChgOk
     */
    @JsonProperty("spdAltChgOk")
    public void setSpdAltChgOk(Boolean spdAltChgOk) {
        this.spdAltChgOk = spdAltChgOk;
    }

    /**
     * 
     * @return
     *     The gate
     */
    @JsonProperty("gate")
    public Boolean getGate() {
        return gate;
    }

    /**
     * 
     * @param gate
     *     The gate
     */
    @JsonProperty("gate")
    public void setGate(Boolean gate) {
        this.gate = gate;
    }

    /**
     * 
     * @return
     *     The fltPlnPt
     */
    @JsonProperty("fltPlnPt")
    public Boolean getFltPlnPt() {
        return fltPlnPt;
    }

    /**
     * 
     * @param fltPlnPt
     *     The fltPlnPt
     */
    @JsonProperty("fltPlnPt")
    public void setFltPlnPt(Boolean fltPlnPt) {
        this.fltPlnPt = fltPlnPt;
    }

    /**
     * 
     * @return
     *     The decsPt
     */
    @JsonProperty("decsPt")
    public Boolean getDecsPt() {
        return decsPt;
    }

    /**
     * 
     * @param decsPt
     *     The decsPt
     */
    @JsonProperty("decsPt")
    public void setDecsPt(Boolean decsPt) {
        this.decsPt = decsPt;
    }

    /**
     * 
     * @return
     *     The reclear
     */
    @JsonProperty("reclear")
    public Boolean getReclear() {
        return reclear;
    }

    /**
     * 
     * @param reclear
     *     The reclear
     */
    @JsonProperty("reclear")
    public void setReclear(Boolean reclear) {
        this.reclear = reclear;
    }

    /**
     * 
     * @return
     *     The owGate
     */
    @JsonProperty("owGate")
    public Boolean getOwGate() {
        return owGate;
    }

    /**
     * 
     * @param owGate
     *     The owGate
     */
    @JsonProperty("owGate")
    public void setOwGate(Boolean owGate) {
        this.owGate = owGate;
    }

    /**
     * 
     * @return
     *     The etPt
     */
    @JsonProperty("etPt")
    public Boolean getEtPt() {
        return etPt;
    }

    /**
     * 
     * @param etPt
     *     The etPt
     */
    @JsonProperty("etPt")
    public void setEtPt(Boolean etPt) {
        this.etPt = etPt;
    }

    /**
     * 
     * @return
     *     The endRestrAwy
     */
    @JsonProperty("endRestrAwy")
    public Boolean getEndRestrAwy() {
        return endRestrAwy;
    }

    /**
     * 
     * @param endRestrAwy
     *     The endRestrAwy
     */
    @JsonProperty("endRestrAwy")
    public void setEndRestrAwy(Boolean endRestrAwy) {
        this.endRestrAwy = endRestrAwy;
    }

    /**
     * 
     * @return
     *     The blocked
     */
    @JsonProperty("blocked")
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * 
     * @param blocked
     *     The blocked
     */
    @JsonProperty("blocked")
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * 
     * @return
     *     The ptAltRestr
     */
    @JsonProperty("ptAltRestr")
    public Boolean getPtAltRestr() {
        return ptAltRestr;
    }

    /**
     * 
     * @param ptAltRestr
     *     The ptAltRestr
     */
    @JsonProperty("ptAltRestr")
    public void setPtAltRestr(Boolean ptAltRestr) {
        this.ptAltRestr = ptAltRestr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vOR).append(altChgOk).append(fIR).append(spdAltChgOk).append(gate).append(fltPlnPt).append(decsPt).append(reclear).append(owGate).append(etPt).append(endRestrAwy).append(blocked).append(ptAltRestr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegInd) == false) {
            return false;
        }
        SegInd rhs = ((SegInd) other);
        return new EqualsBuilder().append(vOR, rhs.vOR).append(altChgOk, rhs.altChgOk).append(fIR, rhs.fIR).append(spdAltChgOk, rhs.spdAltChgOk).append(gate, rhs.gate).append(fltPlnPt, rhs.fltPlnPt).append(decsPt, rhs.decsPt).append(reclear, rhs.reclear).append(owGate, rhs.owGate).append(etPt, rhs.etPt).append(endRestrAwy, rhs.endRestrAwy).append(blocked, rhs.blocked).append(ptAltRestr, rhs.ptAltRestr).isEquals();
    }

}
