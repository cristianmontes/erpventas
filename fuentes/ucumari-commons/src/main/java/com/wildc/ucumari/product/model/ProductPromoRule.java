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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_rule")
public class ProductPromoRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoRulePK productPromoRulePK;
    @Column(name = "RULE_NAME")
    private String ruleName;
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
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromo productPromo;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromoRule")
    private List<ProductPromoAction> productPromoActionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPromoRule")
    private List<ProductPromoCond> productPromoCondList;*/

    public ProductPromoRule() {
    }

    public ProductPromoRule(ProductPromoRulePK productPromoRulePK) {
        this.productPromoRulePK = productPromoRulePK;
    }

    public ProductPromoRule(String productPromoId, String productPromoRuleId) {
        this.productPromoRulePK = new ProductPromoRulePK(productPromoId, productPromoRuleId);
    }

    public ProductPromoRulePK getProductPromoRulePK() {
        return productPromoRulePK;
    }

    public void setProductPromoRulePK(ProductPromoRulePK productPromoRulePK) {
        this.productPromoRulePK = productPromoRulePK;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
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

    public ProductPromo getProductPromo() {
        return productPromo;
    }

    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }
/*
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
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoRulePK != null ? productPromoRulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoRule)) {
            return false;
        }
        ProductPromoRule other = (ProductPromoRule) object;
        if ((this.productPromoRulePK == null && other.productPromoRulePK != null) || (this.productPromoRulePK != null && !this.productPromoRulePK.equals(other.productPromoRulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoRule[ productPromoRulePK=" + productPromoRulePK + " ]";
    }
    
}
