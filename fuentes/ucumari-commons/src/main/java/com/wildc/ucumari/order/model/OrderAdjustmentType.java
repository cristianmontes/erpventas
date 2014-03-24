/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "order_adjustment_type")
public class OrderAdjustmentType implements Serializable {
    /*@OneToMany(mappedBy = "quoteAdjustmentTypeId")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(mappedBy = "orderAdjustmentTypeId")
    private List<OrderAdjustment> orderAdjustmentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ADJUSTMENT_TYPE_ID")
    private String orderAdjustmentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "orderAdjustmentTypeId")
    private List<ProductPromoAction> productPromoActionList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<OrderAdjustmentType> orderAdjustmentTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ORDER_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private OrderAdjustmentType parentTypeId;

    public OrderAdjustmentType() {
    }

    public OrderAdjustmentType(String orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
    }

    public String getOrderAdjustmentTypeId() {
        return orderAdjustmentTypeId;
    }

    public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<ProductPromoAction> getProductPromoActionList() {
        return productPromoActionList;
    }

    public void setProductPromoActionList(List<ProductPromoAction> productPromoActionList) {
        this.productPromoActionList = productPromoActionList;
    }

    public List<OrderAdjustmentType> getOrderAdjustmentTypeList() {
        return orderAdjustmentTypeList;
    }

    public void setOrderAdjustmentTypeList(List<OrderAdjustmentType> orderAdjustmentTypeList) {
        this.orderAdjustmentTypeList = orderAdjustmentTypeList;
    }*/

    public OrderAdjustmentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(OrderAdjustmentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderAdjustmentTypeId != null ? orderAdjustmentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderAdjustmentType)) {
            return false;
        }
        OrderAdjustmentType other = (OrderAdjustmentType) object;
        if ((this.orderAdjustmentTypeId == null && other.orderAdjustmentTypeId != null) || (this.orderAdjustmentTypeId != null && !this.orderAdjustmentTypeId.equals(other.orderAdjustmentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderAdjustmentType[ orderAdjustmentTypeId=" + orderAdjustmentTypeId + " ]";
    }
/*
    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }*/
    
}
