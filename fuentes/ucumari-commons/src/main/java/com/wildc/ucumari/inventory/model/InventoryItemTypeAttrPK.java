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
public class InventoryItemTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_TYPE_ID")
    private String inventoryItemTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public InventoryItemTypeAttrPK() {
    }

    public InventoryItemTypeAttrPK(String inventoryItemTypeId, String attrName) {
        this.inventoryItemTypeId = inventoryItemTypeId;
        this.attrName = attrName;
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTypeId != null ? inventoryItemTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTypeAttrPK)) {
            return false;
        }
        InventoryItemTypeAttrPK other = (InventoryItemTypeAttrPK) object;
        if ((this.inventoryItemTypeId == null && other.inventoryItemTypeId != null) || (this.inventoryItemTypeId != null && !this.inventoryItemTypeId.equals(other.inventoryItemTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTypeAttrPK[ inventoryItemTypeId=" + inventoryItemTypeId + ", attrName=" + attrName + " ]";
    }
    
}
