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
import javax.persistence.JoinColumns;
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
@Table(name = "product_promo_cond")
@NamedQueries({
    @NamedQuery(name = "ProductPromoCond.findAll", query = "SELECT p FROM ProductPromoCond p")})
public class ProductPromoCond implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoCondPK productPromoCondPK;
    @Column(name = "COND_VALUE")
    private String condValue;
    @Column(name = "OTHER_VALUE")
    private String otherValue;
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
    @JoinColumns({
        @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PRODUCT_PROMO_RULE_ID", referencedColumnName = "PRODUCT_PROMO_RULE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductPromoRule productPromoRule;
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromo productPromo;
    @JoinColumn(name = "OPERATOR_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration operatorEnumId;
    @JoinColumn(name = "INPUT_PARAM_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration inputParamEnumId;

    public ProductPromoCond() {
    }

    public ProductPromoCond(ProductPromoCondPK productPromoCondPK) {
        this.productPromoCondPK = productPromoCondPK;
    }

    public ProductPromoCond(String productPromoId, String productPromoRuleId, String productPromoCondSeqId) {
        this.productPromoCondPK = new ProductPromoCondPK(productPromoId, productPromoRuleId, productPromoCondSeqId);
    }

    public ProductPromoCondPK getProductPromoCondPK() {
        return productPromoCondPK;
    }

    public void setProductPromoCondPK(ProductPromoCondPK productPromoCondPK) {
        this.productPromoCondPK = productPromoCondPK;
    }

    public String getCondValue() {
        return condValue;
    }

    public void setCondValue(String condValue) {
        this.condValue = condValue;
    }

    public String getOtherValue() {
        return otherValue;
    }

    public void setOtherValue(String otherValue) {
        this.otherValue = otherValue;
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

    public ProductPromoRule getProductPromoRule() {
        return productPromoRule;
    }

    public void setProductPromoRule(ProductPromoRule productPromoRule) {
        this.productPromoRule = productPromoRule;
    }

    public ProductPromo getProductPromo() {
        return productPromo;
    }

    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
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
        hash += (productPromoCondPK != null ? productPromoCondPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCond)) {
            return false;
        }
        ProductPromoCond other = (ProductPromoCond) object;
        if ((this.productPromoCondPK == null && other.productPromoCondPK != null) || (this.productPromoCondPK != null && !this.productPromoCondPK.equals(other.productPromoCondPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCond[ productPromoCondPK=" + productPromoCondPK + " ]";
    }
    
}
