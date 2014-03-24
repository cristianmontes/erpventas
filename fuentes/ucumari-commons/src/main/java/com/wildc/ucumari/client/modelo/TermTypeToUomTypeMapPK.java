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
public class TermTypeToUomTypeMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
    @Basic(optional = false)
    @Column(name = "UOM_TYPE_ID")
    private String uomTypeId;

    public TermTypeToUomTypeMapPK() {
    }

    public TermTypeToUomTypeMapPK(String termTypeId, String uomTypeId) {
        this.termTypeId = termTypeId;
        this.uomTypeId = uomTypeId;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }

    public String getUomTypeId() {
        return uomTypeId;
    }

    public void setUomTypeId(String uomTypeId) {
        this.uomTypeId = uomTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        hash += (uomTypeId != null ? uomTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermTypeToUomTypeMapPK)) {
            return false;
        }
        TermTypeToUomTypeMapPK other = (TermTypeToUomTypeMapPK) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        if ((this.uomTypeId == null && other.uomTypeId != null) || (this.uomTypeId != null && !this.uomTypeId.equals(other.uomTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermTypeToUomTypeMapPK[ termTypeId=" + termTypeId + ", uomTypeId=" + uomTypeId + " ]";
    }
    
}
