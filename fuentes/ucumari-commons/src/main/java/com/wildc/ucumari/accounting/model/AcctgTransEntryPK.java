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
public class AcctgTransEntryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ID")
    private String acctgTransId;
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ENTRY_SEQ_ID")
    private String acctgTransEntrySeqId;

    public AcctgTransEntryPK() {
    }

    public AcctgTransEntryPK(String acctgTransId, String acctgTransEntrySeqId) {
        this.acctgTransId = acctgTransId;
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }

    public String getAcctgTransId() {
        return acctgTransId;
    }

    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getAcctgTransEntrySeqId() {
        return acctgTransEntrySeqId;
    }

    public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransId != null ? acctgTransId.hashCode() : 0);
        hash += (acctgTransEntrySeqId != null ? acctgTransEntrySeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransEntryPK)) {
            return false;
        }
        AcctgTransEntryPK other = (AcctgTransEntryPK) object;
        if ((this.acctgTransId == null && other.acctgTransId != null) || (this.acctgTransId != null && !this.acctgTransId.equals(other.acctgTransId))) {
            return false;
        }
        if ((this.acctgTransEntrySeqId == null && other.acctgTransEntrySeqId != null) || (this.acctgTransEntrySeqId != null && !this.acctgTransEntrySeqId.equals(other.acctgTransEntrySeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransEntryPK[ acctgTransId=" + acctgTransId + ", acctgTransEntrySeqId=" + acctgTransEntrySeqId + " ]";
    }
    
}
