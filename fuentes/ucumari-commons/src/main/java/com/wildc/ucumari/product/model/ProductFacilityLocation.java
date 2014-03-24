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

import com.wildc.ucumari.facility.model.FacilityLocation;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_facility_location")

public class ProductFacilityLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFacilityLocationPK productFacilityLocationPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MINIMUM_STOCK")
    private BigDecimal minimumStock;
    @Column(name = "MOVE_QUANTITY")
    private BigDecimal moveQuantity;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumns({
        @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "LOCATION_SEQ_ID", referencedColumnName = "LOCATION_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private FacilityLocation facilityLocation;

    public ProductFacilityLocation() {
    }

    public ProductFacilityLocation(ProductFacilityLocationPK productFacilityLocationPK) {
        this.productFacilityLocationPK = productFacilityLocationPK;
    }

    public ProductFacilityLocation(String productId, String facilityId, String locationSeqId) {
        this.productFacilityLocationPK = new ProductFacilityLocationPK(productId, facilityId, locationSeqId);
    }

    public ProductFacilityLocationPK getProductFacilityLocationPK() {
        return productFacilityLocationPK;
    }

    public void setProductFacilityLocationPK(ProductFacilityLocationPK productFacilityLocationPK) {
        this.productFacilityLocationPK = productFacilityLocationPK;
    }

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getMoveQuantity() {
        return moveQuantity;
    }

    public void setMoveQuantity(BigDecimal moveQuantity) {
        this.moveQuantity = moveQuantity;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFacilityLocationPK != null ? productFacilityLocationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFacilityLocation)) {
            return false;
        }
        ProductFacilityLocation other = (ProductFacilityLocation) object;
        if ((this.productFacilityLocationPK == null && other.productFacilityLocationPK != null) || (this.productFacilityLocationPK != null && !this.productFacilityLocationPK.equals(other.productFacilityLocationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFacilityLocation[ productFacilityLocationPK=" + productFacilityLocationPK + " ]";
    }
    
}
