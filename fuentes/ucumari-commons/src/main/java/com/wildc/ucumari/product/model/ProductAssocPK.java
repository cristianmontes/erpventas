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
public class ProductAssocPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2273341961110950537L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID_TO")
    private String productIdTo;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ASSOC_TYPE_ID")
    private String productAssocTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductAssocPK() {
    }

    public ProductAssocPK(String productId, String productIdTo, String productAssocTypeId, Date fromDate) {
        this.productId = productId;
        this.productIdTo = productIdTo;
        this.productAssocTypeId = productAssocTypeId;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductIdTo() {
        return productIdTo;
    }

    public void setProductIdTo(String productIdTo) {
        this.productIdTo = productIdTo;
    }

    public String getProductAssocTypeId() {
        return productAssocTypeId;
    }

    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
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
        hash += (productIdTo != null ? productIdTo.hashCode() : 0);
        hash += (productAssocTypeId != null ? productAssocTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAssocPK)) {
            return false;
        }
        ProductAssocPK other = (ProductAssocPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productIdTo == null && other.productIdTo != null) || (this.productIdTo != null && !this.productIdTo.equals(other.productIdTo))) {
            return false;
        }
        if ((this.productAssocTypeId == null && other.productAssocTypeId != null) || (this.productAssocTypeId != null && !this.productAssocTypeId.equals(other.productAssocTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductAssocPK[ productId=" + productId + ", productIdTo=" + productIdTo + ", productAssocTypeId=" + productAssocTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
