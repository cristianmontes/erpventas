/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_group_role")
@NamedQueries({
    @NamedQuery(name = "ProductStoreGroupRole.findAll", query = "SELECT p FROM ProductStoreGroupRole p")})
public class ProductStoreGroupRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreGroupRolePK productStoreGroupRolePK;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PRODUCT_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup;

    public ProductStoreGroupRole() {
    }

    public ProductStoreGroupRole(ProductStoreGroupRolePK productStoreGroupRolePK) {
        this.productStoreGroupRolePK = productStoreGroupRolePK;
    }

    public ProductStoreGroupRole(String productStoreGroupId, String partyId, String roleTypeId) {
        this.productStoreGroupRolePK = new ProductStoreGroupRolePK(productStoreGroupId, partyId, roleTypeId);
    }

    public ProductStoreGroupRolePK getProductStoreGroupRolePK() {
        return productStoreGroupRolePK;
    }

    public void setProductStoreGroupRolePK(ProductStoreGroupRolePK productStoreGroupRolePK) {
        this.productStoreGroupRolePK = productStoreGroupRolePK;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public ProductStoreGroup getProductStoreGroup() {
        return productStoreGroup;
    }

    public void setProductStoreGroup(ProductStoreGroup productStoreGroup) {
        this.productStoreGroup = productStoreGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupRolePK != null ? productStoreGroupRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupRole)) {
            return false;
        }
        ProductStoreGroupRole other = (ProductStoreGroupRole) object;
        if ((this.productStoreGroupRolePK == null && other.productStoreGroupRolePK != null) || (this.productStoreGroupRolePK != null && !this.productStoreGroupRolePK.equals(other.productStoreGroupRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupRole[ productStoreGroupRolePK=" + productStoreGroupRolePK + " ]";
    }
    
}
