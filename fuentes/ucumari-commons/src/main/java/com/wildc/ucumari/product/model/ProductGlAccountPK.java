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
public class ProductGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_TYPE_ID")
    private String glAccountTypeId;

    public ProductGlAccountPK() {
    }

    public ProductGlAccountPK(String productId, String organizationPartyId, String glAccountTypeId) {
        this.productId = productId;
        this.organizationPartyId = organizationPartyId;
        this.glAccountTypeId = glAccountTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (glAccountTypeId != null ? glAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductGlAccountPK)) {
            return false;
        }
        ProductGlAccountPK other = (ProductGlAccountPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.glAccountTypeId == null && other.glAccountTypeId != null) || (this.glAccountTypeId != null && !this.glAccountTypeId.equals(other.glAccountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductGlAccountPK[ productId=" + productId + ", organizationPartyId=" + organizationPartyId + ", glAccountTypeId=" + glAccountTypeId + " ]";
    }
    
}
