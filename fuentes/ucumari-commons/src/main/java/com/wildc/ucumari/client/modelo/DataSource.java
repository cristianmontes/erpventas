/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.GeoPoint;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyDataSource;
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
@Table(name = "data_source")
@NamedQueries({
    @NamedQuery(name = "DataSource.findAll", query = "SELECT d FROM DataSource d")})
public class DataSource implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataSource")
    private List<PartyDataSource> partyDataSourceList;
    @OneToMany(mappedBy = "dataSourceId")
    private List<DataResourceMetaData> dataResourceMetaDataList;
    @OneToMany(mappedBy = "dataSourceId")
    private List<Content> contentList;
    @OneToMany(mappedBy = "dataSourceId")
    private List<ContentMetaData> contentMetaDataList;
    @OneToMany(mappedBy = "dataSourceId")
    private List<ContentAssoc> contentAssocList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_SOURCE_ID")
    private String dataSourceId;
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
    @OneToMany(mappedBy = "dataSourceId")
    private List<Party> partyList;
    @OneToMany(mappedBy = "dataSourceId")
    private List<DataResource> dataResourceList;
    @JoinColumn(name = "DATA_SOURCE_TYPE_ID", referencedColumnName = "DATA_SOURCE_TYPE_ID")
    @ManyToOne
    private DataSourceType dataSourceTypeId;
    @OneToMany(mappedBy = "dataSourceId")
    private List<GeoPoint> geoPointList;

    public DataSource() {
    }

    public DataSource(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
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

    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public DataSourceType getDataSourceTypeId() {
        return dataSourceTypeId;
    }

    public void setDataSourceTypeId(DataSourceType dataSourceTypeId) {
        this.dataSourceTypeId = dataSourceTypeId;
    }

    public List<GeoPoint> getGeoPointList() {
        return geoPointList;
    }

    public void setGeoPointList(List<GeoPoint> geoPointList) {
        this.geoPointList = geoPointList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataSourceId != null ? dataSourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataSource)) {
            return false;
        }
        DataSource other = (DataSource) object;
        if ((this.dataSourceId == null && other.dataSourceId != null) || (this.dataSourceId != null && !this.dataSourceId.equals(other.dataSourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataSource[ dataSourceId=" + dataSourceId + " ]";
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<ContentMetaData> getContentMetaDataList() {
        return contentMetaDataList;
    }

    public void setContentMetaDataList(List<ContentMetaData> contentMetaDataList) {
        this.contentMetaDataList = contentMetaDataList;
    }

    public List<ContentAssoc> getContentAssocList() {
        return contentAssocList;
    }

    public void setContentAssocList(List<ContentAssoc> contentAssocList) {
        this.contentAssocList = contentAssocList;
    }

    public List<DataResourceMetaData> getDataResourceMetaDataList() {
        return dataResourceMetaDataList;
    }

    public void setDataResourceMetaDataList(List<DataResourceMetaData> dataResourceMetaDataList) {
        this.dataResourceMetaDataList = dataResourceMetaDataList;
    }

    public List<PartyDataSource> getPartyDataSourceList() {
        return partyDataSourceList;
    }

    public void setPartyDataSourceList(List<PartyDataSource> partyDataSourceList) {
        this.partyDataSourceList = partyDataSourceList;
    }
    
}
