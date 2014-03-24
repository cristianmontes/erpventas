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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_meter")
@NamedQueries({
    @NamedQuery(name = "ProductMeter.findAll", query = "SELECT p FROM ProductMeter p")})
public class ProductMeter implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductMeterPK productMeterPK;
    @Column(name = "METER_NAME")
    private String meterName;
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
    @JoinColumn(name = "METER_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom meterUomId;
    @JoinColumn(name = "PRODUCT_METER_TYPE_ID", referencedColumnName = "PRODUCT_METER_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductMeterType productMeterType;

    public ProductMeter() {
    }

    public ProductMeter(ProductMeterPK productMeterPK) {
        this.productMeterPK = productMeterPK;
    }

    public ProductMeter(String productId, String productMeterTypeId) {
        this.productMeterPK = new ProductMeterPK(productId, productMeterTypeId);
    }

    public ProductMeterPK getProductMeterPK() {
        return productMeterPK;
    }

    public void setProductMeterPK(ProductMeterPK productMeterPK) {
        this.productMeterPK = productMeterPK;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
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

    public Uom getMeterUomId() {
        return meterUomId;
    }

    public void setMeterUomId(Uom meterUomId) {
        this.meterUomId = meterUomId;
    }

    public ProductMeterType getProductMeterType() {
        return productMeterType;
    }

    public void setProductMeterType(ProductMeterType productMeterType) {
        this.productMeterType = productMeterType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMeterPK != null ? productMeterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMeter)) {
            return false;
        }
        ProductMeter other = (ProductMeter) object;
        if ((this.productMeterPK == null && other.productMeterPK != null) || (this.productMeterPK != null && !this.productMeterPK.equals(other.productMeterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMeter[ productMeterPK=" + productMeterPK + " ]";
    }
    
}
