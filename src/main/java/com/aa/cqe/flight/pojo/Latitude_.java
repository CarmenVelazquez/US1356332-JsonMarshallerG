
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
    "latitudeDMS",
    "latitudeDecimal",
    "latitudeRadians"
})
public class Latitude_ {

    @JsonProperty("latitudeDMS")
    private LatitudeDMS latitudeDMS;
    @JsonProperty("latitudeDecimal")
    private Double latitudeDecimal;
    @JsonProperty("latitudeRadians")
    private Double latitudeRadians;

    /**
     * 
     * @return
     *     The latitudeDMS
     */
    @JsonProperty("latitudeDMS")
    public LatitudeDMS getLatitudeDMS() {
        return latitudeDMS;
    }

    /**
     * 
     * @param latitudeDMS
     *     The latitudeDMS
     */
    @JsonProperty("latitudeDMS")
    public void setLatitudeDMS(LatitudeDMS latitudeDMS) {
        this.latitudeDMS = latitudeDMS;
    }

    /**
     * 
     * @return
     *     The latitudeDecimal
     */
    @JsonProperty("latitudeDecimal")
    public Double getLatitudeDecimal() {
        return latitudeDecimal;
    }

    /**
     * 
     * @param latitudeDecimal
     *     The latitudeDecimal
     */
    @JsonProperty("latitudeDecimal")
    public void setLatitudeDecimal(Double latitudeDecimal) {
        this.latitudeDecimal = latitudeDecimal;
    }

    /**
     * 
     * @return
     *     The latitudeRadians
     */
    @JsonProperty("latitudeRadians")
    public Double getLatitudeRadians() {
        return latitudeRadians;
    }

    /**
     * 
     * @param latitudeRadians
     *     The latitudeRadians
     */
    @JsonProperty("latitudeRadians")
    public void setLatitudeRadians(Double latitudeRadians) {
        this.latitudeRadians = latitudeRadians;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(latitudeDMS).append(latitudeDecimal).append(latitudeRadians).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Latitude_) == false) {
            return false;
        }
        Latitude_ rhs = ((Latitude_) other);
        return new EqualsBuilder().append(latitudeDMS, rhs.latitudeDMS).append(latitudeDecimal, rhs.latitudeDecimal).append(latitudeRadians, rhs.latitudeRadians).isEquals();
    }

}
