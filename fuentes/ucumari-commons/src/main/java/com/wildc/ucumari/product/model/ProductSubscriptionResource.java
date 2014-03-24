/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.client.modelo.SubscriptionResource;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_subscription_resource")
@NamedQueries({
    @NamedQuery(name = "ProductSubscriptionResource.findAll", query = "SELECT p FROM ProductSubscriptionResource p")})
public class ProductSubscriptionResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductSubscriptionResourcePK productSubscriptionResourcePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PURCHASE_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseFromDate;
    @Column(name = "PURCHASE_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseThruDate;
    @Column(name = "MAX_LIFE_TIME")
    private BigInteger maxLifeTime;
    @Column(name = "AVAILABLE_TIME")
    private BigInteger availableTime;
    @Column(name = "USE_COUNT_LIMIT")
    private BigInteger useCountLimit;
    @Column(name = "USE_TIME")
    private BigInteger useTime;
    @Column(name = "AUTOMATIC_EXTEND")
    private Character automaticExtend;
    @Column(name = "CANCL_AUTM_EXT_TIME")
    private BigInteger canclAutmExtTime;
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
    @JoinColumn(name = "USE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom useTimeUomId;
    @JoinColumn(name = "USE_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType useRoleTypeId;
    @JoinColumn(name = "SUBSCRIPTION_RESOURCE_ID", referencedColumnName = "SUBSCRIPTION_RESOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SubscriptionResource subscriptionResource;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "MAX_LIFE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom maxLifeTimeUomId;
    @JoinColumn(name = "CANCL_AUTM_EXT_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom canclAutmExtTimeUomId;
    @JoinColumn(name = "AVAILABLE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom availableTimeUomId;

    public ProductSubscriptionResource() {
    }

    public ProductSubscriptionResource(ProductSubscriptionResourcePK productSubscriptionResourcePK) {
        this.productSubscriptionResourcePK = productSubscriptionResourcePK;
    }

    public ProductSubscriptionResource(String productId, String subscriptionResourceId, Date fromDate) {
        this.productSubscriptionResourcePK = new ProductSubscriptionResourcePK(productId, subscriptionResourceId, fromDate);
    }

    public ProductSubscriptionResourcePK getProductSubscriptionResourcePK() {
        return productSubscriptionResourcePK;
    }

    public void setProductSubscriptionResourcePK(ProductSubscriptionResourcePK productSubscriptionResourcePK) {
        this.productSubscriptionResourcePK = productSubscriptionResourcePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigInteger getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(BigInteger maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public BigInteger getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(BigInteger availableTime) {
        this.availableTime = availableTime;
    }

    public BigInteger getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigInteger useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigInteger getUseTime() {
        return useTime;
    }

    public void setUseTime(BigInteger useTime) {
        this.useTime = useTime;
    }

    public Character getAutomaticExtend() {
        return automaticExtend;
    }

    public void setAutomaticExtend(Character automaticExtend) {
        this.automaticExtend = automaticExtend;
    }

    public BigInteger getCanclAutmExtTime() {
        return canclAutmExtTime;
    }

    public void setCanclAutmExtTime(BigInteger canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
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

    public Uom getUseTimeUomId() {
        return useTimeUomId;
    }

    public void setUseTimeUomId(Uom useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }

    public RoleType getUseRoleTypeId() {
        return useRoleTypeId;
    }

    public void setUseRoleTypeId(RoleType useRoleTypeId) {
        this.useRoleTypeId = useRoleTypeId;
    }

    public SubscriptionResource getSubscriptionResource() {
        return subscriptionResource;
    }

    public void setSubscriptionResource(SubscriptionResource subscriptionResource) {
        this.subscriptionResource = subscriptionResource;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Uom getMaxLifeTimeUomId() {
        return maxLifeTimeUomId;
    }

    public void setMaxLifeTimeUomId(Uom maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId;
    }

    public Uom getCanclAutmExtTimeUomId() {
        return canclAutmExtTimeUomId;
    }

    public void setCanclAutmExtTimeUomId(Uom canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId;
    }

    public Uom getAvailableTimeUomId() {
        return availableTimeUomId;
    }

    public void setAvailableTimeUomId(Uom availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSubscriptionResourcePK != null ? productSubscriptionResourcePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSubscriptionResource)) {
            return false;
        }
        ProductSubscriptionResource other = (ProductSubscriptionResource) object;
        if ((this.productSubscriptionResourcePK == null && other.productSubscriptionResourcePK != null) || (this.productSubscriptionResourcePK != null && !this.productSubscriptionResourcePK.equals(other.productSubscriptionResourcePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductSubscriptionResource[ productSubscriptionResourcePK=" + productSubscriptionResourcePK + " ]";
    }
    
}
