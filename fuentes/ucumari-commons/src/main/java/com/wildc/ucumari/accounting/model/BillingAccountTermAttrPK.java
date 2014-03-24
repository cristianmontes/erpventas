/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class BillingAccountTermAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BILLING_ACCOUNT_TERM_ID")
    private String billingAccountTermId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public BillingAccountTermAttrPK() {
    }

    public BillingAccountTermAttrPK(String billingAccountTermId, String attrName) {
        this.billingAccountTermId = billingAccountTermId;
        this.attrName = attrName;
    }

    public String getBillingAccountTermId() {
        return billingAccountTermId;
    }

    public void setBillingAccountTermId(String billingAccountTermId) {
        this.billingAccountTermId = billingAccountTermId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billingAccountTermId != null ? billingAccountTermId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillingAccountTermAttrPK)) {
            return false;
        }
        BillingAccountTermAttrPK other = (BillingAccountTermAttrPK) object;
        if ((this.billingAccountTermId == null && other.billingAccountTermId != null) || (this.billingAccountTermId != null && !this.billingAccountTermId.equals(other.billingAccountTermId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BillingAccountTermAttrPK[ billingAccountTermId=" + billingAccountTermId + ", attrName=" + attrName + " ]";
    }
    
}
