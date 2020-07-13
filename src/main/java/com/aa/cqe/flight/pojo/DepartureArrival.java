
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
    "depGate",
    "depTerminal",
    "depTerminalDesc",
    "depParkSpace",
    "depConcourse",
    "arrGate",
    "arrTerminal",
    "arrTerminalDesc",
    "arrParkSpace",
    "arrConcourse",
    "bagClaim"
})
public class DepartureArrival {

    @JsonProperty("depGate")
    private String depGate;
    @JsonProperty("depTerminal")
    private String depTerminal;
    @JsonProperty("depTerminalDesc")
    private String depTerminalDesc;
    @JsonProperty("depParkSpace")
    private String depParkSpace;
    @JsonProperty("depConcourse")
    private String depConcourse;
    @JsonProperty("arrGate")
    private String arrGate;
    @JsonProperty("arrTerminal")
    private String arrTerminal;
    @JsonProperty("arrTerminalDesc")
    private String arrTerminalDesc;
    @JsonProperty("arrParkSpace")
    private String arrParkSpace;
    @JsonProperty("arrConcourse")
    private String arrConcourse;
    @JsonProperty("bagClaim")
    private String bagClaim;

    /**
     * 
     * @return
     *     The depGate
     */
    @JsonProperty("depGate")
    public String getDepGate() {
        return depGate;
    }

    /**
     * 
     * @param depGate
     *     The depGate
     */
    @JsonProperty("depGate")
    public void setDepGate(String depGate) {
        this.depGate = depGate;
    }

    /**
     * 
     * @return
     *     The depTerminal
     */
    @JsonProperty("depTerminal")
    public String getDepTerminal() {
        return depTerminal;
    }

    /**
     * 
     * @param depTerminal
     *     The depTerminal
     */
    @JsonProperty("depTerminal")
    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    /**
     * 
     * @return
     *     The depTerminalDesc
     */
    @JsonProperty("depTerminalDesc")
    public String getDepTerminalDesc() {
        return depTerminalDesc;
    }

    /**
     * 
     * @param depTerminalDesc
     *     The depTerminalDesc
     */
    @JsonProperty("depTerminalDesc")
    public void setDepTerminalDesc(String depTerminalDesc) {
        this.depTerminalDesc = depTerminalDesc;
    }

    /**
     * 
     * @return
     *     The depParkSpace
     */
    @JsonProperty("depParkSpace")
    public String getDepParkSpace() {
        return depParkSpace;
    }

    /**
     * 
     * @param depParkSpace
     *     The depParkSpace
     */
    @JsonProperty("depParkSpace")
    public void setDepParkSpace(String depParkSpace) {
        this.depParkSpace = depParkSpace;
    }

    /**
     * 
     * @return
     *     The depConcourse
     */
    @JsonProperty("depConcourse")
    public String getDepConcourse() {
        return depConcourse;
    }

    /**
     * 
     * @param depConcourse
     *     The depConcourse
     */
    @JsonProperty("depConcourse")
    public void setDepConcourse(String depConcourse) {
        this.depConcourse = depConcourse;
    }

    /**
     * 
     * @return
     *     The arrGate
     */
    @JsonProperty("arrGate")
    public String getArrGate() {
        return arrGate;
    }

    /**
     * 
     * @param arrGate
     *     The arrGate
     */
    @JsonProperty("arrGate")
    public void setArrGate(String arrGate) {
        this.arrGate = arrGate;
    }

    /**
     * 
     * @return
     *     The arrTerminal
     */
    @JsonProperty("arrTerminal")
    public String getArrTerminal() {
        return arrTerminal;
    }

    /**
     * 
     * @param arrTerminal
     *     The arrTerminal
     */
    @JsonProperty("arrTerminal")
    public void setArrTerminal(String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }

    /**
     * 
     * @return
     *     The arrTerminalDesc
     */
    @JsonProperty("arrTerminalDesc")
    public String getArrTerminalDesc() {
        return arrTerminalDesc;
    }

    /**
     * 
     * @param arrTerminalDesc
     *     The arrTerminalDesc
     */
    @JsonProperty("arrTerminalDesc")
    public void setArrTerminalDesc(String arrTerminalDesc) {
        this.arrTerminalDesc = arrTerminalDesc;
    }

    /**
     * 
     * @return
     *     The arrParkSpace
     */
    @JsonProperty("arrParkSpace")
    public String getArrParkSpace() {
        return arrParkSpace;
    }

    /**
     * 
     * @param arrParkSpace
     *     The arrParkSpace
     */
    @JsonProperty("arrParkSpace")
    public void setArrParkSpace(String arrParkSpace) {
        this.arrParkSpace = arrParkSpace;
    }

    /**
     * 
     * @return
     *     The arrConcourse
     */
    @JsonProperty("arrConcourse")
    public String getArrConcourse() {
        return arrConcourse;
    }

    /**
     * 
     * @param arrConcourse
     *     The arrConcourse
     */
    @JsonProperty("arrConcourse")
    public void setArrConcourse(String arrConcourse) {
        this.arrConcourse = arrConcourse;
    }

    /**
     * 
     * @return
     *     The bagClaim
     */
    @JsonProperty("bagClaim")
    public String getBagClaim() {
        return bagClaim;
    }

    /**
     * 
     * @param bagClaim
     *     The bagClaim
     */
    @JsonProperty("bagClaim")
    public void setBagClaim(String bagClaim) {
        this.bagClaim = bagClaim;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(depGate).append(depTerminal).append(depTerminalDesc).append(depParkSpace).append(depConcourse).append(arrGate).append(arrTerminal).append(arrTerminalDesc).append(arrParkSpace).append(arrConcourse).append(bagClaim).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartureArrival) == false) {
            return false;
        }
        DepartureArrival rhs = ((DepartureArrival) other);
        return new EqualsBuilder().append(depGate, rhs.depGate).append(depTerminal, rhs.depTerminal).append(depTerminalDesc, rhs.depTerminalDesc).append(depParkSpace, rhs.depParkSpace).append(depConcourse, rhs.depConcourse).append(arrGate, rhs.arrGate).append(arrTerminal, rhs.arrTerminal).append(arrTerminalDesc, rhs.arrTerminalDesc).append(arrParkSpace, rhs.arrParkSpace).append(arrConcourse, rhs.arrConcourse).append(bagClaim, rhs.bagClaim).isEquals();
    }

}
