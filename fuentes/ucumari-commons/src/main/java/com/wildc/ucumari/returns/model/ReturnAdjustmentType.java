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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "return_adjustment_type")
@NamedQueries({
    @NamedQuery(name = "ReturnAdjustmentType.findAll", query = "SELECT r FROM ReturnAdjustmentType r")})
public class ReturnAdjustmentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_ADJUSTMENT_TYPE_ID")
    private String returnAdjustmentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "returnAdjustmentTypeId")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ReturnAdjustmentType> returnAdjustmentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "RETURN_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private ReturnAdjustmentType parentTypeId;

    public ReturnAdjustmentType() {
    }

    public ReturnAdjustmentType(String returnAdjustmentTypeId) {
        this.returnAdjustmentTypeId = returnAdjustmentTypeId;
    }

    public String getReturnAdjustmentTypeId() {
        return returnAdjustmentTypeId;
    }

    public void setReturnAdjustmentTypeId(String returnAdjustmentTypeId) {
        this.returnAdjustmentTypeId = returnAdjustmentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<ReturnAdjustmentType> getReturnAdjustmentTypeList() {
        return returnAdjustmentTypeList;
    }

    public void setReturnAdjustmentTypeList(List<ReturnAdjustmentType> returnAdjustmentTypeList) {
        this.returnAdjustmentTypeList = returnAdjustmentTypeList;
    }

    public ReturnAdjustmentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ReturnAdjustmentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnAdjustmentTypeId != null ? returnAdjustmentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnAdjustmentType)) {
            return false;
        }
        ReturnAdjustmentType other = (ReturnAdjustmentType) object;
        if ((this.returnAdjustmentTypeId == null && other.returnAdjustmentTypeId != null) || (this.returnAdjustmentTypeId != null && !this.returnAdjustmentTypeId.equals(other.returnAdjustmentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnAdjustmentType[ returnAdjustmentTypeId=" + returnAdjustmentTypeId + " ]";
    }
    
}
