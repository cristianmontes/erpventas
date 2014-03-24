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
public class ProdCatalogCategoryPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6040344450933136875L;
	@Basic(optional = false)
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "PROD_CATALOG_CATEGORY_TYPE_ID")
    private String prodCatalogCategoryTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProdCatalogCategoryPK() {
    }

    public ProdCatalogCategoryPK(String prodCatalogId, String productCategoryId, String prodCatalogCategoryTypeId, Date fromDate) {
        this.prodCatalogId = prodCatalogId;
        this.productCategoryId = productCategoryId;
        this.prodCatalogCategoryTypeId = prodCatalogCategoryTypeId;
        this.fromDate = fromDate;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProdCatalogCategoryTypeId() {
        return prodCatalogCategoryTypeId;
    }

    public void setProdCatalogCategoryTypeId(String prodCatalogCategoryTypeId) {
        this.prodCatalogCategoryTypeId = prodCatalogCategoryTypeId;
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
        hash += (prodCatalogId != null ? prodCatalogId.hashCode() : 0);
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        hash += (prodCatalogCategoryTypeId != null ? prodCatalogCategoryTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCatalogCategoryPK)) {
            return false;
        }
        ProdCatalogCategoryPK other = (ProdCatalogCategoryPK) object;
        if ((this.prodCatalogId == null && other.prodCatalogId != null) || (this.prodCatalogId != null && !this.prodCatalogId.equals(other.prodCatalogId))) {
            return false;
        }
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.prodCatalogCategoryTypeId == null && other.prodCatalogCategoryTypeId != null) || (this.prodCatalogCategoryTypeId != null && !this.prodCatalogCategoryTypeId.equals(other.prodCatalogCategoryTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdCatalogCategoryPK[ prodCatalogId=" + prodCatalogId + ", productCategoryId=" + productCategoryId + ", prodCatalogCategoryTypeId=" + prodCatalogCategoryTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
