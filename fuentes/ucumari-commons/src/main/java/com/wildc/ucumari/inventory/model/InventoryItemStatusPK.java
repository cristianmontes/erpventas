/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class InventoryItemStatusPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "STATUS_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDatetime;

    public InventoryItemStatusPK() {
    }

    public InventoryItemStatusPK(String inventoryItemId, String statusId, Date statusDatetime) {
        this.inventoryItemId = inventoryItemId;
        this.statusId = statusId;
        this.statusDatetime = statusDatetime;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Date getStatusDatetime() {
        return statusDatetime;
    }

    public void setStatusDatetime(Date statusDatetime) {
        this.statusDatetime = statusDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (statusDatetime != null ? statusDatetime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemStatusPK)) {
            return false;
        }
        InventoryItemStatusPK other = (InventoryItemStatusPK) object;
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.statusDatetime == null && other.statusDatetime != null) || (this.statusDatetime != null && !this.statusDatetime.equals(other.statusDatetime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemStatusPK[ inventoryItemId=" + inventoryItemId + ", statusId=" + statusId + ", statusDatetime=" + statusDatetime + " ]";
    }
    
}
