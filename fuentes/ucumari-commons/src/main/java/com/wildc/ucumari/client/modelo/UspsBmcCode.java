/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "usps_bmc_code")
@NamedQueries({
    @NamedQuery(name = "UspsBmcCode.findAll", query = "SELECT u FROM UspsBmcCode u")})
public class UspsBmcCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BMC_CODE")
    private String bmcCode;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "bmcCode")
    private List<UspsZipToBmcCode> uspsZipToBmcCodeList;

    public UspsBmcCode() {
    }

    public UspsBmcCode(String bmcCode) {
        this.bmcCode = bmcCode;
    }

    public String getBmcCode() {
        return bmcCode;
    }

    public void setBmcCode(String bmcCode) {
        this.bmcCode = bmcCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<UspsZipToBmcCode> getUspsZipToBmcCodeList() {
        return uspsZipToBmcCodeList;
    }

    public void setUspsZipToBmcCodeList(List<UspsZipToBmcCode> uspsZipToBmcCodeList) {
        this.uspsZipToBmcCodeList = uspsZipToBmcCodeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bmcCode != null ? bmcCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UspsBmcCode)) {
            return false;
        }
        UspsBmcCode other = (UspsBmcCode) object;
        if ((this.bmcCode == null && other.bmcCode != null) || (this.bmcCode != null && !this.bmcCode.equals(other.bmcCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UspsBmcCode[ bmcCode=" + bmcCode + " ]";
    }
    
}
