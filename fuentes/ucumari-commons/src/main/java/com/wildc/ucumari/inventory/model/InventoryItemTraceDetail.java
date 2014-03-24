/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item_trace_detail")
@NamedQueries({
    @NamedQuery(name = "InventoryItemTraceDetail.findAll", query = "SELECT i FROM InventoryItemTraceDetail i")})
public class InventoryItemTraceDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemTraceDetailPK inventoryItemTraceDetailPK;
    @Column(name = "TRACE_LEVEL")
    private BigInteger traceLevel;
    @Column(name = "USAGE_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usageDatetime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "RECEIPT_ID")
    private String receiptId;
    @Column(name = "INVENTORY_TRANSFER_ID")
    private String inventoryTransferId;
    @Column(name = "ITEM_ISSUANCE_ID")
    private String itemIssuanceId;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "ASSIGN_WORK_EFFORT_ID")
    private String assignWorkEffortId;
    @Column(name = "PRODUCED_WORK_EFFORT_ID")
    private String producedWorkEffortId;
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private String physicalInventoryId;
    @Column(name = "VARIANCE_REASON_ID")
    private String varianceReasonId;
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
    @JoinColumn(name = "INVENTORY_ITEM_USAGE_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_USAGE_TYPE_ID")
    @ManyToOne
    private InventoryItemUsageType inventoryItemUsageTypeId;
    @JoinColumn(name = "TO_INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem toInventoryItemId;
    @JoinColumn(name = "INVENTORY_ITEM_TRACE_ID", referencedColumnName = "INVENTORY_ITEM_TRACE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItemTrace inventoryItemTrace;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;

    public InventoryItemTraceDetail() {
    }

    public InventoryItemTraceDetail(InventoryItemTraceDetailPK inventoryItemTraceDetailPK) {
        this.inventoryItemTraceDetailPK = inventoryItemTraceDetailPK;
    }

    public InventoryItemTraceDetail(String inventoryItemTraceId, String inventoryItemTraceSeqId) {
        this.inventoryItemTraceDetailPK = new InventoryItemTraceDetailPK(inventoryItemTraceId, inventoryItemTraceSeqId);
    }

    public InventoryItemTraceDetailPK getInventoryItemTraceDetailPK() {
        return inventoryItemTraceDetailPK;
    }

    public void setInventoryItemTraceDetailPK(InventoryItemTraceDetailPK inventoryItemTraceDetailPK) {
        this.inventoryItemTraceDetailPK = inventoryItemTraceDetailPK;
    }

    public BigInteger getTraceLevel() {
        return traceLevel;
    }

    public void setTraceLevel(BigInteger traceLevel) {
        this.traceLevel = traceLevel;
    }

    public Date getUsageDatetime() {
        return usageDatetime;
    }

    public void setUsageDatetime(Date usageDatetime) {
        this.usageDatetime = usageDatetime;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getInventoryTransferId() {
        return inventoryTransferId;
    }

    public void setInventoryTransferId(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getAssignWorkEffortId() {
        return assignWorkEffortId;
    }

    public void setAssignWorkEffortId(String assignWorkEffortId) {
        this.assignWorkEffortId = assignWorkEffortId;
    }

    public String getProducedWorkEffortId() {
        return producedWorkEffortId;
    }

    public void setProducedWorkEffortId(String producedWorkEffortId) {
        this.producedWorkEffortId = producedWorkEffortId;
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
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

    public InventoryItemUsageType getInventoryItemUsageTypeId() {
        return inventoryItemUsageTypeId;
    }

    public void setInventoryItemUsageTypeId(InventoryItemUsageType inventoryItemUsageTypeId) {
        this.inventoryItemUsageTypeId = inventoryItemUsageTypeId;
    }

    public InventoryItem getToInventoryItemId() {
        return toInventoryItemId;
    }

    public void setToInventoryItemId(InventoryItem toInventoryItemId) {
        this.toInventoryItemId = toInventoryItemId;
    }

    public InventoryItemTrace getInventoryItemTrace() {
        return inventoryItemTrace;
    }

    public void setInventoryItemTrace(InventoryItemTrace inventoryItemTrace) {
        this.inventoryItemTrace = inventoryItemTrace;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTraceDetailPK != null ? inventoryItemTraceDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTraceDetail)) {
            return false;
        }
        InventoryItemTraceDetail other = (InventoryItemTraceDetail) object;
        if ((this.inventoryItemTraceDetailPK == null && other.inventoryItemTraceDetailPK != null) || (this.inventoryItemTraceDetailPK != null && !this.inventoryItemTraceDetailPK.equals(other.inventoryItemTraceDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTraceDetail[ inventoryItemTraceDetailPK=" + inventoryItemTraceDetailPK + " ]";
    }
    
}
