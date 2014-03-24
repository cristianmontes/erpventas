/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ShipmentItemBillingPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;

    public ShipmentItemBillingPK() {
    }

    public ShipmentItemBillingPK(String shipmentId, String shipmentItemSeqId, String invoiceId, String invoiceItemSeqId) {
        this.shipmentId = shipmentId;
        this.shipmentItemSeqId = shipmentItemSeqId;
        this.invoiceId = invoiceId;
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceItemSeqId() {
        return invoiceItemSeqId;
    }

    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentItemSeqId != null ? shipmentItemSeqId.hashCode() : 0);
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (invoiceItemSeqId != null ? invoiceItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItemBillingPK)) {
            return false;
        }
        ShipmentItemBillingPK other = (ShipmentItemBillingPK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentItemSeqId == null && other.shipmentItemSeqId != null) || (this.shipmentItemSeqId != null && !this.shipmentItemSeqId.equals(other.shipmentItemSeqId))) {
            return false;
        }
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        if ((this.invoiceItemSeqId == null && other.invoiceItemSeqId != null) || (this.invoiceItemSeqId != null && !this.invoiceItemSeqId.equals(other.invoiceItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentItemBillingPK[ shipmentId=" + shipmentId + ", shipmentItemSeqId=" + shipmentItemSeqId + ", invoiceId=" + invoiceId + ", invoiceItemSeqId=" + invoiceItemSeqId + " ]";
    }
    
}
