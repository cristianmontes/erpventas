/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.contact.model.ContactList;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "mmarketing_campaign_contaclist")
@NamedQueries({
    @NamedQuery(name = "MmarketingCampaignContaclist.findAll", query = "SELECT m FROM MmarketingCampaignContaclist m")})
public class MmarketingCampaignContaclist implements Serializable {
    @OneToMany(mappedBy = "campaignListId")
    private List<TrackingCode> trackingCodeList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_LIST_ID")
    private String campaignListId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
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
    @JoinColumn(name = "MARKETING_CAMPAIGN_ID", referencedColumnName = "MARKETING_CAMPAIGN_ID")
    @ManyToOne
    private MarketingCampaign marketingCampaignId;
    @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID")
    @ManyToOne
    private ContactList contactListId;

    public MmarketingCampaignContaclist() {
    }

    public MmarketingCampaignContaclist(String campaignListId) {
        this.campaignListId = campaignListId;
    }

    public String getCampaignListId() {
        return campaignListId;
    }

    public void setCampaignListId(String campaignListId) {
        this.campaignListId = campaignListId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
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

    public MarketingCampaign getMarketingCampaignId() {
        return marketingCampaignId;
    }

    public void setMarketingCampaignId(MarketingCampaign marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }

    public ContactList getContactListId() {
        return contactListId;
    }

    public void setContactListId(ContactList contactListId) {
        this.contactListId = contactListId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignListId != null ? campaignListId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MmarketingCampaignContaclist)) {
            return false;
        }
        MmarketingCampaignContaclist other = (MmarketingCampaignContaclist) object;
        if ((this.campaignListId == null && other.campaignListId != null) || (this.campaignListId != null && !this.campaignListId.equals(other.campaignListId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.MmarketingCampaignContaclist[ campaignListId=" + campaignListId + " ]";
    }

    public List<TrackingCode> getTrackingCodeList() {
        return trackingCodeList;
    }

    public void setTrackingCodeList(List<TrackingCode> trackingCodeList) {
        this.trackingCodeList = trackingCodeList;
    }
    
}
