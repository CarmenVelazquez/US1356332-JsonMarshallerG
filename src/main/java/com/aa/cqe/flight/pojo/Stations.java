
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
    "arr",
    "dupArrStaNum",
    "originalSkdDep",
    "originalArr"
})
public class Stations {

    @JsonProperty("arr")
    private String arr;
    @JsonProperty("dupArrStaNum")
    private String dupArrStaNum;
    @JsonProperty("originalSkdDep")
    private String originalSkdDep;
    @JsonProperty("originalArr")
    private String originalArr;

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
     *     The dupArrStaNum
     */
    @JsonProperty("dupArrStaNum")
    public String getDupArrStaNum() {
        return dupArrStaNum;
    }

    /**
     * 
     * @param dupArrStaNum
     *     The dupArrStaNum
     */
    @JsonProperty("dupArrStaNum")
    public void setDupArrStaNum(String dupArrStaNum) {
        this.dupArrStaNum = dupArrStaNum;
    }

    /**
     * 
     * @return
     *     The originalSkdDep
     */
    @JsonProperty("originalSkdDep")
    public String getOriginalSkdDep() {
        return originalSkdDep;
    }

    /**
     * 
     * @param originalSkdDep
     *     The originalSkdDep
     */
    @JsonProperty("originalSkdDep")
    public void setOriginalSkdDep(String originalSkdDep) {
        this.originalSkdDep = originalSkdDep;
    }

    /**
     * 
     * @return
     *     The originalArr
     */
    @JsonProperty("originalArr")
    public String getOriginalArr() {
        return originalArr;
    }

    /**
     * 
     * @param originalArr
     *     The originalArr
     */
    @JsonProperty("originalArr")
    public void setOriginalArr(String originalArr) {
        this.originalArr = originalArr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arr).append(dupArrStaNum).append(originalSkdDep).append(originalArr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stations) == false) {
            return false;
        }
        Stations rhs = ((Stations) other);
        return new EqualsBuilder().append(arr, rhs.arr).append(dupArrStaNum, rhs.dupArrStaNum).append(originalSkdDep, rhs.originalSkdDep).append(originalArr, rhs.originalArr).isEquals();
    }

}
