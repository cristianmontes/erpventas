/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "usps_b_p_m_zone_map")
@NamedQueries({
    @NamedQuery(name = "UspsBPMZoneMap.findAll", query = "SELECT u FROM UspsBPMZoneMap u")})
public class UspsBPMZoneMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ZIP3")
    private String zip3;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "USPS_B_P_M_RATE_ZONE", referencedColumnName = "USPS_B_P_M_RATE_ZONE")
    @ManyToOne
    private UspsBPMRatesByZone uspsBPMRateZone;

    public UspsBPMZoneMap() {
    }

    public UspsBPMZoneMap(String zip3) {
        this.zip3 = zip3;
    }

    public String getZip3() {
        return zip3;
    }

    public void setZip3(String zip3) {
        this.zip3 = zip3;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public UspsBPMRatesByZone getUspsBPMRateZone() {
        return uspsBPMRateZone;
    }

    public void setUspsBPMRateZone(UspsBPMRatesByZone uspsBPMRateZone) {
        this.uspsBPMRateZone = uspsBPMRateZone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip3 != null ? zip3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UspsBPMZoneMap)) {
            return false;
        }
        UspsBPMZoneMap other = (UspsBPMZoneMap) object;
        if ((this.zip3 == null && other.zip3 != null) || (this.zip3 != null && !this.zip3.equals(other.zip3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UspsBPMZoneMap[ zip3=" + zip3 + " ]";
    }
    
}
