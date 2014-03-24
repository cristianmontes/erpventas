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
@Table(name = "data_resource_type_attr")
@NamedQueries({
    @NamedQuery(name = "DataResourceTypeAttr.findAll", query = "SELECT d FROM DataResourceTypeAttr d")})
public class DataResourceTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataResourceTypeAttrPK dataResourceTypeAttrPK;
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
    @JoinColumn(name = "DATA_RESOURCE_TYPE_ID", referencedColumnName = "DATA_RESOURCE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataResourceType dataResourceType;

    public DataResourceTypeAttr() {
    }

    public DataResourceTypeAttr(DataResourceTypeAttrPK dataResourceTypeAttrPK) {
        this.dataResourceTypeAttrPK = dataResourceTypeAttrPK;
    }

    public DataResourceTypeAttr(String dataResourceTypeId, String attrName) {
        this.dataResourceTypeAttrPK = new DataResourceTypeAttrPK(dataResourceTypeId, attrName);
    }

    public DataResourceTypeAttrPK getDataResourceTypeAttrPK() {
        return dataResourceTypeAttrPK;
    }

    public void setDataResourceTypeAttrPK(DataResourceTypeAttrPK dataResourceTypeAttrPK) {
        this.dataResourceTypeAttrPK = dataResourceTypeAttrPK;
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

    public DataResourceType getDataResourceType() {
        return dataResourceType;
    }

    public void setDataResourceType(DataResourceType dataResourceType) {
        this.dataResourceType = dataResourceType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceTypeAttrPK != null ? dataResourceTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceTypeAttr)) {
            return false;
        }
        DataResourceTypeAttr other = (DataResourceTypeAttr) object;
        if ((this.dataResourceTypeAttrPK == null && other.dataResourceTypeAttrPK != null) || (this.dataResourceTypeAttrPK != null && !this.dataResourceTypeAttrPK.equals(other.dataResourceTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceTypeAttr[ dataResourceTypeAttrPK=" + dataResourceTypeAttrPK + " ]";
    }
    
}
