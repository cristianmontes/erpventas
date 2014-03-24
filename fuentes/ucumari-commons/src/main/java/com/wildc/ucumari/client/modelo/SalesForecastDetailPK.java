/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SalesForecastDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALES_FORECAST_ID")
    private String salesForecastId;
    @Basic(optional = false)
    @Column(name = "SALES_FORECAST_DETAIL_ID")
    private String salesForecastDetailId;

    public SalesForecastDetailPK() {
    }

    public SalesForecastDetailPK(String salesForecastId, String salesForecastDetailId) {
        this.salesForecastId = salesForecastId;
        this.salesForecastDetailId = salesForecastDetailId;
    }

    public String getSalesForecastId() {
        return salesForecastId;
    }

    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }

    public String getSalesForecastDetailId() {
        return salesForecastDetailId;
    }

    public void setSalesForecastDetailId(String salesForecastDetailId) {
        this.salesForecastDetailId = salesForecastDetailId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesForecastId != null ? salesForecastId.hashCode() : 0);
        hash += (salesForecastDetailId != null ? salesForecastDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesForecastDetailPK)) {
            return false;
        }
        SalesForecastDetailPK other = (SalesForecastDetailPK) object;
        if ((this.salesForecastId == null && other.salesForecastId != null) || (this.salesForecastId != null && !this.salesForecastId.equals(other.salesForecastId))) {
            return false;
        }
        if ((this.salesForecastDetailId == null && other.salesForecastDetailId != null) || (this.salesForecastDetailId != null && !this.salesForecastDetailId.equals(other.salesForecastDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesForecastDetailPK[ salesForecastId=" + salesForecastId + ", salesForecastDetailId=" + salesForecastDetailId + " ]";
    }
    
}
