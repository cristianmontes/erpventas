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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_group")

public class ProductStoreGroup implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<VendorProduct> vendorProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<ProductStoreGroupRollup> productStoreGroupRollupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup1")
    private List<ProductStoreGroupRollup> productStoreGroupRollupList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<ProductPrice> productPriceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<ProductStoreGroupMember> productStoreGroupMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<ProductStoreGroupRole> productStoreGroupRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStoreGroup")
    private List<MrpProductStoreGroupMember> mrpProductStoreGroupMemberList;
    */
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;
    @Column(name = "PRODUCT_STORE_GROUP_NAME")
    private String productStoreGroupName;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumn(name = "PRODUCT_STORE_GROUP_TYPE_ID", referencedColumnName = "PRODUCT_STORE_GROUP_TYPE_ID")
    @ManyToOne
    private ProductStoreGroupType productStoreGroupTypeId;    
    @JoinColumn(name = "PRIMARY_PARENT_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID")
    @ManyToOne
    private ProductStoreGroup primaryParentGroupId;
    /*@OneToMany(mappedBy = "primaryParentGroupId")
    private List<ProductStoreGroup> productStoreGroupList;
    @OneToMany(mappedBy = "primaryStoreGroupId")
    private List<ProductStore> productStoreList;*/

    public ProductStoreGroup() {
    }

    public ProductStoreGroup(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }

    public String getProductStoreGroupName() {
        return productStoreGroupName;
    }

    public void setProductStoreGroupName(String productStoreGroupName) {
        this.productStoreGroupName = productStoreGroupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ProductStoreGroupType getProductStoreGroupTypeId() {
        return productStoreGroupTypeId;
    }

    public void setProductStoreGroupTypeId(ProductStoreGroupType productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId;
    }
/*
    public List<ProductStoreGroup> getProductStoreGroupList() {
        return productStoreGroupList;
    }

    public void setProductStoreGroupList(List<ProductStoreGroup> productStoreGroupList) {
        this.productStoreGroupList = productStoreGroupList;
    }*/

    public ProductStoreGroup getPrimaryParentGroupId() {
        return primaryParentGroupId;
    }

    public void setPrimaryParentGroupId(ProductStoreGroup primaryParentGroupId) {
        this.primaryParentGroupId = primaryParentGroupId;
    }
/*
    public List<ProductStore> getProductStoreList() {
        return productStoreList;
    }

    public void setProductStoreList(List<ProductStore> productStoreList) {
        this.productStoreList = productStoreList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroup)) {
            return false;
        }
        ProductStoreGroup other = (ProductStoreGroup) object;
        if ((this.productStoreGroupId == null && other.productStoreGroupId != null) || (this.productStoreGroupId != null && !this.productStoreGroupId.equals(other.productStoreGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroup[ productStoreGroupId=" + productStoreGroupId + " ]";
    }
/*
    public List<MrpProductStoreGroupMember> getMrpProductStoreGroupMemberList() {
        return mrpProductStoreGroupMemberList;
    }

    public void setMrpProductStoreGroupMemberList(List<MrpProductStoreGroupMember> mrpProductStoreGroupMemberList) {
        this.mrpProductStoreGroupMemberList = mrpProductStoreGroupMemberList;
    }

    public List<ProductStoreGroupRollup> getProductStoreGroupRollupList() {
        return productStoreGroupRollupList;
    }

    public void setProductStoreGroupRollupList(List<ProductStoreGroupRollup> productStoreGroupRollupList) {
        this.productStoreGroupRollupList = productStoreGroupRollupList;
    }

    public List<ProductStoreGroupRollup> getProductStoreGroupRollupList1() {
        return productStoreGroupRollupList1;
    }

    public void setProductStoreGroupRollupList1(List<ProductStoreGroupRollup> productStoreGroupRollupList1) {
        this.productStoreGroupRollupList1 = productStoreGroupRollupList1;
    }

    public List<ProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<ProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }

    public List<ProductStoreGroupMember> getProductStoreGroupMemberList() {
        return productStoreGroupMemberList;
    }

    public void setProductStoreGroupMemberList(List<ProductStoreGroupMember> productStoreGroupMemberList) {
        this.productStoreGroupMemberList = productStoreGroupMemberList;
    }

    public List<ProductStoreGroupRole> getProductStoreGroupRoleList() {
        return productStoreGroupRoleList;
    }

    public void setProductStoreGroupRoleList(List<ProductStoreGroupRole> productStoreGroupRoleList) {
        this.productStoreGroupRoleList = productStoreGroupRoleList;
    }

    public List<VendorProduct> getVendorProductList() {
        return vendorProductList;
    }

    public void setVendorProductList(List<VendorProduct> vendorProductList) {
        this.vendorProductList = vendorProductList;
    }*/
    
}
