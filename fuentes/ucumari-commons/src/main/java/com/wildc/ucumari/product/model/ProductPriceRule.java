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
@Table(name = "product_price_rule")
public class ProductPriceRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_RULE_ID")
    private String productPriceRuleId;
    @Column(name = "RULE_NAME")
    private String ruleName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IS_SALE")
    private Character isSale;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productPriceRule")
    private List<ProductPriceCond> productPriceCondList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPriceRule")
    private List<ProductPriceAction> productPriceActionList;*/

    public ProductPriceRule() {
    }

    public ProductPriceRule(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }

    public String getProductPriceRuleId() {
        return productPriceRuleId;
    }

    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getIsSale() {
        return isSale;
    }

    public void setIsSale(Character isSale) {
        this.isSale = isSale;
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
    public List<ProductPriceCond> getProductPriceCondList() {
        return productPriceCondList;
    }

    public void setProductPriceCondList(List<ProductPriceCond> productPriceCondList) {
        this.productPriceCondList = productPriceCondList;
    }

    public List<ProductPriceAction> getProductPriceActionList() {
        return productPriceActionList;
    }

    public void setProductPriceActionList(List<ProductPriceAction> productPriceActionList) {
        this.productPriceActionList = productPriceActionList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceRuleId != null ? productPriceRuleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceRule)) {
            return false;
        }
        ProductPriceRule other = (ProductPriceRule) object;
        if ((this.productPriceRuleId == null && other.productPriceRuleId != null) || (this.productPriceRuleId != null && !this.productPriceRuleId.equals(other.productPriceRuleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceRule[ productPriceRuleId=" + productPriceRuleId + " ]";
    }
    
}
