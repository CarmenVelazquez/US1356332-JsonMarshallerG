
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
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
    "segCount",
    "seg"
})
public class Segs {

    @JsonProperty("segCount")
    private Integer segCount;
    @JsonProperty("seg")
    private List<Seg> seg = new ArrayList<Seg>();

    /**
     * 
     * @return
     *     The segCount
     */
    @JsonProperty("segCount")
    public Integer getSegCount() {
        return segCount;
    }

    /**
     * 
     * @param segCount
     *     The segCount
     */
    @JsonProperty("segCount")
    public void setSegCount(Integer segCount) {
        this.segCount = segCount;
    }

    /**
     * 
     * @return
     *     The seg
     */
    @JsonProperty("seg")
    public List<Seg> getSeg() {
        return seg;
    }

    /**
     * 
     * @param seg
     *     The seg
     */
    @JsonProperty("seg")
    public void setSeg(List<Seg> seg) {
        this.seg = seg;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(segCount).append(seg).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segs) == false) {
            return false;
        }
        Segs rhs = ((Segs) other);
        return new EqualsBuilder().append(segCount, rhs.segCount).append(seg, rhs.seg).isEquals();
    }

}
