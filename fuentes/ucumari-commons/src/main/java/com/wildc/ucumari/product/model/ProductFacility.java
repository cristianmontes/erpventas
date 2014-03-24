/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_facility")

public class ProductFacility implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFacilityPK productFacilityPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MINIMUM_STOCK")
    private BigDecimal minimumStock;
    @Column(name = "REORDER_QUANTITY")
    private BigDecimal reorderQuantity;
    @Column(name = "DAYS_TO_SHIP")
    private BigInteger daysToShip;
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
    @Column(name = "REPLENISH_FROM_FACILITY_ID")
    private String replenishFromFacilityId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "REPLENISH_METHOD_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration replenishMethodEnumId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;

    public ProductFacility() {
    }

    public ProductFacility(ProductFacilityPK productFacilityPK) {
        this.productFacilityPK = productFacilityPK;
    }

    public ProductFacility(String productId, String facilityId) {
        this.productFacilityPK = new ProductFacilityPK(productId, facilityId);
    }

    public ProductFacilityPK getProductFacilityPK() {
        return productFacilityPK;
    }

    public void setProductFacilityPK(ProductFacilityPK productFacilityPK) {
        this.productFacilityPK = productFacilityPK;
    }

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigInteger getDaysToShip() {
        return daysToShip;
    }

    public void setDaysToShip(BigInteger daysToShip) {
        this.daysToShip = daysToShip;
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

    public String getReplenishFromFacilityId() {
        return replenishFromFacilityId;
    }

    public void setReplenishFromFacilityId(String replenishFromFacilityId) {
        this.replenishFromFacilityId = replenishFromFacilityId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Enumeration getReplenishMethodEnumId() {
        return replenishMethodEnumId;
    }

    public void setReplenishMethodEnumId(Enumeration replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFacilityPK != null ? productFacilityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFacility)) {
            return false;
        }
        ProductFacility other = (ProductFacility) object;
        if ((this.productFacilityPK == null && other.productFacilityPK != null) || (this.productFacilityPK != null && !this.productFacilityPK.equals(other.productFacilityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFacility[ productFacilityPK=" + productFacilityPK + " ]";
    }
    
}
