/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.invoice.model.InvoiceItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_item_billing")
public class ShipmentItemBilling implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentItemBillingPK shipmentItemBillingPK;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentItem shipmentItem;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InvoiceItem invoiceItem;

    public ShipmentItemBilling() {
    }

    public ShipmentItemBilling(ShipmentItemBillingPK shipmentItemBillingPK) {
        this.shipmentItemBillingPK = shipmentItemBillingPK;
    }

    public ShipmentItemBilling(String shipmentId, String shipmentItemSeqId, String invoiceId, String invoiceItemSeqId) {
        this.shipmentItemBillingPK = new ShipmentItemBillingPK(shipmentId, shipmentItemSeqId, invoiceId, invoiceItemSeqId);
    }

    public ShipmentItemBillingPK getShipmentItemBillingPK() {
        return shipmentItemBillingPK;
    }

    public void setShipmentItemBillingPK(ShipmentItemBillingPK shipmentItemBillingPK) {
        this.shipmentItemBillingPK = shipmentItemBillingPK;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentItemBillingPK != null ? shipmentItemBillingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItemBilling)) {
            return false;
        }
        ShipmentItemBilling other = (ShipmentItemBilling) object;
        if ((this.shipmentItemBillingPK == null && other.shipmentItemBillingPK != null) || (this.shipmentItemBillingPK != null && !this.shipmentItemBillingPK.equals(other.shipmentItemBillingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentItemBilling[ shipmentItemBillingPK=" + shipmentItemBillingPK + " ]";
    }
    
}
