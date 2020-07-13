
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
    "fosTimeStamp",
    "sourceTimeStamp",
    "fltHubTimeStamp"
})
public class DataTime {

    @JsonProperty("fosTimeStamp")
    private String fosTimeStamp;
    @JsonProperty("sourceTimeStamp")
    private String sourceTimeStamp;
    @JsonProperty("fltHubTimeStamp")
    private String fltHubTimeStamp;

    /**
     * 
     * @return
     *     The fosTimeStamp
     */
    @JsonProperty("fosTimeStamp")
    public String getFosTimeStamp() {
        return fosTimeStamp;
    }

    /**
     * 
     * @param fosTimeStamp
     *     The fosTimeStamp
     */
    @JsonProperty("fosTimeStamp")
    public void setFosTimeStamp(String fosTimeStamp) {
        this.fosTimeStamp = fosTimeStamp;
    }

    /**
     * 
     * @return
     *     The sourceTimeStamp
     */
    @JsonProperty("sourceTimeStamp")
    public String getSourceTimeStamp() {
        return sourceTimeStamp;
    }

    /**
     * 
     * @param sourceTimeStamp
     *     The sourceTimeStamp
     */
    @JsonProperty("sourceTimeStamp")
    public void setSourceTimeStamp(String sourceTimeStamp) {
        this.sourceTimeStamp = sourceTimeStamp;
    }

    /**
     * 
     * @return
     *     The fltHubTimeStamp
     */
    @JsonProperty("fltHubTimeStamp")
    public String getFltHubTimeStamp() {
        return fltHubTimeStamp;
    }

    /**
     * 
     * @param fltHubTimeStamp
     *     The fltHubTimeStamp
     */
    @JsonProperty("fltHubTimeStamp")
    public void setFltHubTimeStamp(String fltHubTimeStamp) {
        this.fltHubTimeStamp = fltHubTimeStamp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fosTimeStamp).append(sourceTimeStamp).append(fltHubTimeStamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataTime) == false) {
            return false;
        }
        DataTime rhs = ((DataTime) other);
        return new EqualsBuilder().append(fosTimeStamp, rhs.fosTimeStamp).append(sourceTimeStamp, rhs.sourceTimeStamp).append(fltHubTimeStamp, rhs.fltHubTimeStamp).isEquals();
    }

}
