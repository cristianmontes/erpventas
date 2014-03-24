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
@Table(name = "data_resource_attribute")
@NamedQueries({
    @NamedQuery(name = "DataResourceAttribute.findAll", query = "SELECT d FROM DataResourceAttribute d")})
public class DataResourceAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataResourceAttributePK dataResourceAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataResource dataResource;

    public DataResourceAttribute() {
    }

    public DataResourceAttribute(DataResourceAttributePK dataResourceAttributePK) {
        this.dataResourceAttributePK = dataResourceAttributePK;
    }

    public DataResourceAttribute(String dataResourceId, String attrName) {
        this.dataResourceAttributePK = new DataResourceAttributePK(dataResourceId, attrName);
    }

    public DataResourceAttributePK getDataResourceAttributePK() {
        return dataResourceAttributePK;
    }

    public void setDataResourceAttributePK(DataResourceAttributePK dataResourceAttributePK) {
        this.dataResourceAttributePK = dataResourceAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public DataResource getDataResource() {
        return dataResource;
    }

    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceAttributePK != null ? dataResourceAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceAttribute)) {
            return false;
        }
        DataResourceAttribute other = (DataResourceAttribute) object;
        if ((this.dataResourceAttributePK == null && other.dataResourceAttributePK != null) || (this.dataResourceAttributePK != null && !this.dataResourceAttributePK.equals(other.dataResourceAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceAttribute[ dataResourceAttributePK=" + dataResourceAttributePK + " ]";
    }
    
}
