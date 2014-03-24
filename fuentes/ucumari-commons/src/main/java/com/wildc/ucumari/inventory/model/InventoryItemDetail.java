/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.FixedAssetMaint;
import com.wildc.ucumari.client.modelo.ItemIssuance;
import com.wildc.ucumari.client.modelo.WorkEffort;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.shipment.model.ShipmentReceipt;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item_detail")
public class InventoryItemDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemDetailPK inventoryItemDetailPK;
    @Column(name = "EFFECTIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_ON_HAND_DIFF")
    private BigDecimal quantityOnHandDiff;
    @Column(name = "AVAILABLE_TO_PROMISE_DIFF")
    private BigDecimal availableToPromiseDiff;
    @Column(name = "UNIT_COST")
    private BigDecimal unitCost;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Column(name = "SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;
    @Column(name = "RETURN_ID")
    private String returnId;
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;
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
    /*@JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortId;*/
    @JoinColumn(name = "RECEIPT_ID", referencedColumnName = "RECEIPT_ID")
    @ManyToOne
    private ShipmentReceipt receiptId;
    @JoinColumn(name = "REASON_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reasonEnumId;
    @JoinColumn(name = "PHYSICAL_INVENTORY_ID", referencedColumnName = "PHYSICAL_INVENTORY_ID")
    @ManyToOne
    private PhysicalInventory physicalInventoryId;
    /*@JoinColumn(name = "ITEM_ISSUANCE_ID", referencedColumnName = "ITEM_ISSUANCE_ID")
    @ManyToOne
    private ItemIssuance itemIssuanceId;*/
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;
    /*@JoinColumns({
        @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID"),
        @JoinColumn(name = "MAINT_HIST_SEQ_ID", referencedColumnName = "MAINT_HIST_SEQ_ID")})
    @ManyToOne
    private FixedAssetMaint fixedAssetMaint;*/

    public InventoryItemDetail() {
    }

    public InventoryItemDetail(InventoryItemDetailPK inventoryItemDetailPK) {
        this.inventoryItemDetailPK = inventoryItemDetailPK;
    }

    public InventoryItemDetail(String inventoryItemId, String inventoryItemDetailSeqId) {
        this.inventoryItemDetailPK = new InventoryItemDetailPK(inventoryItemId, inventoryItemDetailSeqId);
    }

    public InventoryItemDetailPK getInventoryItemDetailPK() {
        return inventoryItemDetailPK;
    }

    public void setInventoryItemDetailPK(InventoryItemDetailPK inventoryItemDetailPK) {
        this.inventoryItemDetailPK = inventoryItemDetailPK;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BigDecimal getQuantityOnHandDiff() {
        return quantityOnHandDiff;
    }

    public void setQuantityOnHandDiff(BigDecimal quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }

    public BigDecimal getAvailableToPromiseDiff() {
        return availableToPromiseDiff;
    }

    public void setAvailableToPromiseDiff(BigDecimal availableToPromiseDiff) {
        this.availableToPromiseDiff = availableToPromiseDiff;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
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
    public WorkEffort getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(WorkEffort workEffortId) {
        this.workEffortId = workEffortId;
    }*/

    public ShipmentReceipt getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(ShipmentReceipt receiptId) {
        this.receiptId = receiptId;
    }

    public Enumeration getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(Enumeration reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }

    public PhysicalInventory getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(PhysicalInventory physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
/*
    public ItemIssuance getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(ItemIssuance itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }*/

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
/*
    public FixedAssetMaint getFixedAssetMaint() {
        return fixedAssetMaint;
    }

    public void setFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
        this.fixedAssetMaint = fixedAssetMaint;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemDetailPK != null ? inventoryItemDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemDetail)) {
            return false;
        }
        InventoryItemDetail other = (InventoryItemDetail) object;
        if ((this.inventoryItemDetailPK == null && other.inventoryItemDetailPK != null) || (this.inventoryItemDetailPK != null && !this.inventoryItemDetailPK.equals(other.inventoryItemDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemDetail[ inventoryItemDetailPK=" + inventoryItemDetailPK + " ]";
    }
    
}
