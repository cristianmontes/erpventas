/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

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
@Table(name = "role_type")

public class RoleType implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<RoleTypeAttr> roleTypeAttrList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<ShipmentCostEstimate> shipmentCostEstimateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<ValidContactMechRole> validContactMechRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<SalesOpportunityRole> salesOpportunityRoleList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "originatedFromRoleTypeId")
    private List<Subscription> subscriptionList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<PartyInvitationRoleAssoc> partyInvitationRoleAssocList;
    @OneToMany(mappedBy = "useRoleTypeId")
    private List<ProductSubscriptionResource> productSubscriptionResourceList;
    @OneToMany(mappedBy = "useRoleTypeId")
    private List<ProductContent> productContentList;
    @OneToMany(mappedBy = "roleTypeIdValidTo")
    private List<PartyRelationshipType> partyRelationshipTypeList;
    @OneToMany(mappedBy = "roleTypeIdValidFrom")
    private List<PartyRelationshipType> partyRelationshipTypeList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<PartyNeed> partyNeedList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<PartyContactMech> partyContactMechList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<Visit> visitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<ContentPurposeOperation> contentPurposeOperationList;
    @OneToMany(mappedBy = "roleTypeIdTo")
    private List<CommunicationEvent> communicationEventList;
    @OneToMany(mappedBy = "roleTypeIdFrom")
    private List<CommunicationEvent> communicationEventList1;
    @OneToMany(mappedBy = "roleTypeId")
    private List<ContentApproval> contentApprovalList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name = "PARENT_TYPE_ID", insertable = false, updatable = false)
    private String parentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "roleTypeIdTo")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<AcctgTransEntry> acctgTransEntryList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<FixedAsset> fixedAssetList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<Invoice> invoiceList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<RoleType> roleTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<AgreementTypeForRoleType> agreementTypeForRoleTypeList;
    @OneToMany(mappedBy = "roleTypeId")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleType")
    private List<PartyRole> partyRoleList;*/

    public RoleType() {
    }

    public RoleType(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public List<RoleType> getRoleTypeList() {
        return roleTypeList;
    }

    public void setRoleTypeList(List<RoleType> roleTypeList) {
        this.roleTypeList = roleTypeList;
    }

    public RoleType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(RoleType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<AgreementTypeForRoleType> getAgreementTypeForRoleTypeList() {
        return agreementTypeForRoleTypeList;
    }

    public void setAgreementTypeForRoleTypeList(List<AgreementTypeForRoleType> agreementTypeForRoleTypeList) {
        this.agreementTypeForRoleTypeList = agreementTypeForRoleTypeList;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }

    public List<PartyRole> getPartyRoleList() {
        return partyRoleList;
    }

    public void setPartyRoleList(List<PartyRole> partyRoleList) {
        this.partyRoleList = partyRoleList;
    }*/

    public String getParentTypeId() {
		return parentTypeId;
	}

	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleType)) {
            return false;
        }
        RoleType other = (RoleType) object;
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RoleType[ roleTypeId=" + roleTypeId + " ]";
    }
/*
    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }

    public List<ContentPurposeOperation> getContentPurposeOperationList() {
        return contentPurposeOperationList;
    }

    public void setContentPurposeOperationList(List<ContentPurposeOperation> contentPurposeOperationList) {
        this.contentPurposeOperationList = contentPurposeOperationList;
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

    public List<ContentApproval> getContentApprovalList() {
        return contentApprovalList;
    }

    public void setContentApprovalList(List<ContentApproval> contentApprovalList) {
        this.contentApprovalList = contentApprovalList;
    }

    public List<PartyInvitationRoleAssoc> getPartyInvitationRoleAssocList() {
        return partyInvitationRoleAssocList;
    }

    public void setPartyInvitationRoleAssocList(List<PartyInvitationRoleAssoc> partyInvitationRoleAssocList) {
        this.partyInvitationRoleAssocList = partyInvitationRoleAssocList;
    }

    public List<ProductSubscriptionResource> getProductSubscriptionResourceList() {
        return productSubscriptionResourceList;
    }

    public void setProductSubscriptionResourceList(List<ProductSubscriptionResource> productSubscriptionResourceList) {
        this.productSubscriptionResourceList = productSubscriptionResourceList;
    }

    public List<ProductContent> getProductContentList() {
        return productContentList;
    }

    public void setProductContentList(List<ProductContent> productContentList) {
        this.productContentList = productContentList;
    }

    public List<PartyRelationshipType> getPartyRelationshipTypeList() {
        return partyRelationshipTypeList;
    }

    public void setPartyRelationshipTypeList(List<PartyRelationshipType> partyRelationshipTypeList) {
        this.partyRelationshipTypeList = partyRelationshipTypeList;
    }

    public List<PartyRelationshipType> getPartyRelationshipTypeList1() {
        return partyRelationshipTypeList1;
    }

    public void setPartyRelationshipTypeList1(List<PartyRelationshipType> partyRelationshipTypeList1) {
        this.partyRelationshipTypeList1 = partyRelationshipTypeList1;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<PartyContactMech> getPartyContactMechList() {
        return partyContactMechList;
    }

    public void setPartyContactMechList(List<PartyContactMech> partyContactMechList) {
        this.partyContactMechList = partyContactMechList;
    }

    public List<RoleTypeAttr> getRoleTypeAttrList() {
        return roleTypeAttrList;
    }

    public void setRoleTypeAttrList(List<RoleTypeAttr> roleTypeAttrList) {
        this.roleTypeAttrList = roleTypeAttrList;
    }

    public List<ShipmentCostEstimate> getShipmentCostEstimateList() {
        return shipmentCostEstimateList;
    }

    public void setShipmentCostEstimateList(List<ShipmentCostEstimate> shipmentCostEstimateList) {
        this.shipmentCostEstimateList = shipmentCostEstimateList;
    }

    public List<ValidContactMechRole> getValidContactMechRoleList() {
        return validContactMechRoleList;
    }

    public void setValidContactMechRoleList(List<ValidContactMechRole> validContactMechRoleList) {
        this.validContactMechRoleList = validContactMechRoleList;
    }

    public List<SalesOpportunityRole> getSalesOpportunityRoleList() {
        return salesOpportunityRoleList;
    }

    public void setSalesOpportunityRoleList(List<SalesOpportunityRole> salesOpportunityRoleList) {
        this.salesOpportunityRoleList = salesOpportunityRoleList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<Subscription> getSubscriptionList1() {
        return subscriptionList1;
    }

    public void setSubscriptionList1(List<Subscription> subscriptionList1) {
        this.subscriptionList1 = subscriptionList1;
    }*/
    
}
