/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.product.model.ProductCategory;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "agreement_category_appl")
@NamedQueries({
    @NamedQuery(name = "AgreementCategoryAppl.findAll", query = "SELECT a FROM AgreementCategoryAppl a")})
public class AgreementCategoryAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementCategoryApplPK agreementCategoryApplPK;
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
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AgreementItem agreementItem;

    public AgreementCategoryAppl() {
    }

    public AgreementCategoryAppl(AgreementCategoryApplPK agreementCategoryApplPK) {
        this.agreementCategoryApplPK = agreementCategoryApplPK;
    }

    public AgreementCategoryAppl(String agreementId, String agreementItemSeqId, String productCategoryId) {
        this.agreementCategoryApplPK = new AgreementCategoryApplPK(agreementId, agreementItemSeqId, productCategoryId);
    }

    public AgreementCategoryApplPK getAgreementCategoryApplPK() {
        return agreementCategoryApplPK;
    }

    public void setAgreementCategoryApplPK(AgreementCategoryApplPK agreementCategoryApplPK) {
        this.agreementCategoryApplPK = agreementCategoryApplPK;
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementCategoryApplPK != null ? agreementCategoryApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementCategoryAppl)) {
            return false;
        }
        AgreementCategoryAppl other = (AgreementCategoryAppl) object;
        if ((this.agreementCategoryApplPK == null && other.agreementCategoryApplPK != null) || (this.agreementCategoryApplPK != null && !this.agreementCategoryApplPK.equals(other.agreementCategoryApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementCategoryAppl[ agreementCategoryApplPK=" + agreementCategoryApplPK + " ]";
    }
    
}
