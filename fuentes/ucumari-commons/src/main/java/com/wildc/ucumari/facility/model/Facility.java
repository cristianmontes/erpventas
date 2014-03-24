/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility")

public class Facility implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityParty> facilityPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityCarrierShipment> facilityCarrierShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityGroupMember> facilityGroupMemberList;
    @OneToMany(mappedBy = "facilityIdFrom")
    private List<FacilityTransferPlan> facilityTransferPlanList;
    @OneToMany(mappedBy = "facilityIdTo")
    private List<FacilityTransferPlan> facilityTransferPlanList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityAssoc> facilityAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility1")
    private List<FacilityAssoc> facilityAssocList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityRole> facilityRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityAttribute> facilityAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityContactMech> facilityContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityContactMechPurpose> facilityContactMechPurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityPartyPermission> facilityPartyPermissionList;
    @OneToMany(mappedBy = "destFacilityId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(mappedBy = "originFacilityId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList1;
    @OneToMany(mappedBy = "facilityId")
    private List<ReorderGuideline> reorderGuidelineList;
    @OneToMany(mappedBy = "facilityId")
    private List<SalesForecastItem> salesForecastItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<FacilityLocation> facilityLocationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<ProductStoreFacility> productStoreFacilityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<ProductFacility> productFacilityList;
    @OneToMany(mappedBy = "facilityId")
    private List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facility")
    private List<ProdCatalogInvFacility> prodCatalogInvFacilityList;
    @OneToMany(mappedBy = "facilityIdTo")
    private List<InventoryTransfer> inventoryTransferList;
    @OneToMany(mappedBy = "facilityId")
    private List<InventoryTransfer> inventoryTransferList1;
    @OneToMany(mappedBy = "facilityId")
    private List<InventoryEventPlanned> inventoryEventPlannedList;
    @OneToMany(mappedBy = "originFacilityId")
    private List<Delivery> deliveryList;
    @OneToMany(mappedBy = "destFacilityId")
    private List<Delivery> deliveryList1;
    @OneToMany(mappedBy = "facilityIdTo")
    private List<Requirement> requirementList;
    @OneToMany(mappedBy = "facilityId")
    private List<Requirement> requirementList1;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Column(name = "FACILITY_NAME")
    private String facilityName;
    @Column(name = "SQUARE_FOOTAGE")
    private BigInteger squareFootage;
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Column(name = "DEFAULT_DAYS_TO_SHIP")
    private BigInteger defaultDaysToShip;
    @Column(name = "OPENED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openedDate;
    @Column(name = "CLOSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedDate;
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
    
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party ownerPartyId;
    @JoinColumn(name = "PRIMARY_FACILITY_GROUP_ID", referencedColumnName = "FACILITY_GROUP_ID")
    @ManyToOne
    private FacilityGroup primaryFacilityGroupId;
    @JoinColumn(name = "FACILITY_TYPE_ID", referencedColumnName = "FACILITY_TYPE_ID")
    @ManyToOne
    private FacilityType facilityTypeId;
    /*
    @OneToMany(mappedBy = "destinationFacilityId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "originFacilityId")
    private List<Shipment> shipmentList1;
    @OneToMany(mappedBy = "facilityId")
    private List<Picklist> picklistList;
    @OneToMany(mappedBy = "destinationFacilityId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "inventoryFacilityId")
    private List<ProductStore> productStoreList;
    @OneToMany(mappedBy = "facilityId")
    private List<InventoryItem> inventoryItemList;
    @OneToMany(mappedBy = "originFacilityId")
    private List<OrderHeader> orderHeaderList;
    @OneToMany(mappedBy = "facilityId")
    private List<WorkEffort> workEffortList;
    @JoinColumn(name = "RESERVE_ORDER_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reserveOrderEnumId;
    @JoinColumn(name = "DEFAULT_INVENTORY_ITEM_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_TYPE_ID")
    @ManyToOne
    private InventoryItemType defaultInventoryItemTypeId;
    @JoinColumn(name = "DEFAULT_WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom defaultWeightUomId;    
    @OneToMany(mappedBy = "parentFacilityId")
    private List<Facility> facilityList;
    @JoinColumn(name = "PARENT_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility parentFacilityId;    
    @JoinColumn(name = "GEO_POINT_ID", referencedColumnName = "GEO_POINT_ID")
    @ManyToOne
    private GeoPoint geoPointId;
    
    @OneToMany(mappedBy = "locatedAtFacilityId")
    private List<FixedAsset> fixedAssetList;
    @OneToMany(mappedBy = "facilityId")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(mappedBy = "facilityId")
    private List<Container> containerList;
    @OneToMany(mappedBy = "facilityId")
    private List<Product> productList;
    @OneToMany(mappedBy = "facilityId")
    private List<WorkEffortPartyAssignment> workEffortPartyAssignmentList;
*/
    public Facility() {
    }

    public Facility(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public BigInteger getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(BigInteger squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public BigInteger getDefaultDaysToShip() {
        return defaultDaysToShip;
    }

    public void setDefaultDaysToShip(BigInteger defaultDaysToShip) {
        this.defaultDaysToShip = defaultDaysToShip;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
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
    
    public Party getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(Party ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
    
    public FacilityGroup getPrimaryFacilityGroupId() {
        return primaryFacilityGroupId;
    }

    public void setPrimaryFacilityGroupId(FacilityGroup primaryFacilityGroupId) {
        this.primaryFacilityGroupId = primaryFacilityGroupId;
    }
    
    public FacilityType getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(FacilityType facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
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

    public List<Picklist> getPicklistList() {
        return picklistList;
    }

    public void setPicklistList(List<Picklist> picklistList) {
        this.picklistList = picklistList;
    }

    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }

    public List<ProductStore> getProductStoreList() {
        return productStoreList;
    }

    public void setProductStoreList(List<ProductStore> productStoreList) {
        this.productStoreList = productStoreList;
    }

    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public Enumeration getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(Enumeration reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public InventoryItemType getDefaultInventoryItemTypeId() {
        return defaultInventoryItemTypeId;
    }

    public void setDefaultInventoryItemTypeId(InventoryItemType defaultInventoryItemTypeId) {
        this.defaultInventoryItemTypeId = defaultInventoryItemTypeId;
    }

    public Uom getDefaultWeightUomId() {
        return defaultWeightUomId;
    }

    public void setDefaultWeightUomId(Uom defaultWeightUomId) {
        this.defaultWeightUomId = defaultWeightUomId;
    }

    

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public Facility getParentFacilityId() {
        return parentFacilityId;
    }

    public void setParentFacilityId(Facility parentFacilityId) {
        this.parentFacilityId = parentFacilityId;
    }

    
    public GeoPoint getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(GeoPoint geoPointId) {
        this.geoPointId = geoPointId;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(List<Container> containerList) {
        this.containerList = containerList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<WorkEffortPartyAssignment> getWorkEffortPartyAssignmentList() {
        return workEffortPartyAssignmentList;
    }

    public void setWorkEffortPartyAssignmentList(List<WorkEffortPartyAssignment> workEffortPartyAssignmentList) {
        this.workEffortPartyAssignmentList = workEffortPartyAssignmentList;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facility)) {
            return false;
        }
        Facility other = (Facility) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Facility[ facilityId=" + facilityId + " ]";
    }
/*
    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public List<Delivery> getDeliveryList1() {
        return deliveryList1;
    }

    public void setDeliveryList1(List<Delivery> deliveryList1) {
        this.deliveryList1 = deliveryList1;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    public List<Requirement> getRequirementList1() {
        return requirementList1;
    }

    public void setRequirementList1(List<Requirement> requirementList1) {
        this.requirementList1 = requirementList1;
    }

    public List<InventoryTransfer> getInventoryTransferList() {
        return inventoryTransferList;
    }

    public void setInventoryTransferList(List<InventoryTransfer> inventoryTransferList) {
        this.inventoryTransferList = inventoryTransferList;
    }

    public List<InventoryTransfer> getInventoryTransferList1() {
        return inventoryTransferList1;
    }

    public void setInventoryTransferList1(List<InventoryTransfer> inventoryTransferList1) {
        this.inventoryTransferList1 = inventoryTransferList1;
    }

    public List<InventoryEventPlanned> getInventoryEventPlannedList() {
        return inventoryEventPlannedList;
    }

    public void setInventoryEventPlannedList(List<InventoryEventPlanned> inventoryEventPlannedList) {
        this.inventoryEventPlannedList = inventoryEventPlannedList;
    }

    public List<FacilityLocation> getFacilityLocationList() {
        return facilityLocationList;
    }

    public void setFacilityLocationList(List<FacilityLocation> facilityLocationList) {
        this.facilityLocationList = facilityLocationList;
    }

    public List<ProductStoreFacility> getProductStoreFacilityList() {
        return productStoreFacilityList;
    }

    public void setProductStoreFacilityList(List<ProductStoreFacility> productStoreFacilityList) {
        this.productStoreFacilityList = productStoreFacilityList;
    }

    public List<ProductFacility> getProductFacilityList() {
        return productFacilityList;
    }

    public void setProductFacilityList(List<ProductFacility> productFacilityList) {
        this.productFacilityList = productFacilityList;
    }

    public List<ProdStoreFacilityByAddr> getProdStoreFacilityByAddrList() {
        return prodStoreFacilityByAddrList;
    }

    public void setProdStoreFacilityByAddrList(List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList) {
        this.prodStoreFacilityByAddrList = prodStoreFacilityByAddrList;
    }

    public List<ProdCatalogInvFacility> getProdCatalogInvFacilityList() {
        return prodCatalogInvFacilityList;
    }

    public void setProdCatalogInvFacilityList(List<ProdCatalogInvFacility> prodCatalogInvFacilityList) {
        this.prodCatalogInvFacilityList = prodCatalogInvFacilityList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList1() {
        return shipmentRouteSegmentList1;
    }

    public void setShipmentRouteSegmentList1(List<ShipmentRouteSegment> shipmentRouteSegmentList1) {
        this.shipmentRouteSegmentList1 = shipmentRouteSegmentList1;
    }

    public List<ReorderGuideline> getReorderGuidelineList() {
        return reorderGuidelineList;
    }

    public void setReorderGuidelineList(List<ReorderGuideline> reorderGuidelineList) {
        this.reorderGuidelineList = reorderGuidelineList;
    }

    public List<SalesForecastItem> getSalesForecastItemList() {
        return salesForecastItemList;
    }

    public void setSalesForecastItemList(List<SalesForecastItem> salesForecastItemList) {
        this.salesForecastItemList = salesForecastItemList;
    }

    public List<FacilityParty> getFacilityPartyList() {
        return facilityPartyList;
    }

    public void setFacilityPartyList(List<FacilityParty> facilityPartyList) {
        this.facilityPartyList = facilityPartyList;
    }

    public List<FacilityCarrierShipment> getFacilityCarrierShipmentList() {
        return facilityCarrierShipmentList;
    }

    public void setFacilityCarrierShipmentList(List<FacilityCarrierShipment> facilityCarrierShipmentList) {
        this.facilityCarrierShipmentList = facilityCarrierShipmentList;
    }

    public List<FacilityGroupMember> getFacilityGroupMemberList() {
        return facilityGroupMemberList;
    }

    public void setFacilityGroupMemberList(List<FacilityGroupMember> facilityGroupMemberList) {
        this.facilityGroupMemberList = facilityGroupMemberList;
    }

    public List<FacilityTransferPlan> getFacilityTransferPlanList() {
        return facilityTransferPlanList;
    }

    public void setFacilityTransferPlanList(List<FacilityTransferPlan> facilityTransferPlanList) {
        this.facilityTransferPlanList = facilityTransferPlanList;
    }

    public List<FacilityTransferPlan> getFacilityTransferPlanList1() {
        return facilityTransferPlanList1;
    }

    public void setFacilityTransferPlanList1(List<FacilityTransferPlan> facilityTransferPlanList1) {
        this.facilityTransferPlanList1 = facilityTransferPlanList1;
    }

    public List<FacilityAssoc> getFacilityAssocList() {
        return facilityAssocList;
    }

    public void setFacilityAssocList(List<FacilityAssoc> facilityAssocList) {
        this.facilityAssocList = facilityAssocList;
    }

    public List<FacilityAssoc> getFacilityAssocList1() {
        return facilityAssocList1;
    }

    public void setFacilityAssocList1(List<FacilityAssoc> facilityAssocList1) {
        this.facilityAssocList1 = facilityAssocList1;
    }

    public List<FacilityRole> getFacilityRoleList() {
        return facilityRoleList;
    }

    public void setFacilityRoleList(List<FacilityRole> facilityRoleList) {
        this.facilityRoleList = facilityRoleList;
    }

    public List<FacilityAttribute> getFacilityAttributeList() {
        return facilityAttributeList;
    }

    public void setFacilityAttributeList(List<FacilityAttribute> facilityAttributeList) {
        this.facilityAttributeList = facilityAttributeList;
    }

    public List<FacilityContactMech> getFacilityContactMechList() {
        return facilityContactMechList;
    }

    public void setFacilityContactMechList(List<FacilityContactMech> facilityContactMechList) {
        this.facilityContactMechList = facilityContactMechList;
    }

    public List<FacilityContactMechPurpose> getFacilityContactMechPurposeList() {
        return facilityContactMechPurposeList;
    }

    public void setFacilityContactMechPurposeList(List<FacilityContactMechPurpose> facilityContactMechPurposeList) {
        this.facilityContactMechPurposeList = facilityContactMechPurposeList;
    }

    public List<FacilityPartyPermission> getFacilityPartyPermissionList() {
        return facilityPartyPermissionList;
    }

    public void setFacilityPartyPermissionList(List<FacilityPartyPermission> facilityPartyPermissionList) {
        this.facilityPartyPermissionList = facilityPartyPermissionList;
    }
    */
}
