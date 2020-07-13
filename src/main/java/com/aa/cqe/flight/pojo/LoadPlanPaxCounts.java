
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
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
    "status",
    "thruPaxUpdateInd",
    "counts",
    "unused",
    "pax",
    "xRider"
})
public class LoadPlanPaxCounts {

    @JsonProperty("status")
    private String status;
    @JsonProperty("thruPaxUpdateInd")
    private String thruPaxUpdateInd;
    @JsonProperty("counts")
    private Counts counts;
    @JsonProperty("unused")
    private String unused;
    @JsonProperty("pax")
    private List<Pax> pax = new ArrayList<Pax>();
    @JsonProperty("xRider")
    private XRider xRider;

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The thruPaxUpdateInd
     */
    @JsonProperty("thruPaxUpdateInd")
    public String getThruPaxUpdateInd() {
        return thruPaxUpdateInd;
    }

    /**
     * 
     * @param thruPaxUpdateInd
     *     The thruPaxUpdateInd
     */
    @JsonProperty("thruPaxUpdateInd")
    public void setThruPaxUpdateInd(String thruPaxUpdateInd) {
        this.thruPaxUpdateInd = thruPaxUpdateInd;
    }

    /**
     * 
     * @return
     *     The counts
     */
    @JsonProperty("counts")
    public Counts getCounts() {
        return counts;
    }

    /**
     * 
     * @param counts
     *     The counts
     */
    @JsonProperty("counts")
    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    /**
     * 
     * @return
     *     The unused
     */
    @JsonProperty("unused")
    public String getUnused() {
        return unused;
    }

    /**
     * 
     * @param unused
     *     The unused
     */
    @JsonProperty("unused")
    public void setUnused(String unused) {
        this.unused = unused;
    }

    /**
     * 
     * @return
     *     The pax
     */
    @JsonProperty("pax")
    public List<Pax> getPax() {
        return pax;
    }

    /**
     * 
     * @param pax
     *     The pax
     */
    @JsonProperty("pax")
    public void setPax(List<Pax> pax) {
        this.pax = pax;
    }

    /**
     * 
     * @return
     *     The xRider
     */
    @JsonProperty("xRider")
    public XRider getXRider() {
        return xRider;
    }

    /**
     * 
     * @param xRider
     *     The xRider
     */
    @JsonProperty("xRider")
    public void setXRider(XRider xRider) {
        this.xRider = xRider;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(thruPaxUpdateInd).append(counts).append(unused).append(pax).append(xRider).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadPlanPaxCounts) == false) {
            return false;
        }
        LoadPlanPaxCounts rhs = ((LoadPlanPaxCounts) other);
        return new EqualsBuilder().append(status, rhs.status).append(thruPaxUpdateInd, rhs.thruPaxUpdateInd).append(counts, rhs.counts).append(unused, rhs.unused).append(pax, rhs.pax).append(xRider, rhs.xRider).isEquals();
    }

}
