/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "status_valid_change")
@NamedQueries({
    @NamedQuery(name = "StatusValidChange.findAll", query = "SELECT s FROM StatusValidChange s")})
public class StatusValidChange implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StatusValidChangePK statusValidChangePK;
    @Column(name = "CONDITION_EXPRESSION")
    private String conditionExpression;
    @Column(name = "TRANSITION_NAME")
    private String transitionName;
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
    @OneToMany(mappedBy = "statusValidChange")
    private List<PicklistStatusHistory> picklistStatusHistoryList;
    @JoinColumn(name = "STATUS_ID_TO", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem1;

    public StatusValidChange() {
    }

    public StatusValidChange(StatusValidChangePK statusValidChangePK) {
        this.statusValidChangePK = statusValidChangePK;
    }

    public StatusValidChange(String statusId, String statusIdTo) {
        this.statusValidChangePK = new StatusValidChangePK(statusId, statusIdTo);
    }

    public StatusValidChangePK getStatusValidChangePK() {
        return statusValidChangePK;
    }

    public void setStatusValidChangePK(StatusValidChangePK statusValidChangePK) {
        this.statusValidChangePK = statusValidChangePK;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public String getTransitionName() {
        return transitionName;
    }

    public void setTransitionName(String transitionName) {
        this.transitionName = transitionName;
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

    public List<PicklistStatusHistory> getPicklistStatusHistoryList() {
        return picklistStatusHistoryList;
    }

    public void setPicklistStatusHistoryList(List<PicklistStatusHistory> picklistStatusHistoryList) {
        this.picklistStatusHistoryList = picklistStatusHistoryList;
    }

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public StatusItem getStatusItem1() {
        return statusItem1;
    }

    public void setStatusItem1(StatusItem statusItem1) {
        this.statusItem1 = statusItem1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusValidChangePK != null ? statusValidChangePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusValidChange)) {
            return false;
        }
        StatusValidChange other = (StatusValidChange) object;
        if ((this.statusValidChangePK == null && other.statusValidChangePK != null) || (this.statusValidChangePK != null && !this.statusValidChangePK.equals(other.statusValidChangePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.StatusValidChange[ statusValidChangePK=" + statusValidChangePK + " ]";
    }
    
}
