
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
    "lineNumber",
    "unitID",
    "commodity",
    "actualWeight",
    "offPointDestination",
    "finalDestination",
    "refusalCode",
    "remarks"
})
public class CargoItem {

    @JsonProperty("lineNumber")
    private Integer lineNumber;
    @JsonProperty("unitID")
    private String unitID;
    @JsonProperty("commodity")
    private Commodity commodity;
    @JsonProperty("actualWeight")
    private Integer actualWeight;
    @JsonProperty("offPointDestination")
    private String offPointDestination;
    @JsonProperty("finalDestination")
    private String finalDestination;
    @JsonProperty("refusalCode")
    private String refusalCode;
    @JsonProperty("remarks")
    private String remarks;

    /**
     * 
     * @return
     *     The lineNumber
     */
    @JsonProperty("lineNumber")
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * 
     * @param lineNumber
     *     The lineNumber
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * 
     * @return
     *     The unitID
     */
    @JsonProperty("unitID")
    public String getUnitID() {
        return unitID;
    }

    /**
     * 
     * @param unitID
     *     The unitID
     */
    @JsonProperty("unitID")
    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    /**
     * 
     * @return
     *     The commodity
     */
    @JsonProperty("commodity")
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * 
     * @param commodity
     *     The commodity
     */
    @JsonProperty("commodity")
    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    /**
     * 
     * @return
     *     The actualWeight
     */
    @JsonProperty("actualWeight")
    public Integer getActualWeight() {
        return actualWeight;
    }

    /**
     * 
     * @param actualWeight
     *     The actualWeight
     */
    @JsonProperty("actualWeight")
    public void setActualWeight(Integer actualWeight) {
        this.actualWeight = actualWeight;
    }

    /**
     * 
     * @return
     *     The offPointDestination
     */
    @JsonProperty("offPointDestination")
    public String getOffPointDestination() {
        return offPointDestination;
    }

    /**
     * 
     * @param offPointDestination
     *     The offPointDestination
     */
    @JsonProperty("offPointDestination")
    public void setOffPointDestination(String offPointDestination) {
        this.offPointDestination = offPointDestination;
    }

    /**
     * 
     * @return
     *     The finalDestination
     */
    @JsonProperty("finalDestination")
    public String getFinalDestination() {
        return finalDestination;
    }

    /**
     * 
     * @param finalDestination
     *     The finalDestination
     */
    @JsonProperty("finalDestination")
    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    /**
     * 
     * @return
     *     The refusalCode
     */
    @JsonProperty("refusalCode")
    public String getRefusalCode() {
        return refusalCode;
    }

    /**
     * 
     * @param refusalCode
     *     The refusalCode
     */
    @JsonProperty("refusalCode")
    public void setRefusalCode(String refusalCode) {
        this.refusalCode = refusalCode;
    }

    /**
     * 
     * @return
     *     The remarks
     */
    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks
     *     The remarks
     */
    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lineNumber).append(unitID).append(commodity).append(actualWeight).append(offPointDestination).append(finalDestination).append(refusalCode).append(remarks).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CargoItem) == false) {
            return false;
        }
        CargoItem rhs = ((CargoItem) other);
        return new EqualsBuilder().append(lineNumber, rhs.lineNumber).append(unitID, rhs.unitID).append(commodity, rhs.commodity).append(actualWeight, rhs.actualWeight).append(offPointDestination, rhs.offPointDestination).append(finalDestination, rhs.finalDestination).append(refusalCode, rhs.refusalCode).append(remarks, rhs.remarks).isEquals();
    }

}
