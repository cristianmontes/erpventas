/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.parameters.model.StatusItem;

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
@Table(name = "party_qual")
@NamedQueries({
    @NamedQuery(name = "PartyQual.findAll", query = "SELECT p FROM PartyQual p")})
public class PartyQual implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyQualPK partyQualPK;
    @Column(name = "QUALIFICATION_DESC")
    private String qualificationDesc;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "VERIF_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem verifStatusId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PARTY_QUAL_TYPE_ID", referencedColumnName = "PARTY_QUAL_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyQualType partyQualType;

    public PartyQual() {
    }

    public PartyQual(PartyQualPK partyQualPK) {
        this.partyQualPK = partyQualPK;
    }

    public PartyQual(String partyId, String partyQualTypeId, Date fromDate) {
        this.partyQualPK = new PartyQualPK(partyId, partyQualTypeId, fromDate);
    }

    public PartyQualPK getPartyQualPK() {
        return partyQualPK;
    }

    public void setPartyQualPK(PartyQualPK partyQualPK) {
        this.partyQualPK = partyQualPK;
    }

    public String getQualificationDesc() {
        return qualificationDesc;
    }

    public void setQualificationDesc(String qualificationDesc) {
        this.qualificationDesc = qualificationDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public StatusItem getVerifStatusId() {
        return verifStatusId;
    }

    public void setVerifStatusId(StatusItem verifStatusId) {
        this.verifStatusId = verifStatusId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyQualType getPartyQualType() {
        return partyQualType;
    }

    public void setPartyQualType(PartyQualType partyQualType) {
        this.partyQualType = partyQualType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyQualPK != null ? partyQualPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyQual)) {
            return false;
        }
        PartyQual other = (PartyQual) object;
        if ((this.partyQualPK == null && other.partyQualPK != null) || (this.partyQualPK != null && !this.partyQualPK.equals(other.partyQualPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyQual[ partyQualPK=" + partyQualPK + " ]";
    }
    
}
