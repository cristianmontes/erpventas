/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "uom_type")

public class UomType implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UOM_TYPE_ID")
    private String uomTypeId;
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
    private List<UomType> uomTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "UOM_TYPE_ID")
    @ManyToOne
    private UomType parentTypeId;
    

    public UomType() {
    }

    public UomType(String uomTypeId) {
        this.uomTypeId = uomTypeId;
    }

    public String getUomTypeId() {
        return uomTypeId;
    }

    public void setUomTypeId(String uomTypeId) {
        this.uomTypeId = uomTypeId;
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

    public List<UomType> getUomTypeList() {
        return uomTypeList;
    }

    public void setUomTypeList(List<UomType> uomTypeList) {
        this.uomTypeList = uomTypeList;
    }

    public UomType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(UomType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uomTypeId != null ? uomTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UomType)) {
            return false;
        }
        UomType other = (UomType) object;
        if ((this.uomTypeId == null && other.uomTypeId != null) || (this.uomTypeId != null && !this.uomTypeId.equals(other.uomTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UomType[ uomTypeId=" + uomTypeId + " ]";
    }
    
}
