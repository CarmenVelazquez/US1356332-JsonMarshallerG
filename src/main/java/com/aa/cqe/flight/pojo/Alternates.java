
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
    "TOA",
    "dest1",
    "dest2",
    "ERA"
})
public class Alternates {

    @JsonProperty("TOA")
    private String tOA;
    @JsonProperty("dest1")
    private String dest1;
    @JsonProperty("dest2")
    private String dest2;
    @JsonProperty("ERA")
    private ERA eRA;

    /**
     * 
     * @return
     *     The tOA
     */
    @JsonProperty("TOA")
    public String getTOA() {
        return tOA;
    }

    /**
     * 
     * @param tOA
     *     The TOA
     */
    @JsonProperty("TOA")
    public void setTOA(String tOA) {
        this.tOA = tOA;
    }

    /**
     * 
     * @return
     *     The dest1
     */
    @JsonProperty("dest1")
    public String getDest1() {
        return dest1;
    }

    /**
     * 
     * @param dest1
     *     The dest1
     */
    @JsonProperty("dest1")
    public void setDest1(String dest1) {
        this.dest1 = dest1;
    }

    /**
     * 
     * @return
     *     The dest2
     */
    @JsonProperty("dest2")
    public String getDest2() {
        return dest2;
    }

    /**
     * 
     * @param dest2
     *     The dest2
     */
    @JsonProperty("dest2")
    public void setDest2(String dest2) {
        this.dest2 = dest2;
    }

    /**
     * 
     * @return
     *     The eRA
     */
    @JsonProperty("ERA")
    public ERA getERA() {
        return eRA;
    }

    /**
     * 
     * @param eRA
     *     The ERA
     */
    @JsonProperty("ERA")
    public void setERA(ERA eRA) {
        this.eRA = eRA;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tOA).append(dest1).append(dest2).append(eRA).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alternates) == false) {
            return false;
        }
        Alternates rhs = ((Alternates) other);
        return new EqualsBuilder().append(tOA, rhs.tOA).append(dest1, rhs.dest1).append(dest2, rhs.dest2).append(eRA, rhs.eRA).isEquals();
    }

}
