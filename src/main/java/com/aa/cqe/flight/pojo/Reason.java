
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
    "code",
    "information",
    "maintIssue"
})
public class Reason {

    @JsonProperty("code")
    private String code;
    @JsonProperty("information")
    private String information;
    @JsonProperty("maintIssue")
    private String maintIssue;

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The information
     */
    @JsonProperty("information")
    public String getInformation() {
        return information;
    }

    /**
     * 
     * @param information
     *     The information
     */
    @JsonProperty("information")
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * 
     * @return
     *     The maintIssue
     */
    @JsonProperty("maintIssue")
    public String getMaintIssue() {
        return maintIssue;
    }

    /**
     * 
     * @param maintIssue
     *     The maintIssue
     */
    @JsonProperty("maintIssue")
    public void setMaintIssue(String maintIssue) {
        this.maintIssue = maintIssue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(information).append(maintIssue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reason) == false) {
            return false;
        }
        Reason rhs = ((Reason) other);
        return new EqualsBuilder().append(code, rhs.code).append(information, rhs.information).append(maintIssue, rhs.maintIssue).isEquals();
    }

}
