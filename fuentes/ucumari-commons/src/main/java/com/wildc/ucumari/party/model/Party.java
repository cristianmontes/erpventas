/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party")
public class Party implements Serializable {
	/*
    @OneToMany(mappedBy = "partyId")
    private List<ServerHit> serverHitList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<SalesForecast> salesForecastList;
    @OneToMany(mappedBy = "internalPartyId")
    private List<SalesForecast> salesForecastList1;
    @OneToMany(mappedBy = "partyId")
    private List<ShipmentCostEstimate> shipmentCostEstimateList;
    @OneToMany(mappedBy = "partyId")
    private List<TimeEntry> timeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<RespondingParty> respondingPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<SupplierProductFeature> supplierProductFeatureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<WorkEffortAssignmentRate> workEffortAssignmentRateList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private Vendor vendor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<TimesheetRole> timesheetRoleList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<SalesForecastHistory> salesForecastHistoryList;
    @OneToMany(mappedBy = "internalPartyId")
    private List<SalesForecastHistory> salesForecastHistoryList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<RateAmount> rateAmountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<VendorProduct> vendorProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<QuoteRole> quoteRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<SalesOpportunityRole> salesOpportunityRoleList;
    @OneToMany(mappedBy = "partyId")
    private List<Timesheet> timesheetList;
    @OneToMany(mappedBy = "clientPartyId")
    private List<Timesheet> timesheetList1;
    @OneToMany(mappedBy = "carrierPartyId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(mappedBy = "partyId")
    private List<ReorderGuideline> reorderGuidelineList;
    @OneToMany(mappedBy = "partyId")
    private List<UserLoginHistory> userLoginHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<WebUserPreference> webUserPreferenceList;
    @OneToMany(mappedBy = "originatedFromPartyId")
    private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "partyId")
    private List<Subscription> subscriptionList1;
    @OneToMany(mappedBy = "partyId")
    private List<ValueLinkFulfillment> valueLinkFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<VarianceReasonGlAccount> varianceReasonGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ShipmentReceiptRole> shipmentReceiptRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<TaxAuthorityGlAccount> taxAuthorityGlAccountList;
    @OneToMany(mappedBy = "partyId")
    private List<SalesForecastItem> salesForecastItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<SupplierProduct> supplierProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<RequirementRole> requirementRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyAttribute> partyAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyTaxInfo> partyTaxInfoList;
    @OneToMany(mappedBy = "partyId")
    private List<PartyResume> partyResumeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyNameHistory> partyNameHistoryList;
    @OneToMany(mappedBy = "partyId")
    private List<ProductPromoUse> productPromoUseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyQual> partyQualList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyClassification> partyClassificationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartySkill> partySkillList;
    @OneToMany(mappedBy = "partyId")
    private List<PaycheckItem> paycheckItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyRate> partyRateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyBenefit> partyBenefitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<PartyBenefit> partyBenefitList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyContent> partyContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PersonTraining> personTrainingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PayrollPreference> payrollPreferenceList;
    @OneToMany(mappedBy = "partyIdFrom")
    private List<PartyInvitation> partyInvitationList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private PartyAcctgPreference partyAcctgPreference;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ProductCategoryGlAccount> productCategoryGlAccountList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<ProductAverageCost> productAverageCostList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PerfReviewItem> perfReviewItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyDataSource> partyDataSourceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyCarrierAccount> partyCarrierAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<PartyCarrierAccount> partyCarrierAccountList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyNote> partyNoteList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private PartyIcsAvsOverride partyIcsAvsOverride;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ProductGlAccount> productGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyGeoPoint> partyGeoPointList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyGlAccount> partyGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<PartyGlAccount> partyGlAccountList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyProfileDefault> partyProfileDefaultList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyTaxAuthInfo> partyTaxAuthInfoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PerformanceNote> performanceNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ProductStoreVendorPayment> productStoreVendorPaymentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyContactMechPurpose> partyContactMechPurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ProductStoreVendorShipment> productStoreVendorShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<ProductStoreVendorShipment> productStoreVendorShipmentList1;
    @OneToMany(mappedBy = "managerPartyId")
    private List<PerfReview> perfReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PerfReview> perfReviewList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyStatus> partyStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private PartySupplementalData partySupplementalData;
    @OneToMany(mappedBy = "parentPartyId")
    private List<PartySupplementalData> partySupplementalDataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyRateNew> partyRateNewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyNeed> partyNeedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ProductPromoCodeParty> productPromoCodePartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyContactMech> partyContactMechList;
    @OneToMany(mappedBy = "defaultDueToPartyId")
    private List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<OrderItemRole> orderItemRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<OrderRole> orderRoleList;
    @OneToMany(mappedBy = "carrierPartyId")
    private List<OrderShipmentPreference> orderShipmentPreferenceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ItemIssuanceRole> itemIssuanceRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<InvoiceGlAccountType> invoiceGlAccountTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<GlAccountTypeDefault> glAccountTypeDefaultList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList;
    @OneToMany(mappedBy = "partyId")
    private List<GiftCardFulfillment> giftCardFulfillmentList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<GlReconciliation> glReconciliationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<GlAccountHistory> glAccountHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<InvoiceRole> invoiceRoleList;
    @OneToMany(mappedBy = "partyId")
    private List<EmplPosition> emplPositionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<EmployeePaycheckType> employeePaycheckTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<EmployeePaycheckType> employeePaycheckTypeList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<EmplPositionFulfillment> emplPositionFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<EmplLeave> emplLeaveList;
    @OneToMany(mappedBy = "partyId")
    private List<Visit> visitList;
    @OneToMany(mappedBy = "ownerPartyId")
    private List<ContactList> contactListList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<CommunicationEventRole> communicationEventRoleList;
    @OneToMany(mappedBy = "committedByPartyId")
    private List<ContentRevision> contentRevisionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<ContactListParty> contactListPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<BudgetRole> budgetRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<BudgetReview> budgetReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<CarrierShipmentBoxType> carrierShipmentBoxTypeList;
    @OneToMany(mappedBy = "partyIdTo")
    private List<CommunicationEvent> communicationEventList;
    @OneToMany(mappedBy = "partyIdFrom")
    private List<CommunicationEvent> communicationEventList1;
    @OneToMany(mappedBy = "partyId")
    private List<CostComponent> costComponentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<CustRequestRole> custRequestRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<CustRequestParty> custRequestPartyList;
    @OneToMany(mappedBy = "partyId")
    private List<ContentApproval> contentApprovalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<BillingAccountRole> billingAccountRoleList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<CustomTimePeriod> customTimePeriodList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_FLUJO_DETALLE")
    @TableGenerator(name = "SEQ_FLUJO_DETALLE", table = "SECUENCIA", pkColumnName = "NOMBRE_TABLA", valueColumnName = "CORRELATIVO", pkColumnValue = "FLUJO_DETALLE", allocationSize = 1)
    //@Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "EXTERNAL_ID")
    private String externalId;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "IS_UNREAD")
    private Character isUnread;
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
    @JoinColumn(name = "PARTY_TYPE_ID", referencedColumnName = "PARTY_TYPE_ID")
    @ManyToOne
    private PartyType partyTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PREFERRED_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom preferredCurrencyUomId;
    @JoinColumn(name = "DOCUMENT_TYPE_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration documentTypeId;
    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;
    
    /*
    @OneToMany(mappedBy = "partyIdTo")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "partyIdFrom")
    private List<Shipment> shipmentList1;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @OneToMany(mappedBy = "partyId")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "supplierPartyId")
    private List<Lot> lotList;
    @OneToMany(mappedBy = "partyIdFrom")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "partyIdTo")
    private List<Payment> paymentList1;
    @OneToMany(mappedBy = "fromPartyId")
    private List<CustRequest> custRequestList;
    @OneToMany(mappedBy = "toPartyId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "fromPartyId")
    private List<ReturnHeader> returnHeaderList1;
    @OneToMany(mappedBy = "defaultShipCarrierPartyId")
    private List<ProductStore> productStoreList;
    @OneToMany(mappedBy = "billToThirdPartyId")
    private List<ProductStore> productStoreList1;
    @OneToMany(mappedBy = "payToPartyId")
    private List<ProductStore> productStoreList2;
    @OneToMany(mappedBy = "partyId")
    private List<AcctgTransEntry> acctgTransEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<AcctgTagEnumType> acctgTagEnumTypeList;
    @OneToMany(mappedBy = "partyId")
    private List<UserLogin> userLoginList;
    @OneToMany(mappedBy = "partyId")
    private List<InventoryItem> inventoryItemList;
    @OneToMany(mappedBy = "ownerPartyId")
    private List<InventoryItem> inventoryItemList1;
    @OneToMany(mappedBy = "partyId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "billToPartyId")
    private List<OrderHeader> orderHeaderList;
    @OneToMany(mappedBy = "billFromPartyId")
    private List<OrderHeader> orderHeaderList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private PartyGroup partyGroup;
    @OneToMany(mappedBy = "ownerPartyId")
    private List<Facility> facilityList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<GlJournal> glJournalList;
    @OneToMany(mappedBy = "partyId")
    private List<FixedAsset> fixedAssetList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private AcctgTagPostingCheck acctgTagPostingCheck;
    @OneToMany(mappedBy = "agentPartyId")
    private List<AgreementTermBilling> agreementTermBillingList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private Person person;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<Employment> employmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party1")
    private List<Employment> employmentList1;
    @OneToMany(mappedBy = "performedByPartyId")
    private List<FinAccountTrans> finAccountTransList;
    @OneToMany(mappedBy = "partyId")
    private List<FinAccountTrans> finAccountTransList1;
    @OneToMany(mappedBy = "carrierPartyId")
    private List<CarrierReturnService> carrierReturnServiceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<TaxAuthority> taxAuthorityList;
    @OneToMany(mappedBy = "vendorPartyId")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(mappedBy = "carrierPartyId")
    private List<OrderItemShipGroup> orderItemShipGroupList1;
    @OneToMany(mappedBy = "supplierPartyId")
    private List<OrderItemShipGroup> orderItemShipGroupList2;
    @OneToMany(mappedBy = "partyId")
    private List<AccountBalanceHistory> accountBalanceHistoryList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<AccountBalanceHistory> accountBalanceHistoryList1;
    @OneToMany(mappedBy = "partyId")
    private List<PaymentMethod> paymentMethodList;
    @OneToMany(mappedBy = "partyId")
    private List<Visitor> visitorList;
    @OneToMany(mappedBy = "manufacturerPartyId")
    private List<Product> productList;
    @OneToMany(mappedBy = "partyIdFrom")
    private List<Invoice> invoiceList;
    @OneToMany(mappedBy = "partyId")
    private List<Invoice> invoiceList1;
    @OneToMany(mappedBy = "partyId")
    private List<CustRequestType> custRequestTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<GlAccountOrganization> glAccountOrganizationList;
    @OneToMany(mappedBy = "noteParty")
    private List<NoteData> noteDataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<CarrierShipmentMethod> carrierShipmentMethodList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<AgreementPartyApplic> agreementPartyApplicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<AgreementTypeForRoleType> agreementTypeForRoleTypeList;
    @OneToMany(mappedBy = "partyId")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<PartyRole> partyRoleList;
    @OneToMany(mappedBy = "overrideOrgPartyId")
    private List<ProductPromo> productPromoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "party")
    private Affiliate affiliate;
    @OneToMany(mappedBy = "ownerPartyId")
    private List<FinAccount> finAccountList;
    @OneToMany(mappedBy = "organizationPartyId")
    private List<FinAccount> finAccountList1;
    @OneToMany(mappedBy = "partyId")
    private List<Quote> quoteList;
    @OneToMany(mappedBy = "contactPartyId")
    private List<Quote> quoteList1;
    @OneToMany(mappedBy = "createdByPartyId")
    private List<Quote> quoteList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
    private List<AgreementRole> agreementRoleList;
    @OneToMany(mappedBy = "overrideOrgPartyId")
    private List<InvoiceItem> invoiceItemList;
    @OneToMany(mappedBy = "taxAuthPartyId")
    private List<InvoiceItem> invoiceItemList1;*/

    public Party() {
    }

    public Party(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Character getIsUnread() {
        return isUnread;
    }

    public void setIsUnread(Character isUnread) {
        this.isUnread = isUnread;
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
    public PartyType getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(PartyType partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }    

    public Uom getPreferredCurrencyUomId() {
        return preferredCurrencyUomId;
    }

    public void setPreferredCurrencyUomId(Uom preferredCurrencyUomId) {
        this.preferredCurrencyUomId = preferredCurrencyUomId;
    }
/*
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public List<Shipment> getShipmentList1() {
        return shipmentList1;
    }

    public void setShipmentList1(List<Shipment> shipmentList1) {
        this.shipmentList1 = shipmentList1;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<Lot> getLotList() {
        return lotList;
    }

    public void setLotList(List<Lot> lotList) {
        this.lotList = lotList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<Payment> getPaymentList1() {
        return paymentList1;
    }

    public void setPaymentList1(List<Payment> paymentList1) {
        this.paymentList1 = paymentList1;
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

    public List<ProductStore> getProductStoreList() {
        return productStoreList;
    }

    public void setProductStoreList(List<ProductStore> productStoreList) {
        this.productStoreList = productStoreList;
    }

    public List<ProductStore> getProductStoreList1() {
        return productStoreList1;
    }

    public void setProductStoreList1(List<ProductStore> productStoreList1) {
        this.productStoreList1 = productStoreList1;
    }

    public List<ProductStore> getProductStoreList2() {
        return productStoreList2;
    }

    public void setProductStoreList2(List<ProductStore> productStoreList2) {
        this.productStoreList2 = productStoreList2;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    public List<AcctgTagEnumType> getAcctgTagEnumTypeList() {
        return acctgTagEnumTypeList;
    }

    public void setAcctgTagEnumTypeList(List<AcctgTagEnumType> acctgTagEnumTypeList) {
        this.acctgTagEnumTypeList = acctgTagEnumTypeList;
    }

    public List<UserLogin> getUserLoginList() {
        return userLoginList;
    }

    public void setUserLoginList(List<UserLogin> userLoginList) {
        this.userLoginList = userLoginList;
    }

    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

    public List<InventoryItem> getInventoryItemList1() {
        return inventoryItemList1;
    }

    public void setInventoryItemList1(List<InventoryItem> inventoryItemList1) {
        this.inventoryItemList1 = inventoryItemList1;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public List<OrderHeader> getOrderHeaderList1() {
        return orderHeaderList1;
    }

    public void setOrderHeaderList1(List<OrderHeader> orderHeaderList1) {
        this.orderHeaderList1 = orderHeaderList1;
    }

    public PartyGroup getPartyGroup() {
        return partyGroup;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public List<GlJournal> getGlJournalList() {
        return glJournalList;
    }

    public void setGlJournalList(List<GlJournal> glJournalList) {
        this.glJournalList = glJournalList;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public AcctgTagPostingCheck getAcctgTagPostingCheck() {
        return acctgTagPostingCheck;
    }

    public void setAcctgTagPostingCheck(AcctgTagPostingCheck acctgTagPostingCheck) {
        this.acctgTagPostingCheck = acctgTagPostingCheck;
    }

    public List<AgreementTermBilling> getAgreementTermBillingList() {
        return agreementTermBillingList;
    }

    public void setAgreementTermBillingList(List<AgreementTermBilling> agreementTermBillingList) {
        this.agreementTermBillingList = agreementTermBillingList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public List<FinAccountTrans> getFinAccountTransList() {
        return finAccountTransList;
    }

    public void setFinAccountTransList(List<FinAccountTrans> finAccountTransList) {
        this.finAccountTransList = finAccountTransList;
    }

    public List<FinAccountTrans> getFinAccountTransList1() {
        return finAccountTransList1;
    }

    public void setFinAccountTransList1(List<FinAccountTrans> finAccountTransList1) {
        this.finAccountTransList1 = finAccountTransList1;
    }

    public List<CarrierReturnService> getCarrierReturnServiceList() {
        return carrierReturnServiceList;
    }

    public void setCarrierReturnServiceList(List<CarrierReturnService> carrierReturnServiceList) {
        this.carrierReturnServiceList = carrierReturnServiceList;
    }

    public List<TaxAuthority> getTaxAuthorityList() {
        return taxAuthorityList;
    }

    public void setTaxAuthorityList(List<TaxAuthority> taxAuthorityList) {
        this.taxAuthorityList = taxAuthorityList;
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

    public List<OrderItemShipGroup> getOrderItemShipGroupList2() {
        return orderItemShipGroupList2;
    }

    public void setOrderItemShipGroupList2(List<OrderItemShipGroup> orderItemShipGroupList2) {
        this.orderItemShipGroupList2 = orderItemShipGroupList2;
    }

    public List<AccountBalanceHistory> getAccountBalanceHistoryList() {
        return accountBalanceHistoryList;
    }

    public void setAccountBalanceHistoryList(List<AccountBalanceHistory> accountBalanceHistoryList) {
        this.accountBalanceHistoryList = accountBalanceHistoryList;
    }

    public List<AccountBalanceHistory> getAccountBalanceHistoryList1() {
        return accountBalanceHistoryList1;
    }

    public void setAccountBalanceHistoryList1(List<AccountBalanceHistory> accountBalanceHistoryList1) {
        this.accountBalanceHistoryList1 = accountBalanceHistoryList1;
    }

    public List<PaymentMethod> getPaymentMethodList() {
        return paymentMethodList;
    }

    public void setPaymentMethodList(List<PaymentMethod> paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }

    public List<Visitor> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<Visitor> visitorList) {
        this.visitorList = visitorList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public List<Invoice> getInvoiceList1() {
        return invoiceList1;
    }

    public void setInvoiceList1(List<Invoice> invoiceList1) {
        this.invoiceList1 = invoiceList1;
    }

    public List<CustRequestType> getCustRequestTypeList() {
        return custRequestTypeList;
    }

    public void setCustRequestTypeList(List<CustRequestType> custRequestTypeList) {
        this.custRequestTypeList = custRequestTypeList;
    }*/
/*
    public List<GlAccountOrganization> getGlAccountOrganizationList() {
        return glAccountOrganizationList;
    }

    public void setGlAccountOrganizationList(List<GlAccountOrganization> glAccountOrganizationList) {
        this.glAccountOrganizationList = glAccountOrganizationList;
    }

    public List<NoteData> getNoteDataList() {
        return noteDataList;
    }

    public void setNoteDataList(List<NoteData> noteDataList) {
        this.noteDataList = noteDataList;
    }

    public List<CarrierShipmentMethod> getCarrierShipmentMethodList() {
        return carrierShipmentMethodList;
    }

    public void setCarrierShipmentMethodList(List<CarrierShipmentMethod> carrierShipmentMethodList) {
        this.carrierShipmentMethodList = carrierShipmentMethodList;
    }

    public List<AgreementPartyApplic> getAgreementPartyApplicList() {
        return agreementPartyApplicList;
    }

    public void setAgreementPartyApplicList(List<AgreementPartyApplic> agreementPartyApplicList) {
        this.agreementPartyApplicList = agreementPartyApplicList;
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
    }

    public List<ProductPromo> getProductPromoList() {
        return productPromoList;
    }

    public void setProductPromoList(List<ProductPromo> productPromoList) {
        this.productPromoList = productPromoList;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }

    public List<FinAccount> getFinAccountList() {
        return finAccountList;
    }

    public void setFinAccountList(List<FinAccount> finAccountList) {
        this.finAccountList = finAccountList;
    }

    public List<FinAccount> getFinAccountList1() {
        return finAccountList1;
    }

    public void setFinAccountList1(List<FinAccount> finAccountList1) {
        this.finAccountList1 = finAccountList1;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    public List<Quote> getQuoteList1() {
        return quoteList1;
    }

    public void setQuoteList1(List<Quote> quoteList1) {
        this.quoteList1 = quoteList1;
    }

    public List<Quote> getQuoteList2() {
        return quoteList2;
    }

    public void setQuoteList2(List<Quote> quoteList2) {
        this.quoteList2 = quoteList2;
    }

    public List<AgreementRole> getAgreementRoleList() {
        return agreementRoleList;
    }

    public void setAgreementRoleList(List<AgreementRole> agreementRoleList) {
        this.agreementRoleList = agreementRoleList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    public List<InvoiceItem> getInvoiceItemList1() {
        return invoiceItemList1;
    }

    public void setInvoiceItemList1(List<InvoiceItem> invoiceItemList1) {
        this.invoiceItemList1 = invoiceItemList1;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Party)) {
            return false;
        }
        Party other = (Party) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Party[ partyId=" + partyId + " ]";
    }
/*
    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }

    public List<ContactList> getContactListList() {
        return contactListList;
    }

    public void setContactListList(List<ContactList> contactListList) {
        this.contactListList = contactListList;
    }

    public List<CommunicationEventRole> getCommunicationEventRoleList() {
        return communicationEventRoleList;
    }

    public void setCommunicationEventRoleList(List<CommunicationEventRole> communicationEventRoleList) {
        this.communicationEventRoleList = communicationEventRoleList;
    }

    public List<ContentRevision> getContentRevisionList() {
        return contentRevisionList;
    }

    public void setContentRevisionList(List<ContentRevision> contentRevisionList) {
        this.contentRevisionList = contentRevisionList;
    }

    public List<ContactListParty> getContactListPartyList() {
        return contactListPartyList;
    }

    public void setContactListPartyList(List<ContactListParty> contactListPartyList) {
        this.contactListPartyList = contactListPartyList;
    }

    public List<BudgetRole> getBudgetRoleList() {
        return budgetRoleList;
    }

    public void setBudgetRoleList(List<BudgetRole> budgetRoleList) {
        this.budgetRoleList = budgetRoleList;
    }

    public List<BudgetReview> getBudgetReviewList() {
        return budgetReviewList;
    }

    public void setBudgetReviewList(List<BudgetReview> budgetReviewList) {
        this.budgetReviewList = budgetReviewList;
    }

    public List<CarrierShipmentBoxType> getCarrierShipmentBoxTypeList() {
        return carrierShipmentBoxTypeList;
    }

    public void setCarrierShipmentBoxTypeList(List<CarrierShipmentBoxType> carrierShipmentBoxTypeList) {
        this.carrierShipmentBoxTypeList = carrierShipmentBoxTypeList;
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

    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
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

    public List<ContentApproval> getContentApprovalList() {
        return contentApprovalList;
    }

    public void setContentApprovalList(List<ContentApproval> contentApprovalList) {
        this.contentApprovalList = contentApprovalList;
    }

    public List<BillingAccountRole> getBillingAccountRoleList() {
        return billingAccountRoleList;
    }

    public void setBillingAccountRoleList(List<BillingAccountRole> billingAccountRoleList) {
        this.billingAccountRoleList = billingAccountRoleList;
    }

    public List<CustomTimePeriod> getCustomTimePeriodList() {
        return customTimePeriodList;
    }

    public void setCustomTimePeriodList(List<CustomTimePeriod> customTimePeriodList) {
        this.customTimePeriodList = customTimePeriodList;
    }

    public List<EmplPosition> getEmplPositionList() {
        return emplPositionList;
    }

    public void setEmplPositionList(List<EmplPosition> emplPositionList) {
        this.emplPositionList = emplPositionList;
    }

    public List<EmployeePaycheckType> getEmployeePaycheckTypeList() {
        return employeePaycheckTypeList;
    }

    public void setEmployeePaycheckTypeList(List<EmployeePaycheckType> employeePaycheckTypeList) {
        this.employeePaycheckTypeList = employeePaycheckTypeList;
    }

    public List<EmployeePaycheckType> getEmployeePaycheckTypeList1() {
        return employeePaycheckTypeList1;
    }

    public void setEmployeePaycheckTypeList1(List<EmployeePaycheckType> employeePaycheckTypeList1) {
        this.employeePaycheckTypeList1 = employeePaycheckTypeList1;
    }

    public List<EmplPositionFulfillment> getEmplPositionFulfillmentList() {
        return emplPositionFulfillmentList;
    }

    public void setEmplPositionFulfillmentList(List<EmplPositionFulfillment> emplPositionFulfillmentList) {
        this.emplPositionFulfillmentList = emplPositionFulfillmentList;
    }

    public List<EmplLeave> getEmplLeaveList() {
        return emplLeaveList;
    }

    public void setEmplLeaveList(List<EmplLeave> emplLeaveList) {
        this.emplLeaveList = emplLeaveList;
    }

    public List<InvoiceAdjustmentGlAccount> getInvoiceAdjustmentGlAccountList() {
        return invoiceAdjustmentGlAccountList;
    }

    public void setInvoiceAdjustmentGlAccountList(List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList) {
        this.invoiceAdjustmentGlAccountList = invoiceAdjustmentGlAccountList;
    }

    public List<ItemIssuanceRole> getItemIssuanceRoleList() {
        return itemIssuanceRoleList;
    }

    public void setItemIssuanceRoleList(List<ItemIssuanceRole> itemIssuanceRoleList) {
        this.itemIssuanceRoleList = itemIssuanceRoleList;
    }

    public List<InvoiceGlAccountType> getInvoiceGlAccountTypeList() {
        return invoiceGlAccountTypeList;
    }

    public void setInvoiceGlAccountTypeList(List<InvoiceGlAccountType> invoiceGlAccountTypeList) {
        this.invoiceGlAccountTypeList = invoiceGlAccountTypeList;
    }

    public List<GlAccountTypeDefault> getGlAccountTypeDefaultList() {
        return glAccountTypeDefaultList;
    }

    public void setGlAccountTypeDefaultList(List<GlAccountTypeDefault> glAccountTypeDefaultList) {
        this.glAccountTypeDefaultList = glAccountTypeDefaultList;
    }

    public List<InvoiceItemTypeGlAccount> getInvoiceItemTypeGlAccountList() {
        return invoiceItemTypeGlAccountList;
    }

    public void setInvoiceItemTypeGlAccountList(List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList) {
        this.invoiceItemTypeGlAccountList = invoiceItemTypeGlAccountList;
    }

    public List<GiftCardFulfillment> getGiftCardFulfillmentList() {
        return giftCardFulfillmentList;
    }

    public void setGiftCardFulfillmentList(List<GiftCardFulfillment> giftCardFulfillmentList) {
        this.giftCardFulfillmentList = giftCardFulfillmentList;
    }

    public List<GlReconciliation> getGlReconciliationList() {
        return glReconciliationList;
    }

    public void setGlReconciliationList(List<GlReconciliation> glReconciliationList) {
        this.glReconciliationList = glReconciliationList;
    }

    public List<GlAccountHistory> getGlAccountHistoryList() {
        return glAccountHistoryList;
    }

    public void setGlAccountHistoryList(List<GlAccountHistory> glAccountHistoryList) {
        this.glAccountHistoryList = glAccountHistoryList;
    }

    public List<InvoiceRole> getInvoiceRoleList() {
        return invoiceRoleList;
    }

    public void setInvoiceRoleList(List<InvoiceRole> invoiceRoleList) {
        this.invoiceRoleList = invoiceRoleList;
    }

    public List<OrderItemRole> getOrderItemRoleList() {
        return orderItemRoleList;
    }

    public void setOrderItemRoleList(List<OrderItemRole> orderItemRoleList) {
        this.orderItemRoleList = orderItemRoleList;
    }

    public List<OrderRole> getOrderRoleList() {
        return orderRoleList;
    }

    public void setOrderRoleList(List<OrderRole> orderRoleList) {
        this.orderRoleList = orderRoleList;
    }

    public List<OrderShipmentPreference> getOrderShipmentPreferenceList() {
        return orderShipmentPreferenceList;
    }

    public void setOrderShipmentPreferenceList(List<OrderShipmentPreference> orderShipmentPreferenceList) {
        this.orderShipmentPreferenceList = orderShipmentPreferenceList;
    }

    public List<PartyAttribute> getPartyAttributeList() {
        return partyAttributeList;
    }

    public void setPartyAttributeList(List<PartyAttribute> partyAttributeList) {
        this.partyAttributeList = partyAttributeList;
    }

    public List<PartyTaxInfo> getPartyTaxInfoList() {
        return partyTaxInfoList;
    }

    public void setPartyTaxInfoList(List<PartyTaxInfo> partyTaxInfoList) {
        this.partyTaxInfoList = partyTaxInfoList;
    }

    public List<PartyResume> getPartyResumeList() {
        return partyResumeList;
    }

    public void setPartyResumeList(List<PartyResume> partyResumeList) {
        this.partyResumeList = partyResumeList;
    }

    public List<PartyNameHistory> getPartyNameHistoryList() {
        return partyNameHistoryList;
    }

    public void setPartyNameHistoryList(List<PartyNameHistory> partyNameHistoryList) {
        this.partyNameHistoryList = partyNameHistoryList;
    }

    public List<ProductPromoUse> getProductPromoUseList() {
        return productPromoUseList;
    }

    public void setProductPromoUseList(List<ProductPromoUse> productPromoUseList) {
        this.productPromoUseList = productPromoUseList;
    }

    public List<PartyQual> getPartyQualList() {
        return partyQualList;
    }

    public void setPartyQualList(List<PartyQual> partyQualList) {
        this.partyQualList = partyQualList;
    }

    public List<PartyClassification> getPartyClassificationList() {
        return partyClassificationList;
    }

    public void setPartyClassificationList(List<PartyClassification> partyClassificationList) {
        this.partyClassificationList = partyClassificationList;
    }

    public List<PartySkill> getPartySkillList() {
        return partySkillList;
    }

    public void setPartySkillList(List<PartySkill> partySkillList) {
        this.partySkillList = partySkillList;
    }

    public List<PaycheckItem> getPaycheckItemList() {
        return paycheckItemList;
    }

    public void setPaycheckItemList(List<PaycheckItem> paycheckItemList) {
        this.paycheckItemList = paycheckItemList;
    }

    public List<PartyRate> getPartyRateList() {
        return partyRateList;
    }

    public void setPartyRateList(List<PartyRate> partyRateList) {
        this.partyRateList = partyRateList;
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

    public List<PaymentGlAccountTypeMap> getPaymentGlAccountTypeMapList() {
        return paymentGlAccountTypeMapList;
    }

    public void setPaymentGlAccountTypeMapList(List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList) {
        this.paymentGlAccountTypeMapList = paymentGlAccountTypeMapList;
    }

    public List<PartyContent> getPartyContentList() {
        return partyContentList;
    }

    public void setPartyContentList(List<PartyContent> partyContentList) {
        this.partyContentList = partyContentList;
    }

    public List<PersonTraining> getPersonTrainingList() {
        return personTrainingList;
    }

    public void setPersonTrainingList(List<PersonTraining> personTrainingList) {
        this.personTrainingList = personTrainingList;
    }

    public List<PayrollPreference> getPayrollPreferenceList() {
        return payrollPreferenceList;
    }

    public void setPayrollPreferenceList(List<PayrollPreference> payrollPreferenceList) {
        this.payrollPreferenceList = payrollPreferenceList;
    }

    public List<PartyInvitation> getPartyInvitationList() {
        return partyInvitationList;
    }

    public void setPartyInvitationList(List<PartyInvitation> partyInvitationList) {
        this.partyInvitationList = partyInvitationList;
    }*/
/*
    public PartyAcctgPreference getPartyAcctgPreference() {
        return partyAcctgPreference;
    }

    public void setPartyAcctgPreference(PartyAcctgPreference partyAcctgPreference) {
        this.partyAcctgPreference = partyAcctgPreference;
    }

    public List<ProductCategoryGlAccount> getProductCategoryGlAccountList() {
        return productCategoryGlAccountList;
    }

    public void setProductCategoryGlAccountList(List<ProductCategoryGlAccount> productCategoryGlAccountList) {
        this.productCategoryGlAccountList = productCategoryGlAccountList;
    }

    public List<ProductAverageCost> getProductAverageCostList() {
        return productAverageCostList;
    }

    public void setProductAverageCostList(List<ProductAverageCost> productAverageCostList) {
        this.productAverageCostList = productAverageCostList;
    }

    public List<PerfReviewItem> getPerfReviewItemList() {
        return perfReviewItemList;
    }

    public void setPerfReviewItemList(List<PerfReviewItem> perfReviewItemList) {
        this.perfReviewItemList = perfReviewItemList;
    }

    public List<PartyDataSource> getPartyDataSourceList() {
        return partyDataSourceList;
    }

    public void setPartyDataSourceList(List<PartyDataSource> partyDataSourceList) {
        this.partyDataSourceList = partyDataSourceList;
    }

    public List<PartyCarrierAccount> getPartyCarrierAccountList() {
        return partyCarrierAccountList;
    }

    public void setPartyCarrierAccountList(List<PartyCarrierAccount> partyCarrierAccountList) {
        this.partyCarrierAccountList = partyCarrierAccountList;
    }

    public List<PartyCarrierAccount> getPartyCarrierAccountList1() {
        return partyCarrierAccountList1;
    }

    public void setPartyCarrierAccountList1(List<PartyCarrierAccount> partyCarrierAccountList1) {
        this.partyCarrierAccountList1 = partyCarrierAccountList1;
    }

    public List<PartyNote> getPartyNoteList() {
        return partyNoteList;
    }

    public void setPartyNoteList(List<PartyNote> partyNoteList) {
        this.partyNoteList = partyNoteList;
    }

    public PartyIcsAvsOverride getPartyIcsAvsOverride() {
        return partyIcsAvsOverride;
    }

    public void setPartyIcsAvsOverride(PartyIcsAvsOverride partyIcsAvsOverride) {
        this.partyIcsAvsOverride = partyIcsAvsOverride;
    }

    public List<ProductGlAccount> getProductGlAccountList() {
        return productGlAccountList;
    }

    public void setProductGlAccountList(List<ProductGlAccount> productGlAccountList) {
        this.productGlAccountList = productGlAccountList;
    }

    public List<PartyGeoPoint> getPartyGeoPointList() {
        return partyGeoPointList;
    }

    public void setPartyGeoPointList(List<PartyGeoPoint> partyGeoPointList) {
        this.partyGeoPointList = partyGeoPointList;
    }

    public List<PartyGlAccount> getPartyGlAccountList() {
        return partyGlAccountList;
    }

    public void setPartyGlAccountList(List<PartyGlAccount> partyGlAccountList) {
        this.partyGlAccountList = partyGlAccountList;
    }

    public List<PartyGlAccount> getPartyGlAccountList1() {
        return partyGlAccountList1;
    }

    public void setPartyGlAccountList1(List<PartyGlAccount> partyGlAccountList1) {
        this.partyGlAccountList1 = partyGlAccountList1;
    }

    public List<PartyProfileDefault> getPartyProfileDefaultList() {
        return partyProfileDefaultList;
    }

    public void setPartyProfileDefaultList(List<PartyProfileDefault> partyProfileDefaultList) {
        this.partyProfileDefaultList = partyProfileDefaultList;
    }

    public List<PartyTaxAuthInfo> getPartyTaxAuthInfoList() {
        return partyTaxAuthInfoList;
    }

    public void setPartyTaxAuthInfoList(List<PartyTaxAuthInfo> partyTaxAuthInfoList) {
        this.partyTaxAuthInfoList = partyTaxAuthInfoList;
    }

    public List<PerformanceNote> getPerformanceNoteList() {
        return performanceNoteList;
    }

    public void setPerformanceNoteList(List<PerformanceNote> performanceNoteList) {
        this.performanceNoteList = performanceNoteList;
    }

    public List<ProductStoreVendorPayment> getProductStoreVendorPaymentList() {
        return productStoreVendorPaymentList;
    }

    public void setProductStoreVendorPaymentList(List<ProductStoreVendorPayment> productStoreVendorPaymentList) {
        this.productStoreVendorPaymentList = productStoreVendorPaymentList;
    }

    public List<PartyContactMechPurpose> getPartyContactMechPurposeList() {
        return partyContactMechPurposeList;
    }

    public void setPartyContactMechPurposeList(List<PartyContactMechPurpose> partyContactMechPurposeList) {
        this.partyContactMechPurposeList = partyContactMechPurposeList;
    }

    public List<ProductStoreVendorShipment> getProductStoreVendorShipmentList() {
        return productStoreVendorShipmentList;
    }

    public void setProductStoreVendorShipmentList(List<ProductStoreVendorShipment> productStoreVendorShipmentList) {
        this.productStoreVendorShipmentList = productStoreVendorShipmentList;
    }

    public List<ProductStoreVendorShipment> getProductStoreVendorShipmentList1() {
        return productStoreVendorShipmentList1;
    }

    public void setProductStoreVendorShipmentList1(List<ProductStoreVendorShipment> productStoreVendorShipmentList1) {
        this.productStoreVendorShipmentList1 = productStoreVendorShipmentList1;
    }

    public List<PerfReview> getPerfReviewList() {
        return perfReviewList;
    }

    public void setPerfReviewList(List<PerfReview> perfReviewList) {
        this.perfReviewList = perfReviewList;
    }

    public List<PerfReview> getPerfReviewList1() {
        return perfReviewList1;
    }

    public void setPerfReviewList1(List<PerfReview> perfReviewList1) {
        this.perfReviewList1 = perfReviewList1;
    }

    public List<PartyStatus> getPartyStatusList() {
        return partyStatusList;
    }

    public void setPartyStatusList(List<PartyStatus> partyStatusList) {
        this.partyStatusList = partyStatusList;
    }

    public List<PartyInvitationGroupAssoc> getPartyInvitationGroupAssocList() {
        return partyInvitationGroupAssocList;
    }

    public void setPartyInvitationGroupAssocList(List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList) {
        this.partyInvitationGroupAssocList = partyInvitationGroupAssocList;
    }

    public PartySupplementalData getPartySupplementalData() {
        return partySupplementalData;
    }

    public void setPartySupplementalData(PartySupplementalData partySupplementalData) {
        this.partySupplementalData = partySupplementalData;
    }

    public List<PartySupplementalData> getPartySupplementalDataList() {
        return partySupplementalDataList;
    }

    public void setPartySupplementalDataList(List<PartySupplementalData> partySupplementalDataList) {
        this.partySupplementalDataList = partySupplementalDataList;
    }

    public List<PaymentMethodTypeGlAccount> getPaymentMethodTypeGlAccountList() {
        return paymentMethodTypeGlAccountList;
    }

    public void setPaymentMethodTypeGlAccountList(List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList) {
        this.paymentMethodTypeGlAccountList = paymentMethodTypeGlAccountList;
    }

    public List<PartyRateNew> getPartyRateNewList() {
        return partyRateNewList;
    }

    public void setPartyRateNewList(List<PartyRateNew> partyRateNewList) {
        this.partyRateNewList = partyRateNewList;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<ProductPromoCodeParty> getProductPromoCodePartyList() {
        return productPromoCodePartyList;
    }

    public void setProductPromoCodePartyList(List<ProductPromoCodeParty> productPromoCodePartyList) {
        this.productPromoCodePartyList = productPromoCodePartyList;
    }

    public List<PartyContactMech> getPartyContactMechList() {
        return partyContactMechList;
    }

    public void setPartyContactMechList(List<PartyContactMech> partyContactMechList) {
        this.partyContactMechList = partyContactMechList;
    }

    public List<PaycheckItemTypeGlAccount> getPaycheckItemTypeGlAccountList() {
        return paycheckItemTypeGlAccountList;
    }

    public void setPaycheckItemTypeGlAccountList(List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList) {
        this.paycheckItemTypeGlAccountList = paycheckItemTypeGlAccountList;
    }

    public List<PaycheckItemTypeGlAccount> getPaycheckItemTypeGlAccountList1() {
        return paycheckItemTypeGlAccountList1;
    }

    public void setPaycheckItemTypeGlAccountList1(List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList1) {
        this.paycheckItemTypeGlAccountList1 = paycheckItemTypeGlAccountList1;
    }

    public List<ServerHit> getServerHitList() {
        return serverHitList;
    }

    public void setServerHitList(List<ServerHit> serverHitList) {
        this.serverHitList = serverHitList;
    }

    public List<SalesForecast> getSalesForecastList() {
        return salesForecastList;
    }

    public void setSalesForecastList(List<SalesForecast> salesForecastList) {
        this.salesForecastList = salesForecastList;
    }

    public List<SalesForecast> getSalesForecastList1() {
        return salesForecastList1;
    }

    public void setSalesForecastList1(List<SalesForecast> salesForecastList1) {
        this.salesForecastList1 = salesForecastList1;
    }

    public List<ShipmentCostEstimate> getShipmentCostEstimateList() {
        return shipmentCostEstimateList;
    }

    public void setShipmentCostEstimateList(List<ShipmentCostEstimate> shipmentCostEstimateList) {
        this.shipmentCostEstimateList = shipmentCostEstimateList;
    }

    public List<TimeEntry> getTimeEntryList() {
        return timeEntryList;
    }

    public void setTimeEntryList(List<TimeEntry> timeEntryList) {
        this.timeEntryList = timeEntryList;
    }

    public List<RespondingParty> getRespondingPartyList() {
        return respondingPartyList;
    }

    public void setRespondingPartyList(List<RespondingParty> respondingPartyList) {
        this.respondingPartyList = respondingPartyList;
    }

    public List<SupplierProductFeature> getSupplierProductFeatureList() {
        return supplierProductFeatureList;
    }

    public void setSupplierProductFeatureList(List<SupplierProductFeature> supplierProductFeatureList) {
        this.supplierProductFeatureList = supplierProductFeatureList;
    }

    public List<WorkEffortAssignmentRate> getWorkEffortAssignmentRateList() {
        return workEffortAssignmentRateList;
    }

    public void setWorkEffortAssignmentRateList(List<WorkEffortAssignmentRate> workEffortAssignmentRateList) {
        this.workEffortAssignmentRateList = workEffortAssignmentRateList;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<TimesheetRole> getTimesheetRoleList() {
        return timesheetRoleList;
    }

    public void setTimesheetRoleList(List<TimesheetRole> timesheetRoleList) {
        this.timesheetRoleList = timesheetRoleList;
    }

    public List<SalesForecastHistory> getSalesForecastHistoryList() {
        return salesForecastHistoryList;
    }

    public void setSalesForecastHistoryList(List<SalesForecastHistory> salesForecastHistoryList) {
        this.salesForecastHistoryList = salesForecastHistoryList;
    }

    public List<SalesForecastHistory> getSalesForecastHistoryList1() {
        return salesForecastHistoryList1;
    }

    public void setSalesForecastHistoryList1(List<SalesForecastHistory> salesForecastHistoryList1) {
        this.salesForecastHistoryList1 = salesForecastHistoryList1;
    }

    public List<RateAmount> getRateAmountList() {
        return rateAmountList;
    }

    public void setRateAmountList(List<RateAmount> rateAmountList) {
        this.rateAmountList = rateAmountList;
    }

    public List<VendorProduct> getVendorProductList() {
        return vendorProductList;
    }

    public void setVendorProductList(List<VendorProduct> vendorProductList) {
        this.vendorProductList = vendorProductList;
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

    public List<Timesheet> getTimesheetList() {
        return timesheetList;
    }

    public void setTimesheetList(List<Timesheet> timesheetList) {
        this.timesheetList = timesheetList;
    }*/
/*
    public List<Timesheet> getTimesheetList1() {
        return timesheetList1;
    }

    public void setTimesheetList1(List<Timesheet> timesheetList1) {
        this.timesheetList1 = timesheetList1;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }

    public List<ReorderGuideline> getReorderGuidelineList() {
        return reorderGuidelineList;
    }

    public void setReorderGuidelineList(List<ReorderGuideline> reorderGuidelineList) {
        this.reorderGuidelineList = reorderGuidelineList;
    }

    public List<UserLoginHistory> getUserLoginHistoryList() {
        return userLoginHistoryList;
    }

    public void setUserLoginHistoryList(List<UserLoginHistory> userLoginHistoryList) {
        this.userLoginHistoryList = userLoginHistoryList;
    }

    public List<WebUserPreference> getWebUserPreferenceList() {
        return webUserPreferenceList;
    }

    public void setWebUserPreferenceList(List<WebUserPreference> webUserPreferenceList) {
        this.webUserPreferenceList = webUserPreferenceList;
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
    }

    public List<ValueLinkFulfillment> getValueLinkFulfillmentList() {
        return valueLinkFulfillmentList;
    }

    public void setValueLinkFulfillmentList(List<ValueLinkFulfillment> valueLinkFulfillmentList) {
        this.valueLinkFulfillmentList = valueLinkFulfillmentList;
    }

    public List<VarianceReasonGlAccount> getVarianceReasonGlAccountList() {
        return varianceReasonGlAccountList;
    }

    public void setVarianceReasonGlAccountList(List<VarianceReasonGlAccount> varianceReasonGlAccountList) {
        this.varianceReasonGlAccountList = varianceReasonGlAccountList;
    }

    public List<ShipmentReceiptRole> getShipmentReceiptRoleList() {
        return shipmentReceiptRoleList;
    }

    public void setShipmentReceiptRoleList(List<ShipmentReceiptRole> shipmentReceiptRoleList) {
        this.shipmentReceiptRoleList = shipmentReceiptRoleList;
    }

    public List<TaxAuthorityGlAccount> getTaxAuthorityGlAccountList() {
        return taxAuthorityGlAccountList;
    }

    public void setTaxAuthorityGlAccountList(List<TaxAuthorityGlAccount> taxAuthorityGlAccountList) {
        this.taxAuthorityGlAccountList = taxAuthorityGlAccountList;
    }

    public List<SalesForecastItem> getSalesForecastItemList() {
        return salesForecastItemList;
    }

    public void setSalesForecastItemList(List<SalesForecastItem> salesForecastItemList) {
        this.salesForecastItemList = salesForecastItemList;
    }

    public List<SupplierProduct> getSupplierProductList() {
        return supplierProductList;
    }

    public void setSupplierProductList(List<SupplierProduct> supplierProductList) {
        this.supplierProductList = supplierProductList;
    }

    public List<RequirementRole> getRequirementRoleList() {
        return requirementRoleList;
    }

    public void setRequirementRoleList(List<RequirementRole> requirementRoleList) {
        this.requirementRoleList = requirementRoleList;
    }*/
    
}
