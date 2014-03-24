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
public class WorkEffortContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_CONTENT_TYPE_ID")
    private String workEffortContentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WorkEffortContentPK() {
    }

    public WorkEffortContentPK(String workEffortId, String contentId, String workEffortContentTypeId, Date fromDate) {
        this.workEffortId = workEffortId;
        this.contentId = contentId;
        this.workEffortContentTypeId = workEffortContentTypeId;
        this.fromDate = fromDate;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getWorkEffortContentTypeId() {
        return workEffortContentTypeId;
    }

    public void setWorkEffortContentTypeId(String workEffortContentTypeId) {
        this.workEffortContentTypeId = workEffortContentTypeId;
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
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (workEffortContentTypeId != null ? workEffortContentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortContentPK)) {
            return false;
        }
        WorkEffortContentPK other = (WorkEffortContentPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.workEffortContentTypeId == null && other.workEffortContentTypeId != null) || (this.workEffortContentTypeId != null && !this.workEffortContentTypeId.equals(other.workEffortContentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortContentPK[ workEffortId=" + workEffortId + ", contentId=" + contentId + ", workEffortContentTypeId=" + workEffortContentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
