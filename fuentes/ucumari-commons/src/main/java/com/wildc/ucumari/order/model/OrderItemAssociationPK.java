/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class OrderItemAssociationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALES_ORDER_ID")
    private String salesOrderId;
    @Basic(optional = false)
    @Column(name = "SO_ITEM_SEQ_ID")
    private String soItemSeqId;
    @Basic(optional = false)
    @Column(name = "PURCHASE_ORDER_ID")
    private String purchaseOrderId;
    @Basic(optional = false)
    @Column(name = "PO_ITEM_SEQ_ID")
    private String poItemSeqId;

    public OrderItemAssociationPK() {
    }

    public OrderItemAssociationPK(String salesOrderId, String soItemSeqId, String purchaseOrderId, String poItemSeqId) {
        this.salesOrderId = salesOrderId;
        this.soItemSeqId = soItemSeqId;
        this.purchaseOrderId = purchaseOrderId;
        this.poItemSeqId = poItemSeqId;
    }

    public String getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(String salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public String getSoItemSeqId() {
        return soItemSeqId;
    }

    public void setSoItemSeqId(String soItemSeqId) {
        this.soItemSeqId = soItemSeqId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPoItemSeqId() {
        return poItemSeqId;
    }

    public void setPoItemSeqId(String poItemSeqId) {
        this.poItemSeqId = poItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOrderId != null ? salesOrderId.hashCode() : 0);
        hash += (soItemSeqId != null ? soItemSeqId.hashCode() : 0);
        hash += (purchaseOrderId != null ? purchaseOrderId.hashCode() : 0);
        hash += (poItemSeqId != null ? poItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemAssociationPK)) {
            return false;
        }
        OrderItemAssociationPK other = (OrderItemAssociationPK) object;
        if ((this.salesOrderId == null && other.salesOrderId != null) || (this.salesOrderId != null && !this.salesOrderId.equals(other.salesOrderId))) {
            return false;
        }
        if ((this.soItemSeqId == null && other.soItemSeqId != null) || (this.soItemSeqId != null && !this.soItemSeqId.equals(other.soItemSeqId))) {
            return false;
        }
        if ((this.purchaseOrderId == null && other.purchaseOrderId != null) || (this.purchaseOrderId != null && !this.purchaseOrderId.equals(other.purchaseOrderId))) {
            return false;
        }
        if ((this.poItemSeqId == null && other.poItemSeqId != null) || (this.poItemSeqId != null && !this.poItemSeqId.equals(other.poItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemAssociationPK[ salesOrderId=" + salesOrderId + ", soItemSeqId=" + soItemSeqId + ", purchaseOrderId=" + purchaseOrderId + ", poItemSeqId=" + poItemSeqId + " ]";
    }
    
}
