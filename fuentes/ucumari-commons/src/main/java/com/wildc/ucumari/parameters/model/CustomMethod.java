/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "custom_method")

public class CustomMethod implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOM_METHOD_ID")
    private String customMethodId;
    @Column(name = "CUSTOM_METHOD_NAME")
    private String customMethodName;
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
    /*
    @OneToMany(mappedBy = "estimateCalcMethod")    
    private List<WorkEffort> workEffortList;*/
    @JoinColumn(name = "CUSTOM_METHOD_TYPE_ID", referencedColumnName = "CUSTOM_METHOD_TYPE_ID")
    @ManyToOne
    private CustomMethodType customMethodTypeId;

    public CustomMethod() {
    }

    public CustomMethod(String customMethodId) {
        this.customMethodId = customMethodId;
    }

    public String getCustomMethodId() {
        return customMethodId;
    }

    public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }

    public String getCustomMethodName() {
        return customMethodName;
    }

    public void setCustomMethodName(String customMethodName) {
        this.customMethodName = customMethodName;
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
/*
    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }*/

    public CustomMethodType getCustomMethodTypeId() {
        return customMethodTypeId;
    }

    public void setCustomMethodTypeId(CustomMethodType customMethodTypeId) {
        this.customMethodTypeId = customMethodTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customMethodId != null ? customMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomMethod)) {
            return false;
        }
        CustomMethod other = (CustomMethod) object;
        if ((this.customMethodId == null && other.customMethodId != null) || (this.customMethodId != null && !this.customMethodId.equals(other.customMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustomMethod[ customMethodId=" + customMethodId + " ]";
    }
    
}
