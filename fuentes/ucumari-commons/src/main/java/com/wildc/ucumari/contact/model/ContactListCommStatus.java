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

import com.wildc.ucumari.client.modelo.CommunicationEvent;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "contact_list_comm_status")
@NamedQueries({
    @NamedQuery(name = "ContactListCommStatus.findAll", query = "SELECT c FROM ContactListCommStatus c")})
public class ContactListCommStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactListCommStatusPK contactListCommStatusPK;
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
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;
    @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactList contactList;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public ContactListCommStatus() {
    }

    public ContactListCommStatus(ContactListCommStatusPK contactListCommStatusPK) {
        this.contactListCommStatusPK = contactListCommStatusPK;
    }

    public ContactListCommStatus(String contactListId, String communicationEventId, String contactMechId) {
        this.contactListCommStatusPK = new ContactListCommStatusPK(contactListId, communicationEventId, contactMechId);
    }

    public ContactListCommStatusPK getContactListCommStatusPK() {
        return contactListCommStatusPK;
    }

    public void setContactListCommStatusPK(ContactListCommStatusPK contactListCommStatusPK) {
        this.contactListCommStatusPK = contactListCommStatusPK;
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

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public CommunicationEvent getCommunicationEvent() {
        return communicationEvent;
    }

    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListCommStatusPK != null ? contactListCommStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactListCommStatus)) {
            return false;
        }
        ContactListCommStatus other = (ContactListCommStatus) object;
        if ((this.contactListCommStatusPK == null && other.contactListCommStatusPK != null) || (this.contactListCommStatusPK != null && !this.contactListCommStatusPK.equals(other.contactListCommStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactListCommStatus[ contactListCommStatusPK=" + contactListCommStatusPK + " ]";
    }
    
}
