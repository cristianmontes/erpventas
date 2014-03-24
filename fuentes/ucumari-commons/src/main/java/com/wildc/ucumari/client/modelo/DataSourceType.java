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
@Table(name = "data_source_type")
@NamedQueries({
    @NamedQuery(name = "DataSourceType.findAll", query = "SELECT d FROM DataSourceType d")})
public class DataSourceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_SOURCE_TYPE_ID")
    private String dataSourceTypeId;
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
    @OneToMany(mappedBy = "dataSourceTypeId")
    private List<DataSource> dataSourceList;

    public DataSourceType() {
    }

    public DataSourceType(String dataSourceTypeId) {
        this.dataSourceTypeId = dataSourceTypeId;
    }

    public String getDataSourceTypeId() {
        return dataSourceTypeId;
    }

    public void setDataSourceTypeId(String dataSourceTypeId) {
        this.dataSourceTypeId = dataSourceTypeId;
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

    public List<DataSource> getDataSourceList() {
        return dataSourceList;
    }

    public void setDataSourceList(List<DataSource> dataSourceList) {
        this.dataSourceList = dataSourceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataSourceTypeId != null ? dataSourceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataSourceType)) {
            return false;
        }
        DataSourceType other = (DataSourceType) object;
        if ((this.dataSourceTypeId == null && other.dataSourceTypeId != null) || (this.dataSourceTypeId != null && !this.dataSourceTypeId.equals(other.dataSourceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataSourceType[ dataSourceTypeId=" + dataSourceTypeId + " ]";
    }
    
}
