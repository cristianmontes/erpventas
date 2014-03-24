/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductFacilityPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6517649808197627628L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;

    public ProductFacilityPK() {
    }

    public ProductFacilityPK(String productId, String facilityId) {
        this.productId = productId;
        this.facilityId = facilityId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFacilityPK)) {
            return false;
        }
        ProductFacilityPK other = (ProductFacilityPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFacilityPK[ productId=" + productId + ", facilityId=" + facilityId + " ]";
    }
    
}
