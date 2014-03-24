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
@Table(name = "enumeration_type")

public class EnumerationType implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENUM_TYPE_ID")
    private String enumTypeId;
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
    private List<EnumerationType> enumerationTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType parentTypeId;
    
    public EnumerationType() {
    }

    public EnumerationType(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }

    public String getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
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

    public List<EnumerationType> getEnumerationTypeList() {
        return enumerationTypeList;
    }

    public void setEnumerationTypeList(List<EnumerationType> enumerationTypeList) {
        this.enumerationTypeList = enumerationTypeList;
    }

    public EnumerationType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(EnumerationType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enumTypeId != null ? enumTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnumerationType)) {
            return false;
        }
        EnumerationType other = (EnumerationType) object;
        if ((this.enumTypeId == null && other.enumTypeId != null) || (this.enumTypeId != null && !this.enumTypeId.equals(other.enumTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EnumerationType[ enumTypeId=" + enumTypeId + " ]";
    }

    
}
