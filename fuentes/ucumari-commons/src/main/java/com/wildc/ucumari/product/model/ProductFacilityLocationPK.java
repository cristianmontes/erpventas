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
public class ProductFacilityLocationPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4794963827477818250L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "LOCATION_SEQ_ID")
    private String locationSeqId;

    public ProductFacilityLocationPK() {
    }

    public ProductFacilityLocationPK(String productId, String facilityId, String locationSeqId) {
        this.productId = productId;
        this.facilityId = facilityId;
        this.locationSeqId = locationSeqId;
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

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (locationSeqId != null ? locationSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFacilityLocationPK)) {
            return false;
        }
        ProductFacilityLocationPK other = (ProductFacilityLocationPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.locationSeqId == null && other.locationSeqId != null) || (this.locationSeqId != null && !this.locationSeqId.equals(other.locationSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFacilityLocationPK[ productId=" + productId + ", facilityId=" + facilityId + ", locationSeqId=" + locationSeqId + " ]";
    }
    
}
