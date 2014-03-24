/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "accommodation_spot")
@NamedQueries({
    @NamedQuery(name = "AccommodationSpot.findAll", query = "SELECT a FROM AccommodationSpot a")})
public class AccommodationSpot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOMMODATION_SPOT_ID")
    private String accommodationSpotId;
    @Column(name = "NUMBER_OF_SPACES")
    private BigInteger numberOfSpaces;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "ACCOMMODATION_CLASS_ID", referencedColumnName = "ACCOMMODATION_CLASS_ID")
    @ManyToOne
    private AccommodationClass accommodationClassId;
    @OneToMany(mappedBy = "accommodationSpotId")
    private List<WorkEffort> workEffortList;

    public AccommodationSpot() {
    }

    public AccommodationSpot(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }

    public String getAccommodationSpotId() {
        return accommodationSpotId;
    }

    public void setAccommodationSpotId(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }

    public BigInteger getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public void setNumberOfSpaces(BigInteger numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public FixedAsset getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(FixedAsset fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public AccommodationClass getAccommodationClassId() {
        return accommodationClassId;
    }

    public void setAccommodationClassId(AccommodationClass accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accommodationSpotId != null ? accommodationSpotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccommodationSpot)) {
            return false;
        }
        AccommodationSpot other = (AccommodationSpot) object;
        if ((this.accommodationSpotId == null && other.accommodationSpotId != null) || (this.accommodationSpotId != null && !this.accommodationSpotId.equals(other.accommodationSpotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AccommodationSpot[ accommodationSpotId=" + accommodationSpotId + " ]";
    }
    
}
