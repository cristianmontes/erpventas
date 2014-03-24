/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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
@Table(name = "product_feature_group_appl")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureGroupAppl.findAll", query = "SELECT p FROM ProductFeatureGroupAppl p")})
public class ProductFeatureGroupAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureGroupApplPK productFeatureGroupApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "PRODUCT_FEATURE_GROUP_ID", referencedColumnName = "PRODUCT_FEATURE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeatureGroup productFeatureGroup;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;

    public ProductFeatureGroupAppl() {
    }

    public ProductFeatureGroupAppl(ProductFeatureGroupApplPK productFeatureGroupApplPK) {
        this.productFeatureGroupApplPK = productFeatureGroupApplPK;
    }

    public ProductFeatureGroupAppl(String productFeatureGroupId, String productFeatureId, Date fromDate) {
        this.productFeatureGroupApplPK = new ProductFeatureGroupApplPK(productFeatureGroupId, productFeatureId, fromDate);
    }

    public ProductFeatureGroupApplPK getProductFeatureGroupApplPK() {
        return productFeatureGroupApplPK;
    }

    public void setProductFeatureGroupApplPK(ProductFeatureGroupApplPK productFeatureGroupApplPK) {
        this.productFeatureGroupApplPK = productFeatureGroupApplPK;
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

    public ProductFeatureGroup getProductFeatureGroup() {
        return productFeatureGroup;
    }

    public void setProductFeatureGroup(ProductFeatureGroup productFeatureGroup) {
        this.productFeatureGroup = productFeatureGroup;
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
        hash += (productFeatureGroupApplPK != null ? productFeatureGroupApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureGroupAppl)) {
            return false;
        }
        ProductFeatureGroupAppl other = (ProductFeatureGroupAppl) object;
        if ((this.productFeatureGroupApplPK == null && other.productFeatureGroupApplPK != null) || (this.productFeatureGroupApplPK != null && !this.productFeatureGroupApplPK.equals(other.productFeatureGroupApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureGroupAppl[ productFeatureGroupApplPK=" + productFeatureGroupApplPK + " ]";
    }
    
}
