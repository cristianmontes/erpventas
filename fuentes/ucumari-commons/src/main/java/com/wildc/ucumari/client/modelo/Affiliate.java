/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyGroup;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "affiliate")
@NamedQueries({
    @NamedQuery(name = "Affiliate.findAll", query = "SELECT a FROM Affiliate a")})
public class Affiliate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "AFFILIATE_NAME")
    private String affiliateName;
    @Column(name = "AFFILIATE_DESCRIPTION")
    private String affiliateDescription;
    @Column(name = "YEAR_ESTABLISHED")
    private String yearEstablished;
    @Column(name = "SITE_TYPE")
    private String siteType;
    @Column(name = "SITE_PAGE_VIEWS")
    private String sitePageViews;
    @Column(name = "SITE_VISITORS")
    private String siteVisitors;
    @Column(name = "DATE_TIME_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeCreated;
    @Column(name = "DATE_TIME_APPROVED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeApproved;
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
    @OneToOne(optional = false)
    private PartyGroup partyGroup;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;

    public Affiliate() {
    }

    public Affiliate(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getAffiliateName() {
        return affiliateName;
    }

    public void setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
    }

    public String getAffiliateDescription() {
        return affiliateDescription;
    }

    public void setAffiliateDescription(String affiliateDescription) {
        this.affiliateDescription = affiliateDescription;
    }

    public String getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(String yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getSitePageViews() {
        return sitePageViews;
    }

    public void setSitePageViews(String sitePageViews) {
        this.sitePageViews = sitePageViews;
    }

    public String getSiteVisitors() {
        return siteVisitors;
    }

    public void setSiteVisitors(String siteVisitors) {
        this.siteVisitors = siteVisitors;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Date getDateTimeApproved() {
        return dateTimeApproved;
    }

    public void setDateTimeApproved(Date dateTimeApproved) {
        this.dateTimeApproved = dateTimeApproved;
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

    public PartyGroup getPartyGroup() {
        return partyGroup;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affiliate)) {
            return false;
        }
        Affiliate other = (Affiliate) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Affiliate[ partyId=" + partyId + " ]";
    }
    
}
