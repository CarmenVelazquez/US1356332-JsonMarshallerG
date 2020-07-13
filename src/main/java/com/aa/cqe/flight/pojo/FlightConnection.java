
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
    "fltNum",
    "fltOrgDate",
    "upOrDownlineSta",
    "dupStaCode",
    "connectingPaxCount",
    "downlineEquipCode",
    "downlineDepTime"
})
public class FlightConnection {

    @JsonProperty("fltNum")
    private String fltNum;
    @JsonProperty("fltOrgDate")
    private String fltOrgDate;
    @JsonProperty("upOrDownlineSta")
    private String upOrDownlineSta;
    @JsonProperty("dupStaCode")
    private String dupStaCode;
    @JsonProperty("connectingPaxCount")
    private Integer connectingPaxCount;
    @JsonProperty("downlineEquipCode")
    private String downlineEquipCode;
    @JsonProperty("downlineDepTime")
    private String downlineDepTime;

    /**
     * 
     * @return
     *     The fltNum
     */
    @JsonProperty("fltNum")
    public String getFltNum() {
        return fltNum;
    }

    /**
     * 
     * @param fltNum
     *     The fltNum
     */
    @JsonProperty("fltNum")
    public void setFltNum(String fltNum) {
        this.fltNum = fltNum;
    }

    /**
     * 
     * @return
     *     The fltOrgDate
     */
    @JsonProperty("fltOrgDate")
    public String getFltOrgDate() {
        return fltOrgDate;
    }

    /**
     * 
     * @param fltOrgDate
     *     The fltOrgDate
     */
    @JsonProperty("fltOrgDate")
    public void setFltOrgDate(String fltOrgDate) {
        this.fltOrgDate = fltOrgDate;
    }

    /**
     * 
     * @return
     *     The upOrDownlineSta
     */
    @JsonProperty("upOrDownlineSta")
    public String getUpOrDownlineSta() {
        return upOrDownlineSta;
    }

    /**
     * 
     * @param upOrDownlineSta
     *     The upOrDownlineSta
     */
    @JsonProperty("upOrDownlineSta")
    public void setUpOrDownlineSta(String upOrDownlineSta) {
        this.upOrDownlineSta = upOrDownlineSta;
    }

    /**
     * 
     * @return
     *     The dupStaCode
     */
    @JsonProperty("dupStaCode")
    public String getDupStaCode() {
        return dupStaCode;
    }

    /**
     * 
     * @param dupStaCode
     *     The dupStaCode
     */
    @JsonProperty("dupStaCode")
    public void setDupStaCode(String dupStaCode) {
        this.dupStaCode = dupStaCode;
    }

    /**
     * 
     * @return
     *     The connectingPaxCount
     */
    @JsonProperty("connectingPaxCount")
    public Integer getConnectingPaxCount() {
        return connectingPaxCount;
    }

    /**
     * 
     * @param connectingPaxCount
     *     The connectingPaxCount
     */
    @JsonProperty("connectingPaxCount")
    public void setConnectingPaxCount(Integer connectingPaxCount) {
        this.connectingPaxCount = connectingPaxCount;
    }

    /**
     * 
     * @return
     *     The downlineEquipCode
     */
    @JsonProperty("downlineEquipCode")
    public String getDownlineEquipCode() {
        return downlineEquipCode;
    }

    /**
     * 
     * @param downlineEquipCode
     *     The downlineEquipCode
     */
    @JsonProperty("downlineEquipCode")
    public void setDownlineEquipCode(String downlineEquipCode) {
        this.downlineEquipCode = downlineEquipCode;
    }

    /**
     * 
     * @return
     *     The downlineDepTime
     */
    @JsonProperty("downlineDepTime")
    public String getDownlineDepTime() {
        return downlineDepTime;
    }

    /**
     * 
     * @param downlineDepTime
     *     The downlineDepTime
     */
    @JsonProperty("downlineDepTime")
    public void setDownlineDepTime(String downlineDepTime) {
        this.downlineDepTime = downlineDepTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fltNum).append(fltOrgDate).append(upOrDownlineSta).append(dupStaCode).append(connectingPaxCount).append(downlineEquipCode).append(downlineDepTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightConnection) == false) {
            return false;
        }
        FlightConnection rhs = ((FlightConnection) other);
        return new EqualsBuilder().append(fltNum, rhs.fltNum).append(fltOrgDate, rhs.fltOrgDate).append(upOrDownlineSta, rhs.upOrDownlineSta).append(dupStaCode, rhs.dupStaCode).append(connectingPaxCount, rhs.connectingPaxCount).append(downlineEquipCode, rhs.downlineEquipCode).append(downlineDepTime, rhs.downlineDepTime).isEquals();
    }

}
