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
import javax.persistence.JoinColumns;
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
@Table(name = "cust_request_item_note")
@NamedQueries({
    @NamedQuery(name = "CustRequestItemNote.findAll", query = "SELECT c FROM CustRequestItemNote c")})
public class CustRequestItemNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestItemNotePK custRequestItemNotePK;
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
    @JoinColumns({
        @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName = "CUST_REQUEST_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CustRequestItem custRequestItem;

    public CustRequestItemNote() {
    }

    public CustRequestItemNote(CustRequestItemNotePK custRequestItemNotePK) {
        this.custRequestItemNotePK = custRequestItemNotePK;
    }

    public CustRequestItemNote(String custRequestId, String custRequestItemSeqId, String noteId) {
        this.custRequestItemNotePK = new CustRequestItemNotePK(custRequestId, custRequestItemSeqId, noteId);
    }

    public CustRequestItemNotePK getCustRequestItemNotePK() {
        return custRequestItemNotePK;
    }

    public void setCustRequestItemNotePK(CustRequestItemNotePK custRequestItemNotePK) {
        this.custRequestItemNotePK = custRequestItemNotePK;
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

    public CustRequestItem getCustRequestItem() {
        return custRequestItem;
    }

    public void setCustRequestItem(CustRequestItem custRequestItem) {
        this.custRequestItem = custRequestItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestItemNotePK != null ? custRequestItemNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestItemNote)) {
            return false;
        }
        CustRequestItemNote other = (CustRequestItemNote) object;
        if ((this.custRequestItemNotePK == null && other.custRequestItemNotePK != null) || (this.custRequestItemNotePK != null && !this.custRequestItemNotePK.equals(other.custRequestItemNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestItemNote[ custRequestItemNotePK=" + custRequestItemNotePK + " ]";
    }
    
}
