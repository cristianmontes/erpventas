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

import com.wildc.ucumari.client.modelo.Content;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_content")
@NamedQueries({
    @NamedQuery(name = "ProductContent.findAll", query = "SELECT p FROM ProductContent p")})
public class ProductContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductContentPK productContentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PURCHASE_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseFromDate;
    @Column(name = "PURCHASE_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseThruDate;
    @Column(name = "USE_COUNT_LIMIT")
    private BigInteger useCountLimit;
    @Column(name = "USE_TIME")
    private BigInteger useTime;
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
    @JoinColumn(name = "USE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom useTimeUomId;
    @JoinColumn(name = "USE_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType useRoleTypeId;
    @JoinColumn(name = "PRODUCT_CONTENT_TYPE_ID", referencedColumnName = "PRODUCT_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductContentType productContentType;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public ProductContent() {
    }

    public ProductContent(ProductContentPK productContentPK) {
        this.productContentPK = productContentPK;
    }

    public ProductContent(String productId, String contentId, String productContentTypeId, Date fromDate) {
        this.productContentPK = new ProductContentPK(productId, contentId, productContentTypeId, fromDate);
    }

    public ProductContentPK getProductContentPK() {
        return productContentPK;
    }

    public void setProductContentPK(ProductContentPK productContentPK) {
        this.productContentPK = productContentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigInteger getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigInteger useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigInteger getUseTime() {
        return useTime;
    }

    public void setUseTime(BigInteger useTime) {
        this.useTime = useTime;
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

    public Uom getUseTimeUomId() {
        return useTimeUomId;
    }

    public void setUseTimeUomId(Uom useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }

    public RoleType getUseRoleTypeId() {
        return useRoleTypeId;
    }

    public void setUseRoleTypeId(RoleType useRoleTypeId) {
        this.useRoleTypeId = useRoleTypeId;
    }

    public ProductContentType getProductContentType() {
        return productContentType;
    }

    public void setProductContentType(ProductContentType productContentType) {
        this.productContentType = productContentType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productContentPK != null ? productContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductContent)) {
            return false;
        }
        ProductContent other = (ProductContent) object;
        if ((this.productContentPK == null && other.productContentPK != null) || (this.productContentPK != null && !this.productContentPK.equals(other.productContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductContent[ productContentPK=" + productContentPK + " ]";
    }
    
}
