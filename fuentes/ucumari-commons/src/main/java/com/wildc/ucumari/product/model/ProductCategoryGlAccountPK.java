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
public class ProductCategoryGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_TYPE_ID")
    private String glAccountTypeId;

    public ProductCategoryGlAccountPK() {
    }

    public ProductCategoryGlAccountPK(String productCategoryId, String organizationPartyId, String glAccountTypeId) {
        this.productCategoryId = productCategoryId;
        this.organizationPartyId = organizationPartyId;
        this.glAccountTypeId = glAccountTypeId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
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
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (glAccountTypeId != null ? glAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryGlAccountPK)) {
            return false;
        }
        ProductCategoryGlAccountPK other = (ProductCategoryGlAccountPK) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
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
        return "com.wildc.ucumari.client.modelo.ProductCategoryGlAccountPK[ productCategoryId=" + productCategoryId + ", organizationPartyId=" + organizationPartyId + ", glAccountTypeId=" + glAccountTypeId + " ]";
    }
    
}
