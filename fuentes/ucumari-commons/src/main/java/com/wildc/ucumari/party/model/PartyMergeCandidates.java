/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "party_merge_candidates")
@NamedQueries({
    @NamedQuery(name = "PartyMergeCandidates.findAll", query = "SELECT p FROM PartyMergeCandidates p")})
public class PartyMergeCandidates implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyMergeCandidatesPK partyMergeCandidatesPK;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
    @Column(name = "DO_NOT_MERGE")
    private Character doNotMerge;
    @Column(name = "HAS_ORDER_ROLES")
    private Character hasOrderRoles;
    @Lob
    @Column(name = "MERGE_RATIONALE")
    private String mergeRationale;
    @Column(name = "COMMENTS")
    private String comments;
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

    public PartyMergeCandidates() {
    }

    public PartyMergeCandidates(PartyMergeCandidatesPK partyMergeCandidatesPK) {
        this.partyMergeCandidatesPK = partyMergeCandidatesPK;
    }

    public PartyMergeCandidates(String partyIdFrom, String partyIdTo) {
        this.partyMergeCandidatesPK = new PartyMergeCandidatesPK(partyIdFrom, partyIdTo);
    }

    public PartyMergeCandidatesPK getPartyMergeCandidatesPK() {
        return partyMergeCandidatesPK;
    }

    public void setPartyMergeCandidatesPK(PartyMergeCandidatesPK partyMergeCandidatesPK) {
        this.partyMergeCandidatesPK = partyMergeCandidatesPK;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }

    public Character getDoNotMerge() {
        return doNotMerge;
    }

    public void setDoNotMerge(Character doNotMerge) {
        this.doNotMerge = doNotMerge;
    }

    public Character getHasOrderRoles() {
        return hasOrderRoles;
    }

    public void setHasOrderRoles(Character hasOrderRoles) {
        this.hasOrderRoles = hasOrderRoles;
    }

    public String getMergeRationale() {
        return mergeRationale;
    }

    public void setMergeRationale(String mergeRationale) {
        this.mergeRationale = mergeRationale;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyMergeCandidatesPK != null ? partyMergeCandidatesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyMergeCandidates)) {
            return false;
        }
        PartyMergeCandidates other = (PartyMergeCandidates) object;
        if ((this.partyMergeCandidatesPK == null && other.partyMergeCandidatesPK != null) || (this.partyMergeCandidatesPK != null && !this.partyMergeCandidatesPK.equals(other.partyMergeCandidatesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyMergeCandidates[ partyMergeCandidatesPK=" + partyMergeCandidatesPK + " ]";
    }
    
}
