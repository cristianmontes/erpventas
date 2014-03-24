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

import com.wildc.ucumari.contact.model.ContactMech;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_contact_mech")
@NamedQueries({
    @NamedQuery(name = "WorkEffortContactMech.findAll", query = "SELECT w FROM WorkEffortContactMech w")})
public class WorkEffortContactMech implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortContactMechPK workEffortContactMechPK;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;

    public WorkEffortContactMech() {
    }

    public WorkEffortContactMech(WorkEffortContactMechPK workEffortContactMechPK) {
        this.workEffortContactMechPK = workEffortContactMechPK;
    }

    public WorkEffortContactMech(String workEffortId, String contactMechId) {
        this.workEffortContactMechPK = new WorkEffortContactMechPK(workEffortId, contactMechId);
    }

    public WorkEffortContactMechPK getWorkEffortContactMechPK() {
        return workEffortContactMechPK;
    }

    public void setWorkEffortContactMechPK(WorkEffortContactMechPK workEffortContactMechPK) {
        this.workEffortContactMechPK = workEffortContactMechPK;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortContactMechPK != null ? workEffortContactMechPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortContactMech)) {
            return false;
        }
        WorkEffortContactMech other = (WorkEffortContactMech) object;
        if ((this.workEffortContactMechPK == null && other.workEffortContactMechPK != null) || (this.workEffortContactMechPK != null && !this.workEffortContactMechPK.equals(other.workEffortContactMechPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortContactMech[ workEffortContactMechPK=" + workEffortContactMechPK + " ]";
    }
    
}
