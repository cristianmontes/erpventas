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
public class AgreementTermAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TERM_ID")
    private String agreementTermId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public AgreementTermAttributePK() {
    }

    public AgreementTermAttributePK(String agreementTermId, String attrName) {
        this.agreementTermId = agreementTermId;
        this.attrName = attrName;
    }

    public String getAgreementTermId() {
        return agreementTermId;
    }

    public void setAgreementTermId(String agreementTermId) {
        this.agreementTermId = agreementTermId;
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
        hash += (agreementTermId != null ? agreementTermId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTermAttributePK)) {
            return false;
        }
        AgreementTermAttributePK other = (AgreementTermAttributePK) object;
        if ((this.agreementTermId == null && other.agreementTermId != null) || (this.agreementTermId != null && !this.agreementTermId.equals(other.agreementTermId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTermAttributePK[ agreementTermId=" + agreementTermId + ", attrName=" + attrName + " ]";
    }
    
}
