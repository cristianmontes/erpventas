/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_price_cond")
@NamedQueries({
    @NamedQuery(name = "ProductPriceCond.findAll", query = "SELECT p FROM ProductPriceCond p")})
public class ProductPriceCond implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPriceCondPK productPriceCondPK;
    @Column(name = "COND_VALUE")
    private String condValue;
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
    @JoinColumn(name = "PRODUCT_PRICE_RULE_ID", referencedColumnName = "PRODUCT_PRICE_RULE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPriceRule productPriceRule;
    @JoinColumn(name = "OPERATOR_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration operatorEnumId;
    @JoinColumn(name = "INPUT_PARAM_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration inputParamEnumId;

    public ProductPriceCond() {
    }

    public ProductPriceCond(ProductPriceCondPK productPriceCondPK) {
        this.productPriceCondPK = productPriceCondPK;
    }

    public ProductPriceCond(String productPriceRuleId, String productPriceCondSeqId) {
        this.productPriceCondPK = new ProductPriceCondPK(productPriceRuleId, productPriceCondSeqId);
    }

    public ProductPriceCondPK getProductPriceCondPK() {
        return productPriceCondPK;
    }

    public void setProductPriceCondPK(ProductPriceCondPK productPriceCondPK) {
        this.productPriceCondPK = productPriceCondPK;
    }

    public String getCondValue() {
        return condValue;
    }

    public void setCondValue(String condValue) {
        this.condValue = condValue;
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

    public ProductPriceRule getProductPriceRule() {
        return productPriceRule;
    }

    public void setProductPriceRule(ProductPriceRule productPriceRule) {
        this.productPriceRule = productPriceRule;
    }

    public Enumeration getOperatorEnumId() {
        return operatorEnumId;
    }

    public void setOperatorEnumId(Enumeration operatorEnumId) {
        this.operatorEnumId = operatorEnumId;
    }

    public Enumeration getInputParamEnumId() {
        return inputParamEnumId;
    }

    public void setInputParamEnumId(Enumeration inputParamEnumId) {
        this.inputParamEnumId = inputParamEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceCondPK != null ? productPriceCondPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceCond)) {
            return false;
        }
        ProductPriceCond other = (ProductPriceCond) object;
        if ((this.productPriceCondPK == null && other.productPriceCondPK != null) || (this.productPriceCondPK != null && !this.productPriceCondPK.equals(other.productPriceCondPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceCond[ productPriceCondPK=" + productPriceCondPK + " ]";
    }
    
}
