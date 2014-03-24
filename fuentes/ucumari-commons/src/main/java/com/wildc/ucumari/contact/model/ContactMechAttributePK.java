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
public class ContactMechAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public ContactMechAttributePK() {
    }

    public ContactMechAttributePK(String contactMechId, String attrName) {
        this.contactMechId = contactMechId;
        this.attrName = attrName;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechAttributePK)) {
            return false;
        }
        ContactMechAttributePK other = (ContactMechAttributePK) object;
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechAttributePK[ contactMechId=" + contactMechId + ", attrName=" + attrName + " ]";
    }
    
}
