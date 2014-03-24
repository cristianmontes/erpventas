/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementCategoryApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_SEQ_ID")
    private String agreementItemSeqId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;

    public AgreementCategoryApplPK() {
    }

    public AgreementCategoryApplPK(String agreementId, String agreementItemSeqId, String productCategoryId) {
        this.agreementId = agreementId;
        this.agreementItemSeqId = agreementItemSeqId;
        this.productCategoryId = productCategoryId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        hash += (agreementItemSeqId != null ? agreementItemSeqId.hashCode() : 0);
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementCategoryApplPK)) {
            return false;
        }
        AgreementCategoryApplPK other = (AgreementCategoryApplPK) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        if ((this.agreementItemSeqId == null && other.agreementItemSeqId != null) || (this.agreementItemSeqId != null && !this.agreementItemSeqId.equals(other.agreementItemSeqId))) {
            return false;
        }
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementCategoryApplPK[ agreementId=" + agreementId + ", agreementItemSeqId=" + agreementItemSeqId + ", productCategoryId=" + productCategoryId + " ]";
    }
    
}
