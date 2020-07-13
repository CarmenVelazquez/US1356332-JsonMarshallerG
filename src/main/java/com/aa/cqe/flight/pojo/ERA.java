
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
    "sta"
})
public class ERA {

    @JsonProperty("sta")
    private List<String> sta = new ArrayList<String>();

    /**
     * 
     * @return
     *     The sta
     */
    @JsonProperty("sta")
    public List<String> getSta() {
        return sta;
    }

    /**
     * 
     * @param sta
     *     The sta
     */
    @JsonProperty("sta")
    public void setSta(List<String> sta) {
        this.sta = sta;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ERA) == false) {
            return false;
        }
        ERA rhs = ((ERA) other);
        return new EqualsBuilder().append(sta, rhs.sta).isEquals();
    }

}
