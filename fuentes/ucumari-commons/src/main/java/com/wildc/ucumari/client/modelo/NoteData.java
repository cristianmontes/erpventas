/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.custrequest.model.CustRequestItemNote;
import com.wildc.ucumari.custrequest.model.CustRequestNote;
import com.wildc.ucumari.party.model.PartyNote;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.quote.model.QuoteNote;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "note_data")
@NamedQueries({
    @NamedQuery(name = "NoteData.findAll", query = "SELECT n FROM NoteData n")})
public class NoteData implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteData")
    private List<QuoteNote> quoteNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteData")
    private List<WorkEffortNote> workEffortNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteData")
    private List<PartyNote> partyNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteData")
    private List<CustRequestNote> custRequestNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noteData")
    private List<CustRequestItemNote> custRequestItemNoteList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NOTE_ID")
    private String noteId;
    @Column(name = "NOTE_NAME")
    private String noteName;
    @Lob
    @Column(name = "NOTE_INFO")
    private String noteInfo;
    @Column(name = "NOTE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date noteDateTime;
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
    @OneToMany(mappedBy = "noteId")
    private List<WorkEffort> workEffortList;
    @JoinColumn(name = "NOTE_PARTY", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party noteParty;

    public NoteData() {
    }

    public NoteData(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteInfo() {
        return noteInfo;
    }

    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }

    public Date getNoteDateTime() {
        return noteDateTime;
    }

    public void setNoteDateTime(Date noteDateTime) {
        this.noteDateTime = noteDateTime;
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

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public Party getNoteParty() {
        return noteParty;
    }

    public void setNoteParty(Party noteParty) {
        this.noteParty = noteParty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noteId != null ? noteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NoteData)) {
            return false;
        }
        NoteData other = (NoteData) object;
        if ((this.noteId == null && other.noteId != null) || (this.noteId != null && !this.noteId.equals(other.noteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.NoteData[ noteId=" + noteId + " ]";
    }

    public List<CustRequestNote> getCustRequestNoteList() {
        return custRequestNoteList;
    }

    public void setCustRequestNoteList(List<CustRequestNote> custRequestNoteList) {
        this.custRequestNoteList = custRequestNoteList;
    }

    public List<CustRequestItemNote> getCustRequestItemNoteList() {
        return custRequestItemNoteList;
    }

    public void setCustRequestItemNoteList(List<CustRequestItemNote> custRequestItemNoteList) {
        this.custRequestItemNoteList = custRequestItemNoteList;
    }

    public List<PartyNote> getPartyNoteList() {
        return partyNoteList;
    }

    public void setPartyNoteList(List<PartyNote> partyNoteList) {
        this.partyNoteList = partyNoteList;
    }

    public List<QuoteNote> getQuoteNoteList() {
        return quoteNoteList;
    }

    public void setQuoteNoteList(List<QuoteNote> quoteNoteList) {
        this.quoteNoteList = quoteNoteList;
    }

    public List<WorkEffortNote> getWorkEffortNoteList() {
        return workEffortNoteList;
    }

    public void setWorkEffortNoteList(List<WorkEffortNote> workEffortNoteList) {
        this.workEffortNoteList = workEffortNoteList;
    }
    
}
