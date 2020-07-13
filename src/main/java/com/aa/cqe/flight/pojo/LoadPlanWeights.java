
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
    "compartmentsCount",
    "cargoFinalInd",
    "thruCargoUpdateInd",
    "stop92MinPaxUpdateInd",
    "version",
    "unused",
    "compartment",
    "wbdsind",
    "wbwlind"
})
public class LoadPlanWeights {

    @JsonProperty("compartmentsCount")
    private Integer compartmentsCount;
    @JsonProperty("cargoFinalInd")
    private String cargoFinalInd;
    @JsonProperty("thruCargoUpdateInd")
    private String thruCargoUpdateInd;
    @JsonProperty("stop92MinPaxUpdateInd")
    private String stop92MinPaxUpdateInd;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("unused")
    private String unused;
    @JsonProperty("compartment")
    private List<Compartment> compartment = new ArrayList<Compartment>();
    @JsonProperty("wbdsind")
    private String wbdsind;
    @JsonProperty("wbwlind")
    private String wbwlind;

    /**
     * 
     * @return
     *     The compartmentsCount
     */
    @JsonProperty("compartmentsCount")
    public Integer getCompartmentsCount() {
        return compartmentsCount;
    }

    /**
     * 
     * @param compartmentsCount
     *     The compartmentsCount
     */
    @JsonProperty("compartmentsCount")
    public void setCompartmentsCount(Integer compartmentsCount) {
        this.compartmentsCount = compartmentsCount;
    }

    /**
     * 
     * @return
     *     The cargoFinalInd
     */
    @JsonProperty("cargoFinalInd")
    public String getCargoFinalInd() {
        return cargoFinalInd;
    }

    /**
     * 
     * @param cargoFinalInd
     *     The cargoFinalInd
     */
    @JsonProperty("cargoFinalInd")
    public void setCargoFinalInd(String cargoFinalInd) {
        this.cargoFinalInd = cargoFinalInd;
    }

    /**
     * 
     * @return
     *     The thruCargoUpdateInd
     */
    @JsonProperty("thruCargoUpdateInd")
    public String getThruCargoUpdateInd() {
        return thruCargoUpdateInd;
    }

    /**
     * 
     * @param thruCargoUpdateInd
     *     The thruCargoUpdateInd
     */
    @JsonProperty("thruCargoUpdateInd")
    public void setThruCargoUpdateInd(String thruCargoUpdateInd) {
        this.thruCargoUpdateInd = thruCargoUpdateInd;
    }

    /**
     * 
     * @return
     *     The stop92MinPaxUpdateInd
     */
    @JsonProperty("stop92MinPaxUpdateInd")
    public String getStop92MinPaxUpdateInd() {
        return stop92MinPaxUpdateInd;
    }

    /**
     * 
     * @param stop92MinPaxUpdateInd
     *     The stop92MinPaxUpdateInd
     */
    @JsonProperty("stop92MinPaxUpdateInd")
    public void setStop92MinPaxUpdateInd(String stop92MinPaxUpdateInd) {
        this.stop92MinPaxUpdateInd = stop92MinPaxUpdateInd;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
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
     *     The compartment
     */
    @JsonProperty("compartment")
    public List<Compartment> getCompartment() {
        return compartment;
    }

    /**
     * 
     * @param compartment
     *     The compartment
     */
    @JsonProperty("compartment")
    public void setCompartment(List<Compartment> compartment) {
        this.compartment = compartment;
    }

    /**
     * 
     * @return
     *     The wbdsind
     */
    @JsonProperty("wbdsind")
    public String getWbdsind() {
        return wbdsind;
    }

    /**
     * 
     * @param wbdsind
     *     The wbdsind
     */
    @JsonProperty("wbdsind")
    public void setWbdsind(String wbdsind) {
        this.wbdsind = wbdsind;
    }

    /**
     * 
     * @return
     *     The wbwlind
     */
    @JsonProperty("wbwlind")
    public String getWbwlind() {
        return wbwlind;
    }

    /**
     * 
     * @param wbwlind
     *     The wbwlind
     */
    @JsonProperty("wbwlind")
    public void setWbwlind(String wbwlind) {
        this.wbwlind = wbwlind;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(compartmentsCount).append(cargoFinalInd).append(thruCargoUpdateInd).append(stop92MinPaxUpdateInd).append(version).append(unused).append(compartment).append(wbdsind).append(wbwlind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadPlanWeights) == false) {
            return false;
        }
        LoadPlanWeights rhs = ((LoadPlanWeights) other);
        return new EqualsBuilder().append(compartmentsCount, rhs.compartmentsCount).append(cargoFinalInd, rhs.cargoFinalInd).append(thruCargoUpdateInd, rhs.thruCargoUpdateInd).append(stop92MinPaxUpdateInd, rhs.stop92MinPaxUpdateInd).append(version, rhs.version).append(unused, rhs.unused).append(compartment, rhs.compartment).append(wbdsind, rhs.wbdsind).append(wbwlind, rhs.wbwlind).isEquals();
    }

}
