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
@Table(name = "data_resource_purpose")
@NamedQueries({
    @NamedQuery(name = "DataResourcePurpose.findAll", query = "SELECT d FROM DataResourcePurpose d")})
public class DataResourcePurpose implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataResourcePurposePK dataResourcePurposePK;
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
    @JoinColumn(name = "CONTENT_PURPOSE_TYPE_ID", referencedColumnName = "CONTENT_PURPOSE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContentPurposeType contentPurposeType;
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataResource dataResource;

    public DataResourcePurpose() {
    }

    public DataResourcePurpose(DataResourcePurposePK dataResourcePurposePK) {
        this.dataResourcePurposePK = dataResourcePurposePK;
    }

    public DataResourcePurpose(String dataResourceId, String contentPurposeTypeId) {
        this.dataResourcePurposePK = new DataResourcePurposePK(dataResourceId, contentPurposeTypeId);
    }

    public DataResourcePurposePK getDataResourcePurposePK() {
        return dataResourcePurposePK;
    }

    public void setDataResourcePurposePK(DataResourcePurposePK dataResourcePurposePK) {
        this.dataResourcePurposePK = dataResourcePurposePK;
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

    public ContentPurposeType getContentPurposeType() {
        return contentPurposeType;
    }

    public void setContentPurposeType(ContentPurposeType contentPurposeType) {
        this.contentPurposeType = contentPurposeType;
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
        hash += (dataResourcePurposePK != null ? dataResourcePurposePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourcePurpose)) {
            return false;
        }
        DataResourcePurpose other = (DataResourcePurpose) object;
        if ((this.dataResourcePurposePK == null && other.dataResourcePurposePK != null) || (this.dataResourcePurposePK != null && !this.dataResourcePurposePK.equals(other.dataResourcePurposePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourcePurpose[ dataResourcePurposePK=" + dataResourcePurposePK + " ]";
    }
    
}
