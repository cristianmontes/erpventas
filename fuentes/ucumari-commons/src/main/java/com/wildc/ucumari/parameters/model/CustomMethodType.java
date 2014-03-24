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
@Table(name = "custom_method_type")

public class CustomMethodType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOM_METHOD_TYPE_ID")
    private String customMethodTypeId;
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
    private List<CustomMethodType> customMethodTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "CUSTOM_METHOD_TYPE_ID")
    @ManyToOne
    private CustomMethodType parentTypeId;

    public CustomMethodType() {
    }

    public CustomMethodType(String customMethodTypeId) {
        this.customMethodTypeId = customMethodTypeId;
    }

    public String getCustomMethodTypeId() {
        return customMethodTypeId;
    }

    public void setCustomMethodTypeId(String customMethodTypeId) {
        this.customMethodTypeId = customMethodTypeId;
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

    public List<CustomMethodType> getCustomMethodTypeList() {
        return customMethodTypeList;
    }

    public void setCustomMethodTypeList(List<CustomMethodType> customMethodTypeList) {
        this.customMethodTypeList = customMethodTypeList;
    }

    public CustomMethodType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(CustomMethodType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customMethodTypeId != null ? customMethodTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomMethodType)) {
            return false;
        }
        CustomMethodType other = (CustomMethodType) object;
        if ((this.customMethodTypeId == null && other.customMethodTypeId != null) || (this.customMethodTypeId != null && !this.customMethodTypeId.equals(other.customMethodTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustomMethodType[ customMethodTypeId=" + customMethodTypeId + " ]";
    }
    
}
