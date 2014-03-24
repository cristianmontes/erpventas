/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.accounting.model.AcctgTrans;
import com.wildc.ucumari.agreement.model.AgreementWorkEffortAppl;
import com.wildc.ucumari.custrequest.model.CustRequestItemWorkEffort;
import com.wildc.ucumari.custrequest.model.CustRequestWorkEffort;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.inventory.model.InventoryItemDetail;
import com.wildc.ucumari.parameters.model.CustomMethod;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.ProductAssoc;
import com.wildc.ucumari.product.model.ProductMaint;
import com.wildc.ucumari.quote.model.QuoteItem;
import com.wildc.ucumari.quote.model.QuoteWorkEffort;
import com.wildc.ucumari.quote.model.SalesOpportunityWorkEffort;
import com.wildc.ucumari.shipment.model.Shipment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "work_effort")
@NamedQueries({
    @NamedQuery(name = "WorkEffort.findAll", query = "SELECT w FROM WorkEffort w")})
public class WorkEffort implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortStatus> workEffortStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortAttribute> workEffortAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortContactMech> workEffortContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortFixedAssetAssign> workEffortFixedAssetAssignList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortCostCalc> workEffortCostCalcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortNote> workEffortNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortBilling> workEffortBillingList;
    @OneToMany(mappedBy = "workEffortId")
    private List<TimeEntry> timeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortInventoryAssign> workEffortInventoryAssignList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortGoodStandard> workEffortGoodStandardList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortKeyword> workEffortKeywordList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortAssignmentRate> workEffortAssignmentRateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkRequirementFulfillment> workRequirementFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<RateAmount> rateAmountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortEventReminder> workEffortEventReminderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortTransBox> workEffortTransBoxList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortReview> workEffortReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<SalesOpportunityWorkEffort> salesOpportunityWorkEffortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<ShoppingListWorkEffort> shoppingListWorkEffortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<QuoteWorkEffort> quoteWorkEffortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortAssoc> workEffortAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort1")
    private List<WorkEffortAssoc> workEffortAssocList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortDeliverableProd> workEffortDeliverableProdList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortContent> workEffortContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortFixedAssetStd> workEffortFixedAssetStdList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortSkillStandard> workEffortSkillStandardList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortInventoryProduced> workEffortInventoryProducedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkOrderItemFulfillment> workOrderItemFulfillmentList;
    @OneToMany(mappedBy = "maintTemplateWorkEffortId")
    private List<ProductMaint> productMaintList;
    @OneToMany(mappedBy = "routingWorkEffortId")
    private List<ProductAssoc> productAssocList;
    @OneToMany(mappedBy = "specRouWeffId")
    private List<ProductAssoc> productAssocList1;
    @OneToMany(mappedBy = "workEffortId")
    private List<InventoryItemDetail> inventoryItemDetailList;
    @OneToMany(mappedBy = "scheduleWorkEffortId")
    private List<FixedAssetMaint> fixedAssetMaintList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<CommunicationEventWorkEff> communicationEventWorkEffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<CustRequestWorkEffort> custRequestWorkEffortList;
    @OneToMany(mappedBy = "workEffortId")
    private List<CostComponent> costComponentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<CustRequestItemWorkEffort> custRequestItemWorkEffortList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Column(name = "LAST_STATUS_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastStatusUpdate;
    @Column(name = "PRIORITY")
    private BigInteger priority;
    @Column(name = "PERCENT_COMPLETE")
    private BigInteger percentComplete;
    @Column(name = "WORK_EFFORT_NAME")
    private String workEffortName;
    @Column(name = "SHOW_AS_ENUM_ID")
    private String showAsEnumId;
    @Column(name = "SEND_NOTIFICATION_EMAIL")
    private Character sendNotificationEmail;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LOCATION_DESC")
    private String locationDesc;
    @Column(name = "ESTIMATED_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedStartDate;
    @Column(name = "ESTIMATED_COMPLETION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedCompletionDate;
    @Column(name = "ACTUAL_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualStartDate;
    @Column(name = "ACTUAL_COMPLETION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualCompletionDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_MILLI_SECONDS")
    private BigDecimal estimatedMilliSeconds;
    @Column(name = "ESTIMATED_SETUP_MILLIS")
    private BigDecimal estimatedSetupMillis;
    @Column(name = "ACTUAL_MILLI_SECONDS")
    private BigDecimal actualMilliSeconds;
    @Column(name = "ACTUAL_SETUP_MILLIS")
    private BigDecimal actualSetupMillis;
    @Column(name = "TOTAL_MILLI_SECONDS_ALLOWED")
    private BigDecimal totalMilliSecondsAllowed;
    @Column(name = "TOTAL_MONEY_ALLOWED")
    private BigDecimal totalMoneyAllowed;
    @Column(name = "SPECIAL_TERMS")
    private String specialTerms;
    @Column(name = "TIME_TRANSPARENCY")
    private BigInteger timeTransparency;
    @Column(name = "UNIVERSAL_ID")
    private String universalId;
    @Column(name = "SOURCE_REFERENCE_ID")
    private String sourceReferenceId;
    @Column(name = "INFO_URL")
    private String infoUrl;
    @Column(name = "SERVICE_LOADER_NAME")
    private String serviceLoaderName;
    @Column(name = "QUANTITY_TO_PRODUCE")
    private BigDecimal quantityToProduce;
    @Column(name = "QUANTITY_PRODUCED")
    private BigDecimal quantityProduced;
    @Column(name = "QUANTITY_REJECTED")
    private BigDecimal quantityRejected;
    @Column(name = "RESERV_PERSONS")
    private BigDecimal reservPersons;
    @Column(name = "RESERV2ND_P_P_PERC")
    private BigDecimal reserv2ndPPPerc;
    @Column(name = "RESERV_NTH_P_P_PERC")
    private BigDecimal reservNthPPPerc;
    @Column(name = "REVISION_NUMBER")
    private BigInteger revisionNumber;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    @OneToMany(mappedBy = "estimatedArrivalWorkEffId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "estimatedShipWorkEffId")
    private List<Shipment> shipmentList1;
    @OneToMany(mappedBy = "workEffortId")
    private List<QuoteItem> quoteItemList;
    @OneToMany(mappedBy = "workEffortId")
    private List<AcctgTrans> acctgTransList;
    @JoinColumn(name = "WORK_EFFORT_TYPE_ID", referencedColumnName = "WORK_EFFORT_TYPE_ID")
    @ManyToOne
    private WorkEffortType workEffortTypeId;
    @JoinColumn(name = "TEMP_EXPR_ID", referencedColumnName = "TEMP_EXPR_ID")
    @ManyToOne
    private TemporalExpression tempExprId;
    @JoinColumn(name = "SCOPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration scopeEnumId;
    @JoinColumn(name = "ACCOMMODATION_MAP_ID", referencedColumnName = "ACCOMMODATION_MAP_ID")
    @ManyToOne
    private AccommodationMap accommodationMapId;
    @JoinColumn(name = "ACCOMMODATION_SPOT_ID", referencedColumnName = "ACCOMMODATION_SPOT_ID")
    @ManyToOne
    private AccommodationSpot accommodationSpotId;
    @JoinColumn(name = "CURRENT_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem currentStatusId;
    @JoinColumn(name = "ESTIMATE_CALC_METHOD", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod estimateCalcMethod;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "MONEY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom moneyUomId;
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "NOTE_ID")
    @ManyToOne
    private NoteData noteId;
    @OneToMany(mappedBy = "workEffortParentId")
    private List<WorkEffort> workEffortList;
    @JoinColumn(name = "WORK_EFFORT_PARENT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortParentId;
    @JoinColumn(name = "WORK_EFFORT_PURPOSE_TYPE_ID", referencedColumnName = "WORK_EFFORT_PURPOSE_TYPE_ID")
    @ManyToOne
    private WorkEffortPurposeType workEffortPurposeTypeId;
    @JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID")
    @ManyToOne
    private RecurrenceInfo recurrenceInfoId;
    @JoinColumn(name = "RUNTIME_DATA_ID", referencedColumnName = "RUNTIME_DATA_ID")
    @ManyToOne
    private RuntimeData runtimeDataId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<WorkEffortPartyAssignment> workEffortPartyAssignmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffort")
    private List<AgreementWorkEffortAppl> agreementWorkEffortApplList;

    public WorkEffort() {
    }

    public WorkEffort(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public Date getLastStatusUpdate() {
        return lastStatusUpdate;
    }

    public void setLastStatusUpdate(Date lastStatusUpdate) {
        this.lastStatusUpdate = lastStatusUpdate;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public BigInteger getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(BigInteger percentComplete) {
        this.percentComplete = percentComplete;
    }

    public String getWorkEffortName() {
        return workEffortName;
    }

    public void setWorkEffortName(String workEffortName) {
        this.workEffortName = workEffortName;
    }

    public String getShowAsEnumId() {
        return showAsEnumId;
    }

    public void setShowAsEnumId(String showAsEnumId) {
        this.showAsEnumId = showAsEnumId;
    }

    public Character getSendNotificationEmail() {
        return sendNotificationEmail;
    }

    public void setSendNotificationEmail(Character sendNotificationEmail) {
        this.sendNotificationEmail = sendNotificationEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public Date getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(Date estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public Date getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualCompletionDate() {
        return actualCompletionDate;
    }

    public void setActualCompletionDate(Date actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }

    public BigDecimal getEstimatedMilliSeconds() {
        return estimatedMilliSeconds;
    }

    public void setEstimatedMilliSeconds(BigDecimal estimatedMilliSeconds) {
        this.estimatedMilliSeconds = estimatedMilliSeconds;
    }

    public BigDecimal getEstimatedSetupMillis() {
        return estimatedSetupMillis;
    }

    public void setEstimatedSetupMillis(BigDecimal estimatedSetupMillis) {
        this.estimatedSetupMillis = estimatedSetupMillis;
    }

    public BigDecimal getActualMilliSeconds() {
        return actualMilliSeconds;
    }

    public void setActualMilliSeconds(BigDecimal actualMilliSeconds) {
        this.actualMilliSeconds = actualMilliSeconds;
    }

    public BigDecimal getActualSetupMillis() {
        return actualSetupMillis;
    }

    public void setActualSetupMillis(BigDecimal actualSetupMillis) {
        this.actualSetupMillis = actualSetupMillis;
    }

    public BigDecimal getTotalMilliSecondsAllowed() {
        return totalMilliSecondsAllowed;
    }

    public void setTotalMilliSecondsAllowed(BigDecimal totalMilliSecondsAllowed) {
        this.totalMilliSecondsAllowed = totalMilliSecondsAllowed;
    }

    public BigDecimal getTotalMoneyAllowed() {
        return totalMoneyAllowed;
    }

    public void setTotalMoneyAllowed(BigDecimal totalMoneyAllowed) {
        this.totalMoneyAllowed = totalMoneyAllowed;
    }

    public String getSpecialTerms() {
        return specialTerms;
    }

    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    public BigInteger getTimeTransparency() {
        return timeTransparency;
    }

    public void setTimeTransparency(BigInteger timeTransparency) {
        this.timeTransparency = timeTransparency;
    }

    public String getUniversalId() {
        return universalId;
    }

    public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getServiceLoaderName() {
        return serviceLoaderName;
    }

    public void setServiceLoaderName(String serviceLoaderName) {
        this.serviceLoaderName = serviceLoaderName;
    }

    public BigDecimal getQuantityToProduce() {
        return quantityToProduce;
    }

    public void setQuantityToProduce(BigDecimal quantityToProduce) {
        this.quantityToProduce = quantityToProduce;
    }

    public BigDecimal getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(BigDecimal quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public BigDecimal getQuantityRejected() {
        return quantityRejected;
    }

    public void setQuantityRejected(BigDecimal quantityRejected) {
        this.quantityRejected = quantityRejected;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(BigInteger revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public WorkEffortType getWorkEffortTypeId() {
        return workEffortTypeId;
    }

    public void setWorkEffortTypeId(WorkEffortType workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
    }

    public TemporalExpression getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(TemporalExpression tempExprId) {
        this.tempExprId = tempExprId;
    }

    public Enumeration getScopeEnumId() {
        return scopeEnumId;
    }

    public void setScopeEnumId(Enumeration scopeEnumId) {
        this.scopeEnumId = scopeEnumId;
    }

    public AccommodationMap getAccommodationMapId() {
        return accommodationMapId;
    }

    public void setAccommodationMapId(AccommodationMap accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }

    public AccommodationSpot getAccommodationSpotId() {
        return accommodationSpotId;
    }

    public void setAccommodationSpotId(AccommodationSpot accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }

    public StatusItem getCurrentStatusId() {
        return currentStatusId;
    }

    public void setCurrentStatusId(StatusItem currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public CustomMethod getEstimateCalcMethod() {
        return estimateCalcMethod;
    }

    public void setEstimateCalcMethod(CustomMethod estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public FixedAsset getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(FixedAsset fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public Uom getMoneyUomId() {
        return moneyUomId;
    }

    public void setMoneyUomId(Uom moneyUomId) {
        this.moneyUomId = moneyUomId;
    }

    public NoteData getNoteId() {
        return noteId;
    }

    public void setNoteId(NoteData noteId) {
        this.noteId = noteId;
    }

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public WorkEffort getWorkEffortParentId() {
        return workEffortParentId;
    }

    public void setWorkEffortParentId(WorkEffort workEffortParentId) {
        this.workEffortParentId = workEffortParentId;
    }

    public WorkEffortPurposeType getWorkEffortPurposeTypeId() {
        return workEffortPurposeTypeId;
    }

    public void setWorkEffortPurposeTypeId(WorkEffortPurposeType workEffortPurposeTypeId) {
        this.workEffortPurposeTypeId = workEffortPurposeTypeId;
    }

    public RecurrenceInfo getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(RecurrenceInfo recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public RuntimeData getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(RuntimeData runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public List<WorkEffortPartyAssignment> getWorkEffortPartyAssignmentList() {
        return workEffortPartyAssignmentList;
    }

    public void setWorkEffortPartyAssignmentList(List<WorkEffortPartyAssignment> workEffortPartyAssignmentList) {
        this.workEffortPartyAssignmentList = workEffortPartyAssignmentList;
    }

    public List<AgreementWorkEffortAppl> getAgreementWorkEffortApplList() {
        return agreementWorkEffortApplList;
    }

    public void setAgreementWorkEffortApplList(List<AgreementWorkEffortAppl> agreementWorkEffortApplList) {
        this.agreementWorkEffortApplList = agreementWorkEffortApplList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffort)) {
            return false;
        }
        WorkEffort other = (WorkEffort) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffort[ workEffortId=" + workEffortId + " ]";
    }

    public List<CommunicationEventWorkEff> getCommunicationEventWorkEffList() {
        return communicationEventWorkEffList;
    }

    public void setCommunicationEventWorkEffList(List<CommunicationEventWorkEff> communicationEventWorkEffList) {
        this.communicationEventWorkEffList = communicationEventWorkEffList;
    }

    public List<CustRequestWorkEffort> getCustRequestWorkEffortList() {
        return custRequestWorkEffortList;
    }

    public void setCustRequestWorkEffortList(List<CustRequestWorkEffort> custRequestWorkEffortList) {
        this.custRequestWorkEffortList = custRequestWorkEffortList;
    }

    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
    }

    public List<CustRequestItemWorkEffort> getCustRequestItemWorkEffortList() {
        return custRequestItemWorkEffortList;
    }

    public void setCustRequestItemWorkEffortList(List<CustRequestItemWorkEffort> custRequestItemWorkEffortList) {
        this.custRequestItemWorkEffortList = custRequestItemWorkEffortList;
    }

    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }

    public List<FixedAssetMaint> getFixedAssetMaintList() {
        return fixedAssetMaintList;
    }

    public void setFixedAssetMaintList(List<FixedAssetMaint> fixedAssetMaintList) {
        this.fixedAssetMaintList = fixedAssetMaintList;
    }

    public List<ProductMaint> getProductMaintList() {
        return productMaintList;
    }

    public void setProductMaintList(List<ProductMaint> productMaintList) {
        this.productMaintList = productMaintList;
    }

    public List<ProductAssoc> getProductAssocList() {
        return productAssocList;
    }

    public void setProductAssocList(List<ProductAssoc> productAssocList) {
        this.productAssocList = productAssocList;
    }

    public List<ProductAssoc> getProductAssocList1() {
        return productAssocList1;
    }

    public void setProductAssocList1(List<ProductAssoc> productAssocList1) {
        this.productAssocList1 = productAssocList1;
    }

    public List<WorkEffortStatus> getWorkEffortStatusList() {
        return workEffortStatusList;
    }

    public void setWorkEffortStatusList(List<WorkEffortStatus> workEffortStatusList) {
        this.workEffortStatusList = workEffortStatusList;
    }

    public List<WorkEffortAttribute> getWorkEffortAttributeList() {
        return workEffortAttributeList;
    }

    public void setWorkEffortAttributeList(List<WorkEffortAttribute> workEffortAttributeList) {
        this.workEffortAttributeList = workEffortAttributeList;
    }

    public List<WorkEffortContactMech> getWorkEffortContactMechList() {
        return workEffortContactMechList;
    }

    public void setWorkEffortContactMechList(List<WorkEffortContactMech> workEffortContactMechList) {
        this.workEffortContactMechList = workEffortContactMechList;
    }

    public List<WorkEffortFixedAssetAssign> getWorkEffortFixedAssetAssignList() {
        return workEffortFixedAssetAssignList;
    }

    public void setWorkEffortFixedAssetAssignList(List<WorkEffortFixedAssetAssign> workEffortFixedAssetAssignList) {
        this.workEffortFixedAssetAssignList = workEffortFixedAssetAssignList;
    }

    public List<WorkEffortCostCalc> getWorkEffortCostCalcList() {
        return workEffortCostCalcList;
    }

    public void setWorkEffortCostCalcList(List<WorkEffortCostCalc> workEffortCostCalcList) {
        this.workEffortCostCalcList = workEffortCostCalcList;
    }

    public List<WorkEffortNote> getWorkEffortNoteList() {
        return workEffortNoteList;
    }

    public void setWorkEffortNoteList(List<WorkEffortNote> workEffortNoteList) {
        this.workEffortNoteList = workEffortNoteList;
    }

    public List<WorkEffortBilling> getWorkEffortBillingList() {
        return workEffortBillingList;
    }

    public void setWorkEffortBillingList(List<WorkEffortBilling> workEffortBillingList) {
        this.workEffortBillingList = workEffortBillingList;
    }

    public List<TimeEntry> getTimeEntryList() {
        return timeEntryList;
    }

    public void setTimeEntryList(List<TimeEntry> timeEntryList) {
        this.timeEntryList = timeEntryList;
    }

    public List<WorkEffortInventoryAssign> getWorkEffortInventoryAssignList() {
        return workEffortInventoryAssignList;
    }

    public void setWorkEffortInventoryAssignList(List<WorkEffortInventoryAssign> workEffortInventoryAssignList) {
        this.workEffortInventoryAssignList = workEffortInventoryAssignList;
    }

    public List<WorkEffortGoodStandard> getWorkEffortGoodStandardList() {
        return workEffortGoodStandardList;
    }

    public void setWorkEffortGoodStandardList(List<WorkEffortGoodStandard> workEffortGoodStandardList) {
        this.workEffortGoodStandardList = workEffortGoodStandardList;
    }

    public List<WorkEffortKeyword> getWorkEffortKeywordList() {
        return workEffortKeywordList;
    }

    public void setWorkEffortKeywordList(List<WorkEffortKeyword> workEffortKeywordList) {
        this.workEffortKeywordList = workEffortKeywordList;
    }

    public List<WorkEffortAssignmentRate> getWorkEffortAssignmentRateList() {
        return workEffortAssignmentRateList;
    }

    public void setWorkEffortAssignmentRateList(List<WorkEffortAssignmentRate> workEffortAssignmentRateList) {
        this.workEffortAssignmentRateList = workEffortAssignmentRateList;
    }

    public List<WorkRequirementFulfillment> getWorkRequirementFulfillmentList() {
        return workRequirementFulfillmentList;
    }

    public void setWorkRequirementFulfillmentList(List<WorkRequirementFulfillment> workRequirementFulfillmentList) {
        this.workRequirementFulfillmentList = workRequirementFulfillmentList;
    }

    public List<RateAmount> getRateAmountList() {
        return rateAmountList;
    }

    public void setRateAmountList(List<RateAmount> rateAmountList) {
        this.rateAmountList = rateAmountList;
    }

    public List<WorkEffortEventReminder> getWorkEffortEventReminderList() {
        return workEffortEventReminderList;
    }

    public void setWorkEffortEventReminderList(List<WorkEffortEventReminder> workEffortEventReminderList) {
        this.workEffortEventReminderList = workEffortEventReminderList;
    }

    public List<WorkEffortTransBox> getWorkEffortTransBoxList() {
        return workEffortTransBoxList;
    }

    public void setWorkEffortTransBoxList(List<WorkEffortTransBox> workEffortTransBoxList) {
        this.workEffortTransBoxList = workEffortTransBoxList;
    }

    public List<WorkEffortReview> getWorkEffortReviewList() {
        return workEffortReviewList;
    }

    public void setWorkEffortReviewList(List<WorkEffortReview> workEffortReviewList) {
        this.workEffortReviewList = workEffortReviewList;
    }

    public List<SalesOpportunityWorkEffort> getSalesOpportunityWorkEffortList() {
        return salesOpportunityWorkEffortList;
    }

    public void setSalesOpportunityWorkEffortList(List<SalesOpportunityWorkEffort> salesOpportunityWorkEffortList) {
        this.salesOpportunityWorkEffortList = salesOpportunityWorkEffortList;
    }

    public List<ShoppingListWorkEffort> getShoppingListWorkEffortList() {
        return shoppingListWorkEffortList;
    }

    public void setShoppingListWorkEffortList(List<ShoppingListWorkEffort> shoppingListWorkEffortList) {
        this.shoppingListWorkEffortList = shoppingListWorkEffortList;
    }

    public List<QuoteWorkEffort> getQuoteWorkEffortList() {
        return quoteWorkEffortList;
    }

    public void setQuoteWorkEffortList(List<QuoteWorkEffort> quoteWorkEffortList) {
        this.quoteWorkEffortList = quoteWorkEffortList;
    }

    public List<WorkEffortAssoc> getWorkEffortAssocList() {
        return workEffortAssocList;
    }

    public void setWorkEffortAssocList(List<WorkEffortAssoc> workEffortAssocList) {
        this.workEffortAssocList = workEffortAssocList;
    }

    public List<WorkEffortAssoc> getWorkEffortAssocList1() {
        return workEffortAssocList1;
    }

    public void setWorkEffortAssocList1(List<WorkEffortAssoc> workEffortAssocList1) {
        this.workEffortAssocList1 = workEffortAssocList1;
    }

    public List<WorkEffortDeliverableProd> getWorkEffortDeliverableProdList() {
        return workEffortDeliverableProdList;
    }

    public void setWorkEffortDeliverableProdList(List<WorkEffortDeliverableProd> workEffortDeliverableProdList) {
        this.workEffortDeliverableProdList = workEffortDeliverableProdList;
    }

    public List<WorkEffortContent> getWorkEffortContentList() {
        return workEffortContentList;
    }

    public void setWorkEffortContentList(List<WorkEffortContent> workEffortContentList) {
        this.workEffortContentList = workEffortContentList;
    }

    public List<WorkEffortFixedAssetStd> getWorkEffortFixedAssetStdList() {
        return workEffortFixedAssetStdList;
    }

    public void setWorkEffortFixedAssetStdList(List<WorkEffortFixedAssetStd> workEffortFixedAssetStdList) {
        this.workEffortFixedAssetStdList = workEffortFixedAssetStdList;
    }

    public List<WorkEffortSkillStandard> getWorkEffortSkillStandardList() {
        return workEffortSkillStandardList;
    }

    public void setWorkEffortSkillStandardList(List<WorkEffortSkillStandard> workEffortSkillStandardList) {
        this.workEffortSkillStandardList = workEffortSkillStandardList;
    }

    public List<WorkEffortInventoryProduced> getWorkEffortInventoryProducedList() {
        return workEffortInventoryProducedList;
    }

    public void setWorkEffortInventoryProducedList(List<WorkEffortInventoryProduced> workEffortInventoryProducedList) {
        this.workEffortInventoryProducedList = workEffortInventoryProducedList;
    }

    public List<WorkOrderItemFulfillment> getWorkOrderItemFulfillmentList() {
        return workOrderItemFulfillmentList;
    }

    public void setWorkOrderItemFulfillmentList(List<WorkOrderItemFulfillment> workOrderItemFulfillmentList) {
        this.workOrderItemFulfillmentList = workOrderItemFulfillmentList;
    }
    
}
