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
public class TermTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public TermTypeAttrPK() {
    }

    public TermTypeAttrPK(String termTypeId, String attrName) {
        this.termTypeId = termTypeId;
        this.attrName = attrName;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
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
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermTypeAttrPK)) {
            return false;
        }
        TermTypeAttrPK other = (TermTypeAttrPK) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermTypeAttrPK[ termTypeId=" + termTypeId + ", attrName=" + attrName + " ]";
    }
    
}
