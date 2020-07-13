
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
    "choReceived",
    "eacEfcLast",
    "eacReportType",
    "eacEfcTime"
})
public class Enroute {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("choReceived")
    private Boolean choReceived;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eacEfcLast")
    private Boolean eacEfcLast;
    @JsonProperty("eacReportType")
    private Boolean eacReportType;
    @JsonProperty("eacEfcTime")
    private String eacEfcTime;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The choReceived
     */
    @JsonProperty("choReceived")
    public Boolean getChoReceived() {
        return choReceived;
    }

    /**
     * 
     * (Required)
     * 
     * @param choReceived
     *     The choReceived
     */
    @JsonProperty("choReceived")
    public void setChoReceived(Boolean choReceived) {
        this.choReceived = choReceived;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eacEfcLast
     */
    @JsonProperty("eacEfcLast")
    public Boolean getEacEfcLast() {
        return eacEfcLast;
    }

    /**
     * 
     * (Required)
     * 
     * @param eacEfcLast
     *     The eacEfcLast
     */
    @JsonProperty("eacEfcLast")
    public void setEacEfcLast(Boolean eacEfcLast) {
        this.eacEfcLast = eacEfcLast;
    }

    /**
     * 
     * @return
     *     The eacReportType
     */
    @JsonProperty("eacReportType")
    public Boolean getEacReportType() {
        return eacReportType;
    }

    /**
     * 
     * @param eacReportType
     *     The eacReportType
     */
    @JsonProperty("eacReportType")
    public void setEacReportType(Boolean eacReportType) {
        this.eacReportType = eacReportType;
    }

    /**
     * 
     * @return
     *     The eacEfcTime
     */
    @JsonProperty("eacEfcTime")
    public String getEacEfcTime() {
        return eacEfcTime;
    }

    /**
     * 
     * @param eacEfcTime
     *     The eacEfcTime
     */
    @JsonProperty("eacEfcTime")
    public void setEacEfcTime(String eacEfcTime) {
        this.eacEfcTime = eacEfcTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(choReceived).append(eacEfcLast).append(eacReportType).append(eacEfcTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Enroute) == false) {
            return false;
        }
        Enroute rhs = ((Enroute) other);
        return new EqualsBuilder().append(choReceived, rhs.choReceived).append(eacEfcLast, rhs.eacEfcLast).append(eacReportType, rhs.eacReportType).append(eacEfcTime, rhs.eacEfcTime).isEquals();
    }

}
