/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "product_price_action")
public class ProductPriceAction implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPriceActionPK productPriceActionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "RATE_CODE")
    private String rateCode;
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
    @JoinColumn(name = "PRODUCT_PRICE_ACTION_TYPE_ID", referencedColumnName = "PRODUCT_PRICE_ACTION_TYPE_ID")
    @ManyToOne
    private ProductPriceActionType productPriceActionTypeId;
    @JoinColumn(name = "PRODUCT_PRICE_RULE_ID", referencedColumnName = "PRODUCT_PRICE_RULE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPriceRule productPriceRule;

    public ProductPriceAction() {
    }

    public ProductPriceAction(ProductPriceActionPK productPriceActionPK) {
        this.productPriceActionPK = productPriceActionPK;
    }

    public ProductPriceAction(String productPriceRuleId, String productPriceActionSeqId) {
        this.productPriceActionPK = new ProductPriceActionPK(productPriceRuleId, productPriceActionSeqId);
    }

    public ProductPriceActionPK getProductPriceActionPK() {
        return productPriceActionPK;
    }

    public void setProductPriceActionPK(ProductPriceActionPK productPriceActionPK) {
        this.productPriceActionPK = productPriceActionPK;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
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

    public ProductPriceActionType getProductPriceActionTypeId() {
        return productPriceActionTypeId;
    }

    public void setProductPriceActionTypeId(ProductPriceActionType productPriceActionTypeId) {
        this.productPriceActionTypeId = productPriceActionTypeId;
    }

    public ProductPriceRule getProductPriceRule() {
        return productPriceRule;
    }

    public void setProductPriceRule(ProductPriceRule productPriceRule) {
        this.productPriceRule = productPriceRule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceActionPK != null ? productPriceActionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceAction)) {
            return false;
        }
        ProductPriceAction other = (ProductPriceAction) object;
        if ((this.productPriceActionPK == null && other.productPriceActionPK != null) || (this.productPriceActionPK != null && !this.productPriceActionPK.equals(other.productPriceActionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceAction[ productPriceActionPK=" + productPriceActionPK + " ]";
    }
    
}
