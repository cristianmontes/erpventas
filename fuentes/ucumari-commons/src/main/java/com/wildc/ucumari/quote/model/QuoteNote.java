/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

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
@Table(name = "quote_note")
@NamedQueries({
    @NamedQuery(name = "QuoteNote.findAll", query = "SELECT q FROM QuoteNote q")})
public class QuoteNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteNotePK quoteNotePK;
    @Column(name = "INTERNAL_NOTE")
    private Character internalNote;
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
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "NOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NoteData noteData;

    public QuoteNote() {
    }

    public QuoteNote(QuoteNotePK quoteNotePK) {
        this.quoteNotePK = quoteNotePK;
    }

    public QuoteNote(String quoteId, String noteId) {
        this.quoteNotePK = new QuoteNotePK(quoteId, noteId);
    }

    public QuoteNotePK getQuoteNotePK() {
        return quoteNotePK;
    }

    public void setQuoteNotePK(QuoteNotePK quoteNotePK) {
        this.quoteNotePK = quoteNotePK;
    }

    public Character getInternalNote() {
        return internalNote;
    }

    public void setInternalNote(Character internalNote) {
        this.internalNote = internalNote;
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

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
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
        hash += (quoteNotePK != null ? quoteNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteNote)) {
            return false;
        }
        QuoteNote other = (QuoteNote) object;
        if ((this.quoteNotePK == null && other.quoteNotePK != null) || (this.quoteNotePK != null && !this.quoteNotePK.equals(other.quoteNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteNote[ quoteNotePK=" + quoteNotePK + " ]";
    }
    
}
