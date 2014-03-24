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
public class ZipSalesRuleLookupPK implements Serializable {
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

    public ZipSalesRuleLookupPK() {
    }

    public ZipSalesRuleLookupPK(String stateCode, String city, String county, Date fromDate) {
        this.stateCode = stateCode;
        this.city = city;
        this.county = county;
        this.fromDate = fromDate;
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
        hash += (stateCode != null ? stateCode.hashCode() : 0);
        hash += (city != null ? city.hashCode() : 0);
        hash += (county != null ? county.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipSalesRuleLookupPK)) {
            return false;
        }
        ZipSalesRuleLookupPK other = (ZipSalesRuleLookupPK) object;
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
        return "com.wildc.ucumari.client.modelo.ZipSalesRuleLookupPK[ stateCode=" + stateCode + ", city=" + city + ", county=" + county + ", fromDate=" + fromDate + " ]";
    }
    
}
