/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_type")
@NamedQueries({
    @NamedQuery(name = "ReturnType.findAll", query = "SELECT r FROM ReturnType r")})
public class ReturnType implements Serializable {
    @OneToMany(mappedBy = "returnTypeId")
    private List<ReturnAdjustment> returnAdjustmentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_TYPE_ID")
    private String returnTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SEQUENCE_ID")
    private String sequenceId;
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
    @OneToMany(mappedBy = "returnTypeId")
    private List<ReturnItem> returnItemList;

    public ReturnType() {
    }

    public ReturnType(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }

    public String getReturnTypeId() {
        return returnTypeId;
    }

    public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
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

    public List<ReturnItem> getReturnItemList() {
        return returnItemList;
    }

    public void setReturnItemList(List<ReturnItem> returnItemList) {
        this.returnItemList = returnItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnTypeId != null ? returnTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnType)) {
            return false;
        }
        ReturnType other = (ReturnType) object;
        if ((this.returnTypeId == null && other.returnTypeId != null) || (this.returnTypeId != null && !this.returnTypeId.equals(other.returnTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnType[ returnTypeId=" + returnTypeId + " ]";
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }
    
}
