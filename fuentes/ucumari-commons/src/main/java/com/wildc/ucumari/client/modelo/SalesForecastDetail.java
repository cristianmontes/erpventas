/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductCategory;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_forecast_detail")
@NamedQueries({
    @NamedQuery(name = "SalesForecastDetail.findAll", query = "SELECT s FROM SalesForecastDetail s")})
public class SalesForecastDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesForecastDetailPK salesForecastDetailPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
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
    @JoinColumn(name = "SALES_FORECAST_ID", referencedColumnName = "SALES_FORECAST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SalesForecast salesForecast;
    @JoinColumn(name = "QUANTITY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom quantityUomId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory productCategoryId;

    public SalesForecastDetail() {
    }

    public SalesForecastDetail(SalesForecastDetailPK salesForecastDetailPK) {
        this.salesForecastDetailPK = salesForecastDetailPK;
    }

    public SalesForecastDetail(String salesForecastId, String salesForecastDetailId) {
        this.salesForecastDetailPK = new SalesForecastDetailPK(salesForecastId, salesForecastDetailId);
    }

    public SalesForecastDetailPK getSalesForecastDetailPK() {
        return salesForecastDetailPK;
    }

    public void setSalesForecastDetailPK(SalesForecastDetailPK salesForecastDetailPK) {
        this.salesForecastDetailPK = salesForecastDetailPK;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public SalesForecast getSalesForecast() {
        return salesForecast;
    }

    public void setSalesForecast(SalesForecast salesForecast) {
        this.salesForecast = salesForecast;
    }

    public Uom getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(Uom quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(ProductCategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesForecastDetailPK != null ? salesForecastDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesForecastDetail)) {
            return false;
        }
        SalesForecastDetail other = (SalesForecastDetail) object;
        if ((this.salesForecastDetailPK == null && other.salesForecastDetailPK != null) || (this.salesForecastDetailPK != null && !this.salesForecastDetailPK.equals(other.salesForecastDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesForecastDetail[ salesForecastDetailPK=" + salesForecastDetailPK + " ]";
    }
    
}
