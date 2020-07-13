
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
    "degrees",
    "minutes",
    "seconds",
    "direction"
})
public class LatitudeDMS {

    @JsonProperty("degrees")
    private Integer degrees;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("seconds")
    private Integer seconds;
    @JsonProperty("direction")
    private LatitudeDMS.Direction direction;

    /**
     * 
     * @return
     *     The degrees
     */
    @JsonProperty("degrees")
    public Integer getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The degrees
     */
    @JsonProperty("degrees")
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

    /**
     * 
     * @return
     *     The minutes
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * 
     * @param minutes
     *     The minutes
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * 
     * @return
     *     The seconds
     */
    @JsonProperty("seconds")
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * 
     * @param seconds
     *     The seconds
     */
    @JsonProperty("seconds")
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    /**
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public LatitudeDMS.Direction getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(LatitudeDMS.Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(degrees).append(minutes).append(seconds).append(direction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LatitudeDMS) == false) {
            return false;
        }
        LatitudeDMS rhs = ((LatitudeDMS) other);
        return new EqualsBuilder().append(degrees, rhs.degrees).append(minutes, rhs.minutes).append(seconds, rhs.seconds).append(direction, rhs.direction).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Direction {

        NORTH("NORTH"),
        SOUTH("SOUTH");
        private final String value;
        private final static Map<String, LatitudeDMS.Direction> CONSTANTS = new HashMap<String, LatitudeDMS.Direction>();

        static {
            for (LatitudeDMS.Direction c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Direction(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static LatitudeDMS.Direction fromValue(String value) {
            LatitudeDMS.Direction constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
