
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
    "latLong",
    "namedFix",
    "fixRadialDistance",
    "preFixAltitude",
    "postFixAltitude"
})
public class AltitudeFixAltitude {

    @JsonProperty("latLong")
    private LatLong latLong;
    @JsonProperty("namedFix")
    private NamedFix namedFix;
    @JsonProperty("fixRadialDistance")
    private FixRadialDistance fixRadialDistance;
    @JsonProperty("preFixAltitude")
    private String preFixAltitude;
    @JsonProperty("postFixAltitude")
    private String postFixAltitude;

    /**
     * 
     * @return
     *     The latLong
     */
    @JsonProperty("latLong")
    public LatLong getLatLong() {
        return latLong;
    }

    /**
     * 
     * @param latLong
     *     The latLong
     */
    @JsonProperty("latLong")
    public void setLatLong(LatLong latLong) {
        this.latLong = latLong;
    }

    /**
     * 
     * @return
     *     The namedFix
     */
    @JsonProperty("namedFix")
    public NamedFix getNamedFix() {
        return namedFix;
    }

    /**
     * 
     * @param namedFix
     *     The namedFix
     */
    @JsonProperty("namedFix")
    public void setNamedFix(NamedFix namedFix) {
        this.namedFix = namedFix;
    }

    /**
     * 
     * @return
     *     The fixRadialDistance
     */
    @JsonProperty("fixRadialDistance")
    public FixRadialDistance getFixRadialDistance() {
        return fixRadialDistance;
    }

    /**
     * 
     * @param fixRadialDistance
     *     The fixRadialDistance
     */
    @JsonProperty("fixRadialDistance")
    public void setFixRadialDistance(FixRadialDistance fixRadialDistance) {
        this.fixRadialDistance = fixRadialDistance;
    }

    /**
     * 
     * @return
     *     The preFixAltitude
     */
    @JsonProperty("preFixAltitude")
    public String getPreFixAltitude() {
        return preFixAltitude;
    }

    /**
     * 
     * @param preFixAltitude
     *     The preFixAltitude
     */
    @JsonProperty("preFixAltitude")
    public void setPreFixAltitude(String preFixAltitude) {
        this.preFixAltitude = preFixAltitude;
    }

    /**
     * 
     * @return
     *     The postFixAltitude
     */
    @JsonProperty("postFixAltitude")
    public String getPostFixAltitude() {
        return postFixAltitude;
    }

    /**
     * 
     * @param postFixAltitude
     *     The postFixAltitude
     */
    @JsonProperty("postFixAltitude")
    public void setPostFixAltitude(String postFixAltitude) {
        this.postFixAltitude = postFixAltitude;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(latLong).append(namedFix).append(fixRadialDistance).append(preFixAltitude).append(postFixAltitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AltitudeFixAltitude) == false) {
            return false;
        }
        AltitudeFixAltitude rhs = ((AltitudeFixAltitude) other);
        return new EqualsBuilder().append(latLong, rhs.latLong).append(namedFix, rhs.namedFix).append(fixRadialDistance, rhs.fixRadialDistance).append(preFixAltitude, rhs.preFixAltitude).append(postFixAltitude, rhs.postFixAltitude).isEquals();
    }

}
