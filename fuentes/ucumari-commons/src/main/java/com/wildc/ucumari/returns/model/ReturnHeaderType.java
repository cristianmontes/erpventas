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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_header_type")
/*@NamedQueries({
    @NamedQuery(name = "ReturnHeaderType.findAll", query = "SELECT r FROM ReturnHeaderType r")})*/
public class ReturnHeaderType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "returnHeaderType")
    private List<ReturnItemTypeMap> returnItemTypeMapList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_HEADER_TYPE_ID")
    private String returnHeaderTypeId;
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
    /*@OneToMany(mappedBy = "returnHeaderTypeId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ReturnHeaderType> returnHeaderTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "RETURN_HEADER_TYPE_ID")
    @ManyToOne
    private ReturnHeaderType parentTypeId;

    public ReturnHeaderType() {
    }

    public ReturnHeaderType(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
    }

    public String getReturnHeaderTypeId() {
        return returnHeaderTypeId;
    }

    public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
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
    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }

    public List<ReturnHeaderType> getReturnHeaderTypeList() {
        return returnHeaderTypeList;
    }

    public void setReturnHeaderTypeList(List<ReturnHeaderType> returnHeaderTypeList) {
        this.returnHeaderTypeList = returnHeaderTypeList;
    }*/

    public ReturnHeaderType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ReturnHeaderType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnHeaderTypeId != null ? returnHeaderTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnHeaderType)) {
            return false;
        }
        ReturnHeaderType other = (ReturnHeaderType) object;
        if ((this.returnHeaderTypeId == null && other.returnHeaderTypeId != null) || (this.returnHeaderTypeId != null && !this.returnHeaderTypeId.equals(other.returnHeaderTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnHeaderType[ returnHeaderTypeId=" + returnHeaderTypeId + " ]";
    }
/*
    public List<ReturnItemTypeMap> getReturnItemTypeMapList() {
        return returnItemTypeMapList;
    }

    public void setReturnItemTypeMapList(List<ReturnItemTypeMap> returnItemTypeMapList) {
        this.returnItemTypeMapList = returnItemTypeMapList;
    }*/
    
}
