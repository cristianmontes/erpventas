/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AcctgTransTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_TYPE_ID")
    private String acctgTransTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public AcctgTransTypeAttrPK() {
    }

    public AcctgTransTypeAttrPK(String acctgTransTypeId, String attrName) {
        this.acctgTransTypeId = acctgTransTypeId;
        this.attrName = attrName;
    }

    public String getAcctgTransTypeId() {
        return acctgTransTypeId;
    }

    public void setAcctgTransTypeId(String acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
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
        hash += (acctgTransTypeId != null ? acctgTransTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransTypeAttrPK)) {
            return false;
        }
        AcctgTransTypeAttrPK other = (AcctgTransTypeAttrPK) object;
        if ((this.acctgTransTypeId == null && other.acctgTransTypeId != null) || (this.acctgTransTypeId != null && !this.acctgTransTypeId.equals(other.acctgTransTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransTypeAttrPK[ acctgTransTypeId=" + acctgTransTypeId + ", attrName=" + attrName + " ]";
    }
    
}
