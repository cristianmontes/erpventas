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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "contact_mech")

public class ContactMech implements Serializable {
	/*
    @OneToMany(mappedBy = "refByWebContactMechId")
    private List<ServerHit> serverHitList;
    @OneToMany(mappedBy = "idByIpContactMechId")
    private List<ServerHit> serverHitList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<WorkEffortContactMech> workEffortContactMechList;
    @OneToMany(mappedBy = "contactMechId")
    private List<RespondingParty> respondingPartyList;
    @OneToMany(mappedBy = "contactMechId")
    private List<WorkEffortEventReminder> workEffortEventReminderList;
    @OneToMany(mappedBy = "contactMechId")
    private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "contactMechId")
    private List<ShipmentContactMech> shipmentContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<PartyContactMechPurpose> partyContactMechPurposeList;
    @OneToMany(mappedBy = "primaryTelecomNumberId")
    private List<PartySupplementalData> partySupplementalDataList;
    @OneToMany(mappedBy = "primaryPostalAddressId")
    private List<PartySupplementalData> partySupplementalDataList1;
    @OneToMany(mappedBy = "primaryEmailId")
    private List<PartySupplementalData> partySupplementalDataList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<PartyContactMech> partyContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<InvoiceContactMech> invoiceContactMechList;
    @OneToMany(mappedBy = "contactMechId1")
    private List<GiftCard> giftCardList;
    @OneToMany(mappedBy = "contactMechId1")
    private List<EftAccount> eftAccountList;
    @OneToMany(mappedBy = "contactMechId")
    private List<Visit> visitList;
    @OneToMany(mappedBy = "contactMechId")
    private List<CommunicationEventRole> communicationEventRoleList;
    @OneToMany(mappedBy = "preferredContactMechId")
    private List<ContactListParty> contactListPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<ContactListCommStatus> contactListCommStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<ContactMechLink> contactMechLinkList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech1")
    private List<ContactMechLink> contactMechLinkList1;
    @OneToMany(mappedBy = "contactMechIdTo")
    private List<CommunicationEvent> communicationEventList;
    @OneToMany(mappedBy = "contactMechIdFrom")
    private List<CommunicationEvent> communicationEventList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private List<ContactMechAttribute> contactMechAttributeList;
    @OneToMany(mappedBy = "contactMechId1")
    private List<CreditCard> creditCardList;
    */
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;
    @Column(name = "INFO_STRING")
    private String infoString;
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
    /*
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private TelecomNumber telecomNumber;
    @OneToMany(mappedBy = "contactMechId")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "fulfillContactMechId")
    private List<CustRequest> custRequestList;
    @OneToMany(mappedBy = "originContactMechId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "originPhoneContactMechId")
    private List<ReturnHeader> returnHeaderList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "contactMech")
    private PostalAddress postalAddress;
    @JoinColumn(name = "CONTACT_MECH_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID")
    @ManyToOne
    private ContactMechType contactMechTypeId;
    
    @OneToMany(mappedBy = "contactMechId")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(mappedBy = "telecomContactMechId1")
    private List<OrderItemShipGroup> orderItemShipGroupList1;
    @OneToMany(mappedBy = "contactMechId1")
    private List<BillingAccount> billingAccountList;
    @OneToMany(mappedBy = "contactMechId")
    private List<Invoice> invoiceList;*/

    public ContactMech() {
    }

    public ContactMech(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
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
/*
    public TelecomNumber getTelecomNumber() {
        return telecomNumber;
    }

    public void setTelecomNumber(TelecomNumber telecomNumber) {
        this.telecomNumber = telecomNumber;
    }

    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<CustRequest> getCustRequestList() {
        return custRequestList;
    }

    public void setCustRequestList(List<CustRequest> custRequestList) {
        this.custRequestList = custRequestList;
    }

    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }

    public List<ReturnHeader> getReturnHeaderList1() {
        return returnHeaderList1;
    }

    public void setReturnHeaderList1(List<ReturnHeader> returnHeaderList1) {
        this.returnHeaderList1 = returnHeaderList1;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public ContactMechType getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(ContactMechType contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList1() {
        return orderItemShipGroupList1;
    }

    public void setOrderItemShipGroupList1(List<OrderItemShipGroup> orderItemShipGroupList1) {
        this.orderItemShipGroupList1 = orderItemShipGroupList1;
    }

    public List<BillingAccount> getBillingAccountList() {
        return billingAccountList;
    }

    public void setBillingAccountList(List<BillingAccount> billingAccountList) {
        this.billingAccountList = billingAccountList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMech)) {
            return false;
        }
        ContactMech other = (ContactMech) object;
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMech[ contactMechId=" + contactMechId + " ]";
    }
/*
    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }

    public List<CommunicationEventRole> getCommunicationEventRoleList() {
        return communicationEventRoleList;
    }

    public void setCommunicationEventRoleList(List<CommunicationEventRole> communicationEventRoleList) {
        this.communicationEventRoleList = communicationEventRoleList;
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

    public List<ContactMechLink> getContactMechLinkList() {
        return contactMechLinkList;
    }

    public void setContactMechLinkList(List<ContactMechLink> contactMechLinkList) {
        this.contactMechLinkList = contactMechLinkList;
    }

    public List<ContactMechLink> getContactMechLinkList1() {
        return contactMechLinkList1;
    }

    public void setContactMechLinkList1(List<ContactMechLink> contactMechLinkList1) {
        this.contactMechLinkList1 = contactMechLinkList1;
    }

    public List<CommunicationEvent> getCommunicationEventList() {
        return communicationEventList;
    }

    public void setCommunicationEventList(List<CommunicationEvent> communicationEventList) {
        this.communicationEventList = communicationEventList;
    }

    public List<CommunicationEvent> getCommunicationEventList1() {
        return communicationEventList1;
    }

    public void setCommunicationEventList1(List<CommunicationEvent> communicationEventList1) {
        this.communicationEventList1 = communicationEventList1;
    }

    public List<ContactMechAttribute> getContactMechAttributeList() {
        return contactMechAttributeList;
    }

    public void setContactMechAttributeList(List<ContactMechAttribute> contactMechAttributeList) {
        this.contactMechAttributeList = contactMechAttributeList;
    }

    public List<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(List<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
    }

    public List<EftAccount> getEftAccountList() {
        return eftAccountList;
    }

    public void setEftAccountList(List<EftAccount> eftAccountList) {
        this.eftAccountList = eftAccountList;
    }

    public List<InvoiceContactMech> getInvoiceContactMechList() {
        return invoiceContactMechList;
    }

    public void setInvoiceContactMechList(List<InvoiceContactMech> invoiceContactMechList) {
        this.invoiceContactMechList = invoiceContactMechList;
    }

    public List<GiftCard> getGiftCardList() {
        return giftCardList;
    }

    public void setGiftCardList(List<GiftCard> giftCardList) {
        this.giftCardList = giftCardList;
    }

    public List<PartyContactMechPurpose> getPartyContactMechPurposeList() {
        return partyContactMechPurposeList;
    }

    public void setPartyContactMechPurposeList(List<PartyContactMechPurpose> partyContactMechPurposeList) {
        this.partyContactMechPurposeList = partyContactMechPurposeList;
    }

    public List<PartySupplementalData> getPartySupplementalDataList() {
        return partySupplementalDataList;
    }

    public void setPartySupplementalDataList(List<PartySupplementalData> partySupplementalDataList) {
        this.partySupplementalDataList = partySupplementalDataList;
    }

    public List<PartySupplementalData> getPartySupplementalDataList1() {
        return partySupplementalDataList1;
    }

    public void setPartySupplementalDataList1(List<PartySupplementalData> partySupplementalDataList1) {
        this.partySupplementalDataList1 = partySupplementalDataList1;
    }

    public List<PartySupplementalData> getPartySupplementalDataList2() {
        return partySupplementalDataList2;
    }

    public void setPartySupplementalDataList2(List<PartySupplementalData> partySupplementalDataList2) {
        this.partySupplementalDataList2 = partySupplementalDataList2;
    }

    public List<PartyContactMech> getPartyContactMechList() {
        return partyContactMechList;
    }

    public void setPartyContactMechList(List<PartyContactMech> partyContactMechList) {
        this.partyContactMechList = partyContactMechList;
    }

    public List<ServerHit> getServerHitList() {
        return serverHitList;
    }

    public void setServerHitList(List<ServerHit> serverHitList) {
        this.serverHitList = serverHitList;
    }

    public List<ServerHit> getServerHitList1() {
        return serverHitList1;
    }

    public void setServerHitList1(List<ServerHit> serverHitList1) {
        this.serverHitList1 = serverHitList1;
    }

    public List<WorkEffortContactMech> getWorkEffortContactMechList() {
        return workEffortContactMechList;
    }

    public void setWorkEffortContactMechList(List<WorkEffortContactMech> workEffortContactMechList) {
        this.workEffortContactMechList = workEffortContactMechList;
    }

    public List<RespondingParty> getRespondingPartyList() {
        return respondingPartyList;
    }

    public void setRespondingPartyList(List<RespondingParty> respondingPartyList) {
        this.respondingPartyList = respondingPartyList;
    }

    public List<WorkEffortEventReminder> getWorkEffortEventReminderList() {
        return workEffortEventReminderList;
    }

    public void setWorkEffortEventReminderList(List<WorkEffortEventReminder> workEffortEventReminderList) {
        this.workEffortEventReminderList = workEffortEventReminderList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<ShipmentContactMech> getShipmentContactMechList() {
        return shipmentContactMechList;
    }

    public void setShipmentContactMechList(List<ShipmentContactMech> shipmentContactMechList) {
        this.shipmentContactMechList = shipmentContactMechList;
    }*/
    
}
