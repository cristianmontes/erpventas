/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ZipSalesTaxLookupPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Basic(optional = false)
    @Column(name = "STATE_CODE")
    private String stateCode;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "COUNTY")
    private String county;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ZipSalesTaxLookupPK() {
    }

    public ZipSalesTaxLookupPK(String zipCode, String stateCode, String city, String county, Date fromDate) {
        this.zipCode = zipCode;
        this.stateCode = stateCode;
        this.city = city;
        this.county = county;
        this.fromDate = fromDate;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zipCode != null ? zipCode.hashCode() : 0);
        hash += (stateCode != null ? stateCode.hashCode() : 0);
        hash += (city != null ? city.hashCode() : 0);
        hash += (county != null ? county.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipSalesTaxLookupPK)) {
            return false;
        }
        ZipSalesTaxLookupPK other = (ZipSalesTaxLookupPK) object;
        if ((this.zipCode == null && other.zipCode != null) || (this.zipCode != null && !this.zipCode.equals(other.zipCode))) {
            return false;
        }
        if ((this.stateCode == null && other.stateCode != null) || (this.stateCode != null && !this.stateCode.equals(other.stateCode))) {
            return false;
        }
        if ((this.city == null && other.city != null) || (this.city != null && !this.city.equals(other.city))) {
            return false;
        }
        if ((this.county == null && other.county != null) || (this.county != null && !this.county.equals(other.county))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ZipSalesTaxLookupPK[ zipCode=" + zipCode + ", stateCode=" + stateCode + ", city=" + city + ", county=" + county + ", fromDate=" + fromDate + " ]";
    }
    
}
