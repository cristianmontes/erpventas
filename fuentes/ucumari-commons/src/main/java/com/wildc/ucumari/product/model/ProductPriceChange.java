/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "product_price_change")
@NamedQueries({
    @NamedQuery(name = "ProductPriceChange.findAll", query = "SELECT p FROM ProductPriceChange p")})
public class ProductPriceChange implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_CHANGE_ID")
    private String productPriceChangeId;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PRODUCT_PRICE_TYPE_ID")
    private String productPriceTypeId;
    @Column(name = "PRODUCT_PRICE_PURPOSE_ID")
    private String productPricePurposeId;
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "OLD_PRICE")
    private BigDecimal oldPrice;
    @Column(name = "CHANGED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changedDate;
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
    @JoinColumn(name = "CHANGED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin changedByUserLogin;

    public ProductPriceChange() {
    }

    public ProductPriceChange(String productPriceChangeId) {
        this.productPriceChangeId = productPriceChangeId;
    }

    public String getProductPriceChangeId() {
        return productPriceChangeId;
    }

    public void setProductPriceChangeId(String productPriceChangeId) {
        this.productPriceChangeId = productPriceChangeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
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

    public UserLogin getChangedByUserLogin() {
        return changedByUserLogin;
    }

    public void setChangedByUserLogin(UserLogin changedByUserLogin) {
        this.changedByUserLogin = changedByUserLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceChangeId != null ? productPriceChangeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceChange)) {
            return false;
        }
        ProductPriceChange other = (ProductPriceChange) object;
        if ((this.productPriceChangeId == null && other.productPriceChangeId != null) || (this.productPriceChangeId != null && !this.productPriceChangeId.equals(other.productPriceChangeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceChange[ productPriceChangeId=" + productPriceChangeId + " ]";
    }
    
}
