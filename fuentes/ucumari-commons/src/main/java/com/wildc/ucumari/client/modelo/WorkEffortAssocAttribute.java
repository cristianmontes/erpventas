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
@Table(name = "work_effort_assoc_attribute")
@NamedQueries({
    @NamedQuery(name = "WorkEffortAssocAttribute.findAll", query = "SELECT w FROM WorkEffortAssocAttribute w")})
public class WorkEffortAssocAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortAssocAttributePK workEffortAssocAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumns({
        @JoinColumn(name = "WORK_EFFORT_ID_FROM", referencedColumnName = "WORK_EFFORT_ID_FROM", insertable = false, updatable = false),
        @JoinColumn(name = "WORK_EFFORT_ID_TO", referencedColumnName = "WORK_EFFORT_ID_TO", insertable = false, updatable = false),
        @JoinColumn(name = "WORK_EFFORT_ASSOC_TYPE_ID", referencedColumnName = "WORK_EFFORT_ASSOC_TYPE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE")})
    @ManyToOne(optional = false)
    private WorkEffortAssoc workEffortAssoc;

    public WorkEffortAssocAttribute() {
    }

    public WorkEffortAssocAttribute(WorkEffortAssocAttributePK workEffortAssocAttributePK) {
        this.workEffortAssocAttributePK = workEffortAssocAttributePK;
    }

    public WorkEffortAssocAttribute(String workEffortIdFrom, String workEffortIdTo, String workEffortAssocTypeId, String attrName) {
        this.workEffortAssocAttributePK = new WorkEffortAssocAttributePK(workEffortIdFrom, workEffortIdTo, workEffortAssocTypeId, attrName);
    }

    public WorkEffortAssocAttributePK getWorkEffortAssocAttributePK() {
        return workEffortAssocAttributePK;
    }

    public void setWorkEffortAssocAttributePK(WorkEffortAssocAttributePK workEffortAssocAttributePK) {
        this.workEffortAssocAttributePK = workEffortAssocAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public WorkEffortAssoc getWorkEffortAssoc() {
        return workEffortAssoc;
    }

    public void setWorkEffortAssoc(WorkEffortAssoc workEffortAssoc) {
        this.workEffortAssoc = workEffortAssoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortAssocAttributePK != null ? workEffortAssocAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssocAttribute)) {
            return false;
        }
        WorkEffortAssocAttribute other = (WorkEffortAssocAttribute) object;
        if ((this.workEffortAssocAttributePK == null && other.workEffortAssocAttributePK != null) || (this.workEffortAssocAttributePK != null && !this.workEffortAssocAttributePK.equals(other.workEffortAssocAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssocAttribute[ workEffortAssocAttributePK=" + workEffortAssocAttributePK + " ]";
    }
    
}
