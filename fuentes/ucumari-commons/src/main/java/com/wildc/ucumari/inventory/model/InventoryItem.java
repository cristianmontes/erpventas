/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item")
public class InventoryItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<WorkEffortInventoryAssign> workEffortInventoryAssignList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<Subscription> subscriptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<WorkEffortInventoryProduced> workEffortInventoryProducedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<PicklistItem> picklistItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<InventoryItemLabelAppl> inventoryItemLabelApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<InventoryItemDetail> inventoryItemDetailList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<InventoryTransfer> inventoryTransferList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<InventoryItemAttribute> inventoryItemAttributeList;
    @OneToMany(mappedBy = "toInventoryItemId")
    private List<InventoryItemTraceDetail> inventoryItemTraceDetailList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<InventoryItemTraceDetail> inventoryItemTraceDetailList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<InventoryItemStatus> inventoryItemStatusList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<InventoryItemTrace> inventoryItemTraceList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<ItemIssuance> itemIssuanceList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Column(name = "DATETIME_RECEIVED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeReceived;
    @Column(name = "DATETIME_MANUFACTURED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeManufactured;
    @Column(name = "EXPIRE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;
    @Column(name = "BIN_NUMBER")
    private String binNumber;
    @Column(name = "LOCATION_SEQ_ID")
    private String locationSeqId;
    @Column(name = "COMMENTS")
    private String comments;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_ON_HAND_TOTAL")
    private BigDecimal quantityOnHandTotal;
    @Column(name = "AVAILABLE_TO_PROMISE_TOTAL")
    private BigDecimal availableToPromiseTotal;
    @Column(name = "QUANTITY_ON_HAND")
    private BigDecimal quantityOnHand;
    @Column(name = "AVAILABLE_TO_PROMISE")
    private BigDecimal availableToPromise;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "SOFT_IDENTIFIER")
    private String softIdentifier;
    @Column(name = "ACTIVATION_NUMBER")
    private String activationNumber;
    @Column(name = "ACTIVATION_VALID_THRU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationValidThru;
    @Column(name = "UNIT_COST")
    private BigDecimal unitCost;
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
    /*@OneToMany(mappedBy = "inventoryItemId")
    private List<ShipmentReceipt> shipmentReceiptList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItem")
    private List<InventoryItemVariance> inventoryItemVarianceList;*/
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "INVENTORY_ITEM_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_TYPE_ID")
    @ManyToOne
    private InventoryItemType inventoryItemTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party ownerPartyId;
    @JoinColumn(name = "LOT_ID", referencedColumnName = "LOT_ID")
    @ManyToOne
    private Lot lotId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    /*@OneToMany(mappedBy = "parentInventoryItemId")
    private List<InventoryItem> inventoryItemList;*/
    @JoinColumn(name = "PARENT_INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem parentInventoryItemId;
    /*@JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId10;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId2;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId3;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId4;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId5;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId6;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId7;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId8;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId9;*/
    @JoinColumn(name = "CONTAINER_ID", referencedColumnName = "CONTAINER_ID")
    @ManyToOne
    private Container containerId;
    /*@OneToMany(mappedBy = "inventoryItemId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "fromInventoryItemId")
    private List<OrderItem> orderItemList;
    @OneToMany(mappedBy = "inventoryItemId")
    private List<InvoiceItem> invoiceItemList;*/

    public InventoryItem() {
    }

    public InventoryItem(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Date getDatetimeReceived() {
        return datetimeReceived;
    }

    public void setDatetimeReceived(Date datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }

    public Date getDatetimeManufactured() {
        return datetimeManufactured;
    }

    public void setDatetimeManufactured(Date datetimeManufactured) {
        this.datetimeManufactured = datetimeManufactured;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getQuantityOnHandTotal() {
        return quantityOnHandTotal;
    }

    public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }

    public BigDecimal getAvailableToPromiseTotal() {
        return availableToPromiseTotal;
    }

    public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }

    public BigDecimal getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public BigDecimal getAvailableToPromise() {
        return availableToPromise;
    }

    public void setAvailableToPromise(BigDecimal availableToPromise) {
        this.availableToPromise = availableToPromise;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSoftIdentifier() {
        return softIdentifier;
    }

    public void setSoftIdentifier(String softIdentifier) {
        this.softIdentifier = softIdentifier;
    }

    public String getActivationNumber() {
        return activationNumber;
    }

    public void setActivationNumber(String activationNumber) {
        this.activationNumber = activationNumber;
    }

    public Date getActivationValidThru() {
        return activationValidThru;
    }

    public void setActivationValidThru(Date activationValidThru) {
        this.activationValidThru = activationValidThru;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
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
    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }

    public List<InventoryItemVariance> getInventoryItemVarianceList() {
        return inventoryItemVarianceList;
    }

    public void setInventoryItemVarianceList(List<InventoryItemVariance> inventoryItemVarianceList) {
        this.inventoryItemVarianceList = inventoryItemVarianceList;
    }*/

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public InventoryItemType getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(InventoryItemType inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Party getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(Party ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public Lot getLotId() {
        return lotId;
    }

    public void setLotId(Lot lotId) {
        this.lotId = lotId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
/*
    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }*/

    public InventoryItem getParentInventoryItemId() {
        return parentInventoryItemId;
    }

    public void setParentInventoryItemId(InventoryItem parentInventoryItemId) {
        this.parentInventoryItemId = parentInventoryItemId;
    }
/*
    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public Enumeration getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(Enumeration acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    public Enumeration getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(Enumeration acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public Enumeration getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(Enumeration acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public Enumeration getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(Enumeration acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public Enumeration getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(Enumeration acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public Enumeration getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(Enumeration acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public Enumeration getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(Enumeration acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public Enumeration getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(Enumeration acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public Enumeration getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(Enumeration acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }*/

    public Container getContainerId() {
        return containerId;
    }

    public void setContainerId(Container containerId) {
        this.containerId = containerId;
    }
/*
    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItem)) {
            return false;
        }
        InventoryItem other = (InventoryItem) object;
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItem[ inventoryItemId=" + inventoryItemId + " ]";
    }
/*
    public List<InventoryItemLabelAppl> getInventoryItemLabelApplList() {
        return inventoryItemLabelApplList;
    }

    public void setInventoryItemLabelApplList(List<InventoryItemLabelAppl> inventoryItemLabelApplList) {
        this.inventoryItemLabelApplList = inventoryItemLabelApplList;
    }

    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }

    public List<InventoryTransfer> getInventoryTransferList() {
        return inventoryTransferList;
    }

    public void setInventoryTransferList(List<InventoryTransfer> inventoryTransferList) {
        this.inventoryTransferList = inventoryTransferList;
    }

    public List<InventoryItemAttribute> getInventoryItemAttributeList() {
        return inventoryItemAttributeList;
    }

    public void setInventoryItemAttributeList(List<InventoryItemAttribute> inventoryItemAttributeList) {
        this.inventoryItemAttributeList = inventoryItemAttributeList;
    }

    public List<InventoryItemTraceDetail> getInventoryItemTraceDetailList() {
        return inventoryItemTraceDetailList;
    }

    public void setInventoryItemTraceDetailList(List<InventoryItemTraceDetail> inventoryItemTraceDetailList) {
        this.inventoryItemTraceDetailList = inventoryItemTraceDetailList;
    }

    public List<InventoryItemTraceDetail> getInventoryItemTraceDetailList1() {
        return inventoryItemTraceDetailList1;
    }

    public void setInventoryItemTraceDetailList1(List<InventoryItemTraceDetail> inventoryItemTraceDetailList1) {
        this.inventoryItemTraceDetailList1 = inventoryItemTraceDetailList1;
    }

    public List<InventoryItemStatus> getInventoryItemStatusList() {
        return inventoryItemStatusList;
    }

    public void setInventoryItemStatusList(List<InventoryItemStatus> inventoryItemStatusList) {
        this.inventoryItemStatusList = inventoryItemStatusList;
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

    public List<PicklistItem> getPicklistItemList() {
        return picklistItemList;
    }

    public void setPicklistItemList(List<PicklistItem> picklistItemList) {
        this.picklistItemList = picklistItemList;
    }

    public List<WorkEffortInventoryAssign> getWorkEffortInventoryAssignList() {
        return workEffortInventoryAssignList;
    }

    public void setWorkEffortInventoryAssignList(List<WorkEffortInventoryAssign> workEffortInventoryAssignList) {
        this.workEffortInventoryAssignList = workEffortInventoryAssignList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<WorkEffortInventoryProduced> getWorkEffortInventoryProducedList() {
        return workEffortInventoryProducedList;
    }

    public void setWorkEffortInventoryProducedList(List<WorkEffortInventoryProduced> workEffortInventoryProducedList) {
        this.workEffortInventoryProducedList = workEffortInventoryProducedList;
    }*/
    
}
