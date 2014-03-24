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
public class ProductFeaturePricePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5430830605016904163L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_TYPE_ID")
    private String productPriceTypeId;
    @Basic(optional = false)
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductFeaturePricePK() {
    }

    public ProductFeaturePricePK(String productFeatureId, String productPriceTypeId, String currencyUomId, Date fromDate) {
        this.productFeatureId = productFeatureId;
        this.productPriceTypeId = productPriceTypeId;
        this.currencyUomId = currencyUomId;
        this.fromDate = fromDate;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
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
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        hash += (productPriceTypeId != null ? productPriceTypeId.hashCode() : 0);
        hash += (currencyUomId != null ? currencyUomId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeaturePricePK)) {
            return false;
        }
        ProductFeaturePricePK other = (ProductFeaturePricePK) object;
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        if ((this.productPriceTypeId == null && other.productPriceTypeId != null) || (this.productPriceTypeId != null && !this.productPriceTypeId.equals(other.productPriceTypeId))) {
            return false;
        }
        if ((this.currencyUomId == null && other.currencyUomId != null) || (this.currencyUomId != null && !this.currencyUomId.equals(other.currencyUomId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeaturePricePK[ productFeatureId=" + productFeatureId + ", productPriceTypeId=" + productPriceTypeId + ", currencyUomId=" + currencyUomId + ", fromDate=" + fromDate + " ]";
    }
    
}
