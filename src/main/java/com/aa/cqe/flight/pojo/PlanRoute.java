
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
    "num",
    "letter",
    "attributes",
    "segs",
    "ATCText",
    "remarks"
})
public class PlanRoute {

    @JsonProperty("num")
    private String num;
    @JsonProperty("letter")
    private String letter;
    @JsonProperty("attributes")
    private Attributes_ attributes;
    @JsonProperty("segs")
    private Segs segs;
    @JsonProperty("ATCText")
    private ATCText aTCText;
    @JsonProperty("remarks")
    private Remarks remarks;

    /**
     * 
     * @return
     *     The num
     */
    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    /**
     * 
     * @param num
     *     The num
     */
    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 
     * @return
     *     The letter
     */
    @JsonProperty("letter")
    public String getLetter() {
        return letter;
    }

    /**
     * 
     * @param letter
     *     The letter
     */
    @JsonProperty("letter")
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Attributes_ getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Attributes_ attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The segs
     */
    @JsonProperty("segs")
    public Segs getSegs() {
        return segs;
    }

    /**
     * 
     * @param segs
     *     The segs
     */
    @JsonProperty("segs")
    public void setSegs(Segs segs) {
        this.segs = segs;
    }

    /**
     * 
     * @return
     *     The aTCText
     */
    @JsonProperty("ATCText")
    public ATCText getATCText() {
        return aTCText;
    }

    /**
     * 
     * @param aTCText
     *     The ATCText
     */
    @JsonProperty("ATCText")
    public void setATCText(ATCText aTCText) {
        this.aTCText = aTCText;
    }

    /**
     * 
     * @return
     *     The remarks
     */
    @JsonProperty("remarks")
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks
     *     The remarks
     */
    @JsonProperty("remarks")
    public void setRemarks(Remarks remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(num).append(letter).append(attributes).append(segs).append(aTCText).append(remarks).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanRoute) == false) {
            return false;
        }
        PlanRoute rhs = ((PlanRoute) other);
        return new EqualsBuilder().append(num, rhs.num).append(letter, rhs.letter).append(attributes, rhs.attributes).append(segs, rhs.segs).append(aTCText, rhs.aTCText).append(remarks, rhs.remarks).isEquals();
    }

}
