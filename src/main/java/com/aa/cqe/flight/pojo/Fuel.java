
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
    "planDep",
    "actualDep",
    "planOff",
    "actualOff",
    "planOn",
    "actualOn",
    "planArr",
    "actualArr",
    "weightUnit"
})
public class Fuel {

    @JsonProperty("planDep")
    private Integer planDep;
    @JsonProperty("actualDep")
    private Integer actualDep;
    @JsonProperty("planOff")
    private Integer planOff;
    @JsonProperty("actualOff")
    private Integer actualOff;
    @JsonProperty("planOn")
    private Integer planOn;
    @JsonProperty("actualOn")
    private Integer actualOn;
    @JsonProperty("planArr")
    private Integer planArr;
    @JsonProperty("actualArr")
    private Integer actualArr;
    @JsonProperty("weightUnit")
    private String weightUnit;

    /**
     * 
     * @return
     *     The planDep
     */
    @JsonProperty("planDep")
    public Integer getPlanDep() {
        return planDep;
    }

    /**
     * 
     * @param planDep
     *     The planDep
     */
    @JsonProperty("planDep")
    public void setPlanDep(Integer planDep) {
        this.planDep = planDep;
    }

    /**
     * 
     * @return
     *     The actualDep
     */
    @JsonProperty("actualDep")
    public Integer getActualDep() {
        return actualDep;
    }

    /**
     * 
     * @param actualDep
     *     The actualDep
     */
    @JsonProperty("actualDep")
    public void setActualDep(Integer actualDep) {
        this.actualDep = actualDep;
    }

    /**
     * 
     * @return
     *     The planOff
     */
    @JsonProperty("planOff")
    public Integer getPlanOff() {
        return planOff;
    }

    /**
     * 
     * @param planOff
     *     The planOff
     */
    @JsonProperty("planOff")
    public void setPlanOff(Integer planOff) {
        this.planOff = planOff;
    }

    /**
     * 
     * @return
     *     The actualOff
     */
    @JsonProperty("actualOff")
    public Integer getActualOff() {
        return actualOff;
    }

    /**
     * 
     * @param actualOff
     *     The actualOff
     */
    @JsonProperty("actualOff")
    public void setActualOff(Integer actualOff) {
        this.actualOff = actualOff;
    }

    /**
     * 
     * @return
     *     The planOn
     */
    @JsonProperty("planOn")
    public Integer getPlanOn() {
        return planOn;
    }

    /**
     * 
     * @param planOn
     *     The planOn
     */
    @JsonProperty("planOn")
    public void setPlanOn(Integer planOn) {
        this.planOn = planOn;
    }

    /**
     * 
     * @return
     *     The actualOn
     */
    @JsonProperty("actualOn")
    public Integer getActualOn() {
        return actualOn;
    }

    /**
     * 
     * @param actualOn
     *     The actualOn
     */
    @JsonProperty("actualOn")
    public void setActualOn(Integer actualOn) {
        this.actualOn = actualOn;
    }

    /**
     * 
     * @return
     *     The planArr
     */
    @JsonProperty("planArr")
    public Integer getPlanArr() {
        return planArr;
    }

    /**
     * 
     * @param planArr
     *     The planArr
     */
    @JsonProperty("planArr")
    public void setPlanArr(Integer planArr) {
        this.planArr = planArr;
    }

    /**
     * 
     * @return
     *     The actualArr
     */
    @JsonProperty("actualArr")
    public Integer getActualArr() {
        return actualArr;
    }

    /**
     * 
     * @param actualArr
     *     The actualArr
     */
    @JsonProperty("actualArr")
    public void setActualArr(Integer actualArr) {
        this.actualArr = actualArr;
    }

    /**
     * 
     * @return
     *     The weightUnit
     */
    @JsonProperty("weightUnit")
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * 
     * @param weightUnit
     *     The weightUnit
     */
    @JsonProperty("weightUnit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(planDep).append(actualDep).append(planOff).append(actualOff).append(planOn).append(actualOn).append(planArr).append(actualArr).append(weightUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fuel) == false) {
            return false;
        }
        Fuel rhs = ((Fuel) other);
        return new EqualsBuilder().append(planDep, rhs.planDep).append(actualDep, rhs.actualDep).append(planOff, rhs.planOff).append(actualOff, rhs.actualOff).append(planOn, rhs.planOn).append(actualOn, rhs.actualOn).append(planArr, rhs.planArr).append(actualArr, rhs.actualArr).append(weightUnit, rhs.weightUnit).isEquals();
    }

}
