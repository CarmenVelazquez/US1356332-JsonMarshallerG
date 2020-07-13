
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
    "source",
    "updatingEid",
    "piceid"
})
public class FltPlanSignature {

    @JsonProperty("source")
    private String source;
    @JsonProperty("updatingEid")
    private String updatingEid;
    @JsonProperty("piceid")
    private String piceid;

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The updatingEid
     */
    @JsonProperty("updatingEid")
    public String getUpdatingEid() {
        return updatingEid;
    }

    /**
     * 
     * @param updatingEid
     *     The updatingEid
     */
    @JsonProperty("updatingEid")
    public void setUpdatingEid(String updatingEid) {
        this.updatingEid = updatingEid;
    }

    /**
     * 
     * @return
     *     The piceid
     */
    @JsonProperty("piceid")
    public String getPiceid() {
        return piceid;
    }

    /**
     * 
     * @param piceid
     *     The piceid
     */
    @JsonProperty("piceid")
    public void setPiceid(String piceid) {
        this.piceid = piceid;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(updatingEid).append(piceid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FltPlanSignature) == false) {
            return false;
        }
        FltPlanSignature rhs = ((FltPlanSignature) other);
        return new EqualsBuilder().append(source, rhs.source).append(updatingEid, rhs.updatingEid).append(piceid, rhs.piceid).isEquals();
    }

}
