/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.party.model.PartyAcctgPreference;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "gl_journal")
@NamedQueries({
    @NamedQuery(name = "GlJournal.findAll", query = "SELECT g FROM GlJournal g")})
public class GlJournal implements Serializable {
    @OneToMany(mappedBy = "errorGlJournalId")
    private List<PartyAcctgPreference> partyAcctgPreferenceList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_JOURNAL_ID")
    private String glJournalId;
    @Column(name = "GL_JOURNAL_NAME")
    private String glJournalName;
    @Column(name = "IS_POSTED")
    private Character isPosted;
    @Column(name = "POSTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedDate;
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
    @OneToMany(mappedBy = "glJournalId")
    private List<AcctgTrans> acctgTransList;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;

    public GlJournal() {
    }

    public GlJournal(String glJournalId) {
        this.glJournalId = glJournalId;
    }

    public String getGlJournalId() {
        return glJournalId;
    }

    public void setGlJournalId(String glJournalId) {
        this.glJournalId = glJournalId;
    }

    public String getGlJournalName() {
        return glJournalName;
    }

    public void setGlJournalName(String glJournalName) {
        this.glJournalName = glJournalName;
    }

    public Character getIsPosted() {
        return isPosted;
    }

    public void setIsPosted(Character isPosted) {
        this.isPosted = isPosted;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
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

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glJournalId != null ? glJournalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlJournal)) {
            return false;
        }
        GlJournal other = (GlJournal) object;
        if ((this.glJournalId == null && other.glJournalId != null) || (this.glJournalId != null && !this.glJournalId.equals(other.glJournalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlJournal[ glJournalId=" + glJournalId + " ]";
    }

    public List<PartyAcctgPreference> getPartyAcctgPreferenceList() {
        return partyAcctgPreferenceList;
    }

    public void setPartyAcctgPreferenceList(List<PartyAcctgPreference> partyAcctgPreferenceList) {
        this.partyAcctgPreferenceList = partyAcctgPreferenceList;
    }
    
}
