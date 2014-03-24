/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "zip_sales_rule_lookup")
@NamedQueries({
    @NamedQuery(name = "ZipSalesRuleLookup.findAll", query = "SELECT z FROM ZipSalesRuleLookup z")})
public class ZipSalesRuleLookup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZipSalesRuleLookupPK zipSalesRuleLookupPK;
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "TAXABLE")
    private String taxable;
    @Column(name = "SHIP_COND")
    private String shipCond;
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

    public ZipSalesRuleLookup() {
    }

    public ZipSalesRuleLookup(ZipSalesRuleLookupPK zipSalesRuleLookupPK) {
        this.zipSalesRuleLookupPK = zipSalesRuleLookupPK;
    }

    public ZipSalesRuleLookup(String stateCode, String city, String county, Date fromDate) {
        this.zipSalesRuleLookupPK = new ZipSalesRuleLookupPK(stateCode, city, county, fromDate);
    }

    public ZipSalesRuleLookupPK getZipSalesRuleLookupPK() {
        return zipSalesRuleLookupPK;
    }

    public void setZipSalesRuleLookupPK(ZipSalesRuleLookupPK zipSalesRuleLookupPK) {
        this.zipSalesRuleLookupPK = zipSalesRuleLookupPK;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public String getShipCond() {
        return shipCond;
    }

    public void setShipCond(String shipCond) {
        this.shipCond = shipCond;
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
        hash += (zipSalesRuleLookupPK != null ? zipSalesRuleLookupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipSalesRuleLookup)) {
            return false;
        }
        ZipSalesRuleLookup other = (ZipSalesRuleLookup) object;
        if ((this.zipSalesRuleLookupPK == null && other.zipSalesRuleLookupPK != null) || (this.zipSalesRuleLookupPK != null && !this.zipSalesRuleLookupPK.equals(other.zipSalesRuleLookupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ZipSalesRuleLookup[ zipSalesRuleLookupPK=" + zipSalesRuleLookupPK + " ]";
    }
    
}
