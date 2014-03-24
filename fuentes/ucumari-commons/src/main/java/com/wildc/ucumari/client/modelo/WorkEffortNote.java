/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "work_effort_note")
@NamedQueries({
    @NamedQuery(name = "WorkEffortNote.findAll", query = "SELECT w FROM WorkEffortNote w")})
public class WorkEffortNote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortNotePK workEffortNotePK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "NOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NoteData noteData;

    public WorkEffortNote() {
    }

    public WorkEffortNote(WorkEffortNotePK workEffortNotePK) {
        this.workEffortNotePK = workEffortNotePK;
    }

    public WorkEffortNote(String workEffortId, String noteId) {
        this.workEffortNotePK = new WorkEffortNotePK(workEffortId, noteId);
    }

    public WorkEffortNotePK getWorkEffortNotePK() {
        return workEffortNotePK;
    }

    public void setWorkEffortNotePK(WorkEffortNotePK workEffortNotePK) {
        this.workEffortNotePK = workEffortNotePK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
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
        hash += (workEffortNotePK != null ? workEffortNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortNote)) {
            return false;
        }
        WorkEffortNote other = (WorkEffortNote) object;
        if ((this.workEffortNotePK == null && other.workEffortNotePK != null) || (this.workEffortNotePK != null && !this.workEffortNotePK.equals(other.workEffortNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortNote[ workEffortNotePK=" + workEffortNotePK + " ]";
    }
    
}
