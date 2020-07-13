
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
    "tpsEquipCode",
    "primaryRunway",
    "primaryFlap",
    "headWind",
    "temperature",
    "qnhPressure",
    "thrustRating",
    "antiIce",
    "wtRestricted"
})
public class Performance {

    @JsonProperty("tpsEquipCode")
    private String tpsEquipCode;
    @JsonProperty("primaryRunway")
    private String primaryRunway;
    @JsonProperty("primaryFlap")
    private String primaryFlap;
    @JsonProperty("headWind")
    private String headWind;
    @JsonProperty("temperature")
    private String temperature;
    @JsonProperty("qnhPressure")
    private String qnhPressure;
    @JsonProperty("thrustRating")
    private String thrustRating;
    @JsonProperty("antiIce")
    private Boolean antiIce;
    @JsonProperty("wtRestricted")
    private Boolean wtRestricted;

    /**
     * 
     * @return
     *     The tpsEquipCode
     */
    @JsonProperty("tpsEquipCode")
    public String getTpsEquipCode() {
        return tpsEquipCode;
    }

    /**
     * 
     * @param tpsEquipCode
     *     The tpsEquipCode
     */
    @JsonProperty("tpsEquipCode")
    public void setTpsEquipCode(String tpsEquipCode) {
        this.tpsEquipCode = tpsEquipCode;
    }

    /**
     * 
     * @return
     *     The primaryRunway
     */
    @JsonProperty("primaryRunway")
    public String getPrimaryRunway() {
        return primaryRunway;
    }

    /**
     * 
     * @param primaryRunway
     *     The primaryRunway
     */
    @JsonProperty("primaryRunway")
    public void setPrimaryRunway(String primaryRunway) {
        this.primaryRunway = primaryRunway;
    }

    /**
     * 
     * @return
     *     The primaryFlap
     */
    @JsonProperty("primaryFlap")
    public String getPrimaryFlap() {
        return primaryFlap;
    }

    /**
     * 
     * @param primaryFlap
     *     The primaryFlap
     */
    @JsonProperty("primaryFlap")
    public void setPrimaryFlap(String primaryFlap) {
        this.primaryFlap = primaryFlap;
    }

    /**
     * 
     * @return
     *     The headWind
     */
    @JsonProperty("headWind")
    public String getHeadWind() {
        return headWind;
    }

    /**
     * 
     * @param headWind
     *     The headWind
     */
    @JsonProperty("headWind")
    public void setHeadWind(String headWind) {
        this.headWind = headWind;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    @JsonProperty("temperature")
    public String getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    @JsonProperty("temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The qnhPressure
     */
    @JsonProperty("qnhPressure")
    public String getQnhPressure() {
        return qnhPressure;
    }

    /**
     * 
     * @param qnhPressure
     *     The qnhPressure
     */
    @JsonProperty("qnhPressure")
    public void setQnhPressure(String qnhPressure) {
        this.qnhPressure = qnhPressure;
    }

    /**
     * 
     * @return
     *     The thrustRating
     */
    @JsonProperty("thrustRating")
    public String getThrustRating() {
        return thrustRating;
    }

    /**
     * 
     * @param thrustRating
     *     The thrustRating
     */
    @JsonProperty("thrustRating")
    public void setThrustRating(String thrustRating) {
        this.thrustRating = thrustRating;
    }

    /**
     * 
     * @return
     *     The antiIce
     */
    @JsonProperty("antiIce")
    public Boolean getAntiIce() {
        return antiIce;
    }

    /**
     * 
     * @param antiIce
     *     The antiIce
     */
    @JsonProperty("antiIce")
    public void setAntiIce(Boolean antiIce) {
        this.antiIce = antiIce;
    }

    /**
     * 
     * @return
     *     The wtRestricted
     */
    @JsonProperty("wtRestricted")
    public Boolean getWtRestricted() {
        return wtRestricted;
    }

    /**
     * 
     * @param wtRestricted
     *     The wtRestricted
     */
    @JsonProperty("wtRestricted")
    public void setWtRestricted(Boolean wtRestricted) {
        this.wtRestricted = wtRestricted;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tpsEquipCode).append(primaryRunway).append(primaryFlap).append(headWind).append(temperature).append(qnhPressure).append(thrustRating).append(antiIce).append(wtRestricted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Performance) == false) {
            return false;
        }
        Performance rhs = ((Performance) other);
        return new EqualsBuilder().append(tpsEquipCode, rhs.tpsEquipCode).append(primaryRunway, rhs.primaryRunway).append(primaryFlap, rhs.primaryFlap).append(headWind, rhs.headWind).append(temperature, rhs.temperature).append(qnhPressure, rhs.qnhPressure).append(thrustRating, rhs.thrustRating).append(antiIce, rhs.antiIce).append(wtRestricted, rhs.wtRestricted).isEquals();
    }

}
