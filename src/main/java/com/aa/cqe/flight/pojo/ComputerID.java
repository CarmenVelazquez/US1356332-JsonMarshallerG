
package com.aa.cqe.flight.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "facilityIdentifier",
    "computerSystemId",
    "idNumber"
})
public class ComputerID {

    @JsonProperty("facilityIdentifier")
    private String facilityIdentifier;
    @JsonProperty("computerSystemId")
    private ComputerID.ComputerSystemId computerSystemId;
    @JsonProperty("idNumber")
    private String idNumber;

    /**
     * 
     * @return
     *     The facilityIdentifier
     */
    @JsonProperty("facilityIdentifier")
    public String getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * 
     * @param facilityIdentifier
     *     The facilityIdentifier
     */
    @JsonProperty("facilityIdentifier")
    public void setFacilityIdentifier(String facilityIdentifier) {
        this.facilityIdentifier = facilityIdentifier;
    }

    /**
     * 
     * @return
     *     The computerSystemId
     */
    @JsonProperty("computerSystemId")
    public ComputerID.ComputerSystemId getComputerSystemId() {
        return computerSystemId;
    }

    /**
     * 
     * @param computerSystemId
     *     The computerSystemId
     */
    @JsonProperty("computerSystemId")
    public void setComputerSystemId(ComputerID.ComputerSystemId computerSystemId) {
        this.computerSystemId = computerSystemId;
    }

    /**
     * 
     * @return
     *     The idNumber
     */
    @JsonProperty("idNumber")
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 
     * @param idNumber
     *     The idNumber
     */
    @JsonProperty("idNumber")
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(facilityIdentifier).append(computerSystemId).append(idNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputerID) == false) {
            return false;
        }
        ComputerID rhs = ((ComputerID) other);
        return new EqualsBuilder().append(facilityIdentifier, rhs.facilityIdentifier).append(computerSystemId, rhs.computerSystemId).append(idNumber, rhs.idNumber).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum ComputerSystemId {

        TFMS("TFMS"),
        HCS("HCS"),
        CTAS("CTAS"),
        ETMS("ETMS"),
        ERAM("ERAM"),
        ODAPS("ODAPS"),
        OTHER("OTHER");
        private final String value;
        private final static Map<String, ComputerID.ComputerSystemId> CONSTANTS = new HashMap<String, ComputerID.ComputerSystemId>();

        static {
            for (ComputerID.ComputerSystemId c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ComputerSystemId(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ComputerID.ComputerSystemId fromValue(String value) {
            ComputerID.ComputerSystemId constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
