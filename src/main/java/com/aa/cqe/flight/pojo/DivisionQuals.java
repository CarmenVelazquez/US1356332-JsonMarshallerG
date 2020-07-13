
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
    "division"
})
public class DivisionQuals {

    @JsonProperty("division")
    private List<String> division = new ArrayList<String>();

    /**
     * 
     * @return
     *     The division
     */
    @JsonProperty("division")
    public List<String> getDivision() {
        return division;
    }

    /**
     * 
     * @param division
     *     The division
     */
    @JsonProperty("division")
    public void setDivision(List<String> division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(division).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DivisionQuals) == false) {
            return false;
        }
        DivisionQuals rhs = ((DivisionQuals) other);
        return new EqualsBuilder().append(division, rhs.division).isEquals();
    }

}
