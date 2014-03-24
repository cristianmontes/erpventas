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
@Table(name = "zip_sales_tax_lookup")
@NamedQueries({
    @NamedQuery(name = "ZipSalesTaxLookup.findAll", query = "SELECT z FROM ZipSalesTaxLookup z")})
public class ZipSalesTaxLookup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZipSalesTaxLookupPK zipSalesTaxLookupPK;
    @Column(name = "COUNTY_FIPS")
    private String countyFips;
    @Column(name = "COUNTY_DEFAULT")
    private Character countyDefault;
    @Column(name = "GENERAL_DEFAULT")
    private Character generalDefault;
    @Column(name = "INSIDE_CITY")
    private Character insideCity;
    @Column(name = "GEO_CODE")
    private String geoCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STATE_SALES_TAX")
    private BigDecimal stateSalesTax;
    @Column(name = "CITY_SALES_TAX")
    private BigDecimal citySalesTax;
    @Column(name = "CITY_LOCAL_SALES_TAX")
    private BigDecimal cityLocalSalesTax;
    @Column(name = "COUNTY_SALES_TAX")
    private BigDecimal countySalesTax;
    @Column(name = "COUNTY_LOCAL_SALES_TAX")
    private BigDecimal countyLocalSalesTax;
    @Column(name = "COMBO_SALES_TAX")
    private BigDecimal comboSalesTax;
    @Column(name = "STATE_USE_TAX")
    private BigDecimal stateUseTax;
    @Column(name = "CITY_USE_TAX")
    private BigDecimal cityUseTax;
    @Column(name = "CITY_LOCAL_USE_TAX")
    private BigDecimal cityLocalUseTax;
    @Column(name = "COUNTY_USE_TAX")
    private BigDecimal countyUseTax;
    @Column(name = "COUNTY_LOCAL_USE_TAX")
    private BigDecimal countyLocalUseTax;
    @Column(name = "COMBO_USE_TAX")
    private BigDecimal comboUseTax;
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

    public ZipSalesTaxLookup() {
    }

    public ZipSalesTaxLookup(ZipSalesTaxLookupPK zipSalesTaxLookupPK) {
        this.zipSalesTaxLookupPK = zipSalesTaxLookupPK;
    }

    public ZipSalesTaxLookup(String zipCode, String stateCode, String city, String county, Date fromDate) {
        this.zipSalesTaxLookupPK = new ZipSalesTaxLookupPK(zipCode, stateCode, city, county, fromDate);
    }

    public ZipSalesTaxLookupPK getZipSalesTaxLookupPK() {
        return zipSalesTaxLookupPK;
    }

    public void setZipSalesTaxLookupPK(ZipSalesTaxLookupPK zipSalesTaxLookupPK) {
        this.zipSalesTaxLookupPK = zipSalesTaxLookupPK;
    }

    public String getCountyFips() {
        return countyFips;
    }

    public void setCountyFips(String countyFips) {
        this.countyFips = countyFips;
    }

    public Character getCountyDefault() {
        return countyDefault;
    }

    public void setCountyDefault(Character countyDefault) {
        this.countyDefault = countyDefault;
    }

    public Character getGeneralDefault() {
        return generalDefault;
    }

    public void setGeneralDefault(Character generalDefault) {
        this.generalDefault = generalDefault;
    }

    public Character getInsideCity() {
        return insideCity;
    }

    public void setInsideCity(Character insideCity) {
        this.insideCity = insideCity;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public BigDecimal getStateSalesTax() {
        return stateSalesTax;
    }

    public void setStateSalesTax(BigDecimal stateSalesTax) {
        this.stateSalesTax = stateSalesTax;
    }

    public BigDecimal getCitySalesTax() {
        return citySalesTax;
    }

    public void setCitySalesTax(BigDecimal citySalesTax) {
        this.citySalesTax = citySalesTax;
    }

    public BigDecimal getCityLocalSalesTax() {
        return cityLocalSalesTax;
    }

    public void setCityLocalSalesTax(BigDecimal cityLocalSalesTax) {
        this.cityLocalSalesTax = cityLocalSalesTax;
    }

    public BigDecimal getCountySalesTax() {
        return countySalesTax;
    }

    public void setCountySalesTax(BigDecimal countySalesTax) {
        this.countySalesTax = countySalesTax;
    }

    public BigDecimal getCountyLocalSalesTax() {
        return countyLocalSalesTax;
    }

    public void setCountyLocalSalesTax(BigDecimal countyLocalSalesTax) {
        this.countyLocalSalesTax = countyLocalSalesTax;
    }

    public BigDecimal getComboSalesTax() {
        return comboSalesTax;
    }

    public void setComboSalesTax(BigDecimal comboSalesTax) {
        this.comboSalesTax = comboSalesTax;
    }

    public BigDecimal getStateUseTax() {
        return stateUseTax;
    }

    public void setStateUseTax(BigDecimal stateUseTax) {
        this.stateUseTax = stateUseTax;
    }

    public BigDecimal getCityUseTax() {
        return cityUseTax;
    }

    public void setCityUseTax(BigDecimal cityUseTax) {
        this.cityUseTax = cityUseTax;
    }

    public BigDecimal getCityLocalUseTax() {
        return cityLocalUseTax;
    }

    public void setCityLocalUseTax(BigDecimal cityLocalUseTax) {
        this.cityLocalUseTax = cityLocalUseTax;
    }

    public BigDecimal getCountyUseTax() {
        return countyUseTax;
    }

    public void setCountyUseTax(BigDecimal countyUseTax) {
        this.countyUseTax = countyUseTax;
    }

    public BigDecimal getCountyLocalUseTax() {
        return countyLocalUseTax;
    }

    public void setCountyLocalUseTax(BigDecimal countyLocalUseTax) {
        this.countyLocalUseTax = countyLocalUseTax;
    }

    public BigDecimal getComboUseTax() {
        return comboUseTax;
    }

    public void setComboUseTax(BigDecimal comboUseTax) {
        this.comboUseTax = comboUseTax;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zipSalesTaxLookupPK != null ? zipSalesTaxLookupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipSalesTaxLookup)) {
            return false;
        }
        ZipSalesTaxLookup other = (ZipSalesTaxLookup) object;
        if ((this.zipSalesTaxLookupPK == null && other.zipSalesTaxLookupPK != null) || (this.zipSalesTaxLookupPK != null && !this.zipSalesTaxLookupPK.equals(other.zipSalesTaxLookupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ZipSalesTaxLookup[ zipSalesTaxLookupPK=" + zipSalesTaxLookupPK + " ]";
    }
    
}
