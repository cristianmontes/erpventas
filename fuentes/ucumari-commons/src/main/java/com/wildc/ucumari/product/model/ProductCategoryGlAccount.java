/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.accounting.model.GlAccountType;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "product_category_gl_account")
@NamedQueries({
    @NamedQuery(name = "ProductCategoryGlAccount.findAll", query = "SELECT p FROM ProductCategoryGlAccount p")})
public class ProductCategoryGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductCategoryGlAccountPK productCategoryGlAccountPK;
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
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccountType glAccountType;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public ProductCategoryGlAccount() {
    }

    public ProductCategoryGlAccount(ProductCategoryGlAccountPK productCategoryGlAccountPK) {
        this.productCategoryGlAccountPK = productCategoryGlAccountPK;
    }

    public ProductCategoryGlAccount(String productCategoryId, String organizationPartyId, String glAccountTypeId) {
        this.productCategoryGlAccountPK = new ProductCategoryGlAccountPK(productCategoryId, organizationPartyId, glAccountTypeId);
    }

    public ProductCategoryGlAccountPK getProductCategoryGlAccountPK() {
        return productCategoryGlAccountPK;
    }

    public void setProductCategoryGlAccountPK(ProductCategoryGlAccountPK productCategoryGlAccountPK) {
        this.productCategoryGlAccountPK = productCategoryGlAccountPK;
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

    public GlAccountType getGlAccountType() {
        return glAccountType;
    }

    public void setGlAccountType(GlAccountType glAccountType) {
        this.glAccountType = glAccountType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryGlAccountPK != null ? productCategoryGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryGlAccount)) {
            return false;
        }
        ProductCategoryGlAccount other = (ProductCategoryGlAccount) object;
        if ((this.productCategoryGlAccountPK == null && other.productCategoryGlAccountPK != null) || (this.productCategoryGlAccountPK != null && !this.productCategoryGlAccountPK.equals(other.productCategoryGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryGlAccount[ productCategoryGlAccountPK=" + productCategoryGlAccountPK + " ]";
    }
    
}
