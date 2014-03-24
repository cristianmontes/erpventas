/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ReturnItemTypeMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_MAP_KEY")
    private String returnItemMapKey;
    @Basic(optional = false)
    @Column(name = "RETURN_HEADER_TYPE_ID")
    private String returnHeaderTypeId;

    public ReturnItemTypeMapPK() {
    }

    public ReturnItemTypeMapPK(String returnItemMapKey, String returnHeaderTypeId) {
        this.returnItemMapKey = returnItemMapKey;
        this.returnHeaderTypeId = returnHeaderTypeId;
    }

    public String getReturnItemMapKey() {
        return returnItemMapKey;
    }

    public void setReturnItemMapKey(String returnItemMapKey) {
        this.returnItemMapKey = returnItemMapKey;
    }

    public String getReturnHeaderTypeId() {
        return returnHeaderTypeId;
    }

    public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnItemMapKey != null ? returnItemMapKey.hashCode() : 0);
        hash += (returnHeaderTypeId != null ? returnHeaderTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemTypeMapPK)) {
            return false;
        }
        ReturnItemTypeMapPK other = (ReturnItemTypeMapPK) object;
        if ((this.returnItemMapKey == null && other.returnItemMapKey != null) || (this.returnItemMapKey != null && !this.returnItemMapKey.equals(other.returnItemMapKey))) {
            return false;
        }
        if ((this.returnHeaderTypeId == null && other.returnHeaderTypeId != null) || (this.returnHeaderTypeId != null && !this.returnHeaderTypeId.equals(other.returnHeaderTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemTypeMapPK[ returnItemMapKey=" + returnItemMapKey + ", returnHeaderTypeId=" + returnHeaderTypeId + " ]";
    }
    
}
