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
public class AgreementToItemMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TYPE_ID")
    private String agreementTypeId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_TYPE_ID")
    private String agreementItemTypeId;

    public AgreementToItemMapPK() {
    }

    public AgreementToItemMapPK(String agreementTypeId, String agreementItemTypeId) {
        this.agreementTypeId = agreementTypeId;
        this.agreementItemTypeId = agreementItemTypeId;
    }

    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    public String getAgreementItemTypeId() {
        return agreementItemTypeId;
    }

    public void setAgreementItemTypeId(String agreementItemTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTypeId != null ? agreementTypeId.hashCode() : 0);
        hash += (agreementItemTypeId != null ? agreementItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementToItemMapPK)) {
            return false;
        }
        AgreementToItemMapPK other = (AgreementToItemMapPK) object;
        if ((this.agreementTypeId == null && other.agreementTypeId != null) || (this.agreementTypeId != null && !this.agreementTypeId.equals(other.agreementTypeId))) {
            return false;
        }
        if ((this.agreementItemTypeId == null && other.agreementItemTypeId != null) || (this.agreementItemTypeId != null && !this.agreementItemTypeId.equals(other.agreementItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementToItemMapPK[ agreementTypeId=" + agreementTypeId + ", agreementItemTypeId=" + agreementItemTypeId + " ]";
    }
    
}
