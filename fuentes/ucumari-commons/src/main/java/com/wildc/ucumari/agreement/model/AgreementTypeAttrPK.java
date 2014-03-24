/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TYPE_ID")
    private String agreementTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public AgreementTypeAttrPK() {
    }

    public AgreementTypeAttrPK(String agreementTypeId, String attrName) {
        this.agreementTypeId = agreementTypeId;
        this.attrName = attrName;
    }

    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
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
        hash += (agreementTypeId != null ? agreementTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTypeAttrPK)) {
            return false;
        }
        AgreementTypeAttrPK other = (AgreementTypeAttrPK) object;
        if ((this.agreementTypeId == null && other.agreementTypeId != null) || (this.agreementTypeId != null && !this.agreementTypeId.equals(other.agreementTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTypeAttrPK[ agreementTypeId=" + agreementTypeId + ", attrName=" + attrName + " ]";
    }
    
}
