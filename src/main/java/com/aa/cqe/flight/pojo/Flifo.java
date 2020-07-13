
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
    "info",
    "flifocode"
})
public class Flifo {

    @JsonProperty("info")
    private List<Info> info = new ArrayList<Info>();
    @JsonProperty("flifocode")
    private String flifocode;

    /**
     * 
     * @return
     *     The info
     */
    @JsonProperty("info")
    public List<Info> getInfo() {
        return info;
    }

    /**
     * 
     * @param info
     *     The info
     */
    @JsonProperty("info")
    public void setInfo(List<Info> info) {
        this.info = info;
    }

    /**
     * 
     * @return
     *     The flifocode
     */
    @JsonProperty("flifocode")
    public String getFlifocode() {
        return flifocode;
    }

    /**
     * 
     * @param flifocode
     *     The flifocode
     */
    @JsonProperty("flifocode")
    public void setFlifocode(String flifocode) {
        this.flifocode = flifocode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(info).append(flifocode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flifo) == false) {
            return false;
        }
        Flifo rhs = ((Flifo) other);
        return new EqualsBuilder().append(info, rhs.info).append(flifocode, rhs.flifocode).isEquals();
    }

}
