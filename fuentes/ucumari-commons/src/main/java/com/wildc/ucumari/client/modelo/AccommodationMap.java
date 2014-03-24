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
@Table(name = "accommodation_map")
@NamedQueries({
    @NamedQuery(name = "AccommodationMap.findAll", query = "SELECT a FROM AccommodationMap a")})
public class AccommodationMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOMMODATION_MAP_ID")
    private String accommodationMapId;
    @Column(name = "NUMBER_OF_SPACES")
    private BigInteger numberOfSpaces;
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
    @OneToMany(mappedBy = "accommodationMapId")
    private List<WorkEffort> workEffortList;
    @JoinColumn(name = "ACCOMMODATION_MAP_TYPE_ID", referencedColumnName = "ACCOMMODATION_MAP_TYPE_ID")
    @ManyToOne
    private AccommodationMapType accommodationMapTypeId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "ACCOMMODATION_CLASS_ID", referencedColumnName = "ACCOMMODATION_CLASS_ID")
    @ManyToOne
    private AccommodationClass accommodationClassId;

    public AccommodationMap() {
    }

    public AccommodationMap(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }

    public String getAccommodationMapId() {
        return accommodationMapId;
    }

    public void setAccommodationMapId(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }

    public BigInteger getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public void setNumberOfSpaces(BigInteger numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
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

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public AccommodationMapType getAccommodationMapTypeId() {
        return accommodationMapTypeId;
    }

    public void setAccommodationMapTypeId(AccommodationMapType accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accommodationMapId != null ? accommodationMapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccommodationMap)) {
            return false;
        }
        AccommodationMap other = (AccommodationMap) object;
        if ((this.accommodationMapId == null && other.accommodationMapId != null) || (this.accommodationMapId != null && !this.accommodationMapId.equals(other.accommodationMapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AccommodationMap[ accommodationMapId=" + accommodationMapId + " ]";
    }
    
}
