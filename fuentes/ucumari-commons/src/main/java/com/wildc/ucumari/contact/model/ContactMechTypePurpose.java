/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "contact_mech_type_purpose")

public class ContactMechTypePurpose implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactMechTypePurposePK contactMechTypePurposePK;
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
    @JoinColumn(name = "CONTACT_MECH_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMechType contactMechType;
    @JoinColumn(name = "CONTACT_MECH_PURPOSE_TYPE_ID", referencedColumnName = "CONTACT_MECH_PURPOSE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMechPurposeType contactMechPurposeType;

    public ContactMechTypePurpose() {
    }

    public ContactMechTypePurpose(ContactMechTypePurposePK contactMechTypePurposePK) {
        this.contactMechTypePurposePK = contactMechTypePurposePK;
    }

    public ContactMechTypePurpose(String contactMechTypeId, String contactMechPurposeTypeId) {
        this.contactMechTypePurposePK = new ContactMechTypePurposePK(contactMechTypeId, contactMechPurposeTypeId);
    }

    public ContactMechTypePurposePK getContactMechTypePurposePK() {
        return contactMechTypePurposePK;
    }

    public void setContactMechTypePurposePK(ContactMechTypePurposePK contactMechTypePurposePK) {
        this.contactMechTypePurposePK = contactMechTypePurposePK;
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

    public ContactMechType getContactMechType() {
        return contactMechType;
    }

    public void setContactMechType(ContactMechType contactMechType) {
        this.contactMechType = contactMechType;
    }

    public ContactMechPurposeType getContactMechPurposeType() {
        return contactMechPurposeType;
    }

    public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
        this.contactMechPurposeType = contactMechPurposeType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechTypePurposePK != null ? contactMechTypePurposePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechTypePurpose)) {
            return false;
        }
        ContactMechTypePurpose other = (ContactMechTypePurpose) object;
        if ((this.contactMechTypePurposePK == null && other.contactMechTypePurposePK != null) || (this.contactMechTypePurposePK != null && !this.contactMechTypePurposePK.equals(other.contactMechTypePurposePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechTypePurpose[ contactMechTypePurposePK=" + contactMechTypePurposePK + " ]";
    }
    
}
