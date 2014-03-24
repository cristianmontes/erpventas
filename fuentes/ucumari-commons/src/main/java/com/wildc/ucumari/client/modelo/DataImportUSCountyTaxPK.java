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
public class DataImportUSCountyTaxPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COUNTY")
    private String county;
    @Basic(optional = false)
    @Column(name = "STATE_CODE")
    private String stateCode;

    public DataImportUSCountyTaxPK() {
    }

    public DataImportUSCountyTaxPK(String county, String stateCode) {
        this.county = county;
        this.stateCode = stateCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (county != null ? county.hashCode() : 0);
        hash += (stateCode != null ? stateCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportUSCountyTaxPK)) {
            return false;
        }
        DataImportUSCountyTaxPK other = (DataImportUSCountyTaxPK) object;
        if ((this.county == null && other.county != null) || (this.county != null && !this.county.equals(other.county))) {
            return false;
        }
        if ((this.stateCode == null && other.stateCode != null) || (this.stateCode != null && !this.stateCode.equals(other.stateCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportUSCountyTaxPK[ county=" + county + ", stateCode=" + stateCode + " ]";
    }
    
}
