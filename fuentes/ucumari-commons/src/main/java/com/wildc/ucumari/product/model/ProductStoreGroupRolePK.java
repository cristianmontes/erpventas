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
public class ProductStoreGroupRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public ProductStoreGroupRolePK() {
    }

    public ProductStoreGroupRolePK(String productStoreGroupId, String partyId, String roleTypeId) {
        this.productStoreGroupId = productStoreGroupId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupRolePK)) {
            return false;
        }
        ProductStoreGroupRolePK other = (ProductStoreGroupRolePK) object;
        if ((this.productStoreGroupId == null && other.productStoreGroupId != null) || (this.productStoreGroupId != null && !this.productStoreGroupId.equals(other.productStoreGroupId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupRolePK[ productStoreGroupId=" + productStoreGroupId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
