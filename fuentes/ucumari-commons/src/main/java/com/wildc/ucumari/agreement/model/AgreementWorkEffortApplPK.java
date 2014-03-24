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
public class AgreementWorkEffortApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_SEQ_ID")
    private String agreementItemSeqId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;

    public AgreementWorkEffortApplPK() {
    }

    public AgreementWorkEffortApplPK(String agreementId, String agreementItemSeqId, String workEffortId) {
        this.agreementId = agreementId;
        this.agreementItemSeqId = agreementItemSeqId;
        this.workEffortId = workEffortId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        hash += (agreementItemSeqId != null ? agreementItemSeqId.hashCode() : 0);
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementWorkEffortApplPK)) {
            return false;
        }
        AgreementWorkEffortApplPK other = (AgreementWorkEffortApplPK) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        if ((this.agreementItemSeqId == null && other.agreementItemSeqId != null) || (this.agreementItemSeqId != null && !this.agreementItemSeqId.equals(other.agreementItemSeqId))) {
            return false;
        }
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementWorkEffortApplPK[ agreementId=" + agreementId + ", agreementItemSeqId=" + agreementItemSeqId + ", workEffortId=" + workEffortId + " ]";
    }
    
}
