/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductStore;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "sales_forecast_item")
@NamedQueries({
    @NamedQuery(name = "SalesForecastItem.findAll", query = "SELECT s FROM SalesForecastItem s")})
public class SalesForecastItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_FORECAST_ITEM_ID")
    private String salesForecastItemId;
    @Column(name = "FORECAST_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date forecastDatetime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FORECAST_QUANTITY")
    private BigDecimal forecastQuantity;
    @Column(name = "FORECAST_UNIT_PRICE")
    private BigDecimal forecastUnitPrice;
    @Column(name = "FORECAST_TOTAL_AMOUNT")
    private BigDecimal forecastTotalAmount;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @JoinColumn(name = "SALES_FORECAST_ID", referencedColumnName = "SALES_FORECAST_ID")
    @ManyToOne
    private SalesForecast salesForecastId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;

    public SalesForecastItem() {
    }

    public SalesForecastItem(String salesForecastItemId) {
        this.salesForecastItemId = salesForecastItemId;
    }

    public String getSalesForecastItemId() {
        return salesForecastItemId;
    }

    public void setSalesForecastItemId(String salesForecastItemId) {
        this.salesForecastItemId = salesForecastItemId;
    }

    public Date getForecastDatetime() {
        return forecastDatetime;
    }

    public void setForecastDatetime(Date forecastDatetime) {
        this.forecastDatetime = forecastDatetime;
    }

    public BigDecimal getForecastQuantity() {
        return forecastQuantity;
    }

    public void setForecastQuantity(BigDecimal forecastQuantity) {
        this.forecastQuantity = forecastQuantity;
    }

    public BigDecimal getForecastUnitPrice() {
        return forecastUnitPrice;
    }

    public void setForecastUnitPrice(BigDecimal forecastUnitPrice) {
        this.forecastUnitPrice = forecastUnitPrice;
    }

    public BigDecimal getForecastTotalAmount() {
        return forecastTotalAmount;
    }

    public void setForecastTotalAmount(BigDecimal forecastTotalAmount) {
        this.forecastTotalAmount = forecastTotalAmount;
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

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public SalesForecast getSalesForecastId() {
        return salesForecastId;
    }

    public void setSalesForecastId(SalesForecast salesForecastId) {
        this.salesForecastId = salesForecastId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesForecastItemId != null ? salesForecastItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesForecastItem)) {
            return false;
        }
        SalesForecastItem other = (SalesForecastItem) object;
        if ((this.salesForecastItemId == null && other.salesForecastItemId != null) || (this.salesForecastItemId != null && !this.salesForecastItemId.equals(other.salesForecastItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesForecastItem[ salesForecastItemId=" + salesForecastItemId + " ]";
    }
    
}
