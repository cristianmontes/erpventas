/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_adjustment_type")
@NamedQueries({
    @NamedQuery(name = "InvoiceAdjustmentType.findAll", query = "SELECT i FROM InvoiceAdjustmentType i")})
public class InvoiceAdjustmentType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceAdjustmentType")
    private List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ADJUSTMENT_TYPE_ID")
    private String invoiceAdjustmentTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "invoiceAdjustmentTypeId")
    private List<InvoiceAdjustment> invoiceAdjustmentList;

    public InvoiceAdjustmentType() {
    }

    public InvoiceAdjustmentType(String invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
    }

    public String getInvoiceAdjustmentTypeId() {
        return invoiceAdjustmentTypeId;
    }

    public void setInvoiceAdjustmentTypeId(String invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<InvoiceAdjustment> getInvoiceAdjustmentList() {
        return invoiceAdjustmentList;
    }

    public void setInvoiceAdjustmentList(List<InvoiceAdjustment> invoiceAdjustmentList) {
        this.invoiceAdjustmentList = invoiceAdjustmentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceAdjustmentTypeId != null ? invoiceAdjustmentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceAdjustmentType)) {
            return false;
        }
        InvoiceAdjustmentType other = (InvoiceAdjustmentType) object;
        if ((this.invoiceAdjustmentTypeId == null && other.invoiceAdjustmentTypeId != null) || (this.invoiceAdjustmentTypeId != null && !this.invoiceAdjustmentTypeId.equals(other.invoiceAdjustmentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceAdjustmentType[ invoiceAdjustmentTypeId=" + invoiceAdjustmentTypeId + " ]";
    }
/*
    public List<InvoiceAdjustmentGlAccount> getInvoiceAdjustmentGlAccountList() {
        return invoiceAdjustmentGlAccountList;
    }

    public void setInvoiceAdjustmentGlAccountList(List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList) {
        this.invoiceAdjustmentGlAccountList = invoiceAdjustmentGlAccountList;
    }*/
    
}
