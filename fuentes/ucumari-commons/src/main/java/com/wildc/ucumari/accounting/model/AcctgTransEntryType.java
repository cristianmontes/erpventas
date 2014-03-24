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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "acctg_trans_entry_type")
@NamedQueries({
    @NamedQuery(name = "AcctgTransEntryType.findAll", query = "SELECT a FROM AcctgTransEntryType a")})
public class AcctgTransEntryType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ENTRY_TYPE_ID")
    private String acctgTransEntryTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<AcctgTransEntryType> acctgTransEntryTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ACCTG_TRANS_ENTRY_TYPE_ID")
    @ManyToOne
    private AcctgTransEntryType parentTypeId;
    @OneToMany(mappedBy = "acctgTransEntryTypeId")
    private List<AcctgTransEntry> acctgTransEntryList;

    public AcctgTransEntryType() {
    }

    public AcctgTransEntryType(String acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }

    public String getAcctgTransEntryTypeId() {
        return acctgTransEntryTypeId;
    }

    public void setAcctgTransEntryTypeId(String acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<AcctgTransEntryType> getAcctgTransEntryTypeList() {
        return acctgTransEntryTypeList;
    }

    public void setAcctgTransEntryTypeList(List<AcctgTransEntryType> acctgTransEntryTypeList) {
        this.acctgTransEntryTypeList = acctgTransEntryTypeList;
    }

    public AcctgTransEntryType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(AcctgTransEntryType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransEntryTypeId != null ? acctgTransEntryTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransEntryType)) {
            return false;
        }
        AcctgTransEntryType other = (AcctgTransEntryType) object;
        if ((this.acctgTransEntryTypeId == null && other.acctgTransEntryTypeId != null) || (this.acctgTransEntryTypeId != null && !this.acctgTransEntryTypeId.equals(other.acctgTransEntryTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransEntryType[ acctgTransEntryTypeId=" + acctgTransEntryTypeId + " ]";
    }
    
}
