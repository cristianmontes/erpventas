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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_event_planned")
public class InventoryEventPlanned implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryEventPlannedPK inventoryEventPlannedPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EVENT_QUANTITY")
    private BigDecimal eventQuantity;
    @Lob
    @Column(name = "EVENT_NAME")
    private String eventName;
    @Column(name = "IS_LATE")
    private Character isLate;
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
    @JoinColumn(name = "INVENTORY_EVENT_PLAN_TYPE_ID", referencedColumnName = "INVENTORY_EVENT_PLAN_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryEventPlannedType inventoryEventPlannedType;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;

    public InventoryEventPlanned() {
    }

    public InventoryEventPlanned(InventoryEventPlannedPK inventoryEventPlannedPK) {
        this.inventoryEventPlannedPK = inventoryEventPlannedPK;
    }

    public InventoryEventPlanned(String productId, Date eventDate, String inventoryEventPlanTypeId) {
        this.inventoryEventPlannedPK = new InventoryEventPlannedPK(productId, eventDate, inventoryEventPlanTypeId);
    }

    public InventoryEventPlannedPK getInventoryEventPlannedPK() {
        return inventoryEventPlannedPK;
    }

    public void setInventoryEventPlannedPK(InventoryEventPlannedPK inventoryEventPlannedPK) {
        this.inventoryEventPlannedPK = inventoryEventPlannedPK;
    }

    public BigDecimal getEventQuantity() {
        return eventQuantity;
    }

    public void setEventQuantity(BigDecimal eventQuantity) {
        this.eventQuantity = eventQuantity;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Character getIsLate() {
        return isLate;
    }

    public void setIsLate(Character isLate) {
        this.isLate = isLate;
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

    public InventoryEventPlannedType getInventoryEventPlannedType() {
        return inventoryEventPlannedType;
    }

    public void setInventoryEventPlannedType(InventoryEventPlannedType inventoryEventPlannedType) {
        this.inventoryEventPlannedType = inventoryEventPlannedType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryEventPlannedPK != null ? inventoryEventPlannedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryEventPlanned)) {
            return false;
        }
        InventoryEventPlanned other = (InventoryEventPlanned) object;
        if ((this.inventoryEventPlannedPK == null && other.inventoryEventPlannedPK != null) || (this.inventoryEventPlannedPK != null && !this.inventoryEventPlannedPK.equals(other.inventoryEventPlannedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryEventPlanned[ inventoryEventPlannedPK=" + inventoryEventPlannedPK + " ]";
    }
    
}
