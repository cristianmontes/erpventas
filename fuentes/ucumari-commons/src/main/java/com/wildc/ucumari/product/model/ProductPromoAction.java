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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.order.model.OrderAdjustmentType;
import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_action")
public class ProductPromoAction implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoActionPK productPromoActionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PARTY_ID")
    private String partyId;
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
    /*@JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromo productPromo;*/
    @JoinColumn(name = "ORDER_ADJUSTMENT_TYPE_ID", referencedColumnName = "ORDER_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private OrderAdjustmentType orderAdjustmentTypeId;
    @JoinColumn(name = "PRODUCT_PROMO_ACTION_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration productPromoActionEnumId;

    public ProductPromoAction() {
    }

    public ProductPromoAction(ProductPromoActionPK productPromoActionPK) {
        this.productPromoActionPK = productPromoActionPK;
    }

    public ProductPromoAction(String productPromoId, String productPromoRuleId, String productPromoActionSeqId) {
        this.productPromoActionPK = new ProductPromoActionPK(productPromoId, productPromoRuleId, productPromoActionSeqId);
    }

    public ProductPromoActionPK getProductPromoActionPK() {
        return productPromoActionPK;
    }

    public void setProductPromoActionPK(ProductPromoActionPK productPromoActionPK) {
        this.productPromoActionPK = productPromoActionPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
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
/*
    public ProductPromo getProductPromo() {
        return productPromo;
    }

    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }*/

    public OrderAdjustmentType getOrderAdjustmentTypeId() {
        return orderAdjustmentTypeId;
    }

    public void setOrderAdjustmentTypeId(OrderAdjustmentType orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
    }

    public Enumeration getProductPromoActionEnumId() {
        return productPromoActionEnumId;
    }

    public void setProductPromoActionEnumId(Enumeration productPromoActionEnumId) {
        this.productPromoActionEnumId = productPromoActionEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoActionPK != null ? productPromoActionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoAction)) {
            return false;
        }
        ProductPromoAction other = (ProductPromoAction) object;
        if ((this.productPromoActionPK == null && other.productPromoActionPK != null) || (this.productPromoActionPK != null && !this.productPromoActionPK.equals(other.productPromoActionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoAction[ productPromoActionPK=" + productPromoActionPK + " ]";
    }
    
}
