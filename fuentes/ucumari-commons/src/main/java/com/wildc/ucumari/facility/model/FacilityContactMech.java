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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_contact_mech")
public class FacilityContactMech implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityContactMechPK facilityContactMechPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "EXTENSION")
    private String extension;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;

    public FacilityContactMech() {
    }

    public FacilityContactMech(FacilityContactMechPK facilityContactMechPK) {
        this.facilityContactMechPK = facilityContactMechPK;
    }

    public FacilityContactMech(String facilityId, String contactMechId, Date fromDate) {
        this.facilityContactMechPK = new FacilityContactMechPK(facilityId, contactMechId, fromDate);
    }

    public FacilityContactMechPK getFacilityContactMechPK() {
        return facilityContactMechPK;
    }

    public void setFacilityContactMechPK(FacilityContactMechPK facilityContactMechPK) {
        this.facilityContactMechPK = facilityContactMechPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityContactMechPK != null ? facilityContactMechPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityContactMech)) {
            return false;
        }
        FacilityContactMech other = (FacilityContactMech) object;
        if ((this.facilityContactMechPK == null && other.facilityContactMechPK != null) || (this.facilityContactMechPK != null && !this.facilityContactMechPK.equals(other.facilityContactMechPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityContactMech[ facilityContactMechPK=" + facilityContactMechPK + " ]";
    }

	public ContactMech getContactMech() {
		return contactMech;
	}

	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}
    
}
