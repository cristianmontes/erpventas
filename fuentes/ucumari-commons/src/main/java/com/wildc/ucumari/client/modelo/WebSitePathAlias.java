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
@Table(name = "web_site_path_alias")
@NamedQueries({
    @NamedQuery(name = "WebSitePathAlias.findAll", query = "SELECT w FROM WebSitePathAlias w")})
public class WebSitePathAlias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebSitePathAliasPK webSitePathAliasPK;
    @Column(name = "ALIAS_TO")
    private String aliasTo;
    @Column(name = "MAP_KEY")
    private String mapKey;
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
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content contentId;

    public WebSitePathAlias() {
    }

    public WebSitePathAlias(WebSitePathAliasPK webSitePathAliasPK) {
        this.webSitePathAliasPK = webSitePathAliasPK;
    }

    public WebSitePathAlias(String webSiteId, String pathAlias) {
        this.webSitePathAliasPK = new WebSitePathAliasPK(webSiteId, pathAlias);
    }

    public WebSitePathAliasPK getWebSitePathAliasPK() {
        return webSitePathAliasPK;
    }

    public void setWebSitePathAliasPK(WebSitePathAliasPK webSitePathAliasPK) {
        this.webSitePathAliasPK = webSitePathAliasPK;
    }

    public String getAliasTo() {
        return aliasTo;
    }

    public void setAliasTo(String aliasTo) {
        this.aliasTo = aliasTo;
    }

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
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

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSitePathAliasPK != null ? webSitePathAliasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSitePathAlias)) {
            return false;
        }
        WebSitePathAlias other = (WebSitePathAlias) object;
        if ((this.webSitePathAliasPK == null && other.webSitePathAliasPK != null) || (this.webSitePathAliasPK != null && !this.webSitePathAliasPK.equals(other.webSitePathAliasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSitePathAlias[ webSitePathAliasPK=" + webSitePathAliasPK + " ]";
    }
    
}
