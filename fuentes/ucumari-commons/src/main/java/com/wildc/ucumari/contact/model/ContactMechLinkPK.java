/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ContactMechLinkPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID_FROM")
    private String contactMechIdFrom;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID_TO")
    private String contactMechIdTo;

    public ContactMechLinkPK() {
    }

    public ContactMechLinkPK(String contactMechIdFrom, String contactMechIdTo) {
        this.contactMechIdFrom = contactMechIdFrom;
        this.contactMechIdTo = contactMechIdTo;
    }

    public String getContactMechIdFrom() {
        return contactMechIdFrom;
    }

    public void setContactMechIdFrom(String contactMechIdFrom) {
        this.contactMechIdFrom = contactMechIdFrom;
    }

    public String getContactMechIdTo() {
        return contactMechIdTo;
    }

    public void setContactMechIdTo(String contactMechIdTo) {
        this.contactMechIdTo = contactMechIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechIdFrom != null ? contactMechIdFrom.hashCode() : 0);
        hash += (contactMechIdTo != null ? contactMechIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechLinkPK)) {
            return false;
        }
        ContactMechLinkPK other = (ContactMechLinkPK) object;
        if ((this.contactMechIdFrom == null && other.contactMechIdFrom != null) || (this.contactMechIdFrom != null && !this.contactMechIdFrom.equals(other.contactMechIdFrom))) {
            return false;
        }
        if ((this.contactMechIdTo == null && other.contactMechIdTo != null) || (this.contactMechIdTo != null && !this.contactMechIdTo.equals(other.contactMechIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechLinkPK[ contactMechIdFrom=" + contactMechIdFrom + ", contactMechIdTo=" + contactMechIdTo + " ]";
    }
    
}
