
package com.aa.cqe.ccs.pojo;

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
@JsonPropertyOrder({
    "divisionQuals"
})

public class DivisionQuals {

    @JsonProperty("divisionQuals")
    private List<String> divisionQuals = new ArrayList<String>();
    /**
     * 
     * @return
     *     The division
     */
    @JsonProperty("divisionQuals")
    public List<String> getDivision() {
        return divisionQuals;
    }

    /**
     * 
     * @param division
     *     The division
     */
    @JsonProperty("divisionQuals")
    public void setDivision(List<String> division) {
        this.divisionQuals = division;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((divisionQuals == null) ? 0 : divisionQuals.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DivisionQuals other = (DivisionQuals) obj;
		if (divisionQuals == null) {
			if (other.divisionQuals != null)
				return false;
		} else if (!divisionQuals.equals(other.divisionQuals))
			return false;
		return true;
	}

    

}
