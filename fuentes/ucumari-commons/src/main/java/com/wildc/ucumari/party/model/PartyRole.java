/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_role")

public class PartyRole implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<SegmentGroupRole> segmentGroupRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<TimesheetRole> timesheetRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<QuoteRole> quoteRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<SalesOpportunityRole> salesOpportunityRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<WebSiteRole> webSiteRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ShipmentReceiptRole> shipmentReceiptRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<RequirementRole> requirementRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PartyRelationship> partyRelationshipList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole1")
    private List<PartyRelationship> partyRelationshipList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PartyBenefit> partyBenefitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole1")
    private List<PartyBenefit> partyBenefitList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ProductRole> productRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PayrollPreference> payrollPreferenceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PerfReviewItem> perfReviewItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PartyGlAccount> partyGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PicklistRole> picklistRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ProductCategoryRole> productCategoryRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PerformanceNote> performanceNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ProdCatalogRole> prodCatalogRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PerfReview> perfReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ProductStoreGroupRole> productStoreGroupRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PartyFixedAssetAssignment> partyFixedAssetAssignmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<PartyContactMech> partyContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ProductStoreRole> productStoreRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ItemIssuanceRole> itemIssuanceRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<GlAccountRole> glAccountRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<InvoiceRole> invoiceRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<DataResourceRole> dataResourceRoleList;
    @OneToMany(mappedBy = "partyRole")
    private List<Visit> visitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<CommunicationEventRole> communicationEventRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<ContentRole> contentRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<BudgetRole> budgetRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<CustRequestRole> custRequestRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<CustRequestParty> custRequestPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<BillingAccountRole> billingAccountRoleList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyRolePK partyRolePK;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<AcctgTransEntryRole> acctgTransEntryRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<Employment> employmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole1")
    private List<Employment> employmentList1;
    @OneToMany(mappedBy = "partyRole")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<CarrierShipmentMethod> carrierShipmentMethodList;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @OneToMany(mappedBy = "partyRole")
    private List<Agreement> agreementList;
    @OneToMany(mappedBy = "partyRole1")
    private List<Agreement> agreementList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyRole")
    private List<AgreementRole> agreementRoleList;*/

    public PartyRole() {
    }

    public PartyRole(PartyRolePK partyRolePK) {
        this.partyRolePK = partyRolePK;
    }

    public PartyRole(String partyId, String roleTypeId) {
        this.partyRolePK = new PartyRolePK(partyId, roleTypeId);
    }

    public PartyRolePK getPartyRolePK() {
        return partyRolePK;
    }

    public void setPartyRolePK(PartyRolePK partyRolePK) {
        this.partyRolePK = partyRolePK;
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
    public List<AcctgTransEntryRole> getAcctgTransEntryRoleList() {
        return acctgTransEntryRoleList;
    }

    public void setAcctgTransEntryRoleList(List<AcctgTransEntryRole> acctgTransEntryRoleList) {
        this.acctgTransEntryRoleList = acctgTransEntryRoleList;
    }

    public List<Employment> getEmploymentList() {
        return employmentList;
    }

    public void setEmploymentList(List<Employment> employmentList) {
        this.employmentList = employmentList;
    }

    public List<Employment> getEmploymentList1() {
        return employmentList1;
    }

    public void setEmploymentList1(List<Employment> employmentList1) {
        this.employmentList1 = employmentList1;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<CarrierShipmentMethod> getCarrierShipmentMethodList() {
        return carrierShipmentMethodList;
    }

    public void setCarrierShipmentMethodList(List<CarrierShipmentMethod> carrierShipmentMethodList) {
        this.carrierShipmentMethodList = carrierShipmentMethodList;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public List<Agreement> getAgreementList() {
        return agreementList;
    }

    public void setAgreementList(List<Agreement> agreementList) {
        this.agreementList = agreementList;
    }

    public List<Agreement> getAgreementList1() {
        return agreementList1;
    }

    public void setAgreementList1(List<Agreement> agreementList1) {
        this.agreementList1 = agreementList1;
    }

    public List<AgreementRole> getAgreementRoleList() {
        return agreementRoleList;
    }

    public void setAgreementRoleList(List<AgreementRole> agreementRoleList) {
        this.agreementRoleList = agreementRoleList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyRolePK != null ? partyRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyRole)) {
            return false;
        }
        PartyRole other = (PartyRole) object;
        if ((this.partyRolePK == null && other.partyRolePK != null) || (this.partyRolePK != null && !this.partyRolePK.equals(other.partyRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyRole[ partyRolePK=" + partyRolePK + " ]";
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

    public List<ContentRole> getContentRoleList() {
        return contentRoleList;
    }

    public void setContentRoleList(List<ContentRole> contentRoleList) {
        this.contentRoleList = contentRoleList;
    }

    public List<BudgetRole> getBudgetRoleList() {
        return budgetRoleList;
    }

    public void setBudgetRoleList(List<BudgetRole> budgetRoleList) {
        this.budgetRoleList = budgetRoleList;
    }

    public List<CustRequestRole> getCustRequestRoleList() {
        return custRequestRoleList;
    }

    public void setCustRequestRoleList(List<CustRequestRole> custRequestRoleList) {
        this.custRequestRoleList = custRequestRoleList;
    }

    public List<CustRequestParty> getCustRequestPartyList() {
        return custRequestPartyList;
    }

    public void setCustRequestPartyList(List<CustRequestParty> custRequestPartyList) {
        this.custRequestPartyList = custRequestPartyList;
    }

    public List<BillingAccountRole> getBillingAccountRoleList() {
        return billingAccountRoleList;
    }

    public void setBillingAccountRoleList(List<BillingAccountRole> billingAccountRoleList) {
        this.billingAccountRoleList = billingAccountRoleList;
    }

    public List<DataResourceRole> getDataResourceRoleList() {
        return dataResourceRoleList;
    }

    public void setDataResourceRoleList(List<DataResourceRole> dataResourceRoleList) {
        this.dataResourceRoleList = dataResourceRoleList;
    }

    public List<ItemIssuanceRole> getItemIssuanceRoleList() {
        return itemIssuanceRoleList;
    }

    public void setItemIssuanceRoleList(List<ItemIssuanceRole> itemIssuanceRoleList) {
        this.itemIssuanceRoleList = itemIssuanceRoleList;
    }

    public List<GlAccountRole> getGlAccountRoleList() {
        return glAccountRoleList;
    }

    public void setGlAccountRoleList(List<GlAccountRole> glAccountRoleList) {
        this.glAccountRoleList = glAccountRoleList;
    }

    public List<InvoiceRole> getInvoiceRoleList() {
        return invoiceRoleList;
    }

    public void setInvoiceRoleList(List<InvoiceRole> invoiceRoleList) {
        this.invoiceRoleList = invoiceRoleList;
    }

    public List<PartyRelationship> getPartyRelationshipList() {
        return partyRelationshipList;
    }

    public void setPartyRelationshipList(List<PartyRelationship> partyRelationshipList) {
        this.partyRelationshipList = partyRelationshipList;
    }

    public List<PartyRelationship> getPartyRelationshipList1() {
        return partyRelationshipList1;
    }

    public void setPartyRelationshipList1(List<PartyRelationship> partyRelationshipList1) {
        this.partyRelationshipList1 = partyRelationshipList1;
    }

    public List<PartyBenefit> getPartyBenefitList() {
        return partyBenefitList;
    }

    public void setPartyBenefitList(List<PartyBenefit> partyBenefitList) {
        this.partyBenefitList = partyBenefitList;
    }

    public List<PartyBenefit> getPartyBenefitList1() {
        return partyBenefitList1;
    }

    public void setPartyBenefitList1(List<PartyBenefit> partyBenefitList1) {
        this.partyBenefitList1 = partyBenefitList1;
    }

    public List<ProductRole> getProductRoleList() {
        return productRoleList;
    }

    public void setProductRoleList(List<ProductRole> productRoleList) {
        this.productRoleList = productRoleList;
    }

    public List<PayrollPreference> getPayrollPreferenceList() {
        return payrollPreferenceList;
    }

    public void setPayrollPreferenceList(List<PayrollPreference> payrollPreferenceList) {
        this.payrollPreferenceList = payrollPreferenceList;
    }

    public List<PerfReviewItem> getPerfReviewItemList() {
        return perfReviewItemList;
    }

    public void setPerfReviewItemList(List<PerfReviewItem> perfReviewItemList) {
        this.perfReviewItemList = perfReviewItemList;
    }

    public List<PartyGlAccount> getPartyGlAccountList() {
        return partyGlAccountList;
    }

    public void setPartyGlAccountList(List<PartyGlAccount> partyGlAccountList) {
        this.partyGlAccountList = partyGlAccountList;
    }

    public List<PicklistRole> getPicklistRoleList() {
        return picklistRoleList;
    }

    public void setPicklistRoleList(List<PicklistRole> picklistRoleList) {
        this.picklistRoleList = picklistRoleList;
    }

    public List<ProductCategoryRole> getProductCategoryRoleList() {
        return productCategoryRoleList;
    }

    public void setProductCategoryRoleList(List<ProductCategoryRole> productCategoryRoleList) {
        this.productCategoryRoleList = productCategoryRoleList;
    }

    public List<PerformanceNote> getPerformanceNoteList() {
        return performanceNoteList;
    }

    public void setPerformanceNoteList(List<PerformanceNote> performanceNoteList) {
        this.performanceNoteList = performanceNoteList;
    }

    public List<ProdCatalogRole> getProdCatalogRoleList() {
        return prodCatalogRoleList;
    }

    public void setProdCatalogRoleList(List<ProdCatalogRole> prodCatalogRoleList) {
        this.prodCatalogRoleList = prodCatalogRoleList;
    }

    public List<PerfReview> getPerfReviewList() {
        return perfReviewList;
    }

    public void setPerfReviewList(List<PerfReview> perfReviewList) {
        this.perfReviewList = perfReviewList;
    }

    public List<ProductStoreGroupRole> getProductStoreGroupRoleList() {
        return productStoreGroupRoleList;
    }

    public void setProductStoreGroupRoleList(List<ProductStoreGroupRole> productStoreGroupRoleList) {
        this.productStoreGroupRoleList = productStoreGroupRoleList;
    }

    public List<PartyFixedAssetAssignment> getPartyFixedAssetAssignmentList() {
        return partyFixedAssetAssignmentList;
    }

    public void setPartyFixedAssetAssignmentList(List<PartyFixedAssetAssignment> partyFixedAssetAssignmentList) {
        this.partyFixedAssetAssignmentList = partyFixedAssetAssignmentList;
    }

    public List<PartyContactMech> getPartyContactMechList() {
        return partyContactMechList;
    }

    public void setPartyContactMechList(List<PartyContactMech> partyContactMechList) {
        this.partyContactMechList = partyContactMechList;
    }

    public List<ProductStoreRole> getProductStoreRoleList() {
        return productStoreRoleList;
    }

    public void setProductStoreRoleList(List<ProductStoreRole> productStoreRoleList) {
        this.productStoreRoleList = productStoreRoleList;
    }

    public List<SegmentGroupRole> getSegmentGroupRoleList() {
        return segmentGroupRoleList;
    }

    public void setSegmentGroupRoleList(List<SegmentGroupRole> segmentGroupRoleList) {
        this.segmentGroupRoleList = segmentGroupRoleList;
    }

    public List<TimesheetRole> getTimesheetRoleList() {
        return timesheetRoleList;
    }

    public void setTimesheetRoleList(List<TimesheetRole> timesheetRoleList) {
        this.timesheetRoleList = timesheetRoleList;
    }

    public List<QuoteRole> getQuoteRoleList() {
        return quoteRoleList;
    }

    public void setQuoteRoleList(List<QuoteRole> quoteRoleList) {
        this.quoteRoleList = quoteRoleList;
    }

    public List<SalesOpportunityRole> getSalesOpportunityRoleList() {
        return salesOpportunityRoleList;
    }

    public void setSalesOpportunityRoleList(List<SalesOpportunityRole> salesOpportunityRoleList) {
        this.salesOpportunityRoleList = salesOpportunityRoleList;
    }

    public List<WebSiteRole> getWebSiteRoleList() {
        return webSiteRoleList;
    }

    public void setWebSiteRoleList(List<WebSiteRole> webSiteRoleList) {
        this.webSiteRoleList = webSiteRoleList;
    }

    public List<ShipmentReceiptRole> getShipmentReceiptRoleList() {
        return shipmentReceiptRoleList;
    }

    public void setShipmentReceiptRoleList(List<ShipmentReceiptRole> shipmentReceiptRoleList) {
        this.shipmentReceiptRoleList = shipmentReceiptRoleList;
    }

    public List<RequirementRole> getRequirementRoleList() {
        return requirementRoleList;
    }

    public void setRequirementRoleList(List<RequirementRole> requirementRoleList) {
        this.requirementRoleList = requirementRoleList;
    }*/
    
}
