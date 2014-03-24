/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "facility_assoc_type")
@NamedQueries({
    @NamedQuery(name = "FacilityAssocType.findAll", query = "SELECT f FROM FacilityAssocType f")})
public class FacilityAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_ASSOC_TYPE_ID")
    private String facilityAssocTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityAssocType")
    private List<FacilityAssoc> facilityAssocList;

    public FacilityAssocType() {
    }

    public FacilityAssocType(String facilityAssocTypeId) {
        this.facilityAssocTypeId = facilityAssocTypeId;
    }

    public String getFacilityAssocTypeId() {
        return facilityAssocTypeId;
    }

    public void setFacilityAssocTypeId(String facilityAssocTypeId) {
        this.facilityAssocTypeId = facilityAssocTypeId;
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

    public List<FacilityAssoc> getFacilityAssocList() {
        return facilityAssocList;
    }

    public void setFacilityAssocList(List<FacilityAssoc> facilityAssocList) {
        this.facilityAssocList = facilityAssocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityAssocTypeId != null ? facilityAssocTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityAssocType)) {
            return false;
        }
        FacilityAssocType other = (FacilityAssocType) object;
        if ((this.facilityAssocTypeId == null && other.facilityAssocTypeId != null) || (this.facilityAssocTypeId != null && !this.facilityAssocTypeId.equals(other.facilityAssocTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityAssocType[ facilityAssocTypeId=" + facilityAssocTypeId + " ]";
    }
    
}
