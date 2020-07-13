
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
    "intOrDomSeq",
    "seqPosition",
    "seqNum",
    "seqOriginDate",
    "dutyPeriodStartDate",
    "dutyPeriodStartTime",
    "dutyCode",
    "dutyLimitTime",
    "seqDPInds"
})
public class Sequence {

    @JsonProperty("intOrDomSeq")
    private String intOrDomSeq;
    @JsonProperty("seqPosition")
    private String seqPosition;
    @JsonProperty("seqNum")
    private Integer seqNum;
    @JsonProperty("seqOriginDate")
    private String seqOriginDate;
    @JsonProperty("dutyPeriodStartDate")
    private String dutyPeriodStartDate;
    @JsonProperty("dutyPeriodStartTime")
    private String dutyPeriodStartTime;
    @JsonProperty("dutyCode")
    private String dutyCode;
    @JsonProperty("dutyLimitTime")
    private String dutyLimitTime;
    @JsonProperty("seqDPInds")
    private String seqDPInds;

    /**
     * 
     * @return
     *     The intOrDomSeq
     */
    @JsonProperty("intOrDomSeq")
    public String getIntOrDomSeq() {
        return intOrDomSeq;
    }

    /**
     * 
     * @param intOrDomSeq
     *     The intOrDomSeq
     */
    @JsonProperty("intOrDomSeq")
    public void setIntOrDomSeq(String intOrDomSeq) {
        this.intOrDomSeq = intOrDomSeq;
    }

    /**
     * 
     * @return
     *     The seqPosition
     */
    @JsonProperty("seqPosition")
    public String getSeqPosition() {
        return seqPosition;
    }

    /**
     * 
     * @param seqPosition
     *     The seqPosition
     */
    @JsonProperty("seqPosition")
    public void setSeqPosition(String seqPosition) {
        this.seqPosition = seqPosition;
    }

    /**
     * 
     * @return
     *     The seqNum
     */
    @JsonProperty("seqNum")
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * 
     * @param seqNum
     *     The seqNum
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    /**
     * 
     * @return
     *     The seqOriginDate
     */
    @JsonProperty("seqOriginDate")
    public String getSeqOriginDate() {
        return seqOriginDate;
    }

    /**
     * 
     * @param seqOriginDate
     *     The seqOriginDate
     */
    @JsonProperty("seqOriginDate")
    public void setSeqOriginDate(String seqOriginDate) {
        this.seqOriginDate = seqOriginDate;
    }

    /**
     * 
     * @return
     *     The dutyPeriodStartDate
     */
    @JsonProperty("dutyPeriodStartDate")
    public String getDutyPeriodStartDate() {
        return dutyPeriodStartDate;
    }

    /**
     * 
     * @param dutyPeriodStartDate
     *     The dutyPeriodStartDate
     */
    @JsonProperty("dutyPeriodStartDate")
    public void setDutyPeriodStartDate(String dutyPeriodStartDate) {
        this.dutyPeriodStartDate = dutyPeriodStartDate;
    }

    /**
     * 
     * @return
     *     The dutyPeriodStartTime
     */
    @JsonProperty("dutyPeriodStartTime")
    public String getDutyPeriodStartTime() {
        return dutyPeriodStartTime;
    }

    /**
     * 
     * @param dutyPeriodStartTime
     *     The dutyPeriodStartTime
     */
    @JsonProperty("dutyPeriodStartTime")
    public void setDutyPeriodStartTime(String dutyPeriodStartTime) {
        this.dutyPeriodStartTime = dutyPeriodStartTime;
    }

    /**
     * 
     * @return
     *     The dutyCode
     */
    @JsonProperty("dutyCode")
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * 
     * @param dutyCode
     *     The dutyCode
     */
    @JsonProperty("dutyCode")
    public void setDutyCode(String dutyCode) {
        this.dutyCode = dutyCode;
    }

    /**
     * 
     * @return
     *     The dutyLimitTime
     */
    @JsonProperty("dutyLimitTime")
    public String getDutyLimitTime() {
        return dutyLimitTime;
    }

    /**
     * 
     * @param dutyLimitTime
     *     The dutyLimitTime
     */
    @JsonProperty("dutyLimitTime")
    public void setDutyLimitTime(String dutyLimitTime) {
        this.dutyLimitTime = dutyLimitTime;
    }

    /**
     * 
     * @return
     *     The seqDPInds
     */
    @JsonProperty("seqDPInds")
    public String getSeqDPInds() {
        return seqDPInds;
    }

    /**
     * 
     * @param seqDPInds
     *     The seqDPInds
     */
    @JsonProperty("seqDPInds")
    public void setSeqDPInds(String seqDPInds) {
        this.seqDPInds = seqDPInds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(intOrDomSeq).append(seqPosition).append(seqNum).append(seqOriginDate).append(dutyPeriodStartDate).append(dutyPeriodStartTime).append(dutyCode).append(dutyLimitTime).append(seqDPInds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sequence) == false) {
            return false;
        }
        Sequence rhs = ((Sequence) other);
        return new EqualsBuilder().append(intOrDomSeq, rhs.intOrDomSeq).append(seqPosition, rhs.seqPosition).append(seqNum, rhs.seqNum).append(seqOriginDate, rhs.seqOriginDate).append(dutyPeriodStartDate, rhs.dutyPeriodStartDate).append(dutyPeriodStartTime, rhs.dutyPeriodStartTime).append(dutyCode, rhs.dutyCode).append(dutyLimitTime, rhs.dutyLimitTime).append(seqDPInds, rhs.seqDPInds).isEquals();
    }

}
