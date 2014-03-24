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
public class InventoryItemVariancePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Basic(optional = false)
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private String physicalInventoryId;

    public InventoryItemVariancePK() {
    }

    public InventoryItemVariancePK(String inventoryItemId, String physicalInventoryId) {
        this.inventoryItemId = inventoryItemId;
        this.physicalInventoryId = physicalInventoryId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        hash += (physicalInventoryId != null ? physicalInventoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemVariancePK)) {
            return false;
        }
        InventoryItemVariancePK other = (InventoryItemVariancePK) object;
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        if ((this.physicalInventoryId == null && other.physicalInventoryId != null) || (this.physicalInventoryId != null && !this.physicalInventoryId.equals(other.physicalInventoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemVariancePK[ inventoryItemId=" + inventoryItemId + ", physicalInventoryId=" + physicalInventoryId + " ]";
    }
    
}
