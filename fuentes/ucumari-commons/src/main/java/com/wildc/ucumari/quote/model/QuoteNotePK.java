/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class QuoteNotePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Basic(optional = false)
    @Column(name = "NOTE_ID")
    private String noteId;

    public QuoteNotePK() {
    }

    public QuoteNotePK(String quoteId, String noteId) {
        this.quoteId = quoteId;
        this.noteId = noteId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
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
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        hash += (noteId != null ? noteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteNotePK)) {
            return false;
        }
        QuoteNotePK other = (QuoteNotePK) object;
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        if ((this.noteId == null && other.noteId != null) || (this.noteId != null && !this.noteId.equals(other.noteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteNotePK[ quoteId=" + quoteId + ", noteId=" + noteId + " ]";
    }
    
}
