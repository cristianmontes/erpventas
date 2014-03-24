/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactList;
import com.wildc.ucumari.contact.model.ContactListCommStatus;
import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.ContactMechType;
import com.wildc.ucumari.custrequest.model.CustRequestCommEvent;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyNeed;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "communication_event")
@NamedQueries({
    @NamedQuery(name = "CommunicationEvent.findAll", query = "SELECT c FROM CommunicationEvent c")})
public class CommunicationEvent implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<SubscriptionCommEvent> subscriptionCommEventList;
    @OneToMany(mappedBy = "communicationEventId")
    private List<PartyNeed> partyNeedList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;
    @Column(name = "ORIG_COMM_EVENT_ID")
    private String origCommEventId;
    @Column(name = "PARENT_COMM_EVENT_ID")
    private String parentCommEventId;
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "DATETIME_STARTED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeStarted;
    @Column(name = "DATETIME_ENDED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeEnded;
    @Column(name = "SUBJECT")
    private String subject;
    @Lob
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "NOTE")
    private String note;
    @Lob
    @Column(name = "HEADER_STRING")
    private String headerString;
    @Lob
    @Column(name = "FROM_STRING")
    private String fromString;
    @Lob
    @Column(name = "TO_STRING")
    private String toString;
    @Lob
    @Column(name = "CC_STRING")
    private String ccString;
    @Lob
    @Column(name = "BCC_STRING")
    private String bccString;
    @Column(name = "MESSAGE_ID")
    private String messageId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommunicationEventOrder> communicationEventOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommunicationEventWorkEff> communicationEventWorkEffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommunicationEventRole> communicationEventRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<ContactListCommStatus> contactListCommStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommunicationEventProduct> communicationEventProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommunicationEventPurpose> communicationEventPurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CustRequestCommEvent> custRequestCommEventList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEvent")
    private List<CommEventContentAssoc> commEventContentAssocList;
    @JoinColumn(name = "COMMUNICATION_EVENT_TYPE_ID", referencedColumnName = "COMMUNICATION_EVENT_TYPE_ID")
    @ManyToOne
    private CommunicationEventType communicationEventTypeId;
    @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeIdTo;
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdTo;
    @JoinColumn(name = "CONTACT_MECH_ID_TO", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechIdTo;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "REASON_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reasonEnumId;
    @JoinColumn(name = "CONTENT_MIME_TYPE_ID", referencedColumnName = "MIME_TYPE_ID")
    @ManyToOne
    private MimeType contentMimeTypeId;
    @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeIdFrom;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdFrom;
    @JoinColumn(name = "CONTACT_MECH_ID_FROM", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechIdFrom;
    @JoinColumn(name = "CONTACT_MECH_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID")
    @ManyToOne
    private ContactMechType contactMechTypeId;
    @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID")
    @ManyToOne
    private ContactList contactListId;

    public CommunicationEvent() {
    }

    public CommunicationEvent(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    public String getOrigCommEventId() {
        return origCommEventId;
    }

    public void setOrigCommEventId(String origCommEventId) {
        this.origCommEventId = origCommEventId;
    }

    public String getParentCommEventId() {
        return parentCommEventId;
    }

    public void setParentCommEventId(String parentCommEventId) {
        this.parentCommEventId = parentCommEventId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDatetimeStarted() {
        return datetimeStarted;
    }

    public void setDatetimeStarted(Date datetimeStarted) {
        this.datetimeStarted = datetimeStarted;
    }

    public Date getDatetimeEnded() {
        return datetimeEnded;
    }

    public void setDatetimeEnded(Date datetimeEnded) {
        this.datetimeEnded = datetimeEnded;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getHeaderString() {
        return headerString;
    }

    public void setHeaderString(String headerString) {
        this.headerString = headerString;
    }

    public String getFromString() {
        return fromString;
    }

    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }

    public String getCcString() {
        return ccString;
    }

    public void setCcString(String ccString) {
        this.ccString = ccString;
    }

    public String getBccString() {
        return bccString;
    }

    public void setBccString(String bccString) {
        this.bccString = bccString;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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

    public List<CommunicationEventOrder> getCommunicationEventOrderList() {
        return communicationEventOrderList;
    }

    public void setCommunicationEventOrderList(List<CommunicationEventOrder> communicationEventOrderList) {
        this.communicationEventOrderList = communicationEventOrderList;
    }

    public List<CommunicationEventWorkEff> getCommunicationEventWorkEffList() {
        return communicationEventWorkEffList;
    }

    public void setCommunicationEventWorkEffList(List<CommunicationEventWorkEff> communicationEventWorkEffList) {
        this.communicationEventWorkEffList = communicationEventWorkEffList;
    }

    public List<CommunicationEventRole> getCommunicationEventRoleList() {
        return communicationEventRoleList;
    }

    public void setCommunicationEventRoleList(List<CommunicationEventRole> communicationEventRoleList) {
        this.communicationEventRoleList = communicationEventRoleList;
    }

    public List<ContactListCommStatus> getContactListCommStatusList() {
        return contactListCommStatusList;
    }

    public void setContactListCommStatusList(List<ContactListCommStatus> contactListCommStatusList) {
        this.contactListCommStatusList = contactListCommStatusList;
    }

    public List<CommunicationEventProduct> getCommunicationEventProductList() {
        return communicationEventProductList;
    }

    public void setCommunicationEventProductList(List<CommunicationEventProduct> communicationEventProductList) {
        this.communicationEventProductList = communicationEventProductList;
    }

    public List<CommunicationEventPurpose> getCommunicationEventPurposeList() {
        return communicationEventPurposeList;
    }

    public void setCommunicationEventPurposeList(List<CommunicationEventPurpose> communicationEventPurposeList) {
        this.communicationEventPurposeList = communicationEventPurposeList;
    }

    public List<CustRequestCommEvent> getCustRequestCommEventList() {
        return custRequestCommEventList;
    }

    public void setCustRequestCommEventList(List<CustRequestCommEvent> custRequestCommEventList) {
        this.custRequestCommEventList = custRequestCommEventList;
    }

    public List<CommEventContentAssoc> getCommEventContentAssocList() {
        return commEventContentAssocList;
    }

    public void setCommEventContentAssocList(List<CommEventContentAssoc> commEventContentAssocList) {
        this.commEventContentAssocList = commEventContentAssocList;
    }

    public CommunicationEventType getCommunicationEventTypeId() {
        return communicationEventTypeId;
    }

    public void setCommunicationEventTypeId(CommunicationEventType communicationEventTypeId) {
        this.communicationEventTypeId = communicationEventTypeId;
    }

    public RoleType getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(RoleType roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    public Party getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(Party partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public ContactMech getContactMechIdTo() {
        return contactMechIdTo;
    }

    public void setContactMechIdTo(ContactMech contactMechIdTo) {
        this.contactMechIdTo = contactMechIdTo;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Enumeration getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(Enumeration reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }

    public MimeType getContentMimeTypeId() {
        return contentMimeTypeId;
    }

    public void setContentMimeTypeId(MimeType contentMimeTypeId) {
        this.contentMimeTypeId = contentMimeTypeId;
    }

    public RoleType getRoleTypeIdFrom() {
        return roleTypeIdFrom;
    }

    public void setRoleTypeIdFrom(RoleType roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }

    public Party getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(Party partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public ContactMech getContactMechIdFrom() {
        return contactMechIdFrom;
    }

    public void setContactMechIdFrom(ContactMech contactMechIdFrom) {
        this.contactMechIdFrom = contactMechIdFrom;
    }

    public ContactMechType getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(ContactMechType contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    public ContactList getContactListId() {
        return contactListId;
    }

    public void setContactListId(ContactList contactListId) {
        this.contactListId = contactListId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventId != null ? communicationEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEvent)) {
            return false;
        }
        CommunicationEvent other = (CommunicationEvent) object;
        if ((this.communicationEventId == null && other.communicationEventId != null) || (this.communicationEventId != null && !this.communicationEventId.equals(other.communicationEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEvent[ communicationEventId=" + communicationEventId + " ]";
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<SubscriptionCommEvent> getSubscriptionCommEventList() {
        return subscriptionCommEventList;
    }

    public void setSubscriptionCommEventList(List<SubscriptionCommEvent> subscriptionCommEventList) {
        this.subscriptionCommEventList = subscriptionCommEventList;
    }
    
}
