
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.Gson;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "event",
    "version",
    "trackingID",
    "dataTime",
    "key",
    "fosPartition",
    "cycled",
    "leg",
    "bondedFuelStatus",
    "alternates",
    "crewData",
    "crewmember",
    "delayCodes",
    "connection",
    "loadPlanWeights",
    "loadPlanPaxCounts",
    "cabinCapacity",
    "fuelSlip",
    "route",
    "planRoute",
    "fltPlanSignature",
    "trackInformation",
    "miscData",
    "cargoItems",
    "source",
    "LUSInd"
})
public class Flight {

    @JsonProperty("event")
    private String event;
    @JsonProperty("version")
    private String version;
    @JsonProperty("trackingID")
    private String trackingID;
    @JsonProperty("dataTime")
    private DataTime dataTime;
    @JsonProperty("key")
    private Key key;
    @JsonProperty("fosPartition")
    private Flight.FosPartition fosPartition;
    @JsonProperty("cycled")
    private Boolean cycled;
    @JsonProperty("leg")
    private Leg leg;
    @JsonProperty("bondedFuelStatus")
    private Boolean bondedFuelStatus;
    @JsonProperty("alternates")
    private Alternates alternates;
    @JsonProperty("crewData")
    private CrewData crewData;
    @JsonProperty("crewmember")
    private List<Crewmember> crewmember = new ArrayList<Crewmember>();
    @JsonProperty("delayCodes")
    private DelayCodes delayCodes;
    @JsonProperty("connection")
    private List<Connection> connection = new ArrayList<Connection>();
    @JsonProperty("loadPlanWeights")
    private LoadPlanWeights loadPlanWeights;
    @JsonProperty("loadPlanPaxCounts")
    private LoadPlanPaxCounts loadPlanPaxCounts;
    @JsonProperty("cabinCapacity")
    private CabinCapacity cabinCapacity;
    @JsonProperty("fuelSlip")
    private FuelSlip fuelSlip;
    @JsonProperty("route")
    private List<Route> route = new ArrayList<Route>();
    @JsonProperty("planRoute")
    private List<PlanRoute> planRoute = new ArrayList<PlanRoute>();
    @JsonProperty("fltPlanSignature")
    private FltPlanSignature fltPlanSignature;
    @JsonProperty("trackInformation")
    private TrackInformation trackInformation;
    @JsonProperty("miscData")
    private MiscData miscData;
    @JsonProperty("cargoItems")
    private CargoItems cargoItems;
    @JsonProperty("source")
    private String source;
    @JsonProperty("LUSInd")
    private String lUSInd;

    /**
     * 
     * @return
     *     The event
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * 
     * @param event
     *     The event
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The trackingID
     */
    @JsonProperty("trackingID")
    public String getTrackingID() {
        return trackingID;
    }

    /**
     * 
     * @param trackingID
     *     The trackingID
     */
    @JsonProperty("trackingID")
    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    /**
     * 
     * @return
     *     The dataTime
     */
    @JsonProperty("dataTime")
    public DataTime getDataTime() {
        return dataTime;
    }

    /**
     * 
     * @param dataTime
     *     The dataTime
     */
    @JsonProperty("dataTime")
    public void setDataTime(DataTime dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public Key getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The fosPartition
     */
    @JsonProperty("fosPartition")
    public Flight.FosPartition getFosPartition() {
        return fosPartition;
    }

    /**
     * 
     * @param fosPartition
     *     The fosPartition
     */
    @JsonProperty("fosPartition")
    public void setFosPartition(Flight.FosPartition fosPartition) {
        this.fosPartition = fosPartition;
    }

    /**
     * 
     * @return
     *     The cycled
     */
    @JsonProperty("cycled")
    public Boolean getCycled() {
        return cycled;
    }

    /**
     * 
     * @param cycled
     *     The cycled
     */
    @JsonProperty("cycled")
    public void setCycled(Boolean cycled) {
        this.cycled = cycled;
    }

    /**
     * 
     * @return
     *     The leg
     */
    @JsonProperty("leg")
    public Leg getLeg() {
        return leg;
    }

    /**
     * 
     * @param leg
     *     The leg
     */
    @JsonProperty("leg")
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    /**
     * 
     * @return
     *     The bondedFuelStatus
     */
    @JsonProperty("bondedFuelStatus")
    public Boolean getBondedFuelStatus() {
        return bondedFuelStatus;
    }

    /**
     * 
     * @param bondedFuelStatus
     *     The bondedFuelStatus
     */
    @JsonProperty("bondedFuelStatus")
    public void setBondedFuelStatus(Boolean bondedFuelStatus) {
        this.bondedFuelStatus = bondedFuelStatus;
    }

    /**
     * 
     * @return
     *     The alternates
     */
    @JsonProperty("alternates")
    public Alternates getAlternates() {
        return alternates;
    }

    /**
     * 
     * @param alternates
     *     The alternates
     */
    @JsonProperty("alternates")
    public void setAlternates(Alternates alternates) {
        this.alternates = alternates;
    }

    /**
     * 
     * @return
     *     The crewData
     */
    @JsonProperty("crewData")
    public CrewData getCrewData() {
        return crewData;
    }

    /**
     * 
     * @param crewData
     *     The crewData
     */
    @JsonProperty("crewData")
    public void setCrewData(CrewData crewData) {
        this.crewData = crewData;
    }

    /**
     * 
     * @return
     *     The crewmember
     */
    @JsonProperty("crewmember")
    public List<Crewmember> getCrewmember() {
        return crewmember;
    }

    /**
     * 
     * @param crewmember
     *     The crewmember
     */
    @JsonProperty("crewmember")
    public void setCrewmember(List<Crewmember> crewmember) {
        this.crewmember = crewmember;
    }

    /**
     * 
     * @return
     *     The delayCodes
     */
    @JsonProperty("delayCodes")
    public DelayCodes getDelayCodes() {
        return delayCodes;
    }

    /**
     * 
     * @param delayCodes
     *     The delayCodes
     */
    @JsonProperty("delayCodes")
    public void setDelayCodes(DelayCodes delayCodes) {
        this.delayCodes = delayCodes;
    }

    /**
     * 
     * @return
     *     The connection
     */
    @JsonProperty("connection")
    public List<Connection> getConnection() {
        return connection;
    }

    /**
     * 
     * @param connection
     *     The connection
     */
    @JsonProperty("connection")
    public void setConnection(List<Connection> connection) {
        this.connection = connection;
    }

    /**
     * 
     * @return
     *     The loadPlanWeights
     */
    @JsonProperty("loadPlanWeights")
    public LoadPlanWeights getLoadPlanWeights() {
        return loadPlanWeights;
    }

    /**
     * 
     * @param loadPlanWeights
     *     The loadPlanWeights
     */
    @JsonProperty("loadPlanWeights")
    public void setLoadPlanWeights(LoadPlanWeights loadPlanWeights) {
        this.loadPlanWeights = loadPlanWeights;
    }

    /**
     * 
     * @return
     *     The loadPlanPaxCounts
     */
    @JsonProperty("loadPlanPaxCounts")
    public LoadPlanPaxCounts getLoadPlanPaxCounts() {
        return loadPlanPaxCounts;
    }

    /**
     * 
     * @param loadPlanPaxCounts
     *     The loadPlanPaxCounts
     */
    @JsonProperty("loadPlanPaxCounts")
    public void setLoadPlanPaxCounts(LoadPlanPaxCounts loadPlanPaxCounts) {
        this.loadPlanPaxCounts = loadPlanPaxCounts;
    }

    /**
     * 
     * @return
     *     The cabinCapacity
     */
    @JsonProperty("cabinCapacity")
    public CabinCapacity getCabinCapacity() {
        return cabinCapacity;
    }

    /**
     * 
     * @param cabinCapacity
     *     The cabinCapacity
     */
    @JsonProperty("cabinCapacity")
    public void setCabinCapacity(CabinCapacity cabinCapacity) {
        this.cabinCapacity = cabinCapacity;
    }

    /**
     * 
     * @return
     *     The fuelSlip
     */
    @JsonProperty("fuelSlip")
    public FuelSlip getFuelSlip() {
        return fuelSlip;
    }

    /**
     * 
     * @param fuelSlip
     *     The fuelSlip
     */
    @JsonProperty("fuelSlip")
    public void setFuelSlip(FuelSlip fuelSlip) {
        this.fuelSlip = fuelSlip;
    }

    /**
     * 
     * @return
     *     The route
     */
    @JsonProperty("route")
    public List<Route> getRoute() {
        return route;
    }

    /**
     * 
     * @param route
     *     The route
     */
    @JsonProperty("route")
    public void setRoute(List<Route> route) {
        this.route = route;
    }

    /**
     * 
     * @return
     *     The planRoute
     */
    @JsonProperty("planRoute")
    public List<PlanRoute> getPlanRoute() {
        return planRoute;
    }

    /**
     * 
     * @param planRoute
     *     The planRoute
     */
    @JsonProperty("planRoute")
    public void setPlanRoute(List<PlanRoute> planRoute) {
        this.planRoute = planRoute;
    }

    /**
     * 
     * @return
     *     The fltPlanSignature
     */
    @JsonProperty("fltPlanSignature")
    public FltPlanSignature getFltPlanSignature() {
        return fltPlanSignature;
    }

    /**
     * 
     * @param fltPlanSignature
     *     The fltPlanSignature
     */
    @JsonProperty("fltPlanSignature")
    public void setFltPlanSignature(FltPlanSignature fltPlanSignature) {
        this.fltPlanSignature = fltPlanSignature;
    }

    /**
     * 
     * @return
     *     The trackInformation
     */
    @JsonProperty("trackInformation")
    public TrackInformation getTrackInformation() {
        return trackInformation;
    }

    /**
     * 
     * @param trackInformation
     *     The trackInformation
     */
    @JsonProperty("trackInformation")
    public void setTrackInformation(TrackInformation trackInformation) {
        this.trackInformation = trackInformation;
    }

    /**
     * 
     * @return
     *     The miscData
     */
    @JsonProperty("miscData")
    public MiscData getMiscData() {
        return miscData;
    }

    /**
     * 
     * @param miscData
     *     The miscData
     */
    @JsonProperty("miscData")
    public void setMiscData(MiscData miscData) {
        this.miscData = miscData;
    }

    /**
     * 
     * @return
     *     The cargoItems
     */
    @JsonProperty("cargoItems")
    public CargoItems getCargoItems() {
        return cargoItems;
    }

    /**
     * 
     * @param cargoItems
     *     The cargoItems
     */
    @JsonProperty("cargoItems")
    public void setCargoItems(CargoItems cargoItems) {
        this.cargoItems = cargoItems;
    }

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The lUSInd
     */
    @JsonProperty("LUSInd")
    public String getLUSInd() {
        return lUSInd;
    }

    /**
     * 
     * @param lUSInd
     *     The LUSInd
     */
    @JsonProperty("LUSInd")
    public void setLUSInd(String lUSInd) {
        this.lUSInd = lUSInd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(event).append(version).append(trackingID).append(dataTime).append(key).append(fosPartition).append(cycled).append(leg).append(bondedFuelStatus).append(alternates).append(crewData).append(crewmember).append(delayCodes).append(connection).append(loadPlanWeights).append(loadPlanPaxCounts).append(cabinCapacity).append(fuelSlip).append(route).append(planRoute).append(fltPlanSignature).append(trackInformation).append(miscData).append(cargoItems).append(source).append(lUSInd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flight) == false) {
            return false;
        }
        Flight rhs = ((Flight) other);
        return new EqualsBuilder().append(event, rhs.event).append(version, rhs.version).append(trackingID, rhs.trackingID).append(dataTime, rhs.dataTime).append(key, rhs.key).append(fosPartition, rhs.fosPartition).append(cycled, rhs.cycled).append(leg, rhs.leg).append(bondedFuelStatus, rhs.bondedFuelStatus).append(alternates, rhs.alternates).append(crewData, rhs.crewData).append(crewmember, rhs.crewmember).append(delayCodes, rhs.delayCodes).append(connection, rhs.connection).append(loadPlanWeights, rhs.loadPlanWeights).append(loadPlanPaxCounts, rhs.loadPlanPaxCounts).append(cabinCapacity, rhs.cabinCapacity).append(fuelSlip, rhs.fuelSlip).append(route, rhs.route).append(planRoute, rhs.planRoute).append(fltPlanSignature, rhs.fltPlanSignature).append(trackInformation, rhs.trackInformation).append(miscData, rhs.miscData).append(cargoItems, rhs.cargoItems).append(source, rhs.source).append(lUSInd, rhs.lUSInd).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum FosPartition {

        AA("AA"),
        MQ("MQ"),
        NA("NA"),
        TE("TE"),
        US("US"),
        XS("XS"),
        Y_6("Y_6"),
        Y_8("Y_8");
        private final String value;
        private final static Map<String, Flight.FosPartition> CONSTANTS = new HashMap<String, Flight.FosPartition>();

        static {
            for (Flight.FosPartition c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FosPartition(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Flight.FosPartition fromValue(String value) {
            Flight.FosPartition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }
   
    
}
