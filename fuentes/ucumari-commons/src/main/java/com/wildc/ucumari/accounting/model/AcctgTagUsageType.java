/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "acctg_tag_usage_type")
@NamedQueries({
    @NamedQuery(name = "AcctgTagUsageType.findAll", query = "SELECT a FROM AcctgTagUsageType a")})
public class AcctgTagUsageType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCTG_TAG_USAGE_TYPE_ID")
    private String acctgTagUsageTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acctgTagUsageType")
    private List<AcctgTagEnumType> acctgTagEnumTypeList;

    public AcctgTagUsageType() {
    }

    public AcctgTagUsageType(String acctgTagUsageTypeId) {
        this.acctgTagUsageTypeId = acctgTagUsageTypeId;
    }

    public String getAcctgTagUsageTypeId() {
        return acctgTagUsageTypeId;
    }

    public void setAcctgTagUsageTypeId(String acctgTagUsageTypeId) {
        this.acctgTagUsageTypeId = acctgTagUsageTypeId;
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

    public List<AcctgTagEnumType> getAcctgTagEnumTypeList() {
        return acctgTagEnumTypeList;
    }

    public void setAcctgTagEnumTypeList(List<AcctgTagEnumType> acctgTagEnumTypeList) {
        this.acctgTagEnumTypeList = acctgTagEnumTypeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTagUsageTypeId != null ? acctgTagUsageTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTagUsageType)) {
            return false;
        }
        AcctgTagUsageType other = (AcctgTagUsageType) object;
        if ((this.acctgTagUsageTypeId == null && other.acctgTagUsageTypeId != null) || (this.acctgTagUsageTypeId != null && !this.acctgTagUsageTypeId.equals(other.acctgTagUsageTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTagUsageType[ acctgTagUsageTypeId=" + acctgTagUsageTypeId + " ]";
    }
    
}
