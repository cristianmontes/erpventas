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
@Table(name = "work_effort_type_attr")
@NamedQueries({
    @NamedQuery(name = "WorkEffortTypeAttr.findAll", query = "SELECT w FROM WorkEffortTypeAttr w")})
public class WorkEffortTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortTypeAttrPK workEffortTypeAttrPK;
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
    @JoinColumn(name = "WORK_EFFORT_TYPE_ID", referencedColumnName = "WORK_EFFORT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffortType workEffortType;

    public WorkEffortTypeAttr() {
    }

    public WorkEffortTypeAttr(WorkEffortTypeAttrPK workEffortTypeAttrPK) {
        this.workEffortTypeAttrPK = workEffortTypeAttrPK;
    }

    public WorkEffortTypeAttr(String workEffortTypeId, String attrName) {
        this.workEffortTypeAttrPK = new WorkEffortTypeAttrPK(workEffortTypeId, attrName);
    }

    public WorkEffortTypeAttrPK getWorkEffortTypeAttrPK() {
        return workEffortTypeAttrPK;
    }

    public void setWorkEffortTypeAttrPK(WorkEffortTypeAttrPK workEffortTypeAttrPK) {
        this.workEffortTypeAttrPK = workEffortTypeAttrPK;
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

    public WorkEffortType getWorkEffortType() {
        return workEffortType;
    }

    public void setWorkEffortType(WorkEffortType workEffortType) {
        this.workEffortType = workEffortType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortTypeAttrPK != null ? workEffortTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortTypeAttr)) {
            return false;
        }
        WorkEffortTypeAttr other = (WorkEffortTypeAttr) object;
        if ((this.workEffortTypeAttrPK == null && other.workEffortTypeAttrPK != null) || (this.workEffortTypeAttrPK != null && !this.workEffortTypeAttrPK.equals(other.workEffortTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortTypeAttr[ workEffortTypeAttrPK=" + workEffortTypeAttrPK + " ]";
    }
    
}
