
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
    "dispDesk",
    "dispPhone",
    "dispName",
    "loadPlanner",
    "loadPlannerPhone",
    "loadPlannerName"
})
public class Planners {

    @JsonProperty("dispDesk")
    private String dispDesk;
    @JsonProperty("dispPhone")
    private String dispPhone;
    @JsonProperty("dispName")
    private String dispName;
    @JsonProperty("loadPlanner")
    private String loadPlanner;
    @JsonProperty("loadPlannerPhone")
    private String loadPlannerPhone;
    @JsonProperty("loadPlannerName")
    private String loadPlannerName;

    /**
     * 
     * @return
     *     The dispDesk
     */
    @JsonProperty("dispDesk")
    public String getDispDesk() {
        return dispDesk;
    }

    /**
     * 
     * @param dispDesk
     *     The dispDesk
     */
    @JsonProperty("dispDesk")
    public void setDispDesk(String dispDesk) {
        this.dispDesk = dispDesk;
    }

    /**
     * 
     * @return
     *     The dispPhone
     */
    @JsonProperty("dispPhone")
    public String getDispPhone() {
        return dispPhone;
    }

    /**
     * 
     * @param dispPhone
     *     The dispPhone
     */
    @JsonProperty("dispPhone")
    public void setDispPhone(String dispPhone) {
        this.dispPhone = dispPhone;
    }

    /**
     * 
     * @return
     *     The dispName
     */
    @JsonProperty("dispName")
    public String getDispName() {
        return dispName;
    }

    /**
     * 
     * @param dispName
     *     The dispName
     */
    @JsonProperty("dispName")
    public void setDispName(String dispName) {
        this.dispName = dispName;
    }

    /**
     * 
     * @return
     *     The loadPlanner
     */
    @JsonProperty("loadPlanner")
    public String getLoadPlanner() {
        return loadPlanner;
    }

    /**
     * 
     * @param loadPlanner
     *     The loadPlanner
     */
    @JsonProperty("loadPlanner")
    public void setLoadPlanner(String loadPlanner) {
        this.loadPlanner = loadPlanner;
    }

    /**
     * 
     * @return
     *     The loadPlannerPhone
     */
    @JsonProperty("loadPlannerPhone")
    public String getLoadPlannerPhone() {
        return loadPlannerPhone;
    }

    /**
     * 
     * @param loadPlannerPhone
     *     The loadPlannerPhone
     */
    @JsonProperty("loadPlannerPhone")
    public void setLoadPlannerPhone(String loadPlannerPhone) {
        this.loadPlannerPhone = loadPlannerPhone;
    }

    /**
     * 
     * @return
     *     The loadPlannerName
     */
    @JsonProperty("loadPlannerName")
    public String getLoadPlannerName() {
        return loadPlannerName;
    }

    /**
     * 
     * @param loadPlannerName
     *     The loadPlannerName
     */
    @JsonProperty("loadPlannerName")
    public void setLoadPlannerName(String loadPlannerName) {
        this.loadPlannerName = loadPlannerName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dispDesk).append(dispPhone).append(dispName).append(loadPlanner).append(loadPlannerPhone).append(loadPlannerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Planners) == false) {
            return false;
        }
        Planners rhs = ((Planners) other);
        return new EqualsBuilder().append(dispDesk, rhs.dispDesk).append(dispPhone, rhs.dispPhone).append(dispName, rhs.dispName).append(loadPlanner, rhs.loadPlanner).append(loadPlannerPhone, rhs.loadPlannerPhone).append(loadPlannerName, rhs.loadPlannerName).isEquals();
    }

}
