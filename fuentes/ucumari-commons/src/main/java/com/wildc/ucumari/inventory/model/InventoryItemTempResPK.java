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
public class InventoryItemTempResPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;

    public InventoryItemTempResPK() {
    }

    public InventoryItemTempResPK(String visitId, String productId, String productStoreId) {
        this.visitId = visitId;
        this.productId = productId;
        this.productStoreId = productStoreId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitId != null ? visitId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTempResPK)) {
            return false;
        }
        InventoryItemTempResPK other = (InventoryItemTempResPK) object;
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTempResPK[ visitId=" + visitId + ", productId=" + productId + ", productStoreId=" + productStoreId + " ]";
    }
    
}
