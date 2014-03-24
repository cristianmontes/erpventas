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
@Table(name = "contact_mech_attribute")
@NamedQueries({
    @NamedQuery(name = "ContactMechAttribute.findAll", query = "SELECT c FROM ContactMechAttribute c")})
public class ContactMechAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactMechAttributePK contactMechAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;

    public ContactMechAttribute() {
    }

    public ContactMechAttribute(ContactMechAttributePK contactMechAttributePK) {
        this.contactMechAttributePK = contactMechAttributePK;
    }

    public ContactMechAttribute(String contactMechId, String attrName) {
        this.contactMechAttributePK = new ContactMechAttributePK(contactMechId, attrName);
    }

    public ContactMechAttributePK getContactMechAttributePK() {
        return contactMechAttributePK;
    }

    public void setContactMechAttributePK(ContactMechAttributePK contactMechAttributePK) {
        this.contactMechAttributePK = contactMechAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechAttributePK != null ? contactMechAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechAttribute)) {
            return false;
        }
        ContactMechAttribute other = (ContactMechAttribute) object;
        if ((this.contactMechAttributePK == null && other.contactMechAttributePK != null) || (this.contactMechAttributePK != null && !this.contactMechAttributePK.equals(other.contactMechAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechAttribute[ contactMechAttributePK=" + contactMechAttributePK + " ]";
    }
    
}
