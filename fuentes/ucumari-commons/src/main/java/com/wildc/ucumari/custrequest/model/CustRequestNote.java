/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.NoteData;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_note")
@NamedQueries({
    @NamedQuery(name = "CustRequestNote.findAll", query = "SELECT c FROM CustRequestNote c")})
public class CustRequestNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestNotePK custRequestNotePK;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "NOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NoteData noteData;

    public CustRequestNote() {
    }

    public CustRequestNote(CustRequestNotePK custRequestNotePK) {
        this.custRequestNotePK = custRequestNotePK;
    }

    public CustRequestNote(String custRequestId, String noteId) {
        this.custRequestNotePK = new CustRequestNotePK(custRequestId, noteId);
    }

    public CustRequestNotePK getCustRequestNotePK() {
        return custRequestNotePK;
    }

    public void setCustRequestNotePK(CustRequestNotePK custRequestNotePK) {
        this.custRequestNotePK = custRequestNotePK;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public NoteData getNoteData() {
        return noteData;
    }

    public void setNoteData(NoteData noteData) {
        this.noteData = noteData;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestNotePK != null ? custRequestNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestNote)) {
            return false;
        }
        CustRequestNote other = (CustRequestNote) object;
        if ((this.custRequestNotePK == null && other.custRequestNotePK != null) || (this.custRequestNotePK != null && !this.custRequestNotePK.equals(other.custRequestNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestNote[ custRequestNotePK=" + custRequestNotePK + " ]";
    }
    
}
