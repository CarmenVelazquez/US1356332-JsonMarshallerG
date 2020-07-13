
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
    "fltPosition",
    "cockpitInd",
    "deadhead",
    "operatingOrDHInd",
    "empNum",
    "crewBase",
    "lastName",
    "firstName",
    "midInitial",
    "nickName",
    "hiMin",
    "polarQualified",
    "divisionQuals",
    "sequence",
    "prevFlt",
    "nextFlt",
    "times",
    "type",
    "fitForDuty"
})
public class Crewmember {

    @JsonProperty("fltPosition")
    private String fltPosition;
    @JsonProperty("cockpitInd")
    private Boolean cockpitInd;
    @JsonProperty("deadhead")
    private Boolean deadhead;
    @JsonProperty("operatingOrDHInd")
    private String operatingOrDHInd;
    @JsonProperty("empNum")
    private String empNum;
    @JsonProperty("crewBase")
    private String crewBase;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("midInitial")
    private String midInitial;
    @JsonProperty("nickName")
    private String nickName;
    @JsonProperty("hiMin")
    private Boolean hiMin;
    @JsonProperty("polarQualified")
    private Boolean polarQualified;
    @JsonProperty("divisionQuals")
    private DivisionQuals divisionQuals;
    @JsonProperty("sequence")
    private Sequence sequence;
    @JsonProperty("prevFlt")
    private PrevFlt prevFlt;
    @JsonProperty("nextFlt")
    private NextFlt nextFlt;
    @JsonProperty("times")
    private Times_ times;
    @JsonProperty("type")
    private Type_ type;
    @JsonProperty("fitForDuty")
    private String fitForDuty;

    /**
     * 
     * @return
     *     The fltPosition
     */
    @JsonProperty("fltPosition")
    public String getFltPosition() {
        return fltPosition;
    }

    /**
     * 
     * @param fltPosition
     *     The fltPosition
     */
    @JsonProperty("fltPosition")
    public void setFltPosition(String fltPosition) {
        this.fltPosition = fltPosition;
    }

    /**
     * 
     * @return
     *     The cockpitInd
     */
    @JsonProperty("cockpitInd")
    public Boolean getCockpitInd() {
        return cockpitInd;
    }

    /**
     * 
     * @param cockpitInd
     *     The cockpitInd
     */
    @JsonProperty("cockpitInd")
    public void setCockpitInd(Boolean cockpitInd) {
        this.cockpitInd = cockpitInd;
    }

    /**
     * 
     * @return
     *     The deadhead
     */
    @JsonProperty("deadhead")
    public Boolean getDeadhead() {
        return deadhead;
    }

    /**
     * 
     * @param deadhead
     *     The deadhead
     */
    @JsonProperty("deadhead")
    public void setDeadhead(Boolean deadhead) {
        this.deadhead = deadhead;
    }

    /**
     * 
     * @return
     *     The operatingOrDHInd
     */
    @JsonProperty("operatingOrDHInd")
    public String getOperatingOrDHInd() {
        return operatingOrDHInd;
    }

    /**
     * 
     * @param operatingOrDHInd
     *     The operatingOrDHInd
     */
    @JsonProperty("operatingOrDHInd")
    public void setOperatingOrDHInd(String operatingOrDHInd) {
        this.operatingOrDHInd = operatingOrDHInd;
    }

    /**
     * 
     * @return
     *     The empNum
     */
    @JsonProperty("empNum")
    public String getEmpNum() {
        return empNum;
    }

    /**
     * 
     * @param empNum
     *     The empNum
     */
    @JsonProperty("empNum")
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /**
     * 
     * @return
     *     The crewBase
     */
    @JsonProperty("crewBase")
    public String getCrewBase() {
        return crewBase;
    }

    /**
     * 
     * @param crewBase
     *     The crewBase
     */
    @JsonProperty("crewBase")
    public void setCrewBase(String crewBase) {
        this.crewBase = crewBase;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The lastName
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The firstName
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The midInitial
     */
    @JsonProperty("midInitial")
    public String getMidInitial() {
        return midInitial;
    }

    /**
     * 
     * @param midInitial
     *     The midInitial
     */
    @JsonProperty("midInitial")
    public void setMidInitial(String midInitial) {
        this.midInitial = midInitial;
    }

    /**
     * 
     * @return
     *     The nickName
     */
    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    /**
     * 
     * @param nickName
     *     The nickName
     */
    @JsonProperty("nickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 
     * @return
     *     The hiMin
     */
    @JsonProperty("hiMin")
    public Boolean getHiMin() {
        return hiMin;
    }

    /**
     * 
     * @param hiMin
     *     The hiMin
     */
    @JsonProperty("hiMin")
    public void setHiMin(Boolean hiMin) {
        this.hiMin = hiMin;
    }

    /**
     * 
     * @return
     *     The polarQualified
     */
    @JsonProperty("polarQualified")
    public Boolean getPolarQualified() {
        return polarQualified;
    }

    /**
     * 
     * @param polarQualified
     *     The polarQualified
     */
    @JsonProperty("polarQualified")
    public void setPolarQualified(Boolean polarQualified) {
        this.polarQualified = polarQualified;
    }

    /**
     * 
     * @return
     *     The divisionQuals
     */
    @JsonProperty("divisionQuals")
    public DivisionQuals getDivisionQuals() {
        return divisionQuals;
    }

    /**
     * 
     * @param divisionQuals
     *     The divisionQuals
     */
    @JsonProperty("divisionQuals")
    public void setDivisionQuals(DivisionQuals divisionQuals) {
        this.divisionQuals = divisionQuals;
    }

    /**
     * 
     * @return
     *     The sequence
     */
    @JsonProperty("sequence")
    public Sequence getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    @JsonProperty("sequence")
    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The prevFlt
     */
    @JsonProperty("prevFlt")
    public PrevFlt getPrevFlt() {
        return prevFlt;
    }

    /**
     * 
     * @param prevFlt
     *     The prevFlt
     */
    @JsonProperty("prevFlt")
    public void setPrevFlt(PrevFlt prevFlt) {
        this.prevFlt = prevFlt;
    }

    /**
     * 
     * @return
     *     The nextFlt
     */
    @JsonProperty("nextFlt")
    public NextFlt getNextFlt() {
        return nextFlt;
    }

    /**
     * 
     * @param nextFlt
     *     The nextFlt
     */
    @JsonProperty("nextFlt")
    public void setNextFlt(NextFlt nextFlt) {
        this.nextFlt = nextFlt;
    }

    /**
     * 
     * @return
     *     The times
     */
    @JsonProperty("times")
    public Times_ getTimes() {
        return times;
    }

    /**
     * 
     * @param times
     *     The times
     */
    @JsonProperty("times")
    public void setTimes(Times_ times) {
        this.times = times;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type_ getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type_ type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The fitForDuty
     */
    @JsonProperty("fitForDuty")
    public String getFitForDuty() {
        return fitForDuty;
    }

    /**
     * 
     * @param fitForDuty
     *     The fitForDuty
     */
    @JsonProperty("fitForDuty")
    public void setFitForDuty(String fitForDuty) {
        this.fitForDuty = fitForDuty;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fltPosition).append(cockpitInd).append(deadhead).append(operatingOrDHInd).append(empNum).append(crewBase).append(lastName).append(firstName).append(midInitial).append(nickName).append(hiMin).append(polarQualified).append(divisionQuals).append(sequence).append(prevFlt).append(nextFlt).append(times).append(type).append(fitForDuty).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Crewmember) == false) {
            return false;
        }
        Crewmember rhs = ((Crewmember) other);
        return new EqualsBuilder().append(fltPosition, rhs.fltPosition).append(cockpitInd, rhs.cockpitInd).append(deadhead, rhs.deadhead).append(operatingOrDHInd, rhs.operatingOrDHInd).append(empNum, rhs.empNum).append(crewBase, rhs.crewBase).append(lastName, rhs.lastName).append(firstName, rhs.firstName).append(midInitial, rhs.midInitial).append(nickName, rhs.nickName).append(hiMin, rhs.hiMin).append(polarQualified, rhs.polarQualified).append(divisionQuals, rhs.divisionQuals).append(sequence, rhs.sequence).append(prevFlt, rhs.prevFlt).append(nextFlt, rhs.nextFlt).append(times, rhs.times).append(type, rhs.type).append(fitForDuty, rhs.fitForDuty).isEquals();
    }

}
