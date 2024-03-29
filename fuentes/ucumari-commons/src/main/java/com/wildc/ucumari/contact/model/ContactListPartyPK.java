/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ContactListPartyPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7982680692134587699L;
	@Basic(optional = false)
    @Column(name = "CONTACT_LIST_ID")
    private String contactListId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ContactListPartyPK() {
    }

    public ContactListPartyPK(String contactListId, String partyId, Date fromDate) {
        this.contactListId = contactListId;
        this.partyId = partyId;
        this.fromDate = fromDate;
    }

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListId != null ? contactListId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactListPartyPK)) {
            return false;
        }
        ContactListPartyPK other = (ContactListPartyPK) object;
        if ((this.contactListId == null && other.contactListId != null) || (this.contactListId != null && !this.contactListId.equals(other.contactListId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactListPartyPK[ contactListId=" + contactListId + ", partyId=" + partyId + ", fromDate=" + fromDate + " ]";
    }
    
}
