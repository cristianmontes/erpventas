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
public class InventoryEventPlannedPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 9130694707685663802L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "EVENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;
    @Basic(optional = false)
    @Column(name = "INVENTORY_EVENT_PLAN_TYPE_ID")
    private String inventoryEventPlanTypeId;

    public InventoryEventPlannedPK() {
    }

    public InventoryEventPlannedPK(String productId, Date eventDate, String inventoryEventPlanTypeId) {
        this.productId = productId;
        this.eventDate = eventDate;
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getInventoryEventPlanTypeId() {
        return inventoryEventPlanTypeId;
    }

    public void setInventoryEventPlanTypeId(String inventoryEventPlanTypeId) {
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (eventDate != null ? eventDate.hashCode() : 0);
        hash += (inventoryEventPlanTypeId != null ? inventoryEventPlanTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryEventPlannedPK)) {
            return false;
        }
        InventoryEventPlannedPK other = (InventoryEventPlannedPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.eventDate == null && other.eventDate != null) || (this.eventDate != null && !this.eventDate.equals(other.eventDate))) {
            return false;
        }
        if ((this.inventoryEventPlanTypeId == null && other.inventoryEventPlanTypeId != null) || (this.inventoryEventPlanTypeId != null && !this.inventoryEventPlanTypeId.equals(other.inventoryEventPlanTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryEventPlannedPK[ productId=" + productId + ", eventDate=" + eventDate + ", inventoryEventPlanTypeId=" + inventoryEventPlanTypeId + " ]";
    }
    
}
