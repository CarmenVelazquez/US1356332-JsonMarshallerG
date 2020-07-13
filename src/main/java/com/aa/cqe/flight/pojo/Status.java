
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
    "leg",
    "dep",
    "arr",
    "fitForDuty",
    "paxStatus",
    "picrecdFP"
})
public class Status {

    @JsonProperty("leg")
    private String leg;
    @JsonProperty("dep")
    private String dep;
    @JsonProperty("arr")
    private String arr;
    @JsonProperty("fitForDuty")
    private String fitForDuty;
    @JsonProperty("paxStatus")
    private String paxStatus;
    @JsonProperty("picrecdFP")
    private String picrecdFP;

    /**
     * 
     * @return
     *     The leg
     */
    @JsonProperty("leg")
    public String getLeg() {
        return leg;
    }

    /**
     * 
     * @param leg
     *     The leg
     */
    @JsonProperty("leg")
    public void setLeg(String leg) {
        this.leg = leg;
    }

    /**
     * 
     * @return
     *     The dep
     */
    @JsonProperty("dep")
    public String getDep() {
        return dep;
    }

    /**
     * 
     * @param dep
     *     The dep
     */
    @JsonProperty("dep")
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * 
     * @return
     *     The arr
     */
    @JsonProperty("arr")
    public String getArr() {
        return arr;
    }

    /**
     * 
     * @param arr
     *     The arr
     */
    @JsonProperty("arr")
    public void setArr(String arr) {
        this.arr = arr;
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

    /**
     * 
     * @return
     *     The paxStatus
     */
    @JsonProperty("paxStatus")
    public String getPaxStatus() {
        return paxStatus;
    }

    /**
     * 
     * @param paxStatus
     *     The paxStatus
     */
    @JsonProperty("paxStatus")
    public void setPaxStatus(String paxStatus) {
        this.paxStatus = paxStatus;
    }

    /**
     * 
     * @return
     *     The picrecdFP
     */
    @JsonProperty("picrecdFP")
    public String getPicrecdFP() {
        return picrecdFP;
    }

    /**
     * 
     * @param picrecdFP
     *     The picrecdFP
     */
    @JsonProperty("picrecdFP")
    public void setPicrecdFP(String picrecdFP) {
        this.picrecdFP = picrecdFP;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(leg).append(dep).append(arr).append(fitForDuty).append(paxStatus).append(picrecdFP).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return new EqualsBuilder().append(leg, rhs.leg).append(dep, rhs.dep).append(arr, rhs.arr).append(fitForDuty, rhs.fitForDuty).append(paxStatus, rhs.paxStatus).append(picrecdFP, rhs.picrecdFP).isEquals();
    }

}
