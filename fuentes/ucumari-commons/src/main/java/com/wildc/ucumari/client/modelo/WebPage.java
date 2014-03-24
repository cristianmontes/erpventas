/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "web_page")
@NamedQueries({
    @NamedQuery(name = "WebPage.findAll", query = "SELECT w FROM WebPage w")})
public class WebPage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_PAGE_ID")
    private String webPageId;
    @Column(name = "PAGE_NAME")
    private String pageName;
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
    @JoinColumn(name = "WEB_SITE_ID", referencedColumnName = "WEB_SITE_ID")
    @ManyToOne
    private WebSite webSiteId;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content contentId;

    public WebPage() {
    }

    public WebPage(String webPageId) {
        this.webPageId = webPageId;
    }

    public String getWebPageId() {
        return webPageId;
    }

    public void setWebPageId(String webPageId) {
        this.webPageId = webPageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
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

    public WebSite getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(WebSite webSiteId) {
        this.webSiteId = webSiteId;
    }

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webPageId != null ? webPageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebPage)) {
            return false;
        }
        WebPage other = (WebPage) object;
        if ((this.webPageId == null && other.webPageId != null) || (this.webPageId != null && !this.webPageId.equals(other.webPageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebPage[ webPageId=" + webPageId + " ]";
    }
    
}
