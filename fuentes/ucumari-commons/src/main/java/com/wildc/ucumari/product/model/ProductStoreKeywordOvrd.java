/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_keyword_ovrd")
@NamedQueries({
    @NamedQuery(name = "ProductStoreKeywordOvrd.findAll", query = "SELECT p FROM ProductStoreKeywordOvrd p")})
public class ProductStoreKeywordOvrd implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreKeywordOvrdPK productStoreKeywordOvrdPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "TARGET")
    private String target;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "TARGET_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration targetTypeEnumId;

    public ProductStoreKeywordOvrd() {
    }

    public ProductStoreKeywordOvrd(ProductStoreKeywordOvrdPK productStoreKeywordOvrdPK) {
        this.productStoreKeywordOvrdPK = productStoreKeywordOvrdPK;
    }

    public ProductStoreKeywordOvrd(String productStoreId, String keyword, Date fromDate) {
        this.productStoreKeywordOvrdPK = new ProductStoreKeywordOvrdPK(productStoreId, keyword, fromDate);
    }

    public ProductStoreKeywordOvrdPK getProductStoreKeywordOvrdPK() {
        return productStoreKeywordOvrdPK;
    }

    public void setProductStoreKeywordOvrdPK(ProductStoreKeywordOvrdPK productStoreKeywordOvrdPK) {
        this.productStoreKeywordOvrdPK = productStoreKeywordOvrdPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public Enumeration getTargetTypeEnumId() {
        return targetTypeEnumId;
    }

    public void setTargetTypeEnumId(Enumeration targetTypeEnumId) {
        this.targetTypeEnumId = targetTypeEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreKeywordOvrdPK != null ? productStoreKeywordOvrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreKeywordOvrd)) {
            return false;
        }
        ProductStoreKeywordOvrd other = (ProductStoreKeywordOvrd) object;
        if ((this.productStoreKeywordOvrdPK == null && other.productStoreKeywordOvrdPK != null) || (this.productStoreKeywordOvrdPK != null && !this.productStoreKeywordOvrdPK.equals(other.productStoreKeywordOvrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreKeywordOvrd[ productStoreKeywordOvrdPK=" + productStoreKeywordOvrdPK + " ]";
    }
    
}
