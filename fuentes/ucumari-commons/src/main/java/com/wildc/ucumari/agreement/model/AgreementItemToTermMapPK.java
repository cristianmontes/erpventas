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
public class AgreementItemToTermMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_TYPE_ID")
    private String agreementItemTypeId;
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;

    public AgreementItemToTermMapPK() {
    }

    public AgreementItemToTermMapPK(String agreementItemTypeId, String termTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
        this.termTypeId = termTypeId;
    }

    public String getAgreementItemTypeId() {
        return agreementItemTypeId;
    }

    public void setAgreementItemTypeId(String agreementItemTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementItemTypeId != null ? agreementItemTypeId.hashCode() : 0);
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementItemToTermMapPK)) {
            return false;
        }
        AgreementItemToTermMapPK other = (AgreementItemToTermMapPK) object;
        if ((this.agreementItemTypeId == null && other.agreementItemTypeId != null) || (this.agreementItemTypeId != null && !this.agreementItemTypeId.equals(other.agreementItemTypeId))) {
            return false;
        }
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementItemToTermMapPK[ agreementItemTypeId=" + agreementItemTypeId + ", termTypeId=" + termTypeId + " ]";
    }
    
}
