/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "product_feature_appl")
public class ProductFeatureAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureApplPK productFeatureApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "RECURRING_AMOUNT")
    private BigDecimal recurringAmount;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeatureAppl")
    private List<ProductFeatureApplAttr> productFeatureApplAttrList;*/
    @JoinColumn(name = "PRODUCT_FEATURE_APPL_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_APPL_TYPE_ID")
    @ManyToOne
    private ProductFeatureApplType productFeatureApplTypeId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;

    public ProductFeatureAppl() {
    }

    public ProductFeatureAppl(ProductFeatureApplPK productFeatureApplPK) {
        this.productFeatureApplPK = productFeatureApplPK;
    }

    public ProductFeatureAppl(String productId, String productFeatureId, Date fromDate) {
        this.productFeatureApplPK = new ProductFeatureApplPK(productId, productFeatureId, fromDate);
    }

    public ProductFeatureApplPK getProductFeatureApplPK() {
        return productFeatureApplPK;
    }

    public void setProductFeatureApplPK(ProductFeatureApplPK productFeatureApplPK) {
        this.productFeatureApplPK = productFeatureApplPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRecurringAmount() {
        return recurringAmount;
    }

    public void setRecurringAmount(BigDecimal recurringAmount) {
        this.recurringAmount = recurringAmount;
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
    public List<ProductFeatureApplAttr> getProductFeatureApplAttrList() {
        return productFeatureApplAttrList;
    }

    public void setProductFeatureApplAttrList(List<ProductFeatureApplAttr> productFeatureApplAttrList) {
        this.productFeatureApplAttrList = productFeatureApplAttrList;
    }*/

    public ProductFeatureApplType getProductFeatureApplTypeId() {
        return productFeatureApplTypeId;
    }

    public void setProductFeatureApplTypeId(ProductFeatureApplType productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureApplPK != null ? productFeatureApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureAppl)) {
            return false;
        }
        ProductFeatureAppl other = (ProductFeatureAppl) object;
        if ((this.productFeatureApplPK == null && other.productFeatureApplPK != null) || (this.productFeatureApplPK != null && !this.productFeatureApplPK.equals(other.productFeatureApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureAppl[ productFeatureApplPK=" + productFeatureApplPK + " ]";
    }
    
}
