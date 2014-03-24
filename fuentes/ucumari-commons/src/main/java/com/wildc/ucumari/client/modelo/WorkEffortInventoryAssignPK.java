/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WorkEffortInventoryAssignPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;

    public WorkEffortInventoryAssignPK() {
    }

    public WorkEffortInventoryAssignPK(String workEffortId, String inventoryItemId) {
        this.workEffortId = workEffortId;
        this.inventoryItemId = inventoryItemId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortInventoryAssignPK)) {
            return false;
        }
        WorkEffortInventoryAssignPK other = (WorkEffortInventoryAssignPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortInventoryAssignPK[ workEffortId=" + workEffortId + ", inventoryItemId=" + inventoryItemId + " ]";
    }
    
}
