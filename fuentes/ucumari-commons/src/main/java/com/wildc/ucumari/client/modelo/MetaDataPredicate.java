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
@Table(name = "meta_data_predicate")
@NamedQueries({
    @NamedQuery(name = "MetaDataPredicate.findAll", query = "SELECT m FROM MetaDataPredicate m")})
public class MetaDataPredicate implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "metaDataPredicate")
    private List<DataResourceMetaData> dataResourceMetaDataList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "META_DATA_PREDICATE_ID")
    private String metaDataPredicateId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "metaDataPredicate")
    private List<ContentMetaData> contentMetaDataList;

    public MetaDataPredicate() {
    }

    public MetaDataPredicate(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }

    public String getMetaDataPredicateId() {
        return metaDataPredicateId;
    }

    public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
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

    public List<ContentMetaData> getContentMetaDataList() {
        return contentMetaDataList;
    }

    public void setContentMetaDataList(List<ContentMetaData> contentMetaDataList) {
        this.contentMetaDataList = contentMetaDataList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (metaDataPredicateId != null ? metaDataPredicateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetaDataPredicate)) {
            return false;
        }
        MetaDataPredicate other = (MetaDataPredicate) object;
        if ((this.metaDataPredicateId == null && other.metaDataPredicateId != null) || (this.metaDataPredicateId != null && !this.metaDataPredicateId.equals(other.metaDataPredicateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.MetaDataPredicate[ metaDataPredicateId=" + metaDataPredicateId + " ]";
    }

    public List<DataResourceMetaData> getDataResourceMetaDataList() {
        return dataResourceMetaDataList;
    }

    public void setDataResourceMetaDataList(List<DataResourceMetaData> dataResourceMetaDataList) {
        this.dataResourceMetaDataList = dataResourceMetaDataList;
    }
    
}
