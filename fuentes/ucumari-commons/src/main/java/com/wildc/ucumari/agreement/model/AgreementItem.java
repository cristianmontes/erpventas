/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement_item")
public class AgreementItem implements Serializable {
    @Lob
    @Column(name = "AGREEMENT_IMAGE")
    private byte[] agreementImage;
    /*@OneToMany(mappedBy = "agreementItem")
    private List<SupplierProduct> supplierProductList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementItemPK agreementItemPK;
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Lob
    @Column(name = "AGREEMENT_TEXT")
    private String agreementText;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementGeographicalApplic> agreementGeographicalApplicList;*/
    @JoinColumn(name = "AGREEMENT_ITEM_TYPE_ID", referencedColumnName = "AGREEMENT_ITEM_TYPE_ID")
    @ManyToOne
    private AgreementItemType agreementItemTypeId;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agreement agreement;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementProductAppl> agreementProductApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementItemAttribute> agreementItemAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementCategoryAppl> agreementCategoryApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementEmploymentAppl> agreementEmploymentApplList;
    @OneToMany(mappedBy = "agreementItem")
    private List<Addendum> addendumList;
    @OneToMany(mappedBy = "agreementItem")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementWorkEffortAppl> agreementWorkEffortApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItem")
    private List<AgreementPromoAppl> agreementPromoApplList;*/

    public AgreementItem() {
    }

    public AgreementItem(AgreementItemPK agreementItemPK) {
        this.agreementItemPK = agreementItemPK;
    }

    public AgreementItem(String agreementId, String agreementItemSeqId) {
        this.agreementItemPK = new AgreementItemPK(agreementId, agreementItemSeqId);
    }

    public AgreementItemPK getAgreementItemPK() {
        return agreementItemPK;
    }

    public void setAgreementItemPK(AgreementItemPK agreementItemPK) {
        this.agreementItemPK = agreementItemPK;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getAgreementText() {
        return agreementText;
    }

    public void setAgreementText(String agreementText) {
        this.agreementText = agreementText;
    }

    public byte[] getAgreementImage() {
        return agreementImage;
    }

    public void setAgreementImage(byte[] agreementImage) {
        this.agreementImage = agreementImage;
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
    public List<AgreementGeographicalApplic> getAgreementGeographicalApplicList() {
        return agreementGeographicalApplicList;
    }

    public void setAgreementGeographicalApplicList(List<AgreementGeographicalApplic> agreementGeographicalApplicList) {
        this.agreementGeographicalApplicList = agreementGeographicalApplicList;
    }*/

    public AgreementItemType getAgreementItemTypeId() {
        return agreementItemTypeId;
    }

    public void setAgreementItemTypeId(AgreementItemType agreementItemTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
/*
    public List<AgreementProductAppl> getAgreementProductApplList() {
        return agreementProductApplList;
    }

    public void setAgreementProductApplList(List<AgreementProductAppl> agreementProductApplList) {
        this.agreementProductApplList = agreementProductApplList;
    }

    public List<AgreementItemAttribute> getAgreementItemAttributeList() {
        return agreementItemAttributeList;
    }

    public void setAgreementItemAttributeList(List<AgreementItemAttribute> agreementItemAttributeList) {
        this.agreementItemAttributeList = agreementItemAttributeList;
    }

    public List<AgreementCategoryAppl> getAgreementCategoryApplList() {
        return agreementCategoryApplList;
    }

    public void setAgreementCategoryApplList(List<AgreementCategoryAppl> agreementCategoryApplList) {
        this.agreementCategoryApplList = agreementCategoryApplList;
    }

    public List<AgreementEmploymentAppl> getAgreementEmploymentApplList() {
        return agreementEmploymentApplList;
    }

    public void setAgreementEmploymentApplList(List<AgreementEmploymentAppl> agreementEmploymentApplList) {
        this.agreementEmploymentApplList = agreementEmploymentApplList;
    }

    public List<Addendum> getAddendumList() {
        return addendumList;
    }

    public void setAddendumList(List<Addendum> addendumList) {
        this.addendumList = addendumList;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }

    public List<AgreementWorkEffortAppl> getAgreementWorkEffortApplList() {
        return agreementWorkEffortApplList;
    }

    public void setAgreementWorkEffortApplList(List<AgreementWorkEffortAppl> agreementWorkEffortApplList) {
        this.agreementWorkEffortApplList = agreementWorkEffortApplList;
    }

    public List<AgreementPromoAppl> getAgreementPromoApplList() {
        return agreementPromoApplList;
    }

    public void setAgreementPromoApplList(List<AgreementPromoAppl> agreementPromoApplList) {
        this.agreementPromoApplList = agreementPromoApplList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementItemPK != null ? agreementItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementItem)) {
            return false;
        }
        AgreementItem other = (AgreementItem) object;
        if ((this.agreementItemPK == null && other.agreementItemPK != null) || (this.agreementItemPK != null && !this.agreementItemPK.equals(other.agreementItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementItem[ agreementItemPK=" + agreementItemPK + " ]";
    }    
/*
    public List<SupplierProduct> getSupplierProductList() {
        return supplierProductList;
    }

    public void setSupplierProductList(List<SupplierProduct> supplierProductList) {
        this.supplierProductList = supplierProductList;
    }*/
    
}
