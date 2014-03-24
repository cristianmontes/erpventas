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
import javax.persistence.JoinColumns;
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
@Table(name = "contact_list_party_status")
@NamedQueries({
    @NamedQuery(name = "ContactListPartyStatus.findAll", query = "SELECT c FROM ContactListPartyStatus c")})
public class ContactListPartyStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactListPartyStatusPK contactListPartyStatusPK;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "SET_BY_USER_LOGIN_ID")
    private String setByUserLoginId;
    @Column(name = "OPT_IN_VERIFY_CODE")
    private String optInVerifyCode;
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
    @JoinColumns({
        @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ContactListParty contactListParty;

    public ContactListPartyStatus() {
    }

    public ContactListPartyStatus(ContactListPartyStatusPK contactListPartyStatusPK) {
        this.contactListPartyStatusPK = contactListPartyStatusPK;
    }

    public ContactListPartyStatus(String contactListId, String partyId, Date fromDate, Date statusDate) {
        this.contactListPartyStatusPK = new ContactListPartyStatusPK(contactListId, partyId, fromDate, statusDate);
    }

    public ContactListPartyStatusPK getContactListPartyStatusPK() {
        return contactListPartyStatusPK;
    }

    public void setContactListPartyStatusPK(ContactListPartyStatusPK contactListPartyStatusPK) {
        this.contactListPartyStatusPK = contactListPartyStatusPK;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getSetByUserLoginId() {
        return setByUserLoginId;
    }

    public void setSetByUserLoginId(String setByUserLoginId) {
        this.setByUserLoginId = setByUserLoginId;
    }

    public String getOptInVerifyCode() {
        return optInVerifyCode;
    }

    public void setOptInVerifyCode(String optInVerifyCode) {
        this.optInVerifyCode = optInVerifyCode;
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

    public ContactListParty getContactListParty() {
        return contactListParty;
    }

    public void setContactListParty(ContactListParty contactListParty) {
        this.contactListParty = contactListParty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListPartyStatusPK != null ? contactListPartyStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactListPartyStatus)) {
            return false;
        }
        ContactListPartyStatus other = (ContactListPartyStatus) object;
        if ((this.contactListPartyStatusPK == null && other.contactListPartyStatusPK != null) || (this.contactListPartyStatusPK != null && !this.contactListPartyStatusPK.equals(other.contactListPartyStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactListPartyStatus[ contactListPartyStatusPK=" + contactListPartyStatusPK + " ]";
    }
    
}
