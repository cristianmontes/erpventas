/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "contact_list_party")
@NamedQueries({
    @NamedQuery(name = "ContactListParty.findAll", query = "SELECT c FROM ContactListParty c")})
public class ContactListParty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactListPartyPK contactListPartyPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PREFERRED_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech preferredContactMechId;
    @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactList contactList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactListParty")
    private List<ContactListPartyStatus> contactListPartyStatusList;

    public ContactListParty() {
    }

    public ContactListParty(ContactListPartyPK contactListPartyPK) {
        this.contactListPartyPK = contactListPartyPK;
    }

    public ContactListParty(String contactListId, String partyId, Date fromDate) {
        this.contactListPartyPK = new ContactListPartyPK(contactListId, partyId, fromDate);
    }

    public ContactListPartyPK getContactListPartyPK() {
        return contactListPartyPK;
    }

    public void setContactListPartyPK(ContactListPartyPK contactListPartyPK) {
        this.contactListPartyPK = contactListPartyPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ContactMech getPreferredContactMechId() {
        return preferredContactMechId;
    }

    public void setPreferredContactMechId(ContactMech preferredContactMechId) {
        this.preferredContactMechId = preferredContactMechId;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public List<ContactListPartyStatus> getContactListPartyStatusList() {
        return contactListPartyStatusList;
    }

    public void setContactListPartyStatusList(List<ContactListPartyStatus> contactListPartyStatusList) {
        this.contactListPartyStatusList = contactListPartyStatusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListPartyPK != null ? contactListPartyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactListParty)) {
            return false;
        }
        ContactListParty other = (ContactListParty) object;
        if ((this.contactListPartyPK == null && other.contactListPartyPK != null) || (this.contactListPartyPK != null && !this.contactListPartyPK.equals(other.contactListPartyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactListParty[ contactListPartyPK=" + contactListPartyPK + " ]";
    }
    
}
