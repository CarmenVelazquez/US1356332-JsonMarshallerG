
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
    "seqNbr",
    "code",
    "time"
})
public class MosaicENR {

    @JsonProperty("seqNbr")
    private Integer seqNbr;
    @JsonProperty("code")
    private String code;
    @JsonProperty("time")
    private String time;

    /**
     * 
     * @return
     *     The seqNbr
     */
    @JsonProperty("seqNbr")
    public Integer getSeqNbr() {
        return seqNbr;
    }

    /**
     * 
     * @param seqNbr
     *     The seqNbr
     */
    @JsonProperty("seqNbr")
    public void setSeqNbr(Integer seqNbr) {
        this.seqNbr = seqNbr;
    }

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
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(seqNbr).append(code).append(time).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MosaicENR) == false) {
            return false;
        }
        MosaicENR rhs = ((MosaicENR) other);
        return new EqualsBuilder().append(seqNbr, rhs.seqNbr).append(code, rhs.code).append(time, rhs.time).isEquals();
    }

}
