/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.invoice.model.InvoiceItem;
import com.wildc.ucumari.shipment.model.ShipmentReceipt;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_item_billing")
@NamedQueries({
    @NamedQuery(name = "ReturnItemBilling.findAll", query = "SELECT r FROM ReturnItemBilling r")})
public class ReturnItemBilling implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReturnItemBillingPK returnItemBillingPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
        @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false),
        @JoinColumn(name = "RETURN_ITEM_SEQ_ID", referencedColumnName = "RETURN_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ReturnItem returnItem;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReturnHeader returnHeader;
    @JoinColumn(name = "SHIPMENT_RECEIPT_ID", referencedColumnName = "RECEIPT_ID")
    @ManyToOne
    private ShipmentReceipt shipmentReceiptId;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InvoiceItem invoiceItem;

    public ReturnItemBilling() {
    }

    public ReturnItemBilling(ReturnItemBillingPK returnItemBillingPK) {
        this.returnItemBillingPK = returnItemBillingPK;
    }

    public ReturnItemBilling(String returnId, String returnItemSeqId, String invoiceId, String invoiceItemSeqId) {
        this.returnItemBillingPK = new ReturnItemBillingPK(returnId, returnItemSeqId, invoiceId, invoiceItemSeqId);
    }

    public ReturnItemBillingPK getReturnItemBillingPK() {
        return returnItemBillingPK;
    }

    public void setReturnItemBillingPK(ReturnItemBillingPK returnItemBillingPK) {
        this.returnItemBillingPK = returnItemBillingPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public ReturnItem getReturnItem() {
        return returnItem;
    }

    public void setReturnItem(ReturnItem returnItem) {
        this.returnItem = returnItem;
    }

    public ReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    public ShipmentReceipt getShipmentReceiptId() {
        return shipmentReceiptId;
    }

    public void setShipmentReceiptId(ShipmentReceipt shipmentReceiptId) {
        this.shipmentReceiptId = shipmentReceiptId;
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
        hash += (returnItemBillingPK != null ? returnItemBillingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemBilling)) {
            return false;
        }
        ReturnItemBilling other = (ReturnItemBilling) object;
        if ((this.returnItemBillingPK == null && other.returnItemBillingPK != null) || (this.returnItemBillingPK != null && !this.returnItemBillingPK.equals(other.returnItemBillingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemBilling[ returnItemBillingPK=" + returnItemBillingPK + " ]";
    }
    
}
