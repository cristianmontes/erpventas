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
@Table(name = "product_store_group_rollup")
@NamedQueries({
    @NamedQuery(name = "ProductStoreGroupRollup.findAll", query = "SELECT p FROM ProductStoreGroupRollup p")})
public class ProductStoreGroupRollup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreGroupRollupPK productStoreGroupRollupPK;
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
    @JoinColumn(name = "PARENT_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup;
    @JoinColumn(name = "PRODUCT_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup1;

    public ProductStoreGroupRollup() {
    }

    public ProductStoreGroupRollup(ProductStoreGroupRollupPK productStoreGroupRollupPK) {
        this.productStoreGroupRollupPK = productStoreGroupRollupPK;
    }

    public ProductStoreGroupRollup(String productStoreGroupId, String parentGroupId, Date fromDate) {
        this.productStoreGroupRollupPK = new ProductStoreGroupRollupPK(productStoreGroupId, parentGroupId, fromDate);
    }

    public ProductStoreGroupRollupPK getProductStoreGroupRollupPK() {
        return productStoreGroupRollupPK;
    }

    public void setProductStoreGroupRollupPK(ProductStoreGroupRollupPK productStoreGroupRollupPK) {
        this.productStoreGroupRollupPK = productStoreGroupRollupPK;
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

    public ProductStoreGroup getProductStoreGroup() {
        return productStoreGroup;
    }

    public void setProductStoreGroup(ProductStoreGroup productStoreGroup) {
        this.productStoreGroup = productStoreGroup;
    }

    public ProductStoreGroup getProductStoreGroup1() {
        return productStoreGroup1;
    }

    public void setProductStoreGroup1(ProductStoreGroup productStoreGroup1) {
        this.productStoreGroup1 = productStoreGroup1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupRollupPK != null ? productStoreGroupRollupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupRollup)) {
            return false;
        }
        ProductStoreGroupRollup other = (ProductStoreGroupRollup) object;
        if ((this.productStoreGroupRollupPK == null && other.productStoreGroupRollupPK != null) || (this.productStoreGroupRollupPK != null && !this.productStoreGroupRollupPK.equals(other.productStoreGroupRollupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupRollup[ productStoreGroupRollupPK=" + productStoreGroupRollupPK + " ]";
    }
    
}
