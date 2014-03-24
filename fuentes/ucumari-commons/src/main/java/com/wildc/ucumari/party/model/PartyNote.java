/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.NoteData;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_note")
@NamedQueries({
    @NamedQuery(name = "PartyNote.findAll", query = "SELECT p FROM PartyNote p")})
public class PartyNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyNotePK partyNotePK;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "NOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NoteData noteData;

    public PartyNote() {
    }

    public PartyNote(PartyNotePK partyNotePK) {
        this.partyNotePK = partyNotePK;
    }

    public PartyNote(String partyId, String noteId) {
        this.partyNotePK = new PartyNotePK(partyId, noteId);
    }

    public PartyNotePK getPartyNotePK() {
        return partyNotePK;
    }

    public void setPartyNotePK(PartyNotePK partyNotePK) {
        this.partyNotePK = partyNotePK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
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
        hash += (partyNotePK != null ? partyNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyNote)) {
            return false;
        }
        PartyNote other = (PartyNote) object;
        if ((this.partyNotePK == null && other.partyNotePK != null) || (this.partyNotePK != null && !this.partyNotePK.equals(other.partyNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyNote[ partyNotePK=" + partyNotePK + " ]";
    }
    
}
