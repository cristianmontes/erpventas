/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductPriceAction;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item_price_info")
@NamedQueries({
    @NamedQuery(name = "OrderItemPriceInfo.findAll", query = "SELECT o FROM OrderItemPriceInfo o")})
public class OrderItemPriceInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_PRICE_INFO_ID")
    private String orderItemPriceInfoId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MODIFY_AMOUNT")
    private BigDecimal modifyAmount;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumns({
        @JoinColumn(name = "PRODUCT_PRICE_RULE_ID", referencedColumnName = "PRODUCT_PRICE_RULE_ID"),
        @JoinColumn(name = "PRODUCT_PRICE_ACTION_SEQ_ID", referencedColumnName = "PRODUCT_PRICE_ACTION_SEQ_ID")})
    @ManyToOne
    private ProductPriceAction productPriceAction;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;

    public OrderItemPriceInfo() {
    }

    public OrderItemPriceInfo(String orderItemPriceInfoId) {
        this.orderItemPriceInfoId = orderItemPriceInfoId;
    }

    public String getOrderItemPriceInfoId() {
        return orderItemPriceInfoId;
    }

    public void setOrderItemPriceInfoId(String orderItemPriceInfoId) {
        this.orderItemPriceInfoId = orderItemPriceInfoId;
    }

    public BigDecimal getModifyAmount() {
        return modifyAmount;
    }

    public void setModifyAmount(BigDecimal modifyAmount) {
        this.modifyAmount = modifyAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ProductPriceAction getProductPriceAction() {
        return productPriceAction;
    }

    public void setProductPriceAction(ProductPriceAction productPriceAction) {
        this.productPriceAction = productPriceAction;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemPriceInfoId != null ? orderItemPriceInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemPriceInfo)) {
            return false;
        }
        OrderItemPriceInfo other = (OrderItemPriceInfo) object;
        if ((this.orderItemPriceInfoId == null && other.orderItemPriceInfoId != null) || (this.orderItemPriceInfoId != null && !this.orderItemPriceInfoId.equals(other.orderItemPriceInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemPriceInfo[ orderItemPriceInfoId=" + orderItemPriceInfoId + " ]";
    }
    
}
