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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_type")
public class InvoiceType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceType")
    private List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceType")
    private List<InvoiceGlAccountType> invoiceGlAccountTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceType")
    private List<InvoiceItemTypeMap> invoiceItemTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceType")
    private List<InvoiceTypeAttr> invoiceTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_TYPE_ID")
    private String invoiceTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "invoiceTypeId")
    private List<Invoice> invoiceList;
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<InvoiceType> invoiceTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "INVOICE_TYPE_ID")
    @ManyToOne
    private InvoiceType parentTypeId;

    public InvoiceType() {
    }

    public InvoiceType(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
/*
    public List<InvoiceType> getInvoiceTypeList() {
        return invoiceTypeList;
    }

    public void setInvoiceTypeList(List<InvoiceType> invoiceTypeList) {
        this.invoiceTypeList = invoiceTypeList;
    }*/

    public InvoiceType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(InvoiceType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceTypeId != null ? invoiceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceType)) {
            return false;
        }
        InvoiceType other = (InvoiceType) object;
        if ((this.invoiceTypeId == null && other.invoiceTypeId != null) || (this.invoiceTypeId != null && !this.invoiceTypeId.equals(other.invoiceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceType[ invoiceTypeId=" + invoiceTypeId + " ]";
    }
/*
    public List<InvoiceAdjustmentGlAccount> getInvoiceAdjustmentGlAccountList() {
        return invoiceAdjustmentGlAccountList;
    }

    public void setInvoiceAdjustmentGlAccountList(List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList) {
        this.invoiceAdjustmentGlAccountList = invoiceAdjustmentGlAccountList;
    }

    public List<InvoiceGlAccountType> getInvoiceGlAccountTypeList() {
        return invoiceGlAccountTypeList;
    }

    public void setInvoiceGlAccountTypeList(List<InvoiceGlAccountType> invoiceGlAccountTypeList) {
        this.invoiceGlAccountTypeList = invoiceGlAccountTypeList;
    }

    public List<InvoiceItemTypeMap> getInvoiceItemTypeMapList() {
        return invoiceItemTypeMapList;
    }

    public void setInvoiceItemTypeMapList(List<InvoiceItemTypeMap> invoiceItemTypeMapList) {
        this.invoiceItemTypeMapList = invoiceItemTypeMapList;
    }

    public List<InvoiceTypeAttr> getInvoiceTypeAttrList() {
        return invoiceTypeAttrList;
    }

    public void setInvoiceTypeAttrList(List<InvoiceTypeAttr> invoiceTypeAttrList) {
        this.invoiceTypeAttrList = invoiceTypeAttrList;
    }*/
    
}
