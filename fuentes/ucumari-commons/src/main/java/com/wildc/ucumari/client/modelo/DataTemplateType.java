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
@Table(name = "data_template_type")
@NamedQueries({
    @NamedQuery(name = "DataTemplateType.findAll", query = "SELECT d FROM DataTemplateType d")})
public class DataTemplateType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_TEMPLATE_TYPE_ID")
    private String dataTemplateTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "EXTENSION")
    private String extension;
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
    @OneToMany(mappedBy = "dataTemplateTypeId")
    private List<DataResource> dataResourceList;

    public DataTemplateType() {
    }

    public DataTemplateType(String dataTemplateTypeId) {
        this.dataTemplateTypeId = dataTemplateTypeId;
    }

    public String getDataTemplateTypeId() {
        return dataTemplateTypeId;
    }

    public void setDataTemplateTypeId(String dataTemplateTypeId) {
        this.dataTemplateTypeId = dataTemplateTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataTemplateTypeId != null ? dataTemplateTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataTemplateType)) {
            return false;
        }
        DataTemplateType other = (DataTemplateType) object;
        if ((this.dataTemplateTypeId == null && other.dataTemplateTypeId != null) || (this.dataTemplateTypeId != null && !this.dataTemplateTypeId.equals(other.dataTemplateTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataTemplateType[ dataTemplateTypeId=" + dataTemplateTypeId + " ]";
    }
    
}
