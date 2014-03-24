/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WebSitePathAliasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WEB_SITE_ID")
    private String webSiteId;
    @Basic(optional = false)
    @Column(name = "PATH_ALIAS")
    private String pathAlias;

    public WebSitePathAliasPK() {
    }

    public WebSitePathAliasPK(String webSiteId, String pathAlias) {
        this.webSiteId = webSiteId;
        this.pathAlias = pathAlias;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getPathAlias() {
        return pathAlias;
    }

    public void setPathAlias(String pathAlias) {
        this.pathAlias = pathAlias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSiteId != null ? webSiteId.hashCode() : 0);
        hash += (pathAlias != null ? pathAlias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSitePathAliasPK)) {
            return false;
        }
        WebSitePathAliasPK other = (WebSitePathAliasPK) object;
        if ((this.webSiteId == null && other.webSiteId != null) || (this.webSiteId != null && !this.webSiteId.equals(other.webSiteId))) {
            return false;
        }
        if ((this.pathAlias == null && other.pathAlias != null) || (this.pathAlias != null && !this.pathAlias.equals(other.pathAlias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSitePathAliasPK[ webSiteId=" + webSiteId + ", pathAlias=" + pathAlias + " ]";
    }
    
}
