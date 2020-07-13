
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
    "catCode",
    "mbrresInds"
})
public class Type_ {

    @JsonProperty("catCode")
    private String catCode;
    @JsonProperty("mbrresInds")
    private String mbrresInds;

    /**
     * 
     * @return
     *     The catCode
     */
    @JsonProperty("catCode")
    public String getCatCode() {
        return catCode;
    }

    /**
     * 
     * @param catCode
     *     The catCode
     */
    @JsonProperty("catCode")
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    /**
     * 
     * @return
     *     The mbrresInds
     */
    @JsonProperty("mbrresInds")
    public String getMbrresInds() {
        return mbrresInds;
    }

    /**
     * 
     * @param mbrresInds
     *     The mbrresInds
     */
    @JsonProperty("mbrresInds")
    public void setMbrresInds(String mbrresInds) {
        this.mbrresInds = mbrresInds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(catCode).append(mbrresInds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type_) == false) {
            return false;
        }
        Type_ rhs = ((Type_) other);
        return new EqualsBuilder().append(catCode, rhs.catCode).append(mbrresInds, rhs.mbrresInds).isEquals();
    }

}
