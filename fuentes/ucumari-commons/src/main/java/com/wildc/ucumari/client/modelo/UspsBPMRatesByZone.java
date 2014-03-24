/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "usps_b_p_m_rates_by_zone")
@NamedQueries({
    @NamedQuery(name = "UspsBPMRatesByZone.findAll", query = "SELECT u FROM UspsBPMRatesByZone u")})
public class UspsBPMRatesByZone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USPS_B_P_M_RATE_ZONE")
    private String uspsBPMRateZone;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATE_PER_PIECE")
    private BigDecimal ratePerPiece;
    @Column(name = "RATE_PER_POUND")
    private BigDecimal ratePerPound;
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
    @OneToMany(mappedBy = "uspsBPMRateZone")
    private List<UspsBPMZoneMap> uspsBPMZoneMapList;

    public UspsBPMRatesByZone() {
    }

    public UspsBPMRatesByZone(String uspsBPMRateZone) {
        this.uspsBPMRateZone = uspsBPMRateZone;
    }

    public String getUspsBPMRateZone() {
        return uspsBPMRateZone;
    }

    public void setUspsBPMRateZone(String uspsBPMRateZone) {
        this.uspsBPMRateZone = uspsBPMRateZone;
    }

    public BigDecimal getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(BigDecimal ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public BigDecimal getRatePerPound() {
        return ratePerPound;
    }

    public void setRatePerPound(BigDecimal ratePerPound) {
        this.ratePerPound = ratePerPound;
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

    public List<UspsBPMZoneMap> getUspsBPMZoneMapList() {
        return uspsBPMZoneMapList;
    }

    public void setUspsBPMZoneMapList(List<UspsBPMZoneMap> uspsBPMZoneMapList) {
        this.uspsBPMZoneMapList = uspsBPMZoneMapList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uspsBPMRateZone != null ? uspsBPMRateZone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UspsBPMRatesByZone)) {
            return false;
        }
        UspsBPMRatesByZone other = (UspsBPMRatesByZone) object;
        if ((this.uspsBPMRateZone == null && other.uspsBPMRateZone != null) || (this.uspsBPMRateZone != null && !this.uspsBPMRateZone.equals(other.uspsBPMRateZone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UspsBPMRatesByZone[ uspsBPMRateZone=" + uspsBPMRateZone + " ]";
    }
    
}
