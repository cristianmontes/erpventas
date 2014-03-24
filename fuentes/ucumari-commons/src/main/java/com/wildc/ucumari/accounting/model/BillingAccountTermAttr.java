/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
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
@Table(name = "billing_account_term_attr")
@NamedQueries({
    @NamedQuery(name = "BillingAccountTermAttr.findAll", query = "SELECT b FROM BillingAccountTermAttr b")})
public class BillingAccountTermAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BillingAccountTermAttrPK billingAccountTermAttrPK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "BILLING_ACCOUNT_TERM_ID", referencedColumnName = "BILLING_ACCOUNT_TERM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BillingAccountTerm billingAccountTerm;

    public BillingAccountTermAttr() {
    }

    public BillingAccountTermAttr(BillingAccountTermAttrPK billingAccountTermAttrPK) {
        this.billingAccountTermAttrPK = billingAccountTermAttrPK;
    }

    public BillingAccountTermAttr(String billingAccountTermId, String attrName) {
        this.billingAccountTermAttrPK = new BillingAccountTermAttrPK(billingAccountTermId, attrName);
    }

    public BillingAccountTermAttrPK getBillingAccountTermAttrPK() {
        return billingAccountTermAttrPK;
    }

    public void setBillingAccountTermAttrPK(BillingAccountTermAttrPK billingAccountTermAttrPK) {
        this.billingAccountTermAttrPK = billingAccountTermAttrPK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public BillingAccountTerm getBillingAccountTerm() {
        return billingAccountTerm;
    }

    public void setBillingAccountTerm(BillingAccountTerm billingAccountTerm) {
        this.billingAccountTerm = billingAccountTerm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billingAccountTermAttrPK != null ? billingAccountTermAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillingAccountTermAttr)) {
            return false;
        }
        BillingAccountTermAttr other = (BillingAccountTermAttr) object;
        if ((this.billingAccountTermAttrPK == null && other.billingAccountTermAttrPK != null) || (this.billingAccountTermAttrPK != null && !this.billingAccountTermAttrPK.equals(other.billingAccountTermAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BillingAccountTermAttr[ billingAccountTermAttrPK=" + billingAccountTermAttrPK + " ]";
    }
    
}
