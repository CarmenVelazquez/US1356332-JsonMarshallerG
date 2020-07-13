
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
    "fltDepDate",
    "fltDepSta",
    "fltDupCode",
    "fltInds",
    "fltEquipCode",
    "fltDepTime"
})
public class PrevFlt {

    @JsonProperty("fltNum")
    private String fltNum;
    @JsonProperty("fltDepDate")
    private String fltDepDate;
    @JsonProperty("fltDepSta")
    private String fltDepSta;
    @JsonProperty("fltDupCode")
    private String fltDupCode;
    @JsonProperty("fltInds")
    private String fltInds;
    @JsonProperty("fltEquipCode")
    private String fltEquipCode;
    @JsonProperty("fltDepTime")
    private String fltDepTime;

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
     *     The fltDepDate
     */
    @JsonProperty("fltDepDate")
    public String getFltDepDate() {
        return fltDepDate;
    }

    /**
     * 
     * @param fltDepDate
     *     The fltDepDate
     */
    @JsonProperty("fltDepDate")
    public void setFltDepDate(String fltDepDate) {
        this.fltDepDate = fltDepDate;
    }

    /**
     * 
     * @return
     *     The fltDepSta
     */
    @JsonProperty("fltDepSta")
    public String getFltDepSta() {
        return fltDepSta;
    }

    /**
     * 
     * @param fltDepSta
     *     The fltDepSta
     */
    @JsonProperty("fltDepSta")
    public void setFltDepSta(String fltDepSta) {
        this.fltDepSta = fltDepSta;
    }

    /**
     * 
     * @return
     *     The fltDupCode
     */
    @JsonProperty("fltDupCode")
    public String getFltDupCode() {
        return fltDupCode;
    }

    /**
     * 
     * @param fltDupCode
     *     The fltDupCode
     */
    @JsonProperty("fltDupCode")
    public void setFltDupCode(String fltDupCode) {
        this.fltDupCode = fltDupCode;
    }

    /**
     * 
     * @return
     *     The fltInds
     */
    @JsonProperty("fltInds")
    public String getFltInds() {
        return fltInds;
    }

    /**
     * 
     * @param fltInds
     *     The fltInds
     */
    @JsonProperty("fltInds")
    public void setFltInds(String fltInds) {
        this.fltInds = fltInds;
    }

    /**
     * 
     * @return
     *     The fltEquipCode
     */
    @JsonProperty("fltEquipCode")
    public String getFltEquipCode() {
        return fltEquipCode;
    }

    /**
     * 
     * @param fltEquipCode
     *     The fltEquipCode
     */
    @JsonProperty("fltEquipCode")
    public void setFltEquipCode(String fltEquipCode) {
        this.fltEquipCode = fltEquipCode;
    }

    /**
     * 
     * @return
     *     The fltDepTime
     */
    @JsonProperty("fltDepTime")
    public String getFltDepTime() {
        return fltDepTime;
    }

    /**
     * 
     * @param fltDepTime
     *     The fltDepTime
     */
    @JsonProperty("fltDepTime")
    public void setFltDepTime(String fltDepTime) {
        this.fltDepTime = fltDepTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fltNum).append(fltDepDate).append(fltDepSta).append(fltDupCode).append(fltInds).append(fltEquipCode).append(fltDepTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrevFlt) == false) {
            return false;
        }
        PrevFlt rhs = ((PrevFlt) other);
        return new EqualsBuilder().append(fltNum, rhs.fltNum).append(fltDepDate, rhs.fltDepDate).append(fltDepSta, rhs.fltDepSta).append(fltDupCode, rhs.fltDupCode).append(fltInds, rhs.fltInds).append(fltEquipCode, rhs.fltEquipCode).append(fltDepTime, rhs.fltDepTime).isEquals();
    }

}
