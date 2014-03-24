/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "facility_type_attr")
@NamedQueries({
    @NamedQuery(name = "FacilityTypeAttr.findAll", query = "SELECT f FROM FacilityTypeAttr f")})
public class FacilityTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityTypeAttrPK facilityTypeAttrPK;
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
    @JoinColumn(name = "FACILITY_TYPE_ID", referencedColumnName = "FACILITY_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacilityType facilityType;

    public FacilityTypeAttr() {
    }

    public FacilityTypeAttr(FacilityTypeAttrPK facilityTypeAttrPK) {
        this.facilityTypeAttrPK = facilityTypeAttrPK;
    }

    public FacilityTypeAttr(String facilityTypeId, String attrName) {
        this.facilityTypeAttrPK = new FacilityTypeAttrPK(facilityTypeId, attrName);
    }

    public FacilityTypeAttrPK getFacilityTypeAttrPK() {
        return facilityTypeAttrPK;
    }

    public void setFacilityTypeAttrPK(FacilityTypeAttrPK facilityTypeAttrPK) {
        this.facilityTypeAttrPK = facilityTypeAttrPK;
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

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityTypeAttrPK != null ? facilityTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityTypeAttr)) {
            return false;
        }
        FacilityTypeAttr other = (FacilityTypeAttr) object;
        if ((this.facilityTypeAttrPK == null && other.facilityTypeAttrPK != null) || (this.facilityTypeAttrPK != null && !this.facilityTypeAttrPK.equals(other.facilityTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityTypeAttr[ facilityTypeAttrPK=" + facilityTypeAttrPK + " ]";
    }
    
}
