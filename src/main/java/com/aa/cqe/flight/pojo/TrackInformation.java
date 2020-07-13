
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
    "sourceFacility",
    "computerID",
    "sourceTimeStamp",
    "latitude",
    "longitude",
    "reportedAltitude",
    "speed"
})
public class TrackInformation {

    @JsonProperty("sourceFacility")
    private String sourceFacility;
    @JsonProperty("computerID")
    private ComputerID computerID;
    @JsonProperty("sourceTimeStamp")
    private String sourceTimeStamp;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("reportedAltitude")
    private ReportedAltitude reportedAltitude;
    @JsonProperty("speed")
    private Integer speed;

    /**
     * 
     * @return
     *     The sourceFacility
     */
    @JsonProperty("sourceFacility")
    public String getSourceFacility() {
        return sourceFacility;
    }

    /**
     * 
     * @param sourceFacility
     *     The sourceFacility
     */
    @JsonProperty("sourceFacility")
    public void setSourceFacility(String sourceFacility) {
        this.sourceFacility = sourceFacility;
    }

    /**
     * 
     * @return
     *     The computerID
     */
    @JsonProperty("computerID")
    public ComputerID getComputerID() {
        return computerID;
    }

    /**
     * 
     * @param computerID
     *     The computerID
     */
    @JsonProperty("computerID")
    public void setComputerID(ComputerID computerID) {
        this.computerID = computerID;
    }

    /**
     * 
     * @return
     *     The sourceTimeStamp
     */
    @JsonProperty("sourceTimeStamp")
    public String getSourceTimeStamp() {
        return sourceTimeStamp;
    }

    /**
     * 
     * @param sourceTimeStamp
     *     The sourceTimeStamp
     */
    @JsonProperty("sourceTimeStamp")
    public void setSourceTimeStamp(String sourceTimeStamp) {
        this.sourceTimeStamp = sourceTimeStamp;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The reportedAltitude
     */
    @JsonProperty("reportedAltitude")
    public ReportedAltitude getReportedAltitude() {
        return reportedAltitude;
    }

    /**
     * 
     * @param reportedAltitude
     *     The reportedAltitude
     */
    @JsonProperty("reportedAltitude")
    public void setReportedAltitude(ReportedAltitude reportedAltitude) {
        this.reportedAltitude = reportedAltitude;
    }

    /**
     * 
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public Integer getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceFacility).append(computerID).append(sourceTimeStamp).append(latitude).append(longitude).append(reportedAltitude).append(speed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrackInformation) == false) {
            return false;
        }
        TrackInformation rhs = ((TrackInformation) other);
        return new EqualsBuilder().append(sourceFacility, rhs.sourceFacility).append(computerID, rhs.computerID).append(sourceTimeStamp, rhs.sourceTimeStamp).append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(reportedAltitude, rhs.reportedAltitude).append(speed, rhs.speed).isEquals();
    }

}
