/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "user_login")
public class UserLogin implements Serializable {
	/*
    @OneToMany(mappedBy = "setByUserLogin")
    private List<WorkEffortStatus> workEffortStatusList;
    @OneToMany(mappedBy = "userLoginId")
    private List<ServerHit> serverHitList;
    @OneToMany(mappedBy = "modifiedByUserLoginId")
    private List<SalesForecast> salesForecastList;
    @OneToMany(mappedBy = "createdByUserLoginId")
    private List<SalesForecast> salesForecastList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private UserLoginSession userLoginSession;
    @OneToMany(mappedBy = "modifiedByUserLogin")
    private List<SalesOpportunityHistory> salesOpportunityHistoryList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "modifiedByUserLoginId")
    private List<SalesForecastHistory> salesForecastHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<ViewPreference> viewPreferenceList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<WorkEffortReview> workEffortReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<UserLoginPasswordHistory> userLoginPasswordHistoryList;
    @OneToMany(mappedBy = "approvedByUserLoginId")
    private List<Timesheet> timesheetList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<OrderAdjustment> orderAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<UserLoginHistory> userLoginHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<WebUserPreference> webUserPreferenceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<UserLoginSecurityGroup> userLoginSecurityGroupList;
    @OneToMany(mappedBy = "modifiedByUserLogin")
    private List<ServiceTestRecord> serviceTestRecordList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ServiceTestRecord> serviceTestRecordList1;
    @OneToMany(mappedBy = "changeUserLoginId")
    private List<PicklistStatusHistory> picklistStatusHistoryList;
    @OneToMany(mappedBy = "changedByUserLogin")
    private List<ProductPriceChange> productPriceChangeList;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ProductPrice> productPriceList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ProductPrice> productPriceList1;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<PicklistRole> picklistRoleList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<PicklistRole> picklistRoleList1;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ProductFeaturePrice> productFeaturePriceList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ProductFeaturePrice> productFeaturePriceList1;
    @OneToMany(mappedBy = "userLoginId")
    private List<ProductReview> productReviewList;
    @OneToMany(mappedBy = "userLoginId")
    private List<KeyboardShortcut> keyboardShortcutList;
    @OneToMany(mappedBy = "runAsUser")
    private List<JobSandbox> jobSandboxList;
    @OneToMany(mappedBy = "authUserLoginId")
    private List<JobSandbox> jobSandboxList1;
    @OneToMany(mappedBy = "createdByUserLoginId")
    private List<LockboxBatch> lockboxBatchList;
    @OneToMany(mappedBy = "runByUserLogin")
    private List<InventoryItemTrace> inventoryItemTraceList;
    @OneToMany(mappedBy = "issuedByUserLoginId")
    private List<ItemIssuance> itemIssuanceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private List<EntityViewHistory> entityViewHistoryList;
    @OneToMany(mappedBy = "userLoginId")
    private List<DataWarehouseTransform> dataWarehouseTransformList;
    @OneToMany(mappedBy = "openUserLoginId")
    private List<CashDrawer> cashDrawerList;
    @OneToMany(mappedBy = "operatorUserLoginId")
    private List<CashDrawer> cashDrawerList1;
    @OneToMany(mappedBy = "closeUserLoginId")
    private List<CashDrawer> cashDrawerList2;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ContactList> contactListList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ContactList> contactListList1;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<Content> contentList;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<Content> contentList1;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ContentAssoc> contentAssocList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ContentAssoc> contentAssocList1;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Column(name = "CURRENT_PASSWORD")
    private String currentPassword;
    @Column(name = "PASSWORD_HINT")
    private String passwordHint;
    @Column(name = "IS_SYSTEM")
    private Character isSystem;
    @Column(name = "ENABLED")
    private Character enabled;
    @Column(name = "HAS_LOGGED_OUT")
    private Character hasLoggedOut;
    @Column(name = "REQUIRE_PASSWORD_CHANGE")
    private Character requirePasswordChange;
    @Column(name = "LAST_CURRENCY_UOM")
    private String lastCurrencyUom;
    @Column(name = "LAST_LOCALE")
    private String lastLocale;
    @Column(name = "LAST_TIME_ZONE")
    private String lastTimeZone;
    @Column(name = "DISABLED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date disabledDateTime;
    @Column(name = "SUCCESSIVE_FAILED_LOGINS")
    private BigInteger successiveFailedLogins;
    @Column(name = "USER_LDAP_DN")
    private String userLdapDn;
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
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    /*private List<Party> partyList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<Party> partyList1;
    @OneToMany(mappedBy = "receivedByUserLoginId")
    private List<ShipmentReceipt> shipmentReceiptList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<InvoiceAdjustment> invoiceAdjustmentList;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<DataResource> dataResourceList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<DataResource> dataResourceList1;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ProductPromoCode> productPromoCodeList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ProductPromoCode> productPromoCodeList1;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<SalesOpportunity> salesOpportunityList;*/
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @Column(name = "PARTY_COMPANY_ID")
    private String partyCompanyId;
    /*
    @OneToMany(mappedBy = "createdBy")
    private List<OrderHeader> orderHeaderList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<OrderPaymentPreference> orderPaymentPreferenceList;
    @OneToMany(mappedBy = "dontCancelSetUserLogin")
    private List<OrderItem> orderItemList;
    @OneToMany(mappedBy = "userLoginId")
    private List<Visitor> visitorList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<Product> productList;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<Product> productList1;
    @OneToMany(mappedBy = "lastModifiedByUserLogin")
    private List<ProductPromo> productPromoList;
    @OneToMany(mappedBy = "createdByUserLogin")
    private List<ProductPromo> productPromoList1;
    @OneToMany(mappedBy = "assignedByUserLoginId")
    private List<WorkEffortPartyAssignment> workEffortPartyAssignmentList;
*/
    public UserLogin() {
    }

    public UserLogin(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public Character getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Character isSystem) {
        this.isSystem = isSystem;
    }

    public Character getEnabled() {
        return enabled;
    }

    public void setEnabled(Character enabled) {
        this.enabled = enabled;
    }

    public Character getHasLoggedOut() {
        return hasLoggedOut;
    }

    public void setHasLoggedOut(Character hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut;
    }

    public Character getRequirePasswordChange() {
        return requirePasswordChange;
    }

    public void setRequirePasswordChange(Character requirePasswordChange) {
        this.requirePasswordChange = requirePasswordChange;
    }

    public String getLastCurrencyUom() {
        return lastCurrencyUom;
    }

    public void setLastCurrencyUom(String lastCurrencyUom) {
        this.lastCurrencyUom = lastCurrencyUom;
    }

    public String getLastLocale() {
        return lastLocale;
    }

    public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale;
    }

    public String getLastTimeZone() {
        return lastTimeZone;
    }

    public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone;
    }

    public Date getDisabledDateTime() {
        return disabledDateTime;
    }

    public void setDisabledDateTime(Date disabledDateTime) {
        this.disabledDateTime = disabledDateTime;
    }

    public BigInteger getSuccessiveFailedLogins() {
        return successiveFailedLogins;
    }

    public void setSuccessiveFailedLogins(BigInteger successiveFailedLogins) {
        this.successiveFailedLogins = successiveFailedLogins;
    }

    public String getUserLdapDn() {
        return userLdapDn;
    }

    public void setUserLdapDn(String userLdapDn) {
        this.userLdapDn = userLdapDn;
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

    /*public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<Party> getPartyList1() {
        return partyList1;
    }

    public void setPartyList1(List<Party> partyList1) {
        this.partyList1 = partyList1;
    }

    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }

    public List<InvoiceAdjustment> getInvoiceAdjustmentList() {
        return invoiceAdjustmentList;
    }

    public void setInvoiceAdjustmentList(List<InvoiceAdjustment> invoiceAdjustmentList) {
        this.invoiceAdjustmentList = invoiceAdjustmentList;
    }

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public List<DataResource> getDataResourceList1() {
        return dataResourceList1;
    }

    public void setDataResourceList1(List<DataResource> dataResourceList1) {
        this.dataResourceList1 = dataResourceList1;
    }

    public List<ProductPromoCode> getProductPromoCodeList() {
        return productPromoCodeList;
    }

    public void setProductPromoCodeList(List<ProductPromoCode> productPromoCodeList) {
        this.productPromoCodeList = productPromoCodeList;
    }

    public List<ProductPromoCode> getProductPromoCodeList1() {
        return productPromoCodeList1;
    }

    public void setProductPromoCodeList1(List<ProductPromoCode> productPromoCodeList1) {
        this.productPromoCodeList1 = productPromoCodeList1;
    }

    public List<SalesOpportunity> getSalesOpportunityList() {
        return salesOpportunityList;
    }

    public void setSalesOpportunityList(List<SalesOpportunity> salesOpportunityList) {
        this.salesOpportunityList = salesOpportunityList;
    }*/

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }
    
    

    /*
    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public List<OrderPaymentPreference> getOrderPaymentPreferenceList() {
        return orderPaymentPreferenceList;
    }

    public void setOrderPaymentPreferenceList(List<OrderPaymentPreference> orderPaymentPreferenceList) {
        this.orderPaymentPreferenceList = orderPaymentPreferenceList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
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

    public List<Product> getProductList1() {
        return productList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.productList1 = productList1;
    }

    public List<ProductPromo> getProductPromoList() {
        return productPromoList;
    }

    public void setProductPromoList(List<ProductPromo> productPromoList) {
        this.productPromoList = productPromoList;
    }

    public List<ProductPromo> getProductPromoList1() {
        return productPromoList1;
    }

    public void setProductPromoList1(List<ProductPromo> productPromoList1) {
        this.productPromoList1 = productPromoList1;
    }

    public List<WorkEffortPartyAssignment> getWorkEffortPartyAssignmentList() {
        return workEffortPartyAssignmentList;
    }

    public void setWorkEffortPartyAssignmentList(List<WorkEffortPartyAssignment> workEffortPartyAssignmentList) {
        this.workEffortPartyAssignmentList = workEffortPartyAssignmentList;
    }*/

    public String getPartyCompanyId() {
		return partyCompanyId;
	}

	public void setPartyCompanyId(String partyCompanyId) {
		this.partyCompanyId = partyCompanyId;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLogin)) {
            return false;
        }
        UserLogin other = (UserLogin) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLogin[ userLoginId=" + userLoginId + " ]";
    }

    /*
    public List<CashDrawer> getCashDrawerList() {
        return cashDrawerList;
    }

    public void setCashDrawerList(List<CashDrawer> cashDrawerList) {
        this.cashDrawerList = cashDrawerList;
    }

    public List<CashDrawer> getCashDrawerList1() {
        return cashDrawerList1;
    }

    public void setCashDrawerList1(List<CashDrawer> cashDrawerList1) {
        this.cashDrawerList1 = cashDrawerList1;
    }

    public List<CashDrawer> getCashDrawerList2() {
        return cashDrawerList2;
    }

    public void setCashDrawerList2(List<CashDrawer> cashDrawerList2) {
        this.cashDrawerList2 = cashDrawerList2;
    }

    public List<ContactList> getContactListList() {
        return contactListList;
    }

    public void setContactListList(List<ContactList> contactListList) {
        this.contactListList = contactListList;
    }

    public List<ContactList> getContactListList1() {
        return contactListList1;
    }

    public void setContactListList1(List<ContactList> contactListList1) {
        this.contactListList1 = contactListList1;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<Content> getContentList1() {
        return contentList1;
    }

    public void setContentList1(List<Content> contentList1) {
        this.contentList1 = contentList1;
    }

    public List<ContentAssoc> getContentAssocList() {
        return contentAssocList;
    }

    public void setContentAssocList(List<ContentAssoc> contentAssocList) {
        this.contentAssocList = contentAssocList;
    }

    public List<ContentAssoc> getContentAssocList1() {
        return contentAssocList1;
    }

    public void setContentAssocList1(List<ContentAssoc> contentAssocList1) {
        this.contentAssocList1 = contentAssocList1;
    }

    public List<EntityViewHistory> getEntityViewHistoryList() {
        return entityViewHistoryList;
    }

    public void setEntityViewHistoryList(List<EntityViewHistory> entityViewHistoryList) {
        this.entityViewHistoryList = entityViewHistoryList;
    }

    public List<DataWarehouseTransform> getDataWarehouseTransformList() {
        return dataWarehouseTransformList;
    }

    public void setDataWarehouseTransformList(List<DataWarehouseTransform> dataWarehouseTransformList) {
        this.dataWarehouseTransformList = dataWarehouseTransformList;
    }

    public List<KeyboardShortcut> getKeyboardShortcutList() {
        return keyboardShortcutList;
    }

    public void setKeyboardShortcutList(List<KeyboardShortcut> keyboardShortcutList) {
        this.keyboardShortcutList = keyboardShortcutList;
    }

    public List<JobSandbox> getJobSandboxList() {
        return jobSandboxList;
    }

    public void setJobSandboxList(List<JobSandbox> jobSandboxList) {
        this.jobSandboxList = jobSandboxList;
    }

    public List<JobSandbox> getJobSandboxList1() {
        return jobSandboxList1;
    }

    public void setJobSandboxList1(List<JobSandbox> jobSandboxList1) {
        this.jobSandboxList1 = jobSandboxList1;
    }

    public List<LockboxBatch> getLockboxBatchList() {
        return lockboxBatchList;
    }

    public void setLockboxBatchList(List<LockboxBatch> lockboxBatchList) {
        this.lockboxBatchList = lockboxBatchList;
    }

    public List<InventoryItemTrace> getInventoryItemTraceList() {
        return inventoryItemTraceList;
    }

    public void setInventoryItemTraceList(List<InventoryItemTrace> inventoryItemTraceList) {
        this.inventoryItemTraceList = inventoryItemTraceList;
    }

    public List<ItemIssuance> getItemIssuanceList() {
        return itemIssuanceList;
    }

    public void setItemIssuanceList(List<ItemIssuance> itemIssuanceList) {
        this.itemIssuanceList = itemIssuanceList;
    }

    public List<PicklistStatusHistory> getPicklistStatusHistoryList() {
        return picklistStatusHistoryList;
    }

    public void setPicklistStatusHistoryList(List<PicklistStatusHistory> picklistStatusHistoryList) {
        this.picklistStatusHistoryList = picklistStatusHistoryList;
    }

    public List<ProductPriceChange> getProductPriceChangeList() {
        return productPriceChangeList;
    }

    public void setProductPriceChangeList(List<ProductPriceChange> productPriceChangeList) {
        this.productPriceChangeList = productPriceChangeList;
    }

    public List<ProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<ProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }

    public List<ProductPrice> getProductPriceList1() {
        return productPriceList1;
    }

    public void setProductPriceList1(List<ProductPrice> productPriceList1) {
        this.productPriceList1 = productPriceList1;
    }

    public List<PicklistRole> getPicklistRoleList() {
        return picklistRoleList;
    }

    public void setPicklistRoleList(List<PicklistRole> picklistRoleList) {
        this.picklistRoleList = picklistRoleList;
    }

    public List<PicklistRole> getPicklistRoleList1() {
        return picklistRoleList1;
    }

    public void setPicklistRoleList1(List<PicklistRole> picklistRoleList1) {
        this.picklistRoleList1 = picklistRoleList1;
    }

    public List<ProductFeaturePrice> getProductFeaturePriceList() {
        return productFeaturePriceList;
    }

    public void setProductFeaturePriceList(List<ProductFeaturePrice> productFeaturePriceList) {
        this.productFeaturePriceList = productFeaturePriceList;
    }

    public List<ProductFeaturePrice> getProductFeaturePriceList1() {
        return productFeaturePriceList1;
    }

    public void setProductFeaturePriceList1(List<ProductFeaturePrice> productFeaturePriceList1) {
        this.productFeaturePriceList1 = productFeaturePriceList1;
    }

    public List<ProductReview> getProductReviewList() {
        return productReviewList;
    }

    public void setProductReviewList(List<ProductReview> productReviewList) {
        this.productReviewList = productReviewList;
    }

    public List<WorkEffortStatus> getWorkEffortStatusList() {
        return workEffortStatusList;
    }

    public void setWorkEffortStatusList(List<WorkEffortStatus> workEffortStatusList) {
        this.workEffortStatusList = workEffortStatusList;
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

    public UserLoginSession getUserLoginSession() {
        return userLoginSession;
    }

    public void setUserLoginSession(UserLoginSession userLoginSession) {
        this.userLoginSession = userLoginSession;
    }

    public List<SalesOpportunityHistory> getSalesOpportunityHistoryList() {
        return salesOpportunityHistoryList;
    }

    public void setSalesOpportunityHistoryList(List<SalesOpportunityHistory> salesOpportunityHistoryList) {
        this.salesOpportunityHistoryList = salesOpportunityHistoryList;
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<SalesForecastHistory> getSalesForecastHistoryList() {
        return salesForecastHistoryList;
    }

    public void setSalesForecastHistoryList(List<SalesForecastHistory> salesForecastHistoryList) {
        this.salesForecastHistoryList = salesForecastHistoryList;
    }

    public List<ViewPreference> getViewPreferenceList() {
        return viewPreferenceList;
    }

    public void setViewPreferenceList(List<ViewPreference> viewPreferenceList) {
        this.viewPreferenceList = viewPreferenceList;
    }

    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<WorkEffortReview> getWorkEffortReviewList() {
        return workEffortReviewList;
    }

    public void setWorkEffortReviewList(List<WorkEffortReview> workEffortReviewList) {
        this.workEffortReviewList = workEffortReviewList;
    }

    public List<UserLoginPasswordHistory> getUserLoginPasswordHistoryList() {
        return userLoginPasswordHistoryList;
    }

    public void setUserLoginPasswordHistoryList(List<UserLoginPasswordHistory> userLoginPasswordHistoryList) {
        this.userLoginPasswordHistoryList = userLoginPasswordHistoryList;
    }

    public List<Timesheet> getTimesheetList() {
        return timesheetList;
    }

    public void setTimesheetList(List<Timesheet> timesheetList) {
        this.timesheetList = timesheetList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
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

    public List<UserLoginSecurityGroup> getUserLoginSecurityGroupList() {
        return userLoginSecurityGroupList;
    }

    public void setUserLoginSecurityGroupList(List<UserLoginSecurityGroup> userLoginSecurityGroupList) {
        this.userLoginSecurityGroupList = userLoginSecurityGroupList;
    }

    public List<ServiceTestRecord> getServiceTestRecordList() {
        return serviceTestRecordList;
    }

    public void setServiceTestRecordList(List<ServiceTestRecord> serviceTestRecordList) {
        this.serviceTestRecordList = serviceTestRecordList;
    }

    public List<ServiceTestRecord> getServiceTestRecordList1() {
        return serviceTestRecordList1;
    }

    public void setServiceTestRecordList1(List<ServiceTestRecord> serviceTestRecordList1) {
        this.serviceTestRecordList1 = serviceTestRecordList1;
    }*/
    
}
