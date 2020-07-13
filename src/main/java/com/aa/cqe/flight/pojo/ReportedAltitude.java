
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
    "requestedAltitude",
    "assignedAltitude"
})
public class ReportedAltitude {

    @JsonProperty("requestedAltitude")
    private RequestedAltitude requestedAltitude;
    @JsonProperty("assignedAltitude")
    private AssignedAltitude assignedAltitude;

    /**
     * 
     * @return
     *     The requestedAltitude
     */
    @JsonProperty("requestedAltitude")
    public RequestedAltitude getRequestedAltitude() {
        return requestedAltitude;
    }

    /**
     * 
     * @param requestedAltitude
     *     The requestedAltitude
     */
    @JsonProperty("requestedAltitude")
    public void setRequestedAltitude(RequestedAltitude requestedAltitude) {
        this.requestedAltitude = requestedAltitude;
    }

    /**
     * 
     * @return
     *     The assignedAltitude
     */
    @JsonProperty("assignedAltitude")
    public AssignedAltitude getAssignedAltitude() {
        return assignedAltitude;
    }

    /**
     * 
     * @param assignedAltitude
     *     The assignedAltitude
     */
    @JsonProperty("assignedAltitude")
    public void setAssignedAltitude(AssignedAltitude assignedAltitude) {
        this.assignedAltitude = assignedAltitude;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestedAltitude).append(assignedAltitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportedAltitude) == false) {
            return false;
        }
        ReportedAltitude rhs = ((ReportedAltitude) other);
        return new EqualsBuilder().append(requestedAltitude, rhs.requestedAltitude).append(assignedAltitude, rhs.assignedAltitude).isEquals();
    }

}
