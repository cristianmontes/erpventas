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
public class DataResourceTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_TYPE_ID")
    private String dataResourceTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public DataResourceTypeAttrPK() {
    }

    public DataResourceTypeAttrPK(String dataResourceTypeId, String attrName) {
        this.dataResourceTypeId = dataResourceTypeId;
        this.attrName = attrName;
    }

    public String getDataResourceTypeId() {
        return dataResourceTypeId;
    }

    public void setDataResourceTypeId(String dataResourceTypeId) {
        this.dataResourceTypeId = dataResourceTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceTypeId != null ? dataResourceTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResourceTypeAttrPK)) {
            return false;
        }
        DataResourceTypeAttrPK other = (DataResourceTypeAttrPK) object;
        if ((this.dataResourceTypeId == null && other.dataResourceTypeId != null) || (this.dataResourceTypeId != null && !this.dataResourceTypeId.equals(other.dataResourceTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResourceTypeAttrPK[ dataResourceTypeId=" + dataResourceTypeId + ", attrName=" + attrName + " ]";
    }
    
}
