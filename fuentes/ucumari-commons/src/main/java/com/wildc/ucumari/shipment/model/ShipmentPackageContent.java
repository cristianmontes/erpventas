/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_package_content")
public class ShipmentPackageContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentPackageContentPK shipmentPackageContentPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "SUB_PRODUCT_QUANTITY")
    private BigDecimal subProductQuantity;
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
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_PACKAGE_SEQ_ID", referencedColumnName = "SHIPMENT_PACKAGE_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentPackage shipmentPackage;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentItem shipmentItem;
    @JoinColumn(name = "SUB_PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product subProductId;

    public ShipmentPackageContent() {
    }

    public ShipmentPackageContent(ShipmentPackageContentPK shipmentPackageContentPK) {
        this.shipmentPackageContentPK = shipmentPackageContentPK;
    }

    public ShipmentPackageContent(String shipmentId, String shipmentPackageSeqId, String shipmentItemSeqId) {
        this.shipmentPackageContentPK = new ShipmentPackageContentPK(shipmentId, shipmentPackageSeqId, shipmentItemSeqId);
    }

    public ShipmentPackageContentPK getShipmentPackageContentPK() {
        return shipmentPackageContentPK;
    }

    public void setShipmentPackageContentPK(ShipmentPackageContentPK shipmentPackageContentPK) {
        this.shipmentPackageContentPK = shipmentPackageContentPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubProductQuantity() {
        return subProductQuantity;
    }

    public void setSubProductQuantity(BigDecimal subProductQuantity) {
        this.subProductQuantity = subProductQuantity;
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

    public ShipmentPackage getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public Product getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(Product subProductId) {
        this.subProductId = subProductId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentPackageContentPK != null ? shipmentPackageContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackageContent)) {
            return false;
        }
        ShipmentPackageContent other = (ShipmentPackageContent) object;
        if ((this.shipmentPackageContentPK == null && other.shipmentPackageContentPK != null) || (this.shipmentPackageContentPK != null && !this.shipmentPackageContentPK.equals(other.shipmentPackageContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackageContent[ shipmentPackageContentPK=" + shipmentPackageContentPK + " ]";
    }
    
}
