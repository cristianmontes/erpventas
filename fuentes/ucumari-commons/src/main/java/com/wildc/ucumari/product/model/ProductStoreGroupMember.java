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
@Table(name = "product_store_group_member")
@NamedQueries({
    @NamedQuery(name = "ProductStoreGroupMember.findAll", query = "SELECT p FROM ProductStoreGroupMember p")})
public class ProductStoreGroupMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreGroupMemberPK productStoreGroupMemberPK;
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
    @JoinColumn(name = "PRODUCT_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;

    public ProductStoreGroupMember() {
    }

    public ProductStoreGroupMember(ProductStoreGroupMemberPK productStoreGroupMemberPK) {
        this.productStoreGroupMemberPK = productStoreGroupMemberPK;
    }

    public ProductStoreGroupMember(String productStoreId, String productStoreGroupId, Date fromDate) {
        this.productStoreGroupMemberPK = new ProductStoreGroupMemberPK(productStoreId, productStoreGroupId, fromDate);
    }

    public ProductStoreGroupMemberPK getProductStoreGroupMemberPK() {
        return productStoreGroupMemberPK;
    }

    public void setProductStoreGroupMemberPK(ProductStoreGroupMemberPK productStoreGroupMemberPK) {
        this.productStoreGroupMemberPK = productStoreGroupMemberPK;
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

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupMemberPK != null ? productStoreGroupMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupMember)) {
            return false;
        }
        ProductStoreGroupMember other = (ProductStoreGroupMember) object;
        if ((this.productStoreGroupMemberPK == null && other.productStoreGroupMemberPK != null) || (this.productStoreGroupMemberPK != null && !this.productStoreGroupMemberPK.equals(other.productStoreGroupMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupMember[ productStoreGroupMemberPK=" + productStoreGroupMemberPK + " ]";
    }
    
}
