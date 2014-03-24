/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "usps_zip_to_bmc_code")
@NamedQueries({
    @NamedQuery(name = "UspsZipToBmcCode.findAll", query = "SELECT u FROM UspsZipToBmcCode u")})
public class UspsZipToBmcCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ZIP3")
    private String zip3;
    @Column(name = "POSTAL_ZONE")
    private BigInteger postalZone;
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
    @JoinColumn(name = "BMC_CODE", referencedColumnName = "BMC_CODE")
    @ManyToOne
    private UspsBmcCode bmcCode;

    public UspsZipToBmcCode() {
    }

    public UspsZipToBmcCode(String zip3) {
        this.zip3 = zip3;
    }

    public String getZip3() {
        return zip3;
    }

    public void setZip3(String zip3) {
        this.zip3 = zip3;
    }

    public BigInteger getPostalZone() {
        return postalZone;
    }

    public void setPostalZone(BigInteger postalZone) {
        this.postalZone = postalZone;
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

    public UspsBmcCode getBmcCode() {
        return bmcCode;
    }

    public void setBmcCode(UspsBmcCode bmcCode) {
        this.bmcCode = bmcCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip3 != null ? zip3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UspsZipToBmcCode)) {
            return false;
        }
        UspsZipToBmcCode other = (UspsZipToBmcCode) object;
        if ((this.zip3 == null && other.zip3 != null) || (this.zip3 != null && !this.zip3.equals(other.zip3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UspsZipToBmcCode[ zip3=" + zip3 + " ]";
    }
    
}
