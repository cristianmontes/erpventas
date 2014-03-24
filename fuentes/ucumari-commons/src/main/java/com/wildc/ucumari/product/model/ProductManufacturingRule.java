/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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
@Table(name = "product_manufacturing_rule")
@NamedQueries({
    @NamedQuery(name = "ProductManufacturingRule.findAll", query = "SELECT p FROM ProductManufacturingRule p")})
public class ProductManufacturingRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RULE_ID")
    private String ruleId;
    @Column(name = "RULE_SEQ_ID")
    private String ruleSeqId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "RULE_OPERATOR")
    private String ruleOperator;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumn(name = "PRODUCT_ID_IN_SUBST", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productIdInSubst;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_ID_IN", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productIdIn;
    @JoinColumn(name = "PRODUCT_ID_FOR", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productIdFor;
    @JoinColumn(name = "PRODUCT_FEATURE", referencedColumnName = "PRODUCT_FEATURE_ID")
    @ManyToOne
    private ProductFeature productFeature;

    public ProductManufacturingRule() {
    }

    public ProductManufacturingRule(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleSeqId() {
        return ruleSeqId;
    }

    public void setRuleSeqId(String ruleSeqId) {
        this.ruleSeqId = ruleSeqId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public String getRuleOperator() {
        return ruleOperator;
    }

    public void setRuleOperator(String ruleOperator) {
        this.ruleOperator = ruleOperator;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Product getProductIdInSubst() {
        return productIdInSubst;
    }

    public void setProductIdInSubst(Product productIdInSubst) {
        this.productIdInSubst = productIdInSubst;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Product getProductIdIn() {
        return productIdIn;
    }

    public void setProductIdIn(Product productIdIn) {
        this.productIdIn = productIdIn;
    }

    public Product getProductIdFor() {
        return productIdFor;
    }

    public void setProductIdFor(Product productIdFor) {
        this.productIdFor = productIdFor;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruleId != null ? ruleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductManufacturingRule)) {
            return false;
        }
        ProductManufacturingRule other = (ProductManufacturingRule) object;
        if ((this.ruleId == null && other.ruleId != null) || (this.ruleId != null && !this.ruleId.equals(other.ruleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductManufacturingRule[ ruleId=" + ruleId + " ]";
    }
    
}
