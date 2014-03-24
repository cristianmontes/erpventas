/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.TermType;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "billing_account_term")
@NamedQueries({
    @NamedQuery(name = "BillingAccountTerm.findAll", query = "SELECT b FROM BillingAccountTerm b")})
public class BillingAccountTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BILLING_ACCOUNT_TERM_ID")
    private String billingAccountTermId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TERM_VALUE")
    private BigDecimal termValue;
    @Column(name = "TERM_DAYS")
    private BigInteger termDays;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billingAccountTerm")
    private List<BillingAccountTermAttr> billingAccountTermAttrList;
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID")
    @ManyToOne
    private TermType termTypeId;
    @JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;

    public BillingAccountTerm() {
    }

    public BillingAccountTerm(String billingAccountTermId) {
        this.billingAccountTermId = billingAccountTermId;
    }

    public String getBillingAccountTermId() {
        return billingAccountTermId;
    }

    public void setBillingAccountTermId(String billingAccountTermId) {
        this.billingAccountTermId = billingAccountTermId;
    }

    public BigDecimal getTermValue() {
        return termValue;
    }

    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }

    public BigInteger getTermDays() {
        return termDays;
    }

    public void setTermDays(BigInteger termDays) {
        this.termDays = termDays;
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

    public List<BillingAccountTermAttr> getBillingAccountTermAttrList() {
        return billingAccountTermAttrList;
    }

    public void setBillingAccountTermAttrList(List<BillingAccountTermAttr> billingAccountTermAttrList) {
        this.billingAccountTermAttrList = billingAccountTermAttrList;
    }

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public TermType getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(TermType termTypeId) {
        this.termTypeId = termTypeId;
    }

    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billingAccountTermId != null ? billingAccountTermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillingAccountTerm)) {
            return false;
        }
        BillingAccountTerm other = (BillingAccountTerm) object;
        if ((this.billingAccountTermId == null && other.billingAccountTermId != null) || (this.billingAccountTermId != null && !this.billingAccountTermId.equals(other.billingAccountTermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BillingAccountTerm[ billingAccountTermId=" + billingAccountTermId + " ]";
    }
    
}
