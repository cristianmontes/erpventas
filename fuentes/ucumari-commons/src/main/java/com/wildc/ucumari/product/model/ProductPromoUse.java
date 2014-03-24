/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_use")
@NamedQueries({
    @NamedQuery(name = "ProductPromoUse.findAll", query = "SELECT p FROM ProductPromoUse p")})
public class ProductPromoUse implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoUsePK productPromoUsePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_DISCOUNT_AMOUNT")
    private BigDecimal totalDiscountAmount;
    @Column(name = "QUANTITY_LEFT_IN_ACTIONS")
    private BigDecimal quantityLeftInActions;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID")
    @ManyToOne
    private ProductPromo productPromoId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumn(name = "PRODUCT_PROMO_CODE_ID", referencedColumnName = "PRODUCT_PROMO_CODE_ID")
    @ManyToOne
    private ProductPromoCode productPromoCodeId;

    public ProductPromoUse() {
    }

    public ProductPromoUse(ProductPromoUsePK productPromoUsePK) {
        this.productPromoUsePK = productPromoUsePK;
    }

    public ProductPromoUse(String orderId, String promoSequenceId) {
        this.productPromoUsePK = new ProductPromoUsePK(orderId, promoSequenceId);
    }

    public ProductPromoUsePK getProductPromoUsePK() {
        return productPromoUsePK;
    }

    public void setProductPromoUsePK(ProductPromoUsePK productPromoUsePK) {
        this.productPromoUsePK = productPromoUsePK;
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public BigDecimal getQuantityLeftInActions() {
        return quantityLeftInActions;
    }

    public void setQuantityLeftInActions(BigDecimal quantityLeftInActions) {
        this.quantityLeftInActions = quantityLeftInActions;
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

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public ProductPromo getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(ProductPromo productPromoId) {
        this.productPromoId = productPromoId;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public ProductPromoCode getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(ProductPromoCode productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoUsePK != null ? productPromoUsePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoUse)) {
            return false;
        }
        ProductPromoUse other = (ProductPromoUse) object;
        if ((this.productPromoUsePK == null && other.productPromoUsePK != null) || (this.productPromoUsePK != null && !this.productPromoUsePK.equals(other.productPromoUsePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoUse[ productPromoUsePK=" + productPromoUsePK + " ]";
    }

}
