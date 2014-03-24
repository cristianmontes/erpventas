/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class DataResourceMetaDataPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_ID")
    private String dataResourceId;
    @Basic(optional = false)
    @Column(name = "META_DATA_PREDICATE_ID")
    private String metaDataPredicateId;
    @Basic(optional = false)
    @Column(name = "META_DATA_VALUE")
    private String metaDataValue;

    public DataResourceMetaDataPK() {
    }

    public DataResourceMetaDataPK(String dataResourceId, String metaDataPredicateId, String metaDataValue) {
        this.dataResourceId = dataResourceId;
        this.metaDataPredicateId = metaDataPredicateId;
        this.metaDataValue = metaDataValue;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getMetaDataPredicateId() {
        return metaDataPredicateId;
    }

    public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }

    public String getMetaDataValue() {
        return metaDataValue;
    }

    public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceId != null ? dataResourceId.hashCode() : 0);
        hash += (metaDataPredicateId != null ? metaDataPredicateId.hashCode() : 0);
        hash += (metaDataValue != null ? metaDataValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceMetaDataPK)) {
            return false;
        }
        DataResourceMetaDataPK other = (DataResourceMetaDataPK) object;
        if ((this.dataResourceId == null && other.dataResourceId != null) || (this.dataResourceId != null && !this.dataResourceId.equals(other.dataResourceId))) {
            return false;
        }
        if ((this.metaDataPredicateId == null && other.metaDataPredicateId != null) || (this.metaDataPredicateId != null && !this.metaDataPredicateId.equals(other.metaDataPredicateId))) {
            return false;
        }
        if ((this.metaDataValue == null && other.metaDataValue != null) || (this.metaDataValue != null && !this.metaDataValue.equals(other.metaDataValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceMetaDataPK[ dataResourceId=" + dataResourceId + ", metaDataPredicateId=" + metaDataPredicateId + ", metaDataValue=" + metaDataValue + " ]";
    }

}
