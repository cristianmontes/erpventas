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
public class InventoryItemDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_DETAIL_SEQ_ID")
    private String inventoryItemDetailSeqId;

    public InventoryItemDetailPK() {
    }

    public InventoryItemDetailPK(String inventoryItemId, String inventoryItemDetailSeqId) {
        this.inventoryItemId = inventoryItemId;
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getInventoryItemDetailSeqId() {
        return inventoryItemDetailSeqId;
    }

    public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        hash += (inventoryItemDetailSeqId != null ? inventoryItemDetailSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemDetailPK)) {
            return false;
        }
        InventoryItemDetailPK other = (InventoryItemDetailPK) object;
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        if ((this.inventoryItemDetailSeqId == null && other.inventoryItemDetailSeqId != null) || (this.inventoryItemDetailSeqId != null && !this.inventoryItemDetailSeqId.equals(other.inventoryItemDetailSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemDetailPK[ inventoryItemId=" + inventoryItemId + ", inventoryItemDetailSeqId=" + inventoryItemDetailSeqId + " ]";
    }
    
}
