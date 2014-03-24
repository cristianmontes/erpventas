/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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
public class ProductPricePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6846199764013930657L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_TYPE_ID")
    private String productPriceTypeId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_PURPOSE_ID")
    private String productPricePurposeId;
    @Basic(optional = false)
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductPricePK() {
    }

    public ProductPricePK(String productId, String productPriceTypeId, String productPricePurposeId, String currencyUomId, String productStoreGroupId, Date fromDate) {
        this.productId = productId;
        this.productPriceTypeId = productPriceTypeId;
        this.productPricePurposeId = productPricePurposeId;
        this.currencyUomId = currencyUomId;
        this.productStoreGroupId = productStoreGroupId;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
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
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (productPriceTypeId != null ? productPriceTypeId.hashCode() : 0);
        hash += (productPricePurposeId != null ? productPricePurposeId.hashCode() : 0);
        hash += (currencyUomId != null ? currencyUomId.hashCode() : 0);
        hash += (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPricePK)) {
            return false;
        }
        ProductPricePK other = (ProductPricePK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productPriceTypeId == null && other.productPriceTypeId != null) || (this.productPriceTypeId != null && !this.productPriceTypeId.equals(other.productPriceTypeId))) {
            return false;
        }
        if ((this.productPricePurposeId == null && other.productPricePurposeId != null) || (this.productPricePurposeId != null && !this.productPricePurposeId.equals(other.productPricePurposeId))) {
            return false;
        }
        if ((this.currencyUomId == null && other.currencyUomId != null) || (this.currencyUomId != null && !this.currencyUomId.equals(other.currencyUomId))) {
            return false;
        }
        if ((this.productStoreGroupId == null && other.productStoreGroupId != null) || (this.productStoreGroupId != null && !this.productStoreGroupId.equals(other.productStoreGroupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPricePK[ productId=" + productId + ", productPriceTypeId=" + productPriceTypeId + ", productPricePurposeId=" + productPricePurposeId + ", currencyUomId=" + currencyUomId + ", productStoreGroupId=" + productStoreGroupId + ", fromDate=" + fromDate + " ]";
    }
    
}
