
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
    "secondDownlineSta",
    "thirdDownlineSta",
    "nextLegFltNum",
    "nextLegOrgDate",
    "nextLegFltDupCode",
    "priorLegFltNum",
    "priorLegOrgDate",
    "priorLegFltDupCode"
})
public class Linkage {

    @JsonProperty("secondDownlineSta")
    private String secondDownlineSta;
    @JsonProperty("thirdDownlineSta")
    private String thirdDownlineSta;
    @JsonProperty("nextLegFltNum")
    private String nextLegFltNum;
    @JsonProperty("nextLegOrgDate")
    private String nextLegOrgDate;
    @JsonProperty("nextLegFltDupCode")
    private String nextLegFltDupCode;
    @JsonProperty("priorLegFltNum")
    private String priorLegFltNum;
    @JsonProperty("priorLegOrgDate")
    private String priorLegOrgDate;
    @JsonProperty("priorLegFltDupCode")
    private String priorLegFltDupCode;

    /**
     * 
     * @return
     *     The secondDownlineSta
     */
    @JsonProperty("secondDownlineSta")
    public String getSecondDownlineSta() {
        return secondDownlineSta;
    }

    /**
     * 
     * @param secondDownlineSta
     *     The secondDownlineSta
     */
    @JsonProperty("secondDownlineSta")
    public void setSecondDownlineSta(String secondDownlineSta) {
        this.secondDownlineSta = secondDownlineSta;
    }

    /**
     * 
     * @return
     *     The thirdDownlineSta
     */
    @JsonProperty("thirdDownlineSta")
    public String getThirdDownlineSta() {
        return thirdDownlineSta;
    }

    /**
     * 
     * @param thirdDownlineSta
     *     The thirdDownlineSta
     */
    @JsonProperty("thirdDownlineSta")
    public void setThirdDownlineSta(String thirdDownlineSta) {
        this.thirdDownlineSta = thirdDownlineSta;
    }

    /**
     * 
     * @return
     *     The nextLegFltNum
     */
    @JsonProperty("nextLegFltNum")
    public String getNextLegFltNum() {
        return nextLegFltNum;
    }

    /**
     * 
     * @param nextLegFltNum
     *     The nextLegFltNum
     */
    @JsonProperty("nextLegFltNum")
    public void setNextLegFltNum(String nextLegFltNum) {
        this.nextLegFltNum = nextLegFltNum;
    }

    /**
     * 
     * @return
     *     The nextLegOrgDate
     */
    @JsonProperty("nextLegOrgDate")
    public String getNextLegOrgDate() {
        return nextLegOrgDate;
    }

    /**
     * 
     * @param nextLegOrgDate
     *     The nextLegOrgDate
     */
    @JsonProperty("nextLegOrgDate")
    public void setNextLegOrgDate(String nextLegOrgDate) {
        this.nextLegOrgDate = nextLegOrgDate;
    }

    /**
     * 
     * @return
     *     The nextLegFltDupCode
     */
    @JsonProperty("nextLegFltDupCode")
    public String getNextLegFltDupCode() {
        return nextLegFltDupCode;
    }

    /**
     * 
     * @param nextLegFltDupCode
     *     The nextLegFltDupCode
     */
    @JsonProperty("nextLegFltDupCode")
    public void setNextLegFltDupCode(String nextLegFltDupCode) {
        this.nextLegFltDupCode = nextLegFltDupCode;
    }

    /**
     * 
     * @return
     *     The priorLegFltNum
     */
    @JsonProperty("priorLegFltNum")
    public String getPriorLegFltNum() {
        return priorLegFltNum;
    }

    /**
     * 
     * @param priorLegFltNum
     *     The priorLegFltNum
     */
    @JsonProperty("priorLegFltNum")
    public void setPriorLegFltNum(String priorLegFltNum) {
        this.priorLegFltNum = priorLegFltNum;
    }

    /**
     * 
     * @return
     *     The priorLegOrgDate
     */
    @JsonProperty("priorLegOrgDate")
    public String getPriorLegOrgDate() {
        return priorLegOrgDate;
    }

    /**
     * 
     * @param priorLegOrgDate
     *     The priorLegOrgDate
     */
    @JsonProperty("priorLegOrgDate")
    public void setPriorLegOrgDate(String priorLegOrgDate) {
        this.priorLegOrgDate = priorLegOrgDate;
    }

    /**
     * 
     * @return
     *     The priorLegFltDupCode
     */
    @JsonProperty("priorLegFltDupCode")
    public String getPriorLegFltDupCode() {
        return priorLegFltDupCode;
    }

    /**
     * 
     * @param priorLegFltDupCode
     *     The priorLegFltDupCode
     */
    @JsonProperty("priorLegFltDupCode")
    public void setPriorLegFltDupCode(String priorLegFltDupCode) {
        this.priorLegFltDupCode = priorLegFltDupCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secondDownlineSta).append(thirdDownlineSta).append(nextLegFltNum).append(nextLegOrgDate).append(nextLegFltDupCode).append(priorLegFltNum).append(priorLegOrgDate).append(priorLegFltDupCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Linkage) == false) {
            return false;
        }
        Linkage rhs = ((Linkage) other);
        return new EqualsBuilder().append(secondDownlineSta, rhs.secondDownlineSta).append(thirdDownlineSta, rhs.thirdDownlineSta).append(nextLegFltNum, rhs.nextLegFltNum).append(nextLegOrgDate, rhs.nextLegOrgDate).append(nextLegFltDupCode, rhs.nextLegFltDupCode).append(priorLegFltNum, rhs.priorLegFltNum).append(priorLegOrgDate, rhs.priorLegOrgDate).append(priorLegFltDupCode, rhs.priorLegFltDupCode).isEquals();
    }

}
