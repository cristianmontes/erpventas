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
public class DataResourcePurposePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_ID")
    private String dataResourceId;
    @Basic(optional = false)
    @Column(name = "CONTENT_PURPOSE_TYPE_ID")
    private String contentPurposeTypeId;

    public DataResourcePurposePK() {
    }

    public DataResourcePurposePK(String dataResourceId, String contentPurposeTypeId) {
        this.dataResourceId = dataResourceId;
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getContentPurposeTypeId() {
        return contentPurposeTypeId;
    }

    public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceId != null ? dataResourceId.hashCode() : 0);
        hash += (contentPurposeTypeId != null ? contentPurposeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourcePurposePK)) {
            return false;
        }
        DataResourcePurposePK other = (DataResourcePurposePK) object;
        if ((this.dataResourceId == null && other.dataResourceId != null) || (this.dataResourceId != null && !this.dataResourceId.equals(other.dataResourceId))) {
            return false;
        }
        if ((this.contentPurposeTypeId == null && other.contentPurposeTypeId != null) || (this.contentPurposeTypeId != null && !this.contentPurposeTypeId.equals(other.contentPurposeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourcePurposePK[ dataResourceId=" + dataResourceId + ", contentPurposeTypeId=" + contentPurposeTypeId + " ]";
    }
    
}
