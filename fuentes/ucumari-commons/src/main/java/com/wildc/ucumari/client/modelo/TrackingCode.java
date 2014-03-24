/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "tracking_code")
@NamedQueries({
    @NamedQuery(name = "TrackingCode.findAll", query = "SELECT t FROM TrackingCode t")})
public class TrackingCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRACKING_CODE_ID")
    private String trackingCodeId;
    @Column(name = "REDIRECT_URL")
    private String redirectUrl;
    @Column(name = "OVERRIDE_LOGO")
    private String overrideLogo;
    @Column(name = "OVERRIDE_CSS")
    private String overrideCss;
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TRACKABLE_LIFETIME")
    private BigInteger trackableLifetime;
    @Column(name = "BILLABLE_LIFETIME")
    private BigInteger billableLifetime;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "GROUP_ID")
    private String groupId;
    @Column(name = "SUBGROUP_ID")
    private String subgroupId;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    @Column(name = "DNIS")
    private String dnis;
    @OneToMany(mappedBy = "trackingCodeId")
    private List<TrackingCodeOrderReturn> trackingCodeOrderReturnList;
    @JoinColumn(name = "CAMPAIGN_LIST_ID", referencedColumnName = "CAMPAIGN_LIST_ID")
    @ManyToOne
    private MmarketingCampaignContaclist campaignListId;
    @JoinColumn(name = "CONTACT_LIST_ID", referencedColumnName = "CONTACT_LIST_ID")
    @ManyToOne
    private ContactList contactListId;
    @JoinColumn(name = "TRACKING_CODE_TYPE_ID", referencedColumnName = "TRACKING_CODE_TYPE_ID")
    @ManyToOne
    private TrackingCodeType trackingCodeTypeId;
    @JoinColumn(name = "MARKETING_CAMPAIGN_ID", referencedColumnName = "MARKETING_CAMPAIGN_ID")
    @ManyToOne
    private MarketingCampaign marketingCampaignId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trackingCode")
    private List<TrackingCodeVisit> trackingCodeVisitList;
    @OneToMany(mappedBy = "trackingCodeId")
    private List<TrackingCodeOrder> trackingCodeOrderList;

    public TrackingCode() {
    }

    public TrackingCode(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    public String getTrackingCodeId() {
        return trackingCodeId;
    }

    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getOverrideLogo() {
        return overrideLogo;
    }

    public void setOverrideLogo(String overrideLogo) {
        this.overrideLogo = overrideLogo;
    }

    public String getOverrideCss() {
        return overrideCss;
    }

    public void setOverrideCss(String overrideCss) {
        this.overrideCss = overrideCss;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getTrackableLifetime() {
        return trackableLifetime;
    }

    public void setTrackableLifetime(BigInteger trackableLifetime) {
        this.trackableLifetime = trackableLifetime;
    }

    public BigInteger getBillableLifetime() {
        return billableLifetime;
    }

    public void setBillableLifetime(BigInteger billableLifetime) {
        this.billableLifetime = billableLifetime;
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubgroupId() {
        return subgroupId;
    }

    public void setSubgroupId(String subgroupId) {
        this.subgroupId = subgroupId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public String getDnis() {
        return dnis;
    }

    public void setDnis(String dnis) {
        this.dnis = dnis;
    }

    public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturnList() {
        return trackingCodeOrderReturnList;
    }

    public void setTrackingCodeOrderReturnList(List<TrackingCodeOrderReturn> trackingCodeOrderReturnList) {
        this.trackingCodeOrderReturnList = trackingCodeOrderReturnList;
    }

    public MmarketingCampaignContaclist getCampaignListId() {
        return campaignListId;
    }

    public void setCampaignListId(MmarketingCampaignContaclist campaignListId) {
        this.campaignListId = campaignListId;
    }

    public ContactList getContactListId() {
        return contactListId;
    }

    public void setContactListId(ContactList contactListId) {
        this.contactListId = contactListId;
    }

    public TrackingCodeType getTrackingCodeTypeId() {
        return trackingCodeTypeId;
    }

    public void setTrackingCodeTypeId(TrackingCodeType trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }

    public MarketingCampaign getMarketingCampaignId() {
        return marketingCampaignId;
    }

    public void setMarketingCampaignId(MarketingCampaign marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }

    public List<TrackingCodeVisit> getTrackingCodeVisitList() {
        return trackingCodeVisitList;
    }

    public void setTrackingCodeVisitList(List<TrackingCodeVisit> trackingCodeVisitList) {
        this.trackingCodeVisitList = trackingCodeVisitList;
    }

    public List<TrackingCodeOrder> getTrackingCodeOrderList() {
        return trackingCodeOrderList;
    }

    public void setTrackingCodeOrderList(List<TrackingCodeOrder> trackingCodeOrderList) {
        this.trackingCodeOrderList = trackingCodeOrderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackingCodeId != null ? trackingCodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCode)) {
            return false;
        }
        TrackingCode other = (TrackingCode) object;
        if ((this.trackingCodeId == null && other.trackingCodeId != null) || (this.trackingCodeId != null && !this.trackingCodeId.equals(other.trackingCodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCode[ trackingCodeId=" + trackingCodeId + " ]";
    }
    
}
