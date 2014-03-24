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
public class AddressMatchMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MAP_KEY")
    private String mapKey;
    @Basic(optional = false)
    @Column(name = "MAP_VALUE")
    private String mapValue;

    public AddressMatchMapPK() {
    }

    public AddressMatchMapPK(String mapKey, String mapValue) {
        this.mapKey = mapKey;
        this.mapValue = mapValue;
    }

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    public String getMapValue() {
        return mapValue;
    }

    public void setMapValue(String mapValue) {
        this.mapValue = mapValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mapKey != null ? mapKey.hashCode() : 0);
        hash += (mapValue != null ? mapValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressMatchMapPK)) {
            return false;
        }
        AddressMatchMapPK other = (AddressMatchMapPK) object;
        if ((this.mapKey == null && other.mapKey != null) || (this.mapKey != null && !this.mapKey.equals(other.mapKey))) {
            return false;
        }
        if ((this.mapValue == null && other.mapValue != null) || (this.mapValue != null && !this.mapValue.equals(other.mapValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AddressMatchMapPK[ mapKey=" + mapKey + ", mapValue=" + mapValue + " ]";
    }
    
}
