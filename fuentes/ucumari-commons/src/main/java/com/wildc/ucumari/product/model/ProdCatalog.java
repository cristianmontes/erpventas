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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "prod_catalog")

public class ProdCatalog implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "prodCatalog")
    private List<ProdCatalogCategory> prodCatalogCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prodCatalog")
    private List<ProductStoreCatalog> productStoreCatalogList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prodCatalog")
    private List<ProdCatalogRole> prodCatalogRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prodCatalog")
    private List<ProdCatalogInvFacility> prodCatalogInvFacilityList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Column(name = "CATALOG_NAME")
    private String catalogName;
    @Column(name = "USE_QUICK_ADD")
    private Character useQuickAdd;
    @Column(name = "STYLE_SHEET")
    private String styleSheet;
    @Column(name = "HEADER_LOGO")
    private String headerLogo;
    @Column(name = "CONTENT_PATH_PREFIX")
    private String contentPathPrefix;
    @Column(name = "TEMPLATE_PATH_PREFIX")
    private String templatePathPrefix;
    @Column(name = "VIEW_ALLOW_PERM_REQD")
    private Character viewAllowPermReqd;
    @Column(name = "PURCHASE_ALLOW_PERM_REQD")
    private Character purchaseAllowPermReqd;
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
    /*@OneToMany(mappedBy = "prodCatalogId")
    private List<CartAbandonedLine> cartAbandonedLineList;*/

    public ProdCatalog() {
    }

    public ProdCatalog(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public Character getUseQuickAdd() {
        return useQuickAdd;
    }

    public void setUseQuickAdd(Character useQuickAdd) {
        this.useQuickAdd = useQuickAdd;
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet;
    }

    public String getHeaderLogo() {
        return headerLogo;
    }

    public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo;
    }

    public String getContentPathPrefix() {
        return contentPathPrefix;
    }

    public void setContentPathPrefix(String contentPathPrefix) {
        this.contentPathPrefix = contentPathPrefix;
    }

    public String getTemplatePathPrefix() {
        return templatePathPrefix;
    }

    public void setTemplatePathPrefix(String templatePathPrefix) {
        this.templatePathPrefix = templatePathPrefix;
    }

    public Character getViewAllowPermReqd() {
        return viewAllowPermReqd;
    }

    public void setViewAllowPermReqd(Character viewAllowPermReqd) {
        this.viewAllowPermReqd = viewAllowPermReqd;
    }

    public Character getPurchaseAllowPermReqd() {
        return purchaseAllowPermReqd;
    }

    public void setPurchaseAllowPermReqd(Character purchaseAllowPermReqd) {
        this.purchaseAllowPermReqd = purchaseAllowPermReqd;
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
/*
    public List<CartAbandonedLine> getCartAbandonedLineList() {
        return cartAbandonedLineList;
    }

    public void setCartAbandonedLineList(List<CartAbandonedLine> cartAbandonedLineList) {
        this.cartAbandonedLineList = cartAbandonedLineList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCatalogId != null ? prodCatalogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCatalog)) {
            return false;
        }
        ProdCatalog other = (ProdCatalog) object;
        if ((this.prodCatalogId == null && other.prodCatalogId != null) || (this.prodCatalogId != null && !this.prodCatalogId.equals(other.prodCatalogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdCatalog[ prodCatalogId=" + prodCatalogId + " ]";
    }
/*
    public List<ProdCatalogCategory> getProdCatalogCategoryList() {
        return prodCatalogCategoryList;
    }

    public void setProdCatalogCategoryList(List<ProdCatalogCategory> prodCatalogCategoryList) {
        this.prodCatalogCategoryList = prodCatalogCategoryList;
    }

    public List<ProductStoreCatalog> getProductStoreCatalogList() {
        return productStoreCatalogList;
    }

    public void setProductStoreCatalogList(List<ProductStoreCatalog> productStoreCatalogList) {
        this.productStoreCatalogList = productStoreCatalogList;
    }

    public List<ProdCatalogRole> getProdCatalogRoleList() {
        return prodCatalogRoleList;
    }

    public void setProdCatalogRoleList(List<ProdCatalogRole> prodCatalogRoleList) {
        this.prodCatalogRoleList = prodCatalogRoleList;
    }

    public List<ProdCatalogInvFacility> getProdCatalogInvFacilityList() {
        return prodCatalogInvFacilityList;
    }

    public void setProdCatalogInvFacilityList(List<ProdCatalogInvFacility> prodCatalogInvFacilityList) {
        this.prodCatalogInvFacilityList = prodCatalogInvFacilityList;
    }*/
    
}
