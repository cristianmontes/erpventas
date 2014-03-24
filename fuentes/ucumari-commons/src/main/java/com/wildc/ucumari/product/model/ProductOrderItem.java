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

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.order.model.OrderItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_order_item")
@NamedQueries({
    @NamedQuery(name = "ProductOrderItem.findAll", query = "SELECT p FROM ProductOrderItem p")})
public class ProductOrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductOrderItemPK productOrderItemPK;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumns({
        @JoinColumn(name = "ENGAGEMENT_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ENGAGEMENT_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem1;
    @JoinColumn(name = "ENGAGEMENT_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader1;

    public ProductOrderItem() {
    }

    public ProductOrderItem(ProductOrderItemPK productOrderItemPK) {
        this.productOrderItemPK = productOrderItemPK;
    }

    public ProductOrderItem(String orderId, String orderItemSeqId, String engagementId, String engagementItemSeqId) {
        this.productOrderItemPK = new ProductOrderItemPK(orderId, orderItemSeqId, engagementId, engagementItemSeqId);
    }

    public ProductOrderItemPK getProductOrderItemPK() {
        return productOrderItemPK;
    }

    public void setProductOrderItemPK(ProductOrderItemPK productOrderItemPK) {
        this.productOrderItemPK = productOrderItemPK;
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

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public OrderItem getOrderItem1() {
        return orderItem1;
    }

    public void setOrderItem1(OrderItem orderItem1) {
        this.orderItem1 = orderItem1;
    }

    public OrderHeader getOrderHeader1() {
        return orderHeader1;
    }

    public void setOrderHeader1(OrderHeader orderHeader1) {
        this.orderHeader1 = orderHeader1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productOrderItemPK != null ? productOrderItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOrderItem)) {
            return false;
        }
        ProductOrderItem other = (ProductOrderItem) object;
        if ((this.productOrderItemPK == null && other.productOrderItemPK != null) || (this.productOrderItemPK != null && !this.productOrderItemPK.equals(other.productOrderItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductOrderItem[ productOrderItemPK=" + productOrderItemPK + " ]";
    }
    
}
