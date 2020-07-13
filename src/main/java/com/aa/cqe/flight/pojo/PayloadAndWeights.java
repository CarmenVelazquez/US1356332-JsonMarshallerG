
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
    "payload",
    "loadStatus",
    "dryOperatingWeight",
    "zeroFuelWeight",
    "maximumZFW",
    "maxTakeoffWeight",
    "maxLandingWeight",
    "maxWeights",
    "maxRampWeight",
    "mtowsuffix",
    "mldwsuffix"
})
public class PayloadAndWeights {

    @JsonProperty("payload")
    private Integer payload;
    @JsonProperty("loadStatus")
    private String loadStatus;
    @JsonProperty("dryOperatingWeight")
    private Integer dryOperatingWeight;
    @JsonProperty("zeroFuelWeight")
    private Integer zeroFuelWeight;
    @JsonProperty("maximumZFW")
    private Integer maximumZFW;
    @JsonProperty("maxTakeoffWeight")
    private Integer maxTakeoffWeight;
    @JsonProperty("maxLandingWeight")
    private Integer maxLandingWeight;
    @JsonProperty("maxWeights")
    private MaxWeights maxWeights;
    @JsonProperty("maxRampWeight")
    private Integer maxRampWeight;
    @JsonProperty("mtowsuffix")
    private String mtowsuffix;
    @JsonProperty("mldwsuffix")
    private String mldwsuffix;

    /**
     * 
     * @return
     *     The payload
     */
    @JsonProperty("payload")
    public Integer getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    @JsonProperty("payload")
    public void setPayload(Integer payload) {
        this.payload = payload;
    }

    /**
     * 
     * @return
     *     The loadStatus
     */
    @JsonProperty("loadStatus")
    public String getLoadStatus() {
        return loadStatus;
    }

    /**
     * 
     * @param loadStatus
     *     The loadStatus
     */
    @JsonProperty("loadStatus")
    public void setLoadStatus(String loadStatus) {
        this.loadStatus = loadStatus;
    }

    /**
     * 
     * @return
     *     The dryOperatingWeight
     */
    @JsonProperty("dryOperatingWeight")
    public Integer getDryOperatingWeight() {
        return dryOperatingWeight;
    }

    /**
     * 
     * @param dryOperatingWeight
     *     The dryOperatingWeight
     */
    @JsonProperty("dryOperatingWeight")
    public void setDryOperatingWeight(Integer dryOperatingWeight) {
        this.dryOperatingWeight = dryOperatingWeight;
    }

    /**
     * 
     * @return
     *     The zeroFuelWeight
     */
    @JsonProperty("zeroFuelWeight")
    public Integer getZeroFuelWeight() {
        return zeroFuelWeight;
    }

    /**
     * 
     * @param zeroFuelWeight
     *     The zeroFuelWeight
     */
    @JsonProperty("zeroFuelWeight")
    public void setZeroFuelWeight(Integer zeroFuelWeight) {
        this.zeroFuelWeight = zeroFuelWeight;
    }

    /**
     * 
     * @return
     *     The maximumZFW
     */
    @JsonProperty("maximumZFW")
    public Integer getMaximumZFW() {
        return maximumZFW;
    }

    /**
     * 
     * @param maximumZFW
     *     The maximumZFW
     */
    @JsonProperty("maximumZFW")
    public void setMaximumZFW(Integer maximumZFW) {
        this.maximumZFW = maximumZFW;
    }

    /**
     * 
     * @return
     *     The maxTakeoffWeight
     */
    @JsonProperty("maxTakeoffWeight")
    public Integer getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    /**
     * 
     * @param maxTakeoffWeight
     *     The maxTakeoffWeight
     */
    @JsonProperty("maxTakeoffWeight")
    public void setMaxTakeoffWeight(Integer maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    /**
     * 
     * @return
     *     The maxLandingWeight
     */
    @JsonProperty("maxLandingWeight")
    public Integer getMaxLandingWeight() {
        return maxLandingWeight;
    }

    /**
     * 
     * @param maxLandingWeight
     *     The maxLandingWeight
     */
    @JsonProperty("maxLandingWeight")
    public void setMaxLandingWeight(Integer maxLandingWeight) {
        this.maxLandingWeight = maxLandingWeight;
    }

    /**
     * 
     * @return
     *     The maxWeights
     */
    @JsonProperty("maxWeights")
    public MaxWeights getMaxWeights() {
        return maxWeights;
    }

    /**
     * 
     * @param maxWeights
     *     The maxWeights
     */
    @JsonProperty("maxWeights")
    public void setMaxWeights(MaxWeights maxWeights) {
        this.maxWeights = maxWeights;
    }

    /**
     * 
     * @return
     *     The maxRampWeight
     */
    @JsonProperty("maxRampWeight")
    public Integer getMaxRampWeight() {
        return maxRampWeight;
    }

    /**
     * 
     * @param maxRampWeight
     *     The maxRampWeight
     */
    @JsonProperty("maxRampWeight")
    public void setMaxRampWeight(Integer maxRampWeight) {
        this.maxRampWeight = maxRampWeight;
    }

    /**
     * 
     * @return
     *     The mtowsuffix
     */
    @JsonProperty("mtowsuffix")
    public String getMtowsuffix() {
        return mtowsuffix;
    }

    /**
     * 
     * @param mtowsuffix
     *     The mtowsuffix
     */
    @JsonProperty("mtowsuffix")
    public void setMtowsuffix(String mtowsuffix) {
        this.mtowsuffix = mtowsuffix;
    }

    /**
     * 
     * @return
     *     The mldwsuffix
     */
    @JsonProperty("mldwsuffix")
    public String getMldwsuffix() {
        return mldwsuffix;
    }

    /**
     * 
     * @param mldwsuffix
     *     The mldwsuffix
     */
    @JsonProperty("mldwsuffix")
    public void setMldwsuffix(String mldwsuffix) {
        this.mldwsuffix = mldwsuffix;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payload).append(loadStatus).append(dryOperatingWeight).append(zeroFuelWeight).append(maximumZFW).append(maxTakeoffWeight).append(maxLandingWeight).append(maxWeights).append(maxRampWeight).append(mtowsuffix).append(mldwsuffix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayloadAndWeights) == false) {
            return false;
        }
        PayloadAndWeights rhs = ((PayloadAndWeights) other);
        return new EqualsBuilder().append(payload, rhs.payload).append(loadStatus, rhs.loadStatus).append(dryOperatingWeight, rhs.dryOperatingWeight).append(zeroFuelWeight, rhs.zeroFuelWeight).append(maximumZFW, rhs.maximumZFW).append(maxTakeoffWeight, rhs.maxTakeoffWeight).append(maxLandingWeight, rhs.maxLandingWeight).append(maxWeights, rhs.maxWeights).append(maxRampWeight, rhs.maxRampWeight).append(mtowsuffix, rhs.mtowsuffix).append(mldwsuffix, rhs.mldwsuffix).isEquals();
    }

}
