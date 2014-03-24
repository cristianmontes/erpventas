/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
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
@Table(name = "inventory_item_type_attr")
@NamedQueries({
    @NamedQuery(name = "InventoryItemTypeAttr.findAll", query = "SELECT i FROM InventoryItemTypeAttr i")})
public class InventoryItemTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemTypeAttrPK inventoryItemTypeAttrPK;
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
    @JoinColumn(name = "INVENTORY_ITEM_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItemType inventoryItemType;

    public InventoryItemTypeAttr() {
    }

    public InventoryItemTypeAttr(InventoryItemTypeAttrPK inventoryItemTypeAttrPK) {
        this.inventoryItemTypeAttrPK = inventoryItemTypeAttrPK;
    }

    public InventoryItemTypeAttr(String inventoryItemTypeId, String attrName) {
        this.inventoryItemTypeAttrPK = new InventoryItemTypeAttrPK(inventoryItemTypeId, attrName);
    }

    public InventoryItemTypeAttrPK getInventoryItemTypeAttrPK() {
        return inventoryItemTypeAttrPK;
    }

    public void setInventoryItemTypeAttrPK(InventoryItemTypeAttrPK inventoryItemTypeAttrPK) {
        this.inventoryItemTypeAttrPK = inventoryItemTypeAttrPK;
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

    public InventoryItemType getInventoryItemType() {
        return inventoryItemType;
    }

    public void setInventoryItemType(InventoryItemType inventoryItemType) {
        this.inventoryItemType = inventoryItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTypeAttrPK != null ? inventoryItemTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTypeAttr)) {
            return false;
        }
        InventoryItemTypeAttr other = (InventoryItemTypeAttr) object;
        if ((this.inventoryItemTypeAttrPK == null && other.inventoryItemTypeAttrPK != null) || (this.inventoryItemTypeAttrPK != null && !this.inventoryItemTypeAttrPK.equals(other.inventoryItemTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTypeAttr[ inventoryItemTypeAttrPK=" + inventoryItemTypeAttrPK + " ]";
    }
    
}
