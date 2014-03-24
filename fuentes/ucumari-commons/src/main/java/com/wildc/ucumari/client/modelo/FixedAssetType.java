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
import javax.persistence.CascadeType;
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
@Table(name = "fixed_asset_type")
@NamedQueries({
    @NamedQuery(name = "FixedAssetType.findAll", query = "SELECT f FROM FixedAssetType f")})
public class FixedAssetType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fixedAssetType")
    private List<WorkEffortFixedAssetStd> workEffortFixedAssetStdList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIXED_ASSET_TYPE_ID")
    private String fixedAssetTypeId;
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
    @OneToMany(mappedBy = "fixedAssetTypeId")
    private List<FixedAsset> fixedAssetList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<FixedAssetType> fixedAssetTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "FIXED_ASSET_TYPE_ID")
    @ManyToOne
    private FixedAssetType parentTypeId;

    public FixedAssetType() {
    }

    public FixedAssetType(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
    }

    public String getFixedAssetTypeId() {
        return fixedAssetTypeId;
    }

    public void setFixedAssetTypeId(String fixedAssetTypeId) {
        this.fixedAssetTypeId = fixedAssetTypeId;
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

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public List<FixedAssetType> getFixedAssetTypeList() {
        return fixedAssetTypeList;
    }

    public void setFixedAssetTypeList(List<FixedAssetType> fixedAssetTypeList) {
        this.fixedAssetTypeList = fixedAssetTypeList;
    }

    public FixedAssetType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(FixedAssetType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedAssetTypeId != null ? fixedAssetTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedAssetType)) {
            return false;
        }
        FixedAssetType other = (FixedAssetType) object;
        if ((this.fixedAssetTypeId == null && other.fixedAssetTypeId != null) || (this.fixedAssetTypeId != null && !this.fixedAssetTypeId.equals(other.fixedAssetTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FixedAssetType[ fixedAssetTypeId=" + fixedAssetTypeId + " ]";
    }

    public List<WorkEffortFixedAssetStd> getWorkEffortFixedAssetStdList() {
        return workEffortFixedAssetStdList;
    }

    public void setWorkEffortFixedAssetStdList(List<WorkEffortFixedAssetStd> workEffortFixedAssetStdList) {
        this.workEffortFixedAssetStdList = workEffortFixedAssetStdList;
    }
    
}
