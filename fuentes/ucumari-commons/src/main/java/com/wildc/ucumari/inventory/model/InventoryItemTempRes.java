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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.Visit;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductStore;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item_temp_res")
@NamedQueries({
    @NamedQuery(name = "InventoryItemTempRes.findAll", query = "SELECT i FROM InventoryItemTempRes i")})
public class InventoryItemTempRes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemTempResPK inventoryItemTempResPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "RESERVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservedDate;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Visit visit;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;

    public InventoryItemTempRes() {
    }

    public InventoryItemTempRes(InventoryItemTempResPK inventoryItemTempResPK) {
        this.inventoryItemTempResPK = inventoryItemTempResPK;
    }

    public InventoryItemTempRes(String visitId, String productId, String productStoreId) {
        this.inventoryItemTempResPK = new InventoryItemTempResPK(visitId, productId, productStoreId);
    }

    public InventoryItemTempResPK getInventoryItemTempResPK() {
        return inventoryItemTempResPK;
    }

    public void setInventoryItemTempResPK(InventoryItemTempResPK inventoryItemTempResPK) {
        this.inventoryItemTempResPK = inventoryItemTempResPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getReservedDate() {
        return reservedDate;
    }

    public void setReservedDate(Date reservedDate) {
        this.reservedDate = reservedDate;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTempResPK != null ? inventoryItemTempResPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTempRes)) {
            return false;
        }
        InventoryItemTempRes other = (InventoryItemTempRes) object;
        if ((this.inventoryItemTempResPK == null && other.inventoryItemTempResPK != null) || (this.inventoryItemTempResPK != null && !this.inventoryItemTempResPK.equals(other.inventoryItemTempResPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTempRes[ inventoryItemTempResPK=" + inventoryItemTempResPK + " ]";
    }
    
}
