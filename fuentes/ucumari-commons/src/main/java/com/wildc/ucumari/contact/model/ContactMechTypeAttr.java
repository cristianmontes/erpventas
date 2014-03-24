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
@Table(name = "contact_mech_type_attr")
@NamedQueries({
    @NamedQuery(name = "ContactMechTypeAttr.findAll", query = "SELECT c FROM ContactMechTypeAttr c")})
public class ContactMechTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactMechTypeAttrPK contactMechTypeAttrPK;
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

    public ContactMechTypeAttr() {
    }

    public ContactMechTypeAttr(ContactMechTypeAttrPK contactMechTypeAttrPK) {
        this.contactMechTypeAttrPK = contactMechTypeAttrPK;
    }

    public ContactMechTypeAttr(String contactMechTypeId, String attrName) {
        this.contactMechTypeAttrPK = new ContactMechTypeAttrPK(contactMechTypeId, attrName);
    }

    public ContactMechTypeAttrPK getContactMechTypeAttrPK() {
        return contactMechTypeAttrPK;
    }

    public void setContactMechTypeAttrPK(ContactMechTypeAttrPK contactMechTypeAttrPK) {
        this.contactMechTypeAttrPK = contactMechTypeAttrPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechTypeAttrPK != null ? contactMechTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechTypeAttr)) {
            return false;
        }
        ContactMechTypeAttr other = (ContactMechTypeAttr) object;
        if ((this.contactMechTypeAttrPK == null && other.contactMechTypeAttrPK != null) || (this.contactMechTypeAttrPK != null && !this.contactMechTypeAttrPK.equals(other.contactMechTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechTypeAttr[ contactMechTypeAttrPK=" + contactMechTypeAttrPK + " ]";
    }
    
}
