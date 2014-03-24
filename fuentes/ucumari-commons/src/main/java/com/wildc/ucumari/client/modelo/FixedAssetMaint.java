/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItemDetail;
import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.ProductMaintType;
import com.wildc.ucumari.product.model.ProductMeterType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "fixed_asset_maint")
@NamedQueries({
    @NamedQuery(name = "FixedAssetMaint.findAll", query = "SELECT f FROM FixedAssetMaint f")})
public class FixedAssetMaint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FixedAssetMaintPK fixedAssetMaintPK;
    @Column(name = "PRODUCT_MAINT_SEQ_ID")
    private String productMaintSeqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INTERVAL_QUANTITY")
    private BigDecimal intervalQuantity;
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
    @OneToMany(mappedBy = "fixedAssetMaint")
    private List<InventoryItemDetail> inventoryItemDetailList;
    @OneToMany(mappedBy = "fixedAssetMaint")
    private List<ItemIssuance> itemIssuanceList;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SCHEDULE_WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort scheduleWorkEffortId;
    @JoinColumn(name = "PURCHASE_ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader purchaseOrderId;
    @JoinColumn(name = "PRODUCT_MAINT_TYPE_ID", referencedColumnName = "PRODUCT_MAINT_TYPE_ID")
    @ManyToOne
    private ProductMaintType productMaintTypeId;
    @JoinColumn(name = "INTERVAL_METER_TYPE_ID", referencedColumnName = "PRODUCT_METER_TYPE_ID")
    @ManyToOne
    private ProductMeterType intervalMeterTypeId;
    @JoinColumn(name = "INTERVAL_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom intervalUomId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FixedAsset fixedAsset;

    public FixedAssetMaint() {
    }

    public FixedAssetMaint(FixedAssetMaintPK fixedAssetMaintPK) {
        this.fixedAssetMaintPK = fixedAssetMaintPK;
    }

    public FixedAssetMaint(String fixedAssetId, String maintHistSeqId) {
        this.fixedAssetMaintPK = new FixedAssetMaintPK(fixedAssetId, maintHistSeqId);
    }

    public FixedAssetMaintPK getFixedAssetMaintPK() {
        return fixedAssetMaintPK;
    }

    public void setFixedAssetMaintPK(FixedAssetMaintPK fixedAssetMaintPK) {
        this.fixedAssetMaintPK = fixedAssetMaintPK;
    }

    public String getProductMaintSeqId() {
        return productMaintSeqId;
    }

    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }

    public BigDecimal getIntervalQuantity() {
        return intervalQuantity;
    }

    public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
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

    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }

    public List<ItemIssuance> getItemIssuanceList() {
        return itemIssuanceList;
    }

    public void setItemIssuanceList(List<ItemIssuance> itemIssuanceList) {
        this.itemIssuanceList = itemIssuanceList;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public WorkEffort getScheduleWorkEffortId() {
        return scheduleWorkEffortId;
    }

    public void setScheduleWorkEffortId(WorkEffort scheduleWorkEffortId) {
        this.scheduleWorkEffortId = scheduleWorkEffortId;
    }

    public OrderHeader getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(OrderHeader purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public ProductMaintType getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(ProductMaintType productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }

    public ProductMeterType getIntervalMeterTypeId() {
        return intervalMeterTypeId;
    }

    public void setIntervalMeterTypeId(ProductMeterType intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }

    public Uom getIntervalUomId() {
        return intervalUomId;
    }

    public void setIntervalUomId(Uom intervalUomId) {
        this.intervalUomId = intervalUomId;
    }

    public FixedAsset getFixedAsset() {
        return fixedAsset;
    }

    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedAssetMaintPK != null ? fixedAssetMaintPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedAssetMaint)) {
            return false;
        }
        FixedAssetMaint other = (FixedAssetMaint) object;
        if ((this.fixedAssetMaintPK == null && other.fixedAssetMaintPK != null) || (this.fixedAssetMaintPK != null && !this.fixedAssetMaintPK.equals(other.fixedAssetMaintPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FixedAssetMaint[ fixedAssetMaintPK=" + fixedAssetMaintPK + " ]";
    }
    
}
