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
public class InventoryItemTraceDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_TRACE_ID")
    private String inventoryItemTraceId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_TRACE_SEQ_ID")
    private String inventoryItemTraceSeqId;

    public InventoryItemTraceDetailPK() {
    }

    public InventoryItemTraceDetailPK(String inventoryItemTraceId, String inventoryItemTraceSeqId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
        this.inventoryItemTraceSeqId = inventoryItemTraceSeqId;
    }

    public String getInventoryItemTraceId() {
        return inventoryItemTraceId;
    }

    public void setInventoryItemTraceId(String inventoryItemTraceId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
    }

    public String getInventoryItemTraceSeqId() {
        return inventoryItemTraceSeqId;
    }

    public void setInventoryItemTraceSeqId(String inventoryItemTraceSeqId) {
        this.inventoryItemTraceSeqId = inventoryItemTraceSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTraceId != null ? inventoryItemTraceId.hashCode() : 0);
        hash += (inventoryItemTraceSeqId != null ? inventoryItemTraceSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTraceDetailPK)) {
            return false;
        }
        InventoryItemTraceDetailPK other = (InventoryItemTraceDetailPK) object;
        if ((this.inventoryItemTraceId == null && other.inventoryItemTraceId != null) || (this.inventoryItemTraceId != null && !this.inventoryItemTraceId.equals(other.inventoryItemTraceId))) {
            return false;
        }
        if ((this.inventoryItemTraceSeqId == null && other.inventoryItemTraceSeqId != null) || (this.inventoryItemTraceSeqId != null && !this.inventoryItemTraceSeqId.equals(other.inventoryItemTraceSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTraceDetailPK[ inventoryItemTraceId=" + inventoryItemTraceId + ", inventoryItemTraceSeqId=" + inventoryItemTraceSeqId + " ]";
    }
    
}
