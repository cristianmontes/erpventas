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
@Table(name = "work_effort_content")
@NamedQueries({
    @NamedQuery(name = "WorkEffortContent.findAll", query = "SELECT w FROM WorkEffortContent w")})
public class WorkEffortContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortContentPK workEffortContentPK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "WORK_EFFORT_CONTENT_TYPE_ID", referencedColumnName = "WORK_EFFORT_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffortContentType workEffortContentType;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public WorkEffortContent() {
    }

    public WorkEffortContent(WorkEffortContentPK workEffortContentPK) {
        this.workEffortContentPK = workEffortContentPK;
    }

    public WorkEffortContent(String workEffortId, String contentId, String workEffortContentTypeId, Date fromDate) {
        this.workEffortContentPK = new WorkEffortContentPK(workEffortId, contentId, workEffortContentTypeId, fromDate);
    }

    public WorkEffortContentPK getWorkEffortContentPK() {
        return workEffortContentPK;
    }

    public void setWorkEffortContentPK(WorkEffortContentPK workEffortContentPK) {
        this.workEffortContentPK = workEffortContentPK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public WorkEffortContentType getWorkEffortContentType() {
        return workEffortContentType;
    }

    public void setWorkEffortContentType(WorkEffortContentType workEffortContentType) {
        this.workEffortContentType = workEffortContentType;
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
        hash += (workEffortContentPK != null ? workEffortContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortContent)) {
            return false;
        }
        WorkEffortContent other = (WorkEffortContent) object;
        if ((this.workEffortContentPK == null && other.workEffortContentPK != null) || (this.workEffortContentPK != null && !this.workEffortContentPK.equals(other.workEffortContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortContent[ workEffortContentPK=" + workEffortContentPK + " ]";
    }
    
}
