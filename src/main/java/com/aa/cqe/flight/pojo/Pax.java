
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
    "clazz",
    "local",
    "thru"
})
public class Pax {

    @JsonProperty("clazz")
    private String clazz;
    @JsonProperty("local")
    private Local__ local;
    @JsonProperty("thru")
    private Thru__ thru;

    /**
     * 
     * @return
     *     The clazz
     */
    @JsonProperty("clazz")
    public String getClazz() {
        return clazz;
    }

    /**
     * 
     * @param clazz
     *     The clazz
     */
    @JsonProperty("clazz")
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * 
     * @return
     *     The local
     */
    @JsonProperty("local")
    public Local__ getLocal() {
        return local;
    }

    /**
     * 
     * @param local
     *     The local
     */
    @JsonProperty("local")
    public void setLocal(Local__ local) {
        this.local = local;
    }

    /**
     * 
     * @return
     *     The thru
     */
    @JsonProperty("thru")
    public Thru__ getThru() {
        return thru;
    }

    /**
     * 
     * @param thru
     *     The thru
     */
    @JsonProperty("thru")
    public void setThru(Thru__ thru) {
        this.thru = thru;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clazz).append(local).append(thru).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pax) == false) {
            return false;
        }
        Pax rhs = ((Pax) other);
        return new EqualsBuilder().append(clazz, rhs.clazz).append(local, rhs.local).append(thru, rhs.thru).isEquals();
    }

}
