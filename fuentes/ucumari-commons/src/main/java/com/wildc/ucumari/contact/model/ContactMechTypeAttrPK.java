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
public class ContactMechTypeAttrPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5634303906336116898L;
	@Basic(optional = false)
    @Column(name = "CONTACT_MECH_TYPE_ID")
    private String contactMechTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public ContactMechTypeAttrPK() {
    }

    public ContactMechTypeAttrPK(String contactMechTypeId, String attrName) {
        this.contactMechTypeId = contactMechTypeId;
        this.attrName = attrName;
    }

    public String getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
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
        hash += (contactMechTypeId != null ? contactMechTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechTypeAttrPK)) {
            return false;
        }
        ContactMechTypeAttrPK other = (ContactMechTypeAttrPK) object;
        if ((this.contactMechTypeId == null && other.contactMechTypeId != null) || (this.contactMechTypeId != null && !this.contactMechTypeId.equals(other.contactMechTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechTypeAttrPK[ contactMechTypeId=" + contactMechTypeId + ", attrName=" + attrName + " ]";
    }
    
}
