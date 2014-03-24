/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.invoice.model.InvoiceItemType;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement_invoice_item_type")
@NamedQueries({
    @NamedQuery(name = "AgreementInvoiceItemType.findAll", query = "SELECT a FROM AgreementInvoiceItemType a")})
public class AgreementInvoiceItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementInvoiceItemTypePK agreementInvoiceItemTypePK;
    @Column(name = "DESCRIPTION_LABEL")
    private String descriptionLabel;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID_TO", referencedColumnName = "INVOICE_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceItemType invoiceItemType;
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID_FROM", referencedColumnName = "INVOICE_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceItemType invoiceItemType1;
    @JoinColumn(name = "AGREEMENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementType agreementType;

    public AgreementInvoiceItemType() {
    }

    public AgreementInvoiceItemType(AgreementInvoiceItemTypePK agreementInvoiceItemTypePK) {
        this.agreementInvoiceItemTypePK = agreementInvoiceItemTypePK;
    }

    public AgreementInvoiceItemType(String agreementTypeId, String invoiceItemTypeIdFrom, String invoiceItemTypeIdTo) {
        this.agreementInvoiceItemTypePK = new AgreementInvoiceItemTypePK(agreementTypeId, invoiceItemTypeIdFrom, invoiceItemTypeIdTo);
    }

    public AgreementInvoiceItemTypePK getAgreementInvoiceItemTypePK() {
        return agreementInvoiceItemTypePK;
    }

    public void setAgreementInvoiceItemTypePK(AgreementInvoiceItemTypePK agreementInvoiceItemTypePK) {
        this.agreementInvoiceItemTypePK = agreementInvoiceItemTypePK;
    }

    public String getDescriptionLabel() {
        return descriptionLabel;
    }

    public void setDescriptionLabel(String descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public InvoiceItemType getInvoiceItemType() {
        return invoiceItemType;
    }

    public void setInvoiceItemType(InvoiceItemType invoiceItemType) {
        this.invoiceItemType = invoiceItemType;
    }

    public InvoiceItemType getInvoiceItemType1() {
        return invoiceItemType1;
    }

    public void setInvoiceItemType1(InvoiceItemType invoiceItemType1) {
        this.invoiceItemType1 = invoiceItemType1;
    }

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementInvoiceItemTypePK != null ? agreementInvoiceItemTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementInvoiceItemType)) {
            return false;
        }
        AgreementInvoiceItemType other = (AgreementInvoiceItemType) object;
        if ((this.agreementInvoiceItemTypePK == null && other.agreementInvoiceItemTypePK != null) || (this.agreementInvoiceItemTypePK != null && !this.agreementInvoiceItemTypePK.equals(other.agreementInvoiceItemTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementInvoiceItemType[ agreementInvoiceItemTypePK=" + agreementInvoiceItemTypePK + " ]";
    }
    
}
