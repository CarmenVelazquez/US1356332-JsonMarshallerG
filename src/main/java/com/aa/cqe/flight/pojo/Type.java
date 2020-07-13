
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
    "deiceInd",
    "captQuals",
    "fltRelStatus",
    "callSign",
    "mealCode",
    "stubFltNum",
    "intOrDom",
    "kickOffFlt",
    "antiIceInd",
    "dblProvision",
    "EWDirectionInd",
    "EROWneeded",
    "EROWcomplete"
})
public class Type {

    @JsonProperty("deiceInd")
    private String deiceInd;
    @JsonProperty("captQuals")
    private String captQuals;
    @JsonProperty("fltRelStatus")
    private String fltRelStatus;
    @JsonProperty("callSign")
    private String callSign;
    @JsonProperty("mealCode")
    private String mealCode;
    @JsonProperty("stubFltNum")
    private String stubFltNum;
    @JsonProperty("intOrDom")
    private String intOrDom;
    @JsonProperty("kickOffFlt")
    private String kickOffFlt;
    @JsonProperty("antiIceInd")
    private String antiIceInd;
    @JsonProperty("dblProvision")
    private String dblProvision;
    @JsonProperty("EWDirectionInd")
    private String eWDirectionInd;
    @JsonProperty("EROWneeded")
    private String eROWneeded;
    @JsonProperty("EROWcomplete")
    private String eROWcomplete;

    /**
     * 
     * @return
     *     The deiceInd
     */
    @JsonProperty("deiceInd")
    public String getDeiceInd() {
        return deiceInd;
    }

    /**
     * 
     * @param deiceInd
     *     The deiceInd
     */
    @JsonProperty("deiceInd")
    public void setDeiceInd(String deiceInd) {
        this.deiceInd = deiceInd;
    }

    /**
     * 
     * @return
     *     The captQuals
     */
    @JsonProperty("captQuals")
    public String getCaptQuals() {
        return captQuals;
    }

    /**
     * 
     * @param captQuals
     *     The captQuals
     */
    @JsonProperty("captQuals")
    public void setCaptQuals(String captQuals) {
        this.captQuals = captQuals;
    }

    /**
     * 
     * @return
     *     The fltRelStatus
     */
    @JsonProperty("fltRelStatus")
    public String getFltRelStatus() {
        return fltRelStatus;
    }

    /**
     * 
     * @param fltRelStatus
     *     The fltRelStatus
     */
    @JsonProperty("fltRelStatus")
    public void setFltRelStatus(String fltRelStatus) {
        this.fltRelStatus = fltRelStatus;
    }

    /**
     * 
     * @return
     *     The callSign
     */
    @JsonProperty("callSign")
    public String getCallSign() {
        return callSign;
    }

    /**
     * 
     * @param callSign
     *     The callSign
     */
    @JsonProperty("callSign")
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    /**
     * 
     * @return
     *     The mealCode
     */
    @JsonProperty("mealCode")
    public String getMealCode() {
        return mealCode;
    }

    /**
     * 
     * @param mealCode
     *     The mealCode
     */
    @JsonProperty("mealCode")
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    /**
     * 
     * @return
     *     The stubFltNum
     */
    @JsonProperty("stubFltNum")
    public String getStubFltNum() {
        return stubFltNum;
    }

    /**
     * 
     * @param stubFltNum
     *     The stubFltNum
     */
    @JsonProperty("stubFltNum")
    public void setStubFltNum(String stubFltNum) {
        this.stubFltNum = stubFltNum;
    }

    /**
     * 
     * @return
     *     The intOrDom
     */
    @JsonProperty("intOrDom")
    public String getIntOrDom() {
        return intOrDom;
    }

    /**
     * 
     * @param intOrDom
     *     The intOrDom
     */
    @JsonProperty("intOrDom")
    public void setIntOrDom(String intOrDom) {
        this.intOrDom = intOrDom;
    }

    /**
     * 
     * @return
     *     The kickOffFlt
     */
    @JsonProperty("kickOffFlt")
    public String getKickOffFlt() {
        return kickOffFlt;
    }

    /**
     * 
     * @param kickOffFlt
     *     The kickOffFlt
     */
    @JsonProperty("kickOffFlt")
    public void setKickOffFlt(String kickOffFlt) {
        this.kickOffFlt = kickOffFlt;
    }

    /**
     * 
     * @return
     *     The antiIceInd
     */
    @JsonProperty("antiIceInd")
    public String getAntiIceInd() {
        return antiIceInd;
    }

    /**
     * 
     * @param antiIceInd
     *     The antiIceInd
     */
    @JsonProperty("antiIceInd")
    public void setAntiIceInd(String antiIceInd) {
        this.antiIceInd = antiIceInd;
    }

    /**
     * 
     * @return
     *     The dblProvision
     */
    @JsonProperty("dblProvision")
    public String getDblProvision() {
        return dblProvision;
    }

    /**
     * 
     * @param dblProvision
     *     The dblProvision
     */
    @JsonProperty("dblProvision")
    public void setDblProvision(String dblProvision) {
        this.dblProvision = dblProvision;
    }

    /**
     * 
     * @return
     *     The eWDirectionInd
     */
    @JsonProperty("EWDirectionInd")
    public String getEWDirectionInd() {
        return eWDirectionInd;
    }

    /**
     * 
     * @param eWDirectionInd
     *     The EWDirectionInd
     */
    @JsonProperty("EWDirectionInd")
    public void setEWDirectionInd(String eWDirectionInd) {
        this.eWDirectionInd = eWDirectionInd;
    }

    /**
     * 
     * @return
     *     The eROWneeded
     */
    @JsonProperty("EROWneeded")
    public String getEROWneeded() {
        return eROWneeded;
    }

    /**
     * 
     * @param eROWneeded
     *     The EROWneeded
     */
    @JsonProperty("EROWneeded")
    public void setEROWneeded(String eROWneeded) {
        this.eROWneeded = eROWneeded;
    }

    /**
     * 
     * @return
     *     The eROWcomplete
     */
    @JsonProperty("EROWcomplete")
    public String getEROWcomplete() {
        return eROWcomplete;
    }

    /**
     * 
     * @param eROWcomplete
     *     The EROWcomplete
     */
    @JsonProperty("EROWcomplete")
    public void setEROWcomplete(String eROWcomplete) {
        this.eROWcomplete = eROWcomplete;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deiceInd).append(captQuals).append(fltRelStatus).append(callSign).append(mealCode).append(stubFltNum).append(intOrDom).append(kickOffFlt).append(antiIceInd).append(dblProvision).append(eWDirectionInd).append(eROWneeded).append(eROWcomplete).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return new EqualsBuilder().append(deiceInd, rhs.deiceInd).append(captQuals, rhs.captQuals).append(fltRelStatus, rhs.fltRelStatus).append(callSign, rhs.callSign).append(mealCode, rhs.mealCode).append(stubFltNum, rhs.stubFltNum).append(intOrDom, rhs.intOrDom).append(kickOffFlt, rhs.kickOffFlt).append(antiIceInd, rhs.antiIceInd).append(dblProvision, rhs.dblProvision).append(eWDirectionInd, rhs.eWDirectionInd).append(eROWneeded, rhs.eROWneeded).append(eROWcomplete, rhs.eROWcomplete).isEquals();
    }

}
