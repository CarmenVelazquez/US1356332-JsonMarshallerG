
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
    "airlineCode",
    "fltNum",
    "fltOrgDate",
    "depSta",
    "dupDepStaNum"
})
public class Key {

    @JsonProperty("airlineCode")
    private AirlineCode airlineCode;
    @JsonProperty("fltNum")
    private String fltNum;
    @JsonProperty("fltOrgDate")
    private String fltOrgDate;
    @JsonProperty("depSta")
    private String depSta;
    @JsonProperty("dupDepStaNum")
    private String dupDepStaNum;

    /**
     * 
     * @return
     *     The airlineCode
     */
    @JsonProperty("airlineCode")
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * 
     * @param airlineCode
     *     The airlineCode
     */
    @JsonProperty("airlineCode")
    public void setAirlineCode(AirlineCode airlineCode) {
        this.airlineCode = airlineCode;
    }

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
     *     The depSta
     */
    @JsonProperty("depSta")
    public String getDepSta() {
        return depSta;
    }

    /**
     * 
     * @param depSta
     *     The depSta
     */
    @JsonProperty("depSta")
    public void setDepSta(String depSta) {
        this.depSta = depSta;
    }

    /**
     * 
     * @return
     *     The dupDepStaNum
     */
    @JsonProperty("dupDepStaNum")
    public String getDupDepStaNum() {
        return dupDepStaNum;
    }

    /**
     * 
     * @param dupDepStaNum
     *     The dupDepStaNum
     */
    @JsonProperty("dupDepStaNum")
    public void setDupDepStaNum(String dupDepStaNum) {
        this.dupDepStaNum = dupDepStaNum;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airlineCode).append(fltNum).append(fltOrgDate).append(depSta).append(dupDepStaNum).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Key) == false) {
            return false;
        }
        Key rhs = ((Key) other);
        return new EqualsBuilder().append(airlineCode, rhs.airlineCode).append(fltNum, rhs.fltNum).append(fltOrgDate, rhs.fltOrgDate).append(depSta, rhs.depSta).append(dupDepStaNum, rhs.dupDepStaNum).isEquals();
    }

}
