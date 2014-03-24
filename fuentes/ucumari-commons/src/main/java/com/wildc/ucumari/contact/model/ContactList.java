/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import com.wildc.ucumari.client.modelo.CommunicationEvent;
import com.wildc.ucumari.client.modelo.MarketingCampaign;
import com.wildc.ucumari.client.modelo.MmarketingCampaignContaclist;
import com.wildc.ucumari.client.modelo.TrackingCode;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "contact_list")
@NamedQueries({
    @NamedQuery(name = "ContactList.findAll", query = "SELECT c FROM ContactList c")})
public class ContactList implements Serializable {
    @OneToMany(mappedBy = "contactListId")
    private List<TrackingCode> trackingCodeList;
    @OneToMany(mappedBy = "contactListId")
    private List<MmarketingCampaignContaclist> mmarketingCampaignContaclistList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_LIST_ID")
    private String contactListId;
    @Column(name = "CONTACT_LIST_NAME")
    private String contactListName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "IS_PUBLIC")
    private Character isPublic;
    @Column(name = "SINGLE_USE")
    private Character singleUse;
    @Column(name = "VERIFY_EMAIL_FROM")
    private String verifyEmailFrom;
    @Column(name = "VERIFY_EMAIL_SCREEN")
    private String verifyEmailScreen;
    @Column(name = "VERIFY_EMAIL_SUBJECT")
    private String verifyEmailSubject;
    @Column(name = "VERIFY_EMAIL_WEB_SITE_ID")
    private String verifyEmailWebSiteId;
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
    @OneToMany(mappedBy = "parentContactListId")
    private List<ContactList> contactListList;
    @JoinColumn(name = "PARENT_CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID")
    @ManyToOne
    private ContactList parentContactListId;
    @JoinColumn(name = "CONTACT_LIST_TYPE_ID", referencedColumnName = "CONTACT_LIST_TYPE_ID")
    @ManyToOne
    private ContactListType contactListTypeId;
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party ownerPartyId;
    @JoinColumn(name = "MARKETING_CAMPAIGN_ID", referencedColumnName = "MARKETING_CAMPAIGN_ID")
    @ManyToOne
    private MarketingCampaign marketingCampaignId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "CONTACT_MECH_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID")
    @ManyToOne
    private ContactMechType contactMechTypeId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactList")
    private List<ContactListParty> contactListPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactList")
    private List<ContactListCommStatus> contactListCommStatusList;
    @OneToMany(mappedBy = "contactListId")
    private List<CommunicationEvent> communicationEventList;

    public ContactList() {
    }

    public ContactList(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getContactListName() {
        return contactListName;
    }

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Character isPublic) {
        this.isPublic = isPublic;
    }

    public Character getSingleUse() {
        return singleUse;
    }

    public void setSingleUse(Character singleUse) {
        this.singleUse = singleUse;
    }

    public String getVerifyEmailFrom() {
        return verifyEmailFrom;
    }

    public void setVerifyEmailFrom(String verifyEmailFrom) {
        this.verifyEmailFrom = verifyEmailFrom;
    }

    public String getVerifyEmailScreen() {
        return verifyEmailScreen;
    }

    public void setVerifyEmailScreen(String verifyEmailScreen) {
        this.verifyEmailScreen = verifyEmailScreen;
    }

    public String getVerifyEmailSubject() {
        return verifyEmailSubject;
    }

    public void setVerifyEmailSubject(String verifyEmailSubject) {
        this.verifyEmailSubject = verifyEmailSubject;
    }

    public String getVerifyEmailWebSiteId() {
        return verifyEmailWebSiteId;
    }

    public void setVerifyEmailWebSiteId(String verifyEmailWebSiteId) {
        this.verifyEmailWebSiteId = verifyEmailWebSiteId;
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

    public List<ContactList> getContactListList() {
        return contactListList;
    }

    public void setContactListList(List<ContactList> contactListList) {
        this.contactListList = contactListList;
    }

    public ContactList getParentContactListId() {
        return parentContactListId;
    }

    public void setParentContactListId(ContactList parentContactListId) {
        this.parentContactListId = parentContactListId;
    }

    public ContactListType getContactListTypeId() {
        return contactListTypeId;
    }

    public void setContactListTypeId(ContactListType contactListTypeId) {
        this.contactListTypeId = contactListTypeId;
    }

    public Party getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(Party ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public MarketingCampaign getMarketingCampaignId() {
        return marketingCampaignId;
    }

    public void setMarketingCampaignId(MarketingCampaign marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public ContactMechType getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(ContactMechType contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public List<ContactListParty> getContactListPartyList() {
        return contactListPartyList;
    }

    public void setContactListPartyList(List<ContactListParty> contactListPartyList) {
        this.contactListPartyList = contactListPartyList;
    }

    public List<ContactListCommStatus> getContactListCommStatusList() {
        return contactListCommStatusList;
    }

    public void setContactListCommStatusList(List<ContactListCommStatus> contactListCommStatusList) {
        this.contactListCommStatusList = contactListCommStatusList;
    }

    public List<CommunicationEvent> getCommunicationEventList() {
        return communicationEventList;
    }

    public void setCommunicationEventList(List<CommunicationEvent> communicationEventList) {
        this.communicationEventList = communicationEventList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactListId != null ? contactListId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactList)) {
            return false;
        }
        ContactList other = (ContactList) object;
        if ((this.contactListId == null && other.contactListId != null) || (this.contactListId != null && !this.contactListId.equals(other.contactListId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactList[ contactListId=" + contactListId + " ]";
    }

    public List<MmarketingCampaignContaclist> getMmarketingCampaignContaclistList() {
        return mmarketingCampaignContaclistList;
    }

    public void setMmarketingCampaignContaclistList(List<MmarketingCampaignContaclist> mmarketingCampaignContaclistList) {
        this.mmarketingCampaignContaclistList = mmarketingCampaignContaclistList;
    }

    public List<TrackingCode> getTrackingCodeList() {
        return trackingCodeList;
    }

    public void setTrackingCodeList(List<TrackingCode> trackingCodeList) {
        this.trackingCodeList = trackingCodeList;
    }
    
}
