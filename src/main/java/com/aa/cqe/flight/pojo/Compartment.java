
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
    "compartmentId",
    "local",
    "thru"
})
public class Compartment {

    @JsonProperty("compartmentId")
    private String compartmentId;
    @JsonProperty("local")
    private Local_ local;
    @JsonProperty("thru")
    private Thru_ thru;

    /**
     * 
     * @return
     *     The compartmentId
     */
    @JsonProperty("compartmentId")
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * 
     * @param compartmentId
     *     The compartmentId
     */
    @JsonProperty("compartmentId")
    public void setCompartmentId(String compartmentId) {
        this.compartmentId = compartmentId;
    }

    /**
     * 
     * @return
     *     The local
     */
    @JsonProperty("local")
    public Local_ getLocal() {
        return local;
    }

    /**
     * 
     * @param local
     *     The local
     */
    @JsonProperty("local")
    public void setLocal(Local_ local) {
        this.local = local;
    }

    /**
     * 
     * @return
     *     The thru
     */
    @JsonProperty("thru")
    public Thru_ getThru() {
        return thru;
    }

    /**
     * 
     * @param thru
     *     The thru
     */
    @JsonProperty("thru")
    public void setThru(Thru_ thru) {
        this.thru = thru;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(compartmentId).append(local).append(thru).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Compartment) == false) {
            return false;
        }
        Compartment rhs = ((Compartment) other);
        return new EqualsBuilder().append(compartmentId, rhs.compartmentId).append(local, rhs.local).append(thru, rhs.thru).isEquals();
    }

}
