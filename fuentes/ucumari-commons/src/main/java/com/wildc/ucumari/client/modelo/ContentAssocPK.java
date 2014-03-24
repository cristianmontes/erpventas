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
public class ContentAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID_TO")
    private String contentIdTo;
    @Basic(optional = false)
    @Column(name = "CONTENT_ASSOC_TYPE_ID")
    private String contentAssocTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ContentAssocPK() {
    }

    public ContentAssocPK(String contentId, String contentIdTo, String contentAssocTypeId, Date fromDate) {
        this.contentId = contentId;
        this.contentIdTo = contentIdTo;
        this.contentAssocTypeId = contentAssocTypeId;
        this.fromDate = fromDate;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentIdTo() {
        return contentIdTo;
    }

    public void setContentIdTo(String contentIdTo) {
        this.contentIdTo = contentIdTo;
    }

    public String getContentAssocTypeId() {
        return contentAssocTypeId;
    }

    public void setContentAssocTypeId(String contentAssocTypeId) {
        this.contentAssocTypeId = contentAssocTypeId;
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
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (contentIdTo != null ? contentIdTo.hashCode() : 0);
        hash += (contentAssocTypeId != null ? contentAssocTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentAssocPK)) {
            return false;
        }
        ContentAssocPK other = (ContentAssocPK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.contentIdTo == null && other.contentIdTo != null) || (this.contentIdTo != null && !this.contentIdTo.equals(other.contentIdTo))) {
            return false;
        }
        if ((this.contentAssocTypeId == null && other.contentAssocTypeId != null) || (this.contentAssocTypeId != null && !this.contentAssocTypeId.equals(other.contentAssocTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentAssocPK[ contentId=" + contentId + ", contentIdTo=" + contentIdTo + ", contentAssocTypeId=" + contentAssocTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
