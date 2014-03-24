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
@Table(name = "accommodation_class")
@NamedQueries({
    @NamedQuery(name = "AccommodationClass.findAll", query = "SELECT a FROM AccommodationClass a")})
public class AccommodationClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOMMODATION_CLASS_ID")
    private String accommodationClassId;
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
    @OneToMany(mappedBy = "accommodationClassId")
    private List<AccommodationSpot> accommodationSpotList;
    @OneToMany(mappedBy = "parentClassId")
    private List<AccommodationClass> accommodationClassList;
    @JoinColumn(name = "PARENT_CLASS_ID", referencedColumnName = "ACCOMMODATION_CLASS_ID")
    @ManyToOne
    private AccommodationClass parentClassId;
    @OneToMany(mappedBy = "accommodationClassId")
    private List<AccommodationMap> accommodationMapList;

    public AccommodationClass() {
    }

    public AccommodationClass(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }

    public String getAccommodationClassId() {
        return accommodationClassId;
    }

    public void setAccommodationClassId(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
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

    public List<AccommodationSpot> getAccommodationSpotList() {
        return accommodationSpotList;
    }

    public void setAccommodationSpotList(List<AccommodationSpot> accommodationSpotList) {
        this.accommodationSpotList = accommodationSpotList;
    }

    public List<AccommodationClass> getAccommodationClassList() {
        return accommodationClassList;
    }

    public void setAccommodationClassList(List<AccommodationClass> accommodationClassList) {
        this.accommodationClassList = accommodationClassList;
    }

    public AccommodationClass getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(AccommodationClass parentClassId) {
        this.parentClassId = parentClassId;
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
        hash += (accommodationClassId != null ? accommodationClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccommodationClass)) {
            return false;
        }
        AccommodationClass other = (AccommodationClass) object;
        if ((this.accommodationClassId == null && other.accommodationClassId != null) || (this.accommodationClassId != null && !this.accommodationClassId.equals(other.accommodationClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AccommodationClass[ accommodationClassId=" + accommodationClassId + " ]";
    }
    
}
