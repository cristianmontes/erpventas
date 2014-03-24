/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "accommodation_map_type")
@NamedQueries({
    @NamedQuery(name = "AccommodationMapType.findAll", query = "SELECT a FROM AccommodationMapType a")})
public class AccommodationMapType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOMMODATION_MAP_TYPE_ID")
    private String accommodationMapTypeId;
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
    @OneToMany(mappedBy = "accommodationMapTypeId")
    private List<AccommodationMap> accommodationMapList;

    public AccommodationMapType() {
    }

    public AccommodationMapType(String accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
    }

    public String getAccommodationMapTypeId() {
        return accommodationMapTypeId;
    }

    public void setAccommodationMapTypeId(String accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
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

    public List<AccommodationMap> getAccommodationMapList() {
        return accommodationMapList;
    }

    public void setAccommodationMapList(List<AccommodationMap> accommodationMapList) {
        this.accommodationMapList = accommodationMapList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accommodationMapTypeId != null ? accommodationMapTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccommodationMapType)) {
            return false;
        }
        AccommodationMapType other = (AccommodationMapType) object;
        if ((this.accommodationMapTypeId == null && other.accommodationMapTypeId != null) || (this.accommodationMapTypeId != null && !this.accommodationMapTypeId.equals(other.accommodationMapTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AccommodationMapType[ accommodationMapTypeId=" + accommodationMapTypeId + " ]";
    }
    
}
