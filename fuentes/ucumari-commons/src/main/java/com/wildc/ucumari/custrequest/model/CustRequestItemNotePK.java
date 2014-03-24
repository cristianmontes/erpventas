/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class CustRequestItemNotePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ITEM_SEQ_ID")
    private String custRequestItemSeqId;
    @Basic(optional = false)
    @Column(name = "NOTE_ID")
    private String noteId;

    public CustRequestItemNotePK() {
    }

    public CustRequestItemNotePK(String custRequestId, String custRequestItemSeqId, String noteId) {
        this.custRequestId = custRequestId;
        this.custRequestItemSeqId = custRequestItemSeqId;
        this.noteId = noteId;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getCustRequestItemSeqId() {
        return custRequestItemSeqId;
    }

    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        hash += (custRequestItemSeqId != null ? custRequestItemSeqId.hashCode() : 0);
        hash += (noteId != null ? noteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestItemNotePK)) {
            return false;
        }
        CustRequestItemNotePK other = (CustRequestItemNotePK) object;
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
            return false;
        }
        if ((this.custRequestItemSeqId == null && other.custRequestItemSeqId != null) || (this.custRequestItemSeqId != null && !this.custRequestItemSeqId.equals(other.custRequestItemSeqId))) {
            return false;
        }
        if ((this.noteId == null && other.noteId != null) || (this.noteId != null && !this.noteId.equals(other.noteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestItemNotePK[ custRequestId=" + custRequestId + ", custRequestItemSeqId=" + custRequestItemSeqId + ", noteId=" + noteId + " ]";
    }
    
}
