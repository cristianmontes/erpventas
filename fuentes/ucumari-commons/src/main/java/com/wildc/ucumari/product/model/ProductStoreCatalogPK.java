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
public class ProductStoreCatalogPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4663525555736450338L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductStoreCatalogPK() {
    }

    public ProductStoreCatalogPK(String productStoreId, String prodCatalogId, Date fromDate) {
        this.productStoreId = productStoreId;
        this.prodCatalogId = prodCatalogId;
        this.fromDate = fromDate;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
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
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (prodCatalogId != null ? prodCatalogId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreCatalogPK)) {
            return false;
        }
        ProductStoreCatalogPK other = (ProductStoreCatalogPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.prodCatalogId == null && other.prodCatalogId != null) || (this.prodCatalogId != null && !this.prodCatalogId.equals(other.prodCatalogId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreCatalogPK[ productStoreId=" + productStoreId + ", prodCatalogId=" + prodCatalogId + ", fromDate=" + fromDate + " ]";
    }
    
}
