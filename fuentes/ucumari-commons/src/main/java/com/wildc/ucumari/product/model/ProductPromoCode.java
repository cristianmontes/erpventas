/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
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

import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_code")

public class ProductPromoCode implements Serializable {
    /*@OneToMany(mappedBy = "productPromoCodeId")
    private List<ProductPromoUse> productPromoUseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromoCode")
    private List<ProductPromoCodeEmail> productPromoCodeEmailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromoCode")
    private List<ProductPromoCodeParty> productPromoCodePartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromoCode")
    private List<OrderProductPromoCode> orderProductPromoCodeList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_CODE_ID")
    private String productPromoCodeId;
    @Column(name = "USER_ENTERED")
    private Character userEntered;
    @Column(name = "REQUIRE_EMAIL_OR_PARTY")
    private Character requireEmailOrParty;
    @Column(name = "USE_LIMIT_PER_CODE")
    private BigInteger useLimitPerCode;
    @Column(name = "USE_LIMIT_PER_CUSTOMER")
    private BigInteger useLimitPerCustomer;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    /*@OneToMany(mappedBy = "productPromoCodeId")
    private List<ShoppingList> shoppingListList;*/
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID")
    @ManyToOne
    private ProductPromo productPromoId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;

    public ProductPromoCode() {
    }

    public ProductPromoCode(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    public Character getUserEntered() {
        return userEntered;
    }

    public void setUserEntered(Character userEntered) {
        this.userEntered = userEntered;
    }

    public Character getRequireEmailOrParty() {
        return requireEmailOrParty;
    }

    public void setRequireEmailOrParty(Character requireEmailOrParty) {
        this.requireEmailOrParty = requireEmailOrParty;
    }

    public BigInteger getUseLimitPerCode() {
        return useLimitPerCode;
    }

    public void setUseLimitPerCode(BigInteger useLimitPerCode) {
        this.useLimitPerCode = useLimitPerCode;
    }

    public BigInteger getUseLimitPerCustomer() {
        return useLimitPerCustomer;
    }

    public void setUseLimitPerCustomer(BigInteger useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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
    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }*/

    public ProductPromo getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(ProductPromo productPromoId) {
        this.productPromoId = productPromoId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCodeId != null ? productPromoCodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCode)) {
            return false;
        }
        ProductPromoCode other = (ProductPromoCode) object;
        if ((this.productPromoCodeId == null && other.productPromoCodeId != null) || (this.productPromoCodeId != null && !this.productPromoCodeId.equals(other.productPromoCodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCode[ productPromoCodeId=" + productPromoCodeId + " ]";
    }
/*
    public List<OrderProductPromoCode> getOrderProductPromoCodeList() {
        return orderProductPromoCodeList;
    }

    public void setOrderProductPromoCodeList(List<OrderProductPromoCode> orderProductPromoCodeList) {
        this.orderProductPromoCodeList = orderProductPromoCodeList;
    }

    public List<ProductPromoUse> getProductPromoUseList() {
        return productPromoUseList;
    }

    public void setProductPromoUseList(List<ProductPromoUse> productPromoUseList) {
        this.productPromoUseList = productPromoUseList;
    }

    public List<ProductPromoCodeEmail> getProductPromoCodeEmailList() {
        return productPromoCodeEmailList;
    }

    public void setProductPromoCodeEmailList(List<ProductPromoCodeEmail> productPromoCodeEmailList) {
        this.productPromoCodeEmailList = productPromoCodeEmailList;
    }

    public List<ProductPromoCodeParty> getProductPromoCodePartyList() {
        return productPromoCodePartyList;
    }

    public void setProductPromoCodePartyList(List<ProductPromoCodeParty> productPromoCodePartyList) {
        this.productPromoCodePartyList = productPromoCodePartyList;
    }*/
    
}
