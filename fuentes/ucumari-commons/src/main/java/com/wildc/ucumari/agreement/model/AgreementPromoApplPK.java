/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementPromoApplPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_SEQ_ID")
    private String agreementItemSeqId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ID")
    private String productPromoId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public AgreementPromoApplPK() {
    }

    public AgreementPromoApplPK(String agreementId, String agreementItemSeqId, String productPromoId, Date fromDate) {
        this.agreementId = agreementId;
        this.agreementItemSeqId = agreementItemSeqId;
        this.productPromoId = productPromoId;
        this.fromDate = fromDate;
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

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        hash += (agreementItemSeqId != null ? agreementItemSeqId.hashCode() : 0);
        hash += (productPromoId != null ? productPromoId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementPromoApplPK)) {
            return false;
        }
        AgreementPromoApplPK other = (AgreementPromoApplPK) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        if ((this.agreementItemSeqId == null && other.agreementItemSeqId != null) || (this.agreementItemSeqId != null && !this.agreementItemSeqId.equals(other.agreementItemSeqId))) {
            return false;
        }
        if ((this.productPromoId == null && other.productPromoId != null) || (this.productPromoId != null && !this.productPromoId.equals(other.productPromoId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementPromoApplPK[ agreementId=" + agreementId + ", agreementItemSeqId=" + agreementItemSeqId + ", productPromoId=" + productPromoId + ", fromDate=" + fromDate + " ]";
    }
    
}
