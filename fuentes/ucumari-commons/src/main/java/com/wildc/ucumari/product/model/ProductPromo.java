/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo")

public class ProductPromo implements Serializable {
    /*@OneToMany(mappedBy = "productPromoId")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "productPromoId")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(mappedBy = "productPromoId")
    private List<OrderAdjustment> orderAdjustmentList;
    @OneToMany(mappedBy = "productPromoId")
    private List<ProductPromoUse> productPromoUseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductPromoCategory> productPromoCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductPromoProduct> productPromoProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductStorePromoAppl> productStorePromoApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductPromoRule> productPromoRuleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductPromoAction> productPromoActionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<ProductPromoCond> productPromoCondList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ID")
    private String productPromoId;
    @Column(name = "PROMO_NAME")
    private String promoName;
    @Column(name = "PROMO_TEXT")
    private String promoText;
    @Column(name = "USER_ENTERED")
    private Character userEntered;
    @Column(name = "SHOW_TO_CUSTOMER")
    private Character showToCustomer;
    @Column(name = "REQUIRE_CODE")
    private Character requireCode;
    @Column(name = "USE_LIMIT_PER_ORDER")
    private BigInteger useLimitPerOrder;
    @Column(name = "USE_LIMIT_PER_CUSTOMER")
    private BigInteger useLimitPerCustomer;
    @Column(name = "USE_LIMIT_PER_PROMOTION")
    private BigInteger useLimitPerPromotion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BILLBACK_FACTOR")
    private BigDecimal billbackFactor;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
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
    @JoinColumn(name = "OVERRIDE_ORG_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party overrideOrgPartyId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    /*
    @OneToMany(mappedBy = "productPromoId")
    private List<ProductPromoCode> productPromoCodeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromo")
    private List<AgreementPromoAppl> agreementPromoApplList;*/

    public ProductPromo() {
    }

    public ProductPromo(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public Character getUserEntered() {
        return userEntered;
    }

    public void setUserEntered(Character userEntered) {
        this.userEntered = userEntered;
    }

    public Character getShowToCustomer() {
        return showToCustomer;
    }

    public void setShowToCustomer(Character showToCustomer) {
        this.showToCustomer = showToCustomer;
    }

    public Character getRequireCode() {
        return requireCode;
    }

    public void setRequireCode(Character requireCode) {
        this.requireCode = requireCode;
    }

    public BigInteger getUseLimitPerOrder() {
        return useLimitPerOrder;
    }

    public void setUseLimitPerOrder(BigInteger useLimitPerOrder) {
        this.useLimitPerOrder = useLimitPerOrder;
    }

    public BigInteger getUseLimitPerCustomer() {
        return useLimitPerCustomer;
    }

    public void setUseLimitPerCustomer(BigInteger useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }

    public BigInteger getUseLimitPerPromotion() {
        return useLimitPerPromotion;
    }

    public void setUseLimitPerPromotion(BigInteger useLimitPerPromotion) {
        this.useLimitPerPromotion = useLimitPerPromotion;
    }

    public BigDecimal getBillbackFactor() {
        return billbackFactor;
    }

    public void setBillbackFactor(BigDecimal billbackFactor) {
        this.billbackFactor = billbackFactor;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
    public List<ProductPromoCode> getProductPromoCodeList() {
        return productPromoCodeList;
    }

    public void setProductPromoCodeList(List<ProductPromoCode> productPromoCodeList) {
        this.productPromoCodeList = productPromoCodeList;
    }*/

    public Party getOverrideOrgPartyId() {
        return overrideOrgPartyId;
    }

    public void setOverrideOrgPartyId(Party overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
/*
    public List<AgreementPromoAppl> getAgreementPromoApplList() {
        return agreementPromoApplList;
    }

    public void setAgreementPromoApplList(List<AgreementPromoAppl> agreementPromoApplList) {
        this.agreementPromoApplList = agreementPromoApplList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoId != null ? productPromoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromo)) {
            return false;
        }
        ProductPromo other = (ProductPromo) object;
        if ((this.productPromoId == null && other.productPromoId != null) || (this.productPromoId != null && !this.productPromoId.equals(other.productPromoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromo[ productPromoId=" + productPromoId + " ]";
    }
/*
    public List<ProductPromoUse> getProductPromoUseList() {
        return productPromoUseList;
    }

    public void setProductPromoUseList(List<ProductPromoUse> productPromoUseList) {
        this.productPromoUseList = productPromoUseList;
    }

    public List<ProductPromoCategory> getProductPromoCategoryList() {
        return productPromoCategoryList;
    }

    public void setProductPromoCategoryList(List<ProductPromoCategory> productPromoCategoryList) {
        this.productPromoCategoryList = productPromoCategoryList;
    }

    public List<ProductPromoProduct> getProductPromoProductList() {
        return productPromoProductList;
    }

    public void setProductPromoProductList(List<ProductPromoProduct> productPromoProductList) {
        this.productPromoProductList = productPromoProductList;
    }

    public List<ProductStorePromoAppl> getProductStorePromoApplList() {
        return productStorePromoApplList;
    }

    public void setProductStorePromoApplList(List<ProductStorePromoAppl> productStorePromoApplList) {
        this.productStorePromoApplList = productStorePromoApplList;
    }

    public List<ProductPromoRule> getProductPromoRuleList() {
        return productPromoRuleList;
    }

    public void setProductPromoRuleList(List<ProductPromoRule> productPromoRuleList) {
        this.productPromoRuleList = productPromoRuleList;
    }

    public List<ProductPromoAction> getProductPromoActionList() {
        return productPromoActionList;
    }

    public void setProductPromoActionList(List<ProductPromoAction> productPromoActionList) {
        this.productPromoActionList = productPromoActionList;
    }

    public List<ProductPromoCond> getProductPromoCondList() {
        return productPromoCondList;
    }

    public void setProductPromoCondList(List<ProductPromoCond> productPromoCondList) {
        this.productPromoCondList = productPromoCondList;
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }*/
    
}
