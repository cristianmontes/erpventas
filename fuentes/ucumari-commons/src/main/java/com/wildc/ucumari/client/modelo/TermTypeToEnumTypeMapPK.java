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
public class TermTypeToEnumTypeMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
    @Basic(optional = false)
    @Column(name = "ENUM_TYPE_ID")
    private String enumTypeId;

    public TermTypeToEnumTypeMapPK() {
    }

    public TermTypeToEnumTypeMapPK(String termTypeId, String enumTypeId) {
        this.termTypeId = termTypeId;
        this.enumTypeId = enumTypeId;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }

    public String getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        hash += (enumTypeId != null ? enumTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermTypeToEnumTypeMapPK)) {
            return false;
        }
        TermTypeToEnumTypeMapPK other = (TermTypeToEnumTypeMapPK) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        if ((this.enumTypeId == null && other.enumTypeId != null) || (this.enumTypeId != null && !this.enumTypeId.equals(other.enumTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermTypeToEnumTypeMapPK[ termTypeId=" + termTypeId + ", enumTypeId=" + enumTypeId + " ]";
    }
    
}
