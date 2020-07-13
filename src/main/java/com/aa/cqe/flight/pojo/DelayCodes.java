
package com.aa.cqe.flight.pojo;

import java.util.ArrayList;
import java.util.List;
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
    "local",
    "thru",
    "acars",
    "mosaicDEP",
    "mosaicENR"
})
public class DelayCodes {

    @JsonProperty("local")
    private List<Local> local = new ArrayList<Local>();
    @JsonProperty("thru")
    private List<Thru> thru = new ArrayList<Thru>();
    @JsonProperty("acars")
    private List<Acar> acars = new ArrayList<Acar>();
    @JsonProperty("mosaicDEP")
    private List<MosaicDEP> mosaicDEP = new ArrayList<MosaicDEP>();
    @JsonProperty("mosaicENR")
    private List<MosaicENR> mosaicENR = new ArrayList<MosaicENR>();

    /**
     * 
     * @return
     *     The local
     */
    @JsonProperty("local")
    public List<Local> getLocal() {
        return local;
    }

    /**
     * 
     * @param local
     *     The local
     */
    @JsonProperty("local")
    public void setLocal(List<Local> local) {
        this.local = local;
    }

    /**
     * 
     * @return
     *     The thru
     */
    @JsonProperty("thru")
    public List<Thru> getThru() {
        return thru;
    }

    /**
     * 
     * @param thru
     *     The thru
     */
    @JsonProperty("thru")
    public void setThru(List<Thru> thru) {
        this.thru = thru;
    }

    /**
     * 
     * @return
     *     The acars
     */
    @JsonProperty("acars")
    public List<Acar> getAcars() {
        return acars;
    }

    /**
     * 
     * @param acars
     *     The acars
     */
    @JsonProperty("acars")
    public void setAcars(List<Acar> acars) {
        this.acars = acars;
    }

    /**
     * 
     * @return
     *     The mosaicDEP
     */
    @JsonProperty("mosaicDEP")
    public List<MosaicDEP> getMosaicDEP() {
        return mosaicDEP;
    }

    /**
     * 
     * @param mosaicDEP
     *     The mosaicDEP
     */
    @JsonProperty("mosaicDEP")
    public void setMosaicDEP(List<MosaicDEP> mosaicDEP) {
        this.mosaicDEP = mosaicDEP;
    }

    /**
     * 
     * @return
     *     The mosaicENR
     */
    @JsonProperty("mosaicENR")
    public List<MosaicENR> getMosaicENR() {
        return mosaicENR;
    }

    /**
     * 
     * @param mosaicENR
     *     The mosaicENR
     */
    @JsonProperty("mosaicENR")
    public void setMosaicENR(List<MosaicENR> mosaicENR) {
        this.mosaicENR = mosaicENR;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(local).append(thru).append(acars).append(mosaicDEP).append(mosaicENR).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DelayCodes) == false) {
            return false;
        }
        DelayCodes rhs = ((DelayCodes) other);
        return new EqualsBuilder().append(local, rhs.local).append(thru, rhs.thru).append(acars, rhs.acars).append(mosaicDEP, rhs.mosaicDEP).append(mosaicENR, rhs.mosaicENR).isEquals();
    }

}
