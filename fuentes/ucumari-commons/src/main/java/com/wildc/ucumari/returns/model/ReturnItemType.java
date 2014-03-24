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
@Table(name = "return_item_type")
@NamedQueries({
    @NamedQuery(name = "ReturnItemType.findAll", query = "SELECT r FROM ReturnItemType r")})
public class ReturnItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_TYPE_ID")
    private String returnItemTypeId;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<ReturnItemType> returnItemTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "RETURN_ITEM_TYPE_ID")
    @ManyToOne
    private ReturnItemType parentTypeId;
    @OneToMany(mappedBy = "returnItemTypeId")
    private List<ReturnItem> returnItemList;

    public ReturnItemType() {
    }

    public ReturnItemType(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
    }

    public String getReturnItemTypeId() {
        return returnItemTypeId;
    }

    public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
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

    public List<ReturnItemType> getReturnItemTypeList() {
        return returnItemTypeList;
    }

    public void setReturnItemTypeList(List<ReturnItemType> returnItemTypeList) {
        this.returnItemTypeList = returnItemTypeList;
    }

    public ReturnItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ReturnItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
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
        hash += (returnItemTypeId != null ? returnItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemType)) {
            return false;
        }
        ReturnItemType other = (ReturnItemType) object;
        if ((this.returnItemTypeId == null && other.returnItemTypeId != null) || (this.returnItemTypeId != null && !this.returnItemTypeId.equals(other.returnItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemType[ returnItemTypeId=" + returnItemTypeId + " ]";
    }
    
}
