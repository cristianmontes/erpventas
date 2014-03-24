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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WebSiteContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WEB_SITE_ID")
    private String webSiteId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "WEB_SITE_CONTENT_TYPE_ID")
    private String webSiteContentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WebSiteContentPK() {
    }

    public WebSiteContentPK(String webSiteId, String contentId, String webSiteContentTypeId, Date fromDate) {
        this.webSiteId = webSiteId;
        this.contentId = contentId;
        this.webSiteContentTypeId = webSiteContentTypeId;
        this.fromDate = fromDate;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getWebSiteContentTypeId() {
        return webSiteContentTypeId;
    }

    public void setWebSiteContentTypeId(String webSiteContentTypeId) {
        this.webSiteContentTypeId = webSiteContentTypeId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSiteId != null ? webSiteId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (webSiteContentTypeId != null ? webSiteContentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSiteContentPK)) {
            return false;
        }
        WebSiteContentPK other = (WebSiteContentPK) object;
        if ((this.webSiteId == null && other.webSiteId != null) || (this.webSiteId != null && !this.webSiteId.equals(other.webSiteId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.webSiteContentTypeId == null && other.webSiteContentTypeId != null) || (this.webSiteContentTypeId != null && !this.webSiteContentTypeId.equals(other.webSiteContentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSiteContentPK[ webSiteId=" + webSiteId + ", contentId=" + contentId + ", webSiteContentTypeId=" + webSiteContentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
