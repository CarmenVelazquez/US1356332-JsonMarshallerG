
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
    "priority",
    "selectedInd",
    "length",
    "windDistance",
    "indBits1",
    "indBits2",
    "indBits3",
    "routeIndicators",
    "routeInput"
})
public class Attributes {

    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("selectedInd")
    private Boolean selectedInd;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("windDistance")
    private Integer windDistance;
    @JsonProperty("indBits1")
    private String indBits1;
    @JsonProperty("indBits2")
    private String indBits2;
    @JsonProperty("indBits3")
    private String indBits3;
    @JsonProperty("routeIndicators")
    private RouteIndicators routeIndicators;
    @JsonProperty("routeInput")
    private Boolean routeInput;

    /**
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The selectedInd
     */
    @JsonProperty("selectedInd")
    public Boolean getSelectedInd() {
        return selectedInd;
    }

    /**
     * 
     * @param selectedInd
     *     The selectedInd
     */
    @JsonProperty("selectedInd")
    public void setSelectedInd(Boolean selectedInd) {
        this.selectedInd = selectedInd;
    }

    /**
     * 
     * @return
     *     The length
     */
    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 
     * @return
     *     The windDistance
     */
    @JsonProperty("windDistance")
    public Integer getWindDistance() {
        return windDistance;
    }

    /**
     * 
     * @param windDistance
     *     The windDistance
     */
    @JsonProperty("windDistance")
    public void setWindDistance(Integer windDistance) {
        this.windDistance = windDistance;
    }

    /**
     * 
     * @return
     *     The indBits1
     */
    @JsonProperty("indBits1")
    public String getIndBits1() {
        return indBits1;
    }

    /**
     * 
     * @param indBits1
     *     The indBits1
     */
    @JsonProperty("indBits1")
    public void setIndBits1(String indBits1) {
        this.indBits1 = indBits1;
    }

    /**
     * 
     * @return
     *     The indBits2
     */
    @JsonProperty("indBits2")
    public String getIndBits2() {
        return indBits2;
    }

    /**
     * 
     * @param indBits2
     *     The indBits2
     */
    @JsonProperty("indBits2")
    public void setIndBits2(String indBits2) {
        this.indBits2 = indBits2;
    }

    /**
     * 
     * @return
     *     The indBits3
     */
    @JsonProperty("indBits3")
    public String getIndBits3() {
        return indBits3;
    }

    /**
     * 
     * @param indBits3
     *     The indBits3
     */
    @JsonProperty("indBits3")
    public void setIndBits3(String indBits3) {
        this.indBits3 = indBits3;
    }

    /**
     * 
     * @return
     *     The routeIndicators
     */
    @JsonProperty("routeIndicators")
    public RouteIndicators getRouteIndicators() {
        return routeIndicators;
    }

    /**
     * 
     * @param routeIndicators
     *     The routeIndicators
     */
    @JsonProperty("routeIndicators")
    public void setRouteIndicators(RouteIndicators routeIndicators) {
        this.routeIndicators = routeIndicators;
    }

    /**
     * 
     * @return
     *     The routeInput
     */
    @JsonProperty("routeInput")
    public Boolean getRouteInput() {
        return routeInput;
    }

    /**
     * 
     * @param routeInput
     *     The routeInput
     */
    @JsonProperty("routeInput")
    public void setRouteInput(Boolean routeInput) {
        this.routeInput = routeInput;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(priority).append(selectedInd).append(length).append(windDistance).append(indBits1).append(indBits2).append(indBits3).append(routeIndicators).append(routeInput).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(priority, rhs.priority).append(selectedInd, rhs.selectedInd).append(length, rhs.length).append(windDistance, rhs.windDistance).append(indBits1, rhs.indBits1).append(indBits2, rhs.indBits2).append(indBits3, rhs.indBits3).append(routeIndicators, rhs.routeIndicators).append(routeInput, rhs.routeInput).isEquals();
    }

}
