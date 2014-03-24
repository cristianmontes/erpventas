/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "web_site_role")
@NamedQueries({
    @NamedQuery(name = "WebSiteRole.findAll", query = "SELECT w FROM WebSiteRole w")})
public class WebSiteRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebSiteRolePK webSiteRolePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "WEB_SITE_ID", referencedColumnName = "WEB_SITE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WebSite webSite;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;

    public WebSiteRole() {
    }

    public WebSiteRole(WebSiteRolePK webSiteRolePK) {
        this.webSiteRolePK = webSiteRolePK;
    }

    public WebSiteRole(String partyId, String roleTypeId, String webSiteId, Date fromDate) {
        this.webSiteRolePK = new WebSiteRolePK(partyId, roleTypeId, webSiteId, fromDate);
    }

    public WebSiteRolePK getWebSiteRolePK() {
        return webSiteRolePK;
    }

    public void setWebSiteRolePK(WebSiteRolePK webSiteRolePK) {
        this.webSiteRolePK = webSiteRolePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public WebSite getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSiteRolePK != null ? webSiteRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSiteRole)) {
            return false;
        }
        WebSiteRole other = (WebSiteRole) object;
        if ((this.webSiteRolePK == null && other.webSiteRolePK != null) || (this.webSiteRolePK != null && !this.webSiteRolePK.equals(other.webSiteRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSiteRole[ webSiteRolePK=" + webSiteRolePK + " ]";
    }
    
}
