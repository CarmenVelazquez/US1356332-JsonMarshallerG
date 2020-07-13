
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
    "segmentCount",
    "segment"
})
public class Segments {

    @JsonProperty("segmentCount")
    private Integer segmentCount;
    @JsonProperty("segment")
    private List<Segment> segment = new ArrayList<Segment>();

    /**
     * 
     * @return
     *     The segmentCount
     */
    @JsonProperty("segmentCount")
    public Integer getSegmentCount() {
        return segmentCount;
    }

    /**
     * 
     * @param segmentCount
     *     The segmentCount
     */
    @JsonProperty("segmentCount")
    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    /**
     * 
     * @return
     *     The segment
     */
    @JsonProperty("segment")
    public List<Segment> getSegment() {
        return segment;
    }

    /**
     * 
     * @param segment
     *     The segment
     */
    @JsonProperty("segment")
    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(segmentCount).append(segment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segments) == false) {
            return false;
        }
        Segments rhs = ((Segments) other);
        return new EqualsBuilder().append(segmentCount, rhs.segmentCount).append(segment, rhs.segment).isEquals();
    }

}
