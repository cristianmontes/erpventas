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
@Table(name = "web_site_content")
@NamedQueries({
    @NamedQuery(name = "WebSiteContent.findAll", query = "SELECT w FROM WebSiteContent w")})
public class WebSiteContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebSiteContentPK webSiteContentPK;
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
    @JoinColumn(name = "WEB_SITE_CONTENT_TYPE_ID", referencedColumnName = "WEB_SITE_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WebSiteContentType webSiteContentType;
    @JoinColumn(name = "WEB_SITE_ID", referencedColumnName = "WEB_SITE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WebSite webSite;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public WebSiteContent() {
    }

    public WebSiteContent(WebSiteContentPK webSiteContentPK) {
        this.webSiteContentPK = webSiteContentPK;
    }

    public WebSiteContent(String webSiteId, String contentId, String webSiteContentTypeId, Date fromDate) {
        this.webSiteContentPK = new WebSiteContentPK(webSiteId, contentId, webSiteContentTypeId, fromDate);
    }

    public WebSiteContentPK getWebSiteContentPK() {
        return webSiteContentPK;
    }

    public void setWebSiteContentPK(WebSiteContentPK webSiteContentPK) {
        this.webSiteContentPK = webSiteContentPK;
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

    public WebSiteContentType getWebSiteContentType() {
        return webSiteContentType;
    }

    public void setWebSiteContentType(WebSiteContentType webSiteContentType) {
        this.webSiteContentType = webSiteContentType;
    }

    public WebSite getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
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
        hash += (webSiteContentPK != null ? webSiteContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSiteContent)) {
            return false;
        }
        WebSiteContent other = (WebSiteContent) object;
        if ((this.webSiteContentPK == null && other.webSiteContentPK != null) || (this.webSiteContentPK != null && !this.webSiteContentPK.equals(other.webSiteContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSiteContent[ webSiteContentPK=" + webSiteContentPK + " ]";
    }
    
}
