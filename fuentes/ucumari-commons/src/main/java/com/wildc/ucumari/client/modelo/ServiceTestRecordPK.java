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
public class ServiceTestRecordPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "KEY1")
    private String key1;
    @Basic(optional = false)
    @Column(name = "KEY2")
    private String key2;

    public ServiceTestRecordPK() {
    }

    public ServiceTestRecordPK(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (key1 != null ? key1.hashCode() : 0);
        hash += (key2 != null ? key2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceTestRecordPK)) {
            return false;
        }
        ServiceTestRecordPK other = (ServiceTestRecordPK) object;
        if ((this.key1 == null && other.key1 != null) || (this.key1 != null && !this.key1.equals(other.key1))) {
            return false;
        }
        if ((this.key2 == null && other.key2 != null) || (this.key2 != null && !this.key2.equals(other.key2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ServiceTestRecordPK[ key1=" + key1 + ", key2=" + key2 + " ]";
    }
    
}
