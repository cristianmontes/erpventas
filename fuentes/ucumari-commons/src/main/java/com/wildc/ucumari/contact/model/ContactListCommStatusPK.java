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
public class ContactListCommStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTACT_LIST_ID")
    private String contactListId;
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;

    public ContactListCommStatusPK() {
    }

    public ContactListCommStatusPK(String contactListId, String communicationEventId, String contactMechId) {
        this.contactListId = contactListId;
        this.communicationEventId = communicationEventId;
        this.contactMechId = contactMechId;
    }

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListId != null ? contactListId.hashCode() : 0);
        hash += (communicationEventId != null ? communicationEventId.hashCode() : 0);
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactListCommStatusPK)) {
            return false;
        }
        ContactListCommStatusPK other = (ContactListCommStatusPK) object;
        if ((this.contactListId == null && other.contactListId != null) || (this.contactListId != null && !this.contactListId.equals(other.contactListId))) {
            return false;
        }
        if ((this.communicationEventId == null && other.communicationEventId != null) || (this.communicationEventId != null && !this.communicationEventId.equals(other.communicationEventId))) {
            return false;
        }
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactListCommStatusPK[ contactListId=" + contactListId + ", communicationEventId=" + communicationEventId + ", contactMechId=" + contactMechId + " ]";
    }
    
}
