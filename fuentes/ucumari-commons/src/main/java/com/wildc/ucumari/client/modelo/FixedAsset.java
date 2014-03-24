/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.PartyFixedAssetAssignment;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.accounting.model.AcctgTrans;
import com.wildc.ucumari.facility.model.Facility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "fixed_asset")
@NamedQueries({
    @NamedQuery(name = "FixedAsset.findAll", query = "SELECT f FROM FixedAsset f")})
public class FixedAsset implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fixedAsset")
    private List<WorkEffortFixedAssetAssign> workEffortFixedAssetAssignList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fixedAsset")
    private List<PartyFixedAssetAssignment> partyFixedAssetAssignmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fixedAsset")
    private List<FixedAssetMaint> fixedAssetMaintList;
    @OneToMany(mappedBy = "fixedAssetId")
    private List<Delivery> deliveryList;
    @OneToMany(mappedBy = "fixedAssetId")
    private List<Requirement> requirementList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIXED_ASSET_ID")
    private String fixedAssetId;
    @Column(name = "FIXED_ASSET_NAME")
    private String fixedAssetName;
    @Column(name = "DATE_ACQUIRED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAcquired;
    @Column(name = "DATE_LAST_SERVICED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastServiced;
    @Column(name = "DATE_NEXT_SERVICE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNextService;
    @Column(name = "EXPECTED_END_OF_LIFE")
    @Temporal(TemporalType.DATE)
    private Date expectedEndOfLife;
    @Column(name = "ACTUAL_END_OF_LIFE")
    @Temporal(TemporalType.DATE)
    private Date actualEndOfLife;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRODUCTION_CAPACITY")
    private BigDecimal productionCapacity;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "LOCATED_AT_LOCATION_SEQ_ID")
    private String locatedAtLocationSeqId;
    @Column(name = "SALVAGE_VALUE")
    private BigDecimal salvageValue;
    @Column(name = "DEPRECIATION")
    private BigDecimal depreciation;
    @Column(name = "PURCHASE_COST")
    private BigDecimal purchaseCost;
    @Column(name = "PURCHASE_COST_UOM_ID")
    private String purchaseCostUomId;
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
    @OneToMany(mappedBy = "fixedAssetId")
    private List<AccommodationSpot> accommodationSpotList;
    @OneToMany(mappedBy = "fixedAssetId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "fixedAssetId")
    private List<WorkEffort> workEffortList;
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "FIXED_ASSET_TYPE_ID", referencedColumnName = "FIXED_ASSET_TYPE_ID")
    @ManyToOne
    private FixedAssetType fixedAssetTypeId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @OneToMany(mappedBy = "parentFixedAssetId")
    private List<FixedAsset> fixedAssetList;
    @JoinColumn(name = "PARENT_FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset parentFixedAssetId;
    @JoinColumns({
        @JoinColumn(name = "ACQUIRE_ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ACQUIRE_ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "INSTANCE_OF_PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product instanceOfProductId;
    @JoinColumn(name = "LOCATED_AT_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility locatedAtFacilityId;
    @JoinColumn(name = "CLASS_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration classEnumId;
    @JoinColumn(name = "CALENDAR_ID", referencedColumnName = "CALENDAR_ID")
    @ManyToOne
    private TechDataCalendar calendarId;
    @OneToMany(mappedBy = "fixedAssetId")
    private List<AccommodationMap> accommodationMapList;

    public FixedAsset() {
    }

    public FixedAsset(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getFixedAssetName() {
        return fixedAssetName;
    }

    public void setFixedAssetName(String fixedAssetName) {
        this.fixedAssetName = fixedAssetName;
    }

    public Date getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(Date dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public Date getDateLastServiced() {
        return dateLastServiced;
    }

    public void setDateLastServiced(Date dateLastServiced) {
        this.dateLastServiced = dateLastServiced;
    }

    public Date getDateNextService() {
        return dateNextService;
    }

    public void setDateNextService(Date dateNextService) {
        this.dateNextService = dateNextService;
    }

    public Date getExpectedEndOfLife() {
        return expectedEndOfLife;
    }

    public void setExpectedEndOfLife(Date expectedEndOfLife) {
        this.expectedEndOfLife = expectedEndOfLife;
    }

    public Date getActualEndOfLife() {
        return actualEndOfLife;
    }

    public void setActualEndOfLife(Date actualEndOfLife) {
        this.actualEndOfLife = actualEndOfLife;
    }

    public BigDecimal getProductionCapacity() {
        return productionCapacity;
    }

    public void setProductionCapacity(BigDecimal productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLocatedAtLocationSeqId() {
        return locatedAtLocationSeqId;
    }

    public void setLocatedAtLocationSeqId(String locatedAtLocationSeqId) {
        this.locatedAtLocationSeqId = locatedAtLocationSeqId;
    }

    public BigDecimal getSalvageValue() {
        return salvageValue;
    }

    public void setSalvageValue(BigDecimal salvageValue) {
        this.salvageValue = salvageValue;
    }

    public BigDecimal getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(BigDecimal depreciation) {
        this.depreciation = depreciation;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getPurchaseCostUomId() {
        return purchaseCostUomId;
    }

    public void setPurchaseCostUomId(String purchaseCostUomId) {
        this.purchaseCostUomId = purchaseCostUomId;
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

    public List<AccommodationSpot> getAccommodationSpotList() {
        return accommodationSpotList;
    }

    public void setAccommodationSpotList(List<AccommodationSpot> accommodationSpotList) {
        this.accommodationSpotList = accommodationSpotList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public FixedAssetType getFixedAssetTypeId() {
        return fixedAssetTypeId;
    }

    public void setFixedAssetTypeId(FixedAssetType fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public FixedAsset getParentFixedAssetId() {
        return parentFixedAssetId;
    }

    public void setParentFixedAssetId(FixedAsset parentFixedAssetId) {
        this.parentFixedAssetId = parentFixedAssetId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Product getInstanceOfProductId() {
        return instanceOfProductId;
    }

    public void setInstanceOfProductId(Product instanceOfProductId) {
        this.instanceOfProductId = instanceOfProductId;
    }

    public Facility getLocatedAtFacilityId() {
        return locatedAtFacilityId;
    }

    public void setLocatedAtFacilityId(Facility locatedAtFacilityId) {
        this.locatedAtFacilityId = locatedAtFacilityId;
    }

    public Enumeration getClassEnumId() {
        return classEnumId;
    }

    public void setClassEnumId(Enumeration classEnumId) {
        this.classEnumId = classEnumId;
    }

    public TechDataCalendar getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(TechDataCalendar calendarId) {
        this.calendarId = calendarId;
    }

    public List<AccommodationMap> getAccommodationMapList() {
        return accommodationMapList;
    }

    public void setAccommodationMapList(List<AccommodationMap> accommodationMapList) {
        this.accommodationMapList = accommodationMapList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedAssetId != null ? fixedAssetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedAsset)) {
            return false;
        }
        FixedAsset other = (FixedAsset) object;
        if ((this.fixedAssetId == null && other.fixedAssetId != null) || (this.fixedAssetId != null && !this.fixedAssetId.equals(other.fixedAssetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FixedAsset[ fixedAssetId=" + fixedAssetId + " ]";
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    public List<FixedAssetMaint> getFixedAssetMaintList() {
        return fixedAssetMaintList;
    }

    public void setFixedAssetMaintList(List<FixedAssetMaint> fixedAssetMaintList) {
        this.fixedAssetMaintList = fixedAssetMaintList;
    }

    public List<PartyFixedAssetAssignment> getPartyFixedAssetAssignmentList() {
        return partyFixedAssetAssignmentList;
    }

    public void setPartyFixedAssetAssignmentList(List<PartyFixedAssetAssignment> partyFixedAssetAssignmentList) {
        this.partyFixedAssetAssignmentList = partyFixedAssetAssignmentList;
    }

    public List<WorkEffortFixedAssetAssign> getWorkEffortFixedAssetAssignList() {
        return workEffortFixedAssetAssignList;
    }

    public void setWorkEffortFixedAssetAssignList(List<WorkEffortFixedAssetAssign> workEffortFixedAssetAssignList) {
        this.workEffortFixedAssetAssignList = workEffortFixedAssetAssignList;
    }
    
}
