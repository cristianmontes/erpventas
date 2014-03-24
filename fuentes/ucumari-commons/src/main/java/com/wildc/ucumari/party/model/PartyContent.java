/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.Content;
import com.wildc.ucumari.parameters.model.Enumeration;

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
@Table(name = "party_content")
@NamedQueries({
    @NamedQuery(name = "PartyContent.findAll", query = "SELECT p FROM PartyContent p")})
public class PartyContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyContentPK partyContentPK;
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
    @JoinColumn(name = "PARTY_CONTENT_TYPE_ID", referencedColumnName = "PARTY_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyContentType partyContentType;
    @JoinColumn(name = "CONTENT_PURPOSE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration contentPurposeEnumId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public PartyContent() {
    }

    public PartyContent(PartyContentPK partyContentPK) {
        this.partyContentPK = partyContentPK;
    }

    public PartyContent(String partyId, String contentId, String partyContentTypeId, Date fromDate) {
        this.partyContentPK = new PartyContentPK(partyId, contentId, partyContentTypeId, fromDate);
    }

    public PartyContentPK getPartyContentPK() {
        return partyContentPK;
    }

    public void setPartyContentPK(PartyContentPK partyContentPK) {
        this.partyContentPK = partyContentPK;
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

    public PartyContentType getPartyContentType() {
        return partyContentType;
    }

    public void setPartyContentType(PartyContentType partyContentType) {
        this.partyContentType = partyContentType;
    }

    public Enumeration getContentPurposeEnumId() {
        return contentPurposeEnumId;
    }

    public void setContentPurposeEnumId(Enumeration contentPurposeEnumId) {
        this.contentPurposeEnumId = contentPurposeEnumId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyContentPK != null ? partyContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyContent)) {
            return false;
        }
        PartyContent other = (PartyContent) object;
        if ((this.partyContentPK == null && other.partyContentPK != null) || (this.partyContentPK != null && !this.partyContentPK.equals(other.partyContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyContent[ partyContentPK=" + partyContentPK + " ]";
    }
    
}
