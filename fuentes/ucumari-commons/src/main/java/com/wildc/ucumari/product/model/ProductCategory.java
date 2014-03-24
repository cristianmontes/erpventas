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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_category")

public class ProductCategory implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<TaxAuthorityCategory> taxAuthorityCategoryList;
    @OneToMany(mappedBy = "productCategoryId")
    private List<SalesForecastDetail> salesForecastDetailList;
    @OneToMany(mappedBy = "productCategoryId")
    private List<Subscription> subscriptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProdCatalogCategory> prodCatalogCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryAttribute> productCategoryAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductFeatureCategoryAppl> productFeatureCategoryApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductPromoCategory> productPromoCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryGlAccount> productCategoryGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryRollup> productCategoryRollupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory1")
    private List<ProductCategoryRollup> productCategoryRollupList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductFeatureCatGrpAppl> productFeatureCatGrpApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryRole> productCategoryRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryMember> productCategoryMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryLink> productCategoryLinkList;
    @OneToMany(mappedBy = "productCategoryId")
    private List<PartyNeed> partyNeedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<ProductCategoryContent> productCategoryContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<MarketInterest> marketInterestList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Column(name = "CATEGORY_NAME")
    private String categoryName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "CATEGORY_IMAGE_URL")
    private String categoryImageUrl;
    @Column(name = "LINK_ONE_IMAGE_URL")
    private String linkOneImageUrl;
    @Column(name = "LINK_TWO_IMAGE_URL")
    private String linkTwoImageUrl;
    @Column(name = "DETAIL_SCREEN")
    private String detailScreen;
    @Column(name = "SHOW_IN_SELECT")
    private Character showInSelect;
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
    @JoinColumn(name = "PRODUCT_CATEGORY_TYPE_ID", referencedColumnName = "PRODUCT_CATEGORY_TYPE_ID")
    @ManyToOne
    private ProductCategoryType productCategoryTypeId;
    /*@OneToMany(mappedBy = "primaryParentCategoryId")
    private List<ProductCategory> productCategoryList;*/
    @JoinColumn(name = "PRIMARY_PARENT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory primaryParentCategoryId;
    /*@OneToMany(mappedBy = "productCategoryId")
    private List<TaxAuthorityRateProduct> taxAuthorityRateProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private List<AgreementCategoryAppl> agreementCategoryApplList;
    @OneToMany(mappedBy = "primaryProductCategoryId")
    private List<Product> productList;
    @OneToMany(mappedBy = "productCategoryId")
    private List<AgreementTerm> agreementTermList;*/

    public ProductCategory() {
    }

    public ProductCategory(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    public String getLinkOneImageUrl() {
        return linkOneImageUrl;
    }

    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl;
    }

    public String getLinkTwoImageUrl() {
        return linkTwoImageUrl;
    }

    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl;
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    public Character getShowInSelect() {
        return showInSelect;
    }

    public void setShowInSelect(Character showInSelect) {
        this.showInSelect = showInSelect;
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

    public ProductCategoryType getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(ProductCategoryType productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }
/*
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }*/

    public ProductCategory getPrimaryParentCategoryId() {
        return primaryParentCategoryId;
    }

    public void setPrimaryParentCategoryId(ProductCategory primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId;
    }
/*
    public List<TaxAuthorityRateProduct> getTaxAuthorityRateProductList() {
        return taxAuthorityRateProductList;
    }

    public void setTaxAuthorityRateProductList(List<TaxAuthorityRateProduct> taxAuthorityRateProductList) {
        this.taxAuthorityRateProductList = taxAuthorityRateProductList;
    }

    public List<AgreementCategoryAppl> getAgreementCategoryApplList() {
        return agreementCategoryApplList;
    }

    public void setAgreementCategoryApplList(List<AgreementCategoryAppl> agreementCategoryApplList) {
        this.agreementCategoryApplList = agreementCategoryApplList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategory)) {
            return false;
        }
        ProductCategory other = (ProductCategory) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategory[ productCategoryId=" + productCategoryId + " ]";
    }
/*
    public List<MarketInterest> getMarketInterestList() {
        return marketInterestList;
    }

    public void setMarketInterestList(List<MarketInterest> marketInterestList) {
        this.marketInterestList = marketInterestList;
    }

    public List<ProdCatalogCategory> getProdCatalogCategoryList() {
        return prodCatalogCategoryList;
    }

    public void setProdCatalogCategoryList(List<ProdCatalogCategory> prodCatalogCategoryList) {
        this.prodCatalogCategoryList = prodCatalogCategoryList;
    }

    public List<ProductCategoryAttribute> getProductCategoryAttributeList() {
        return productCategoryAttributeList;
    }

    public void setProductCategoryAttributeList(List<ProductCategoryAttribute> productCategoryAttributeList) {
        this.productCategoryAttributeList = productCategoryAttributeList;
    }

    public List<ProductFeatureCategoryAppl> getProductFeatureCategoryApplList() {
        return productFeatureCategoryApplList;
    }

    public void setProductFeatureCategoryApplList(List<ProductFeatureCategoryAppl> productFeatureCategoryApplList) {
        this.productFeatureCategoryApplList = productFeatureCategoryApplList;
    }

    public List<ProductPromoCategory> getProductPromoCategoryList() {
        return productPromoCategoryList;
    }

    public void setProductPromoCategoryList(List<ProductPromoCategory> productPromoCategoryList) {
        this.productPromoCategoryList = productPromoCategoryList;
    }

    public List<ProductCategoryGlAccount> getProductCategoryGlAccountList() {
        return productCategoryGlAccountList;
    }

    public void setProductCategoryGlAccountList(List<ProductCategoryGlAccount> productCategoryGlAccountList) {
        this.productCategoryGlAccountList = productCategoryGlAccountList;
    }

    public List<ProductCategoryRollup> getProductCategoryRollupList() {
        return productCategoryRollupList;
    }

    public void setProductCategoryRollupList(List<ProductCategoryRollup> productCategoryRollupList) {
        this.productCategoryRollupList = productCategoryRollupList;
    }

    public List<ProductCategoryRollup> getProductCategoryRollupList1() {
        return productCategoryRollupList1;
    }

    public void setProductCategoryRollupList1(List<ProductCategoryRollup> productCategoryRollupList1) {
        this.productCategoryRollupList1 = productCategoryRollupList1;
    }

    public List<ProductFeatureCatGrpAppl> getProductFeatureCatGrpApplList() {
        return productFeatureCatGrpApplList;
    }

    public void setProductFeatureCatGrpApplList(List<ProductFeatureCatGrpAppl> productFeatureCatGrpApplList) {
        this.productFeatureCatGrpApplList = productFeatureCatGrpApplList;
    }

    public List<ProductCategoryRole> getProductCategoryRoleList() {
        return productCategoryRoleList;
    }

    public void setProductCategoryRoleList(List<ProductCategoryRole> productCategoryRoleList) {
        this.productCategoryRoleList = productCategoryRoleList;
    }

    public List<ProductCategoryMember> getProductCategoryMemberList() {
        return productCategoryMemberList;
    }

    public void setProductCategoryMemberList(List<ProductCategoryMember> productCategoryMemberList) {
        this.productCategoryMemberList = productCategoryMemberList;
    }

    public List<ProductCategoryLink> getProductCategoryLinkList() {
        return productCategoryLinkList;
    }

    public void setProductCategoryLinkList(List<ProductCategoryLink> productCategoryLinkList) {
        this.productCategoryLinkList = productCategoryLinkList;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<ProductCategoryContent> getProductCategoryContentList() {
        return productCategoryContentList;
    }

    public void setProductCategoryContentList(List<ProductCategoryContent> productCategoryContentList) {
        this.productCategoryContentList = productCategoryContentList;
    }

    public List<TaxAuthorityCategory> getTaxAuthorityCategoryList() {
        return taxAuthorityCategoryList;
    }

    public void setTaxAuthorityCategoryList(List<TaxAuthorityCategory> taxAuthorityCategoryList) {
        this.taxAuthorityCategoryList = taxAuthorityCategoryList;
    }

    public List<SalesForecastDetail> getSalesForecastDetailList() {
        return salesForecastDetailList;
    }

    public void setSalesForecastDetailList(List<SalesForecastDetail> salesForecastDetailList) {
        this.salesForecastDetailList = salesForecastDetailList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }*/
    
}
