/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "term_type")
public class TermType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "termType")
    private List<TermTypeAttr> termTypeAttrList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "termType")
    private TermTypeFields termTypeFields;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "termType")
    private List<TermTypeToUomTypeMap> termTypeToUomTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "termType")
    private List<QuoteTerm> quoteTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "termType")
    private List<TermTypeToEnumTypeMap> termTypeToEnumTypeMapList;
    @OneToMany(mappedBy = "termTypeId")
    private List<InvoiceTerm> invoiceTermList;
    @OneToMany(mappedBy = "termTypeId")
    private List<BillingAccountTerm> billingAccountTermList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "termType")
    private List<AgreementItemToTermMap> agreementItemToTermMapList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<TermType> termTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "TERM_TYPE_ID")
    @ManyToOne
    private TermType parentTypeId;
    /*@OneToMany(mappedBy = "termTypeId")
    private List<AgreementTerm> agreementTermList;*/

    public TermType() {
    }

    public TermType(String termTypeId) {
        this.termTypeId = termTypeId;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
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
/*
    public List<AgreementItemToTermMap> getAgreementItemToTermMapList() {
        return agreementItemToTermMapList;
    }

    public void setAgreementItemToTermMapList(List<AgreementItemToTermMap> agreementItemToTermMapList) {
        this.agreementItemToTermMapList = agreementItemToTermMapList;
    }

    public List<TermType> getTermTypeList() {
        return termTypeList;
    }

    public void setTermTypeList(List<TermType> termTypeList) {
        this.termTypeList = termTypeList;
    }*/

    public TermType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(TermType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermType)) {
            return false;
        }
        TermType other = (TermType) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermType[ termTypeId=" + termTypeId + " ]";
    }
/*
    public List<BillingAccountTerm> getBillingAccountTermList() {
        return billingAccountTermList;
    }

    public void setBillingAccountTermList(List<BillingAccountTerm> billingAccountTermList) {
        this.billingAccountTermList = billingAccountTermList;
    }

    public List<InvoiceTerm> getInvoiceTermList() {
        return invoiceTermList;
    }

    public void setInvoiceTermList(List<InvoiceTerm> invoiceTermList) {
        this.invoiceTermList = invoiceTermList;
    }

    public List<TermTypeAttr> getTermTypeAttrList() {
        return termTypeAttrList;
    }

    public void setTermTypeAttrList(List<TermTypeAttr> termTypeAttrList) {
        this.termTypeAttrList = termTypeAttrList;
    }

    public TermTypeFields getTermTypeFields() {
        return termTypeFields;
    }

    public void setTermTypeFields(TermTypeFields termTypeFields) {
        this.termTypeFields = termTypeFields;
    }

    public List<TermTypeToUomTypeMap> getTermTypeToUomTypeMapList() {
        return termTypeToUomTypeMapList;
    }

    public void setTermTypeToUomTypeMapList(List<TermTypeToUomTypeMap> termTypeToUomTypeMapList) {
        this.termTypeToUomTypeMapList = termTypeToUomTypeMapList;
    }

    public List<QuoteTerm> getQuoteTermList() {
        return quoteTermList;
    }

    public void setQuoteTermList(List<QuoteTerm> quoteTermList) {
        this.quoteTermList = quoteTermList;
    }

    public List<TermTypeToEnumTypeMap> getTermTypeToEnumTypeMapList() {
        return termTypeToEnumTypeMapList;
    }

    public void setTermTypeToEnumTypeMapList(List<TermTypeToEnumTypeMap> termTypeToEnumTypeMapList) {
        this.termTypeToEnumTypeMapList = termTypeToEnumTypeMapList;
    }
    */
}
