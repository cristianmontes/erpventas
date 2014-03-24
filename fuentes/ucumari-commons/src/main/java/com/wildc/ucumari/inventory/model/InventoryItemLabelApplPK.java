/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class InventoryItemLabelApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_LABEL_TYPE_ID")
    private String inventoryItemLabelTypeId;

    public InventoryItemLabelApplPK() {
    }

    public InventoryItemLabelApplPK(String inventoryItemId, String inventoryItemLabelTypeId) {
        this.inventoryItemId = inventoryItemId;
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemLabelTypeId() {
        return inventoryItemLabelTypeId;
    }

    public void setInventoryItemLabelTypeId(String inventoryItemLabelTypeId) {
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        hash += (inventoryItemLabelTypeId != null ? inventoryItemLabelTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemLabelApplPK)) {
            return false;
        }
        InventoryItemLabelApplPK other = (InventoryItemLabelApplPK) object;
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        if ((this.inventoryItemLabelTypeId == null && other.inventoryItemLabelTypeId != null) || (this.inventoryItemLabelTypeId != null && !this.inventoryItemLabelTypeId.equals(other.inventoryItemLabelTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemLabelApplPK[ inventoryItemId=" + inventoryItemId + ", inventoryItemLabelTypeId=" + inventoryItemLabelTypeId + " ]";
    }
    
}
