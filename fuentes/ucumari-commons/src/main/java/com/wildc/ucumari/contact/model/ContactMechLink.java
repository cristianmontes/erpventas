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
@Table(name = "contact_mech_link")
@NamedQueries({
    @NamedQuery(name = "ContactMechLink.findAll", query = "SELECT c FROM ContactMechLink c")})
public class ContactMechLink implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactMechLinkPK contactMechLinkPK;
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
    @JoinColumn(name = "CONTACT_MECH_ID_TO", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;
    @JoinColumn(name = "CONTACT_MECH_ID_FROM", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech1;

    public ContactMechLink() {
    }

    public ContactMechLink(ContactMechLinkPK contactMechLinkPK) {
        this.contactMechLinkPK = contactMechLinkPK;
    }

    public ContactMechLink(String contactMechIdFrom, String contactMechIdTo) {
        this.contactMechLinkPK = new ContactMechLinkPK(contactMechIdFrom, contactMechIdTo);
    }

    public ContactMechLinkPK getContactMechLinkPK() {
        return contactMechLinkPK;
    }

    public void setContactMechLinkPK(ContactMechLinkPK contactMechLinkPK) {
        this.contactMechLinkPK = contactMechLinkPK;
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

    public ContactMech getContactMech1() {
        return contactMech1;
    }

    public void setContactMech1(ContactMech contactMech1) {
        this.contactMech1 = contactMech1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechLinkPK != null ? contactMechLinkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechLink)) {
            return false;
        }
        ContactMechLink other = (ContactMechLink) object;
        if ((this.contactMechLinkPK == null && other.contactMechLinkPK != null) || (this.contactMechLinkPK != null && !this.contactMechLinkPK.equals(other.contactMechLinkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechLink[ contactMechLinkPK=" + contactMechLinkPK + " ]";
    }
    
}
