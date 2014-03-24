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
@Table(name = "fin_account_trans_type")
@NamedQueries({
    @NamedQuery(name = "FinAccountTransType.findAll", query = "SELECT f FROM FinAccountTransType f")})
public class FinAccountTransType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIN_ACCOUNT_TRANS_TYPE_ID")
    private String finAccountTransTypeId;
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
    @OneToMany(mappedBy = "finAccountTransTypeId")
    private List<FinAccountTrans> finAccountTransList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<FinAccountTransType> finAccountTransTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "FIN_ACCOUNT_TRANS_TYPE_ID")
    @ManyToOne
    private FinAccountTransType parentTypeId;

    public FinAccountTransType() {
    }

    public FinAccountTransType(String finAccountTransTypeId) {
        this.finAccountTransTypeId = finAccountTransTypeId;
    }

    public String getFinAccountTransTypeId() {
        return finAccountTransTypeId;
    }

    public void setFinAccountTransTypeId(String finAccountTransTypeId) {
        this.finAccountTransTypeId = finAccountTransTypeId;
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

    public List<FinAccountTrans> getFinAccountTransList() {
        return finAccountTransList;
    }

    public void setFinAccountTransList(List<FinAccountTrans> finAccountTransList) {
        this.finAccountTransList = finAccountTransList;
    }

    public List<FinAccountTransType> getFinAccountTransTypeList() {
        return finAccountTransTypeList;
    }

    public void setFinAccountTransTypeList(List<FinAccountTransType> finAccountTransTypeList) {
        this.finAccountTransTypeList = finAccountTransTypeList;
    }

    public FinAccountTransType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(FinAccountTransType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (finAccountTransTypeId != null ? finAccountTransTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinAccountTransType)) {
            return false;
        }
        FinAccountTransType other = (FinAccountTransType) object;
        if ((this.finAccountTransTypeId == null && other.finAccountTransTypeId != null) || (this.finAccountTransTypeId != null && !this.finAccountTransTypeId.equals(other.finAccountTransTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FinAccountTransType[ finAccountTransTypeId=" + finAccountTransTypeId + " ]";
    }
    
}
