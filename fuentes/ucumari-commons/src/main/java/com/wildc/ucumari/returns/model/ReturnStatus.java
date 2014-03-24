/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_status")
@NamedQueries({
    @NamedQuery(name = "ReturnStatus.findAll", query = "SELECT r FROM ReturnStatus r")})
public class ReturnStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_STATUS_ID")
    private String returnStatusId;
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;
    @Column(name = "STATUS_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDatetime;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID")
    @ManyToOne
    private ReturnHeader returnId;

    public ReturnStatus() {
    }

    public ReturnStatus(String returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public String getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(String returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    public Date getStatusDatetime() {
        return statusDatetime;
    }

    public void setStatusDatetime(Date statusDatetime) {
        this.statusDatetime = statusDatetime;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ReturnHeader getReturnId() {
        return returnId;
    }

    public void setReturnId(ReturnHeader returnId) {
        this.returnId = returnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnStatusId != null ? returnStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnStatus)) {
            return false;
        }
        ReturnStatus other = (ReturnStatus) object;
        if ((this.returnStatusId == null && other.returnStatusId != null) || (this.returnStatusId != null && !this.returnStatusId.equals(other.returnStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnStatus[ returnStatusId=" + returnStatusId + " ]";
    }
    
}
