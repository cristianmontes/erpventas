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
@Table(name = "data_resource_type")
@NamedQueries({
    @NamedQuery(name = "DataResourceType.findAll", query = "SELECT d FROM DataResourceType d")})
public class DataResourceType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResourceType")
    private List<DataResourceTypeAttr> dataResourceTypeAttrList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_TYPE_ID")
    private String dataResourceTypeId;
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
    @OneToMany(mappedBy = "dataResourceTypeId")
    private List<DataResource> dataResourceList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<DataResourceType> dataResourceTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "DATA_RESOURCE_TYPE_ID")
    @ManyToOne
    private DataResourceType parentTypeId;

    public DataResourceType() {
    }

    public DataResourceType(String dataResourceTypeId) {
        this.dataResourceTypeId = dataResourceTypeId;
    }

    public String getDataResourceTypeId() {
        return dataResourceTypeId;
    }

    public void setDataResourceTypeId(String dataResourceTypeId) {
        this.dataResourceTypeId = dataResourceTypeId;
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

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public List<DataResourceType> getDataResourceTypeList() {
        return dataResourceTypeList;
    }

    public void setDataResourceTypeList(List<DataResourceType> dataResourceTypeList) {
        this.dataResourceTypeList = dataResourceTypeList;
    }

    public DataResourceType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(DataResourceType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceTypeId != null ? dataResourceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceType)) {
            return false;
        }
        DataResourceType other = (DataResourceType) object;
        if ((this.dataResourceTypeId == null && other.dataResourceTypeId != null) || (this.dataResourceTypeId != null && !this.dataResourceTypeId.equals(other.dataResourceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceType[ dataResourceTypeId=" + dataResourceTypeId + " ]";
    }

    public List<DataResourceTypeAttr> getDataResourceTypeAttrList() {
        return dataResourceTypeAttrList;
    }

    public void setDataResourceTypeAttrList(List<DataResourceTypeAttr> dataResourceTypeAttrList) {
        this.dataResourceTypeAttrList = dataResourceTypeAttrList;
    }
    
}
