/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_item_type")
public class InvoiceItemType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItemType")
    private List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList;
    @OneToMany(mappedBy = "invoiceItemTypeId")
    private List<InvoiceItemTypeMap> invoiceItemTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItemType")
    private List<InvoiceItemTypeAttr> invoiceItemTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_TYPE_ID")
    private String invoiceItemTypeId;
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
    @Column(name = "DEFAULT_SEQUENCE_NUM")
    private BigInteger defaultSequenceNum;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItemType")
    private List<AgreementInvoiceItemType> agreementInvoiceItemTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItemType1")
    private List<AgreementInvoiceItemType> agreementInvoiceItemTypeList1;
    @JoinColumn(name = "DEFAULT_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount defaultGlAccountId;
    @OneToMany(mappedBy = "parentTypeId")
    private List<InvoiceItemType> invoiceItemTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID")
    @ManyToOne
    private InvoiceItemType parentTypeId;
    @OneToMany(mappedBy = "invoiceItemTypeId")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(mappedBy = "invoiceItemTypeId")
    private List<InvoiceItem> invoiceItemList;*/

    public InvoiceItemType() {
    }

    public InvoiceItemType(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }

    public String getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
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

    public BigInteger getDefaultSequenceNum() {
        return defaultSequenceNum;
    }

    public void setDefaultSequenceNum(BigInteger defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }
/*
    public List<AgreementInvoiceItemType> getAgreementInvoiceItemTypeList() {
        return agreementInvoiceItemTypeList;
    }

    public void setAgreementInvoiceItemTypeList(List<AgreementInvoiceItemType> agreementInvoiceItemTypeList) {
        this.agreementInvoiceItemTypeList = agreementInvoiceItemTypeList;
    }

    public List<AgreementInvoiceItemType> getAgreementInvoiceItemTypeList1() {
        return agreementInvoiceItemTypeList1;
    }

    public void setAgreementInvoiceItemTypeList1(List<AgreementInvoiceItemType> agreementInvoiceItemTypeList1) {
        this.agreementInvoiceItemTypeList1 = agreementInvoiceItemTypeList1;
    }

    public GlAccount getDefaultGlAccountId() {
        return defaultGlAccountId;
    }

    public void setDefaultGlAccountId(GlAccount defaultGlAccountId) {
        this.defaultGlAccountId = defaultGlAccountId;
    }

    public List<InvoiceItemType> getInvoiceItemTypeList() {
        return invoiceItemTypeList;
    }

    public void setInvoiceItemTypeList(List<InvoiceItemType> invoiceItemTypeList) {
        this.invoiceItemTypeList = invoiceItemTypeList;
    }

    public InvoiceItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(InvoiceItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemTypeId != null ? invoiceItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemType)) {
            return false;
        }
        InvoiceItemType other = (InvoiceItemType) object;
        if ((this.invoiceItemTypeId == null && other.invoiceItemTypeId != null) || (this.invoiceItemTypeId != null && !this.invoiceItemTypeId.equals(other.invoiceItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemType[ invoiceItemTypeId=" + invoiceItemTypeId + " ]";
    }
/*
    public List<InvoiceItemTypeGlAccount> getInvoiceItemTypeGlAccountList() {
        return invoiceItemTypeGlAccountList;
    }

    public void setInvoiceItemTypeGlAccountList(List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList) {
        this.invoiceItemTypeGlAccountList = invoiceItemTypeGlAccountList;
    }

    public List<InvoiceItemTypeMap> getInvoiceItemTypeMapList() {
        return invoiceItemTypeMapList;
    }

    public void setInvoiceItemTypeMapList(List<InvoiceItemTypeMap> invoiceItemTypeMapList) {
        this.invoiceItemTypeMapList = invoiceItemTypeMapList;
    }

    public List<InvoiceItemTypeAttr> getInvoiceItemTypeAttrList() {
        return invoiceItemTypeAttrList;
    }

    public void setInvoiceItemTypeAttrList(List<InvoiceItemTypeAttr> invoiceItemTypeAttrList) {
        this.invoiceItemTypeAttrList = invoiceItemTypeAttrList;
    }*/
    
}
