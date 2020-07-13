
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
    "hiLowRte",
    "lowLevelRte",
    "faaPrefRte",
    "reclearRte",
    "nationalRteProgram",
    "internationalRte",
    "fuelFerry",
    "supplementalRte",
    "shortSegRte",
    "codedDepartureRte",
    "overWaterAircraftRequired",
    "highAltitudeRte",
    "omegaAircraftRequired",
    "pointToPoint",
    "restrictSuper80",
    "fmcTextAvailable",
    "eraTextAvailable",
    "possibleATCTextError",
    "playbookRte"
})
public class RouteIndicators {

    @JsonProperty("hiLowRte")
    private Boolean hiLowRte;
    @JsonProperty("lowLevelRte")
    private Boolean lowLevelRte;
    @JsonProperty("faaPrefRte")
    private Boolean faaPrefRte;
    @JsonProperty("reclearRte")
    private String reclearRte;
    @JsonProperty("nationalRteProgram")
    private Boolean nationalRteProgram;
    @JsonProperty("internationalRte")
    private Boolean internationalRte;
    @JsonProperty("fuelFerry")
    private Boolean fuelFerry;
    @JsonProperty("supplementalRte")
    private Boolean supplementalRte;
    @JsonProperty("shortSegRte")
    private Boolean shortSegRte;
    @JsonProperty("codedDepartureRte")
    private Boolean codedDepartureRte;
    @JsonProperty("overWaterAircraftRequired")
    private Boolean overWaterAircraftRequired;
    @JsonProperty("highAltitudeRte")
    private Boolean highAltitudeRte;
    @JsonProperty("omegaAircraftRequired")
    private Boolean omegaAircraftRequired;
    @JsonProperty("pointToPoint")
    private Boolean pointToPoint;
    @JsonProperty("restrictSuper80")
    private Boolean restrictSuper80;
    @JsonProperty("fmcTextAvailable")
    private Boolean fmcTextAvailable;
    @JsonProperty("eraTextAvailable")
    private Boolean eraTextAvailable;
    @JsonProperty("possibleATCTextError")
    private Boolean possibleATCTextError;
    @JsonProperty("playbookRte")
    private Boolean playbookRte;

    /**
     * 
     * @return
     *     The hiLowRte
     */
    @JsonProperty("hiLowRte")
    public Boolean getHiLowRte() {
        return hiLowRte;
    }

    /**
     * 
     * @param hiLowRte
     *     The hiLowRte
     */
    @JsonProperty("hiLowRte")
    public void setHiLowRte(Boolean hiLowRte) {
        this.hiLowRte = hiLowRte;
    }

    /**
     * 
     * @return
     *     The lowLevelRte
     */
    @JsonProperty("lowLevelRte")
    public Boolean getLowLevelRte() {
        return lowLevelRte;
    }

    /**
     * 
     * @param lowLevelRte
     *     The lowLevelRte
     */
    @JsonProperty("lowLevelRte")
    public void setLowLevelRte(Boolean lowLevelRte) {
        this.lowLevelRte = lowLevelRte;
    }

    /**
     * 
     * @return
     *     The faaPrefRte
     */
    @JsonProperty("faaPrefRte")
    public Boolean getFaaPrefRte() {
        return faaPrefRte;
    }

    /**
     * 
     * @param faaPrefRte
     *     The faaPrefRte
     */
    @JsonProperty("faaPrefRte")
    public void setFaaPrefRte(Boolean faaPrefRte) {
        this.faaPrefRte = faaPrefRte;
    }

    /**
     * 
     * @return
     *     The reclearRte
     */
    @JsonProperty("reclearRte")
    public String getReclearRte() {
        return reclearRte;
    }

    /**
     * 
     * @param reclearRte
     *     The reclearRte
     */
    @JsonProperty("reclearRte")
    public void setReclearRte(String reclearRte) {
        this.reclearRte = reclearRte;
    }

    /**
     * 
     * @return
     *     The nationalRteProgram
     */
    @JsonProperty("nationalRteProgram")
    public Boolean getNationalRteProgram() {
        return nationalRteProgram;
    }

    /**
     * 
     * @param nationalRteProgram
     *     The nationalRteProgram
     */
    @JsonProperty("nationalRteProgram")
    public void setNationalRteProgram(Boolean nationalRteProgram) {
        this.nationalRteProgram = nationalRteProgram;
    }

    /**
     * 
     * @return
     *     The internationalRte
     */
    @JsonProperty("internationalRte")
    public Boolean getInternationalRte() {
        return internationalRte;
    }

    /**
     * 
     * @param internationalRte
     *     The internationalRte
     */
    @JsonProperty("internationalRte")
    public void setInternationalRte(Boolean internationalRte) {
        this.internationalRte = internationalRte;
    }

    /**
     * 
     * @return
     *     The fuelFerry
     */
    @JsonProperty("fuelFerry")
    public Boolean getFuelFerry() {
        return fuelFerry;
    }

    /**
     * 
     * @param fuelFerry
     *     The fuelFerry
     */
    @JsonProperty("fuelFerry")
    public void setFuelFerry(Boolean fuelFerry) {
        this.fuelFerry = fuelFerry;
    }

    /**
     * 
     * @return
     *     The supplementalRte
     */
    @JsonProperty("supplementalRte")
    public Boolean getSupplementalRte() {
        return supplementalRte;
    }

    /**
     * 
     * @param supplementalRte
     *     The supplementalRte
     */
    @JsonProperty("supplementalRte")
    public void setSupplementalRte(Boolean supplementalRte) {
        this.supplementalRte = supplementalRte;
    }

    /**
     * 
     * @return
     *     The shortSegRte
     */
    @JsonProperty("shortSegRte")
    public Boolean getShortSegRte() {
        return shortSegRte;
    }

    /**
     * 
     * @param shortSegRte
     *     The shortSegRte
     */
    @JsonProperty("shortSegRte")
    public void setShortSegRte(Boolean shortSegRte) {
        this.shortSegRte = shortSegRte;
    }

    /**
     * 
     * @return
     *     The codedDepartureRte
     */
    @JsonProperty("codedDepartureRte")
    public Boolean getCodedDepartureRte() {
        return codedDepartureRte;
    }

    /**
     * 
     * @param codedDepartureRte
     *     The codedDepartureRte
     */
    @JsonProperty("codedDepartureRte")
    public void setCodedDepartureRte(Boolean codedDepartureRte) {
        this.codedDepartureRte = codedDepartureRte;
    }

    /**
     * 
     * @return
     *     The overWaterAircraftRequired
     */
    @JsonProperty("overWaterAircraftRequired")
    public Boolean getOverWaterAircraftRequired() {
        return overWaterAircraftRequired;
    }

    /**
     * 
     * @param overWaterAircraftRequired
     *     The overWaterAircraftRequired
     */
    @JsonProperty("overWaterAircraftRequired")
    public void setOverWaterAircraftRequired(Boolean overWaterAircraftRequired) {
        this.overWaterAircraftRequired = overWaterAircraftRequired;
    }

    /**
     * 
     * @return
     *     The highAltitudeRte
     */
    @JsonProperty("highAltitudeRte")
    public Boolean getHighAltitudeRte() {
        return highAltitudeRte;
    }

    /**
     * 
     * @param highAltitudeRte
     *     The highAltitudeRte
     */
    @JsonProperty("highAltitudeRte")
    public void setHighAltitudeRte(Boolean highAltitudeRte) {
        this.highAltitudeRte = highAltitudeRte;
    }

    /**
     * 
     * @return
     *     The omegaAircraftRequired
     */
    @JsonProperty("omegaAircraftRequired")
    public Boolean getOmegaAircraftRequired() {
        return omegaAircraftRequired;
    }

    /**
     * 
     * @param omegaAircraftRequired
     *     The omegaAircraftRequired
     */
    @JsonProperty("omegaAircraftRequired")
    public void setOmegaAircraftRequired(Boolean omegaAircraftRequired) {
        this.omegaAircraftRequired = omegaAircraftRequired;
    }

    /**
     * 
     * @return
     *     The pointToPoint
     */
    @JsonProperty("pointToPoint")
    public Boolean getPointToPoint() {
        return pointToPoint;
    }

    /**
     * 
     * @param pointToPoint
     *     The pointToPoint
     */
    @JsonProperty("pointToPoint")
    public void setPointToPoint(Boolean pointToPoint) {
        this.pointToPoint = pointToPoint;
    }

    /**
     * 
     * @return
     *     The restrictSuper80
     */
    @JsonProperty("restrictSuper80")
    public Boolean getRestrictSuper80() {
        return restrictSuper80;
    }

    /**
     * 
     * @param restrictSuper80
     *     The restrictSuper80
     */
    @JsonProperty("restrictSuper80")
    public void setRestrictSuper80(Boolean restrictSuper80) {
        this.restrictSuper80 = restrictSuper80;
    }

    /**
     * 
     * @return
     *     The fmcTextAvailable
     */
    @JsonProperty("fmcTextAvailable")
    public Boolean getFmcTextAvailable() {
        return fmcTextAvailable;
    }

    /**
     * 
     * @param fmcTextAvailable
     *     The fmcTextAvailable
     */
    @JsonProperty("fmcTextAvailable")
    public void setFmcTextAvailable(Boolean fmcTextAvailable) {
        this.fmcTextAvailable = fmcTextAvailable;
    }

    /**
     * 
     * @return
     *     The eraTextAvailable
     */
    @JsonProperty("eraTextAvailable")
    public Boolean getEraTextAvailable() {
        return eraTextAvailable;
    }

    /**
     * 
     * @param eraTextAvailable
     *     The eraTextAvailable
     */
    @JsonProperty("eraTextAvailable")
    public void setEraTextAvailable(Boolean eraTextAvailable) {
        this.eraTextAvailable = eraTextAvailable;
    }

    /**
     * 
     * @return
     *     The possibleATCTextError
     */
    @JsonProperty("possibleATCTextError")
    public Boolean getPossibleATCTextError() {
        return possibleATCTextError;
    }

    /**
     * 
     * @param possibleATCTextError
     *     The possibleATCTextError
     */
    @JsonProperty("possibleATCTextError")
    public void setPossibleATCTextError(Boolean possibleATCTextError) {
        this.possibleATCTextError = possibleATCTextError;
    }

    /**
     * 
     * @return
     *     The playbookRte
     */
    @JsonProperty("playbookRte")
    public Boolean getPlaybookRte() {
        return playbookRte;
    }

    /**
     * 
     * @param playbookRte
     *     The playbookRte
     */
    @JsonProperty("playbookRte")
    public void setPlaybookRte(Boolean playbookRte) {
        this.playbookRte = playbookRte;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hiLowRte).append(lowLevelRte).append(faaPrefRte).append(reclearRte).append(nationalRteProgram).append(internationalRte).append(fuelFerry).append(supplementalRte).append(shortSegRte).append(codedDepartureRte).append(overWaterAircraftRequired).append(highAltitudeRte).append(omegaAircraftRequired).append(pointToPoint).append(restrictSuper80).append(fmcTextAvailable).append(eraTextAvailable).append(possibleATCTextError).append(playbookRte).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteIndicators) == false) {
            return false;
        }
        RouteIndicators rhs = ((RouteIndicators) other);
        return new EqualsBuilder().append(hiLowRte, rhs.hiLowRte).append(lowLevelRte, rhs.lowLevelRte).append(faaPrefRte, rhs.faaPrefRte).append(reclearRte, rhs.reclearRte).append(nationalRteProgram, rhs.nationalRteProgram).append(internationalRte, rhs.internationalRte).append(fuelFerry, rhs.fuelFerry).append(supplementalRte, rhs.supplementalRte).append(shortSegRte, rhs.shortSegRte).append(codedDepartureRte, rhs.codedDepartureRte).append(overWaterAircraftRequired, rhs.overWaterAircraftRequired).append(highAltitudeRte, rhs.highAltitudeRte).append(omegaAircraftRequired, rhs.omegaAircraftRequired).append(pointToPoint, rhs.pointToPoint).append(restrictSuper80, rhs.restrictSuper80).append(fmcTextAvailable, rhs.fmcTextAvailable).append(eraTextAvailable, rhs.eraTextAvailable).append(possibleATCTextError, rhs.possibleATCTextError).append(playbookRte, rhs.playbookRte).isEquals();
    }

}
