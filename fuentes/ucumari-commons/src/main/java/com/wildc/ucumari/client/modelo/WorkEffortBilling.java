/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_billing")
@NamedQueries({
    @NamedQuery(name = "WorkEffortBilling.findAll", query = "SELECT w FROM WorkEffortBilling w")})
public class WorkEffortBilling implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortBillingPK workEffortBillingPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCENTAGE")
    private BigDecimal percentage;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InvoiceItem invoiceItem;

    public WorkEffortBilling() {
    }

    public WorkEffortBilling(WorkEffortBillingPK workEffortBillingPK) {
        this.workEffortBillingPK = workEffortBillingPK;
    }

    public WorkEffortBilling(String workEffortId, String invoiceId, String invoiceItemSeqId) {
        this.workEffortBillingPK = new WorkEffortBillingPK(workEffortId, invoiceId, invoiceItemSeqId);
    }

    public WorkEffortBillingPK getWorkEffortBillingPK() {
        return workEffortBillingPK;
    }

    public void setWorkEffortBillingPK(WorkEffortBillingPK workEffortBillingPK) {
        this.workEffortBillingPK = workEffortBillingPK;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
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
        hash += (workEffortBillingPK != null ? workEffortBillingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortBilling)) {
            return false;
        }
        WorkEffortBilling other = (WorkEffortBilling) object;
        if ((this.workEffortBillingPK == null && other.workEffortBillingPK != null) || (this.workEffortBillingPK != null && !this.workEffortBillingPK.equals(other.workEffortBillingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortBilling[ workEffortBillingPK=" + workEffortBillingPK + " ]";
    }
    
}
