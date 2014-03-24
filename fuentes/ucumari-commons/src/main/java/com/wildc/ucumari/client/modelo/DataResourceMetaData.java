/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_resource_meta_data")
@NamedQueries({
    @NamedQuery(name = "DataResourceMetaData.findAll", query = "SELECT d FROM DataResourceMetaData d")})
public class DataResourceMetaData implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataResourceMetaDataPK dataResourceMetaDataPK;
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
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @JoinColumn(name = "META_DATA_PREDICATE_ID", referencedColumnName = "META_DATA_PREDICATE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MetaDataPredicate metaDataPredicate;
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataResource dataResource;

    public DataResourceMetaData() {
    }

    public DataResourceMetaData(DataResourceMetaDataPK dataResourceMetaDataPK) {
        this.dataResourceMetaDataPK = dataResourceMetaDataPK;
    }

    public DataResourceMetaData(String dataResourceId, String metaDataPredicateId, String metaDataValue) {
        this.dataResourceMetaDataPK = new DataResourceMetaDataPK(dataResourceId, metaDataPredicateId, metaDataValue);
    }

    public DataResourceMetaDataPK getDataResourceMetaDataPK() {
        return dataResourceMetaDataPK;
    }

    public void setDataResourceMetaDataPK(DataResourceMetaDataPK dataResourceMetaDataPK) {
        this.dataResourceMetaDataPK = dataResourceMetaDataPK;
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

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public MetaDataPredicate getMetaDataPredicate() {
        return metaDataPredicate;
    }

    public void setMetaDataPredicate(MetaDataPredicate metaDataPredicate) {
        this.metaDataPredicate = metaDataPredicate;
    }

    public DataResource getDataResource() {
        return dataResource;
    }

    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceMetaDataPK != null ? dataResourceMetaDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceMetaData)) {
            return false;
        }
        DataResourceMetaData other = (DataResourceMetaData) object;
        if ((this.dataResourceMetaDataPK == null && other.dataResourceMetaDataPK != null) || (this.dataResourceMetaDataPK != null && !this.dataResourceMetaDataPK.equals(other.dataResourceMetaDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceMetaData[ dataResourceMetaDataPK=" + dataResourceMetaDataPK + " ]";
    }
    
}
