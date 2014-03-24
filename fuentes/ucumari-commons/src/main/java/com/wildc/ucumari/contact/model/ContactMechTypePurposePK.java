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
public class ContactMechTypePurposePK implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7674100746157164521L;
	@Basic(optional = false)
    @Column(name = "CONTACT_MECH_TYPE_ID")
    private String contactMechTypeId;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_PURPOSE_TYPE_ID")
    private String contactMechPurposeTypeId;

    public ContactMechTypePurposePK() {
    }

    public ContactMechTypePurposePK(String contactMechTypeId, String contactMechPurposeTypeId) {
        this.contactMechTypeId = contactMechTypeId;
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    public String getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechTypeId != null ? contactMechTypeId.hashCode() : 0);
        hash += (contactMechPurposeTypeId != null ? contactMechPurposeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechTypePurposePK)) {
            return false;
        }
        ContactMechTypePurposePK other = (ContactMechTypePurposePK) object;
        if ((this.contactMechTypeId == null && other.contactMechTypeId != null) || (this.contactMechTypeId != null && !this.contactMechTypeId.equals(other.contactMechTypeId))) {
            return false;
        }
        if ((this.contactMechPurposeTypeId == null && other.contactMechPurposeTypeId != null) || (this.contactMechPurposeTypeId != null && !this.contactMechPurposeTypeId.equals(other.contactMechPurposeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechTypePurposePK[ contactMechTypeId=" + contactMechTypeId + ", contactMechPurposeTypeId=" + contactMechPurposeTypeId + " ]";
    }
    
}
