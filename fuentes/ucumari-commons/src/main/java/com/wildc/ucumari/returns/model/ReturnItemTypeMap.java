/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

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
@Table(name = "return_item_type_map")
@NamedQueries({
    @NamedQuery(name = "ReturnItemTypeMap.findAll", query = "SELECT r FROM ReturnItemTypeMap r")})
public class ReturnItemTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReturnItemTypeMapPK returnItemTypeMapPK;
    @Column(name = "RETURN_ITEM_TYPE_ID")
    private String returnItemTypeId;
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
    @JoinColumn(name = "RETURN_HEADER_TYPE_ID", referencedColumnName = "RETURN_HEADER_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReturnHeaderType returnHeaderType;

    public ReturnItemTypeMap() {
    }

    public ReturnItemTypeMap(ReturnItemTypeMapPK returnItemTypeMapPK) {
        this.returnItemTypeMapPK = returnItemTypeMapPK;
    }

    public ReturnItemTypeMap(String returnItemMapKey, String returnHeaderTypeId) {
        this.returnItemTypeMapPK = new ReturnItemTypeMapPK(returnItemMapKey, returnHeaderTypeId);
    }

    public ReturnItemTypeMapPK getReturnItemTypeMapPK() {
        return returnItemTypeMapPK;
    }

    public void setReturnItemTypeMapPK(ReturnItemTypeMapPK returnItemTypeMapPK) {
        this.returnItemTypeMapPK = returnItemTypeMapPK;
    }

    public String getReturnItemTypeId() {
        return returnItemTypeId;
    }

    public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
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

    public ReturnHeaderType getReturnHeaderType() {
        return returnHeaderType;
    }

    public void setReturnHeaderType(ReturnHeaderType returnHeaderType) {
        this.returnHeaderType = returnHeaderType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnItemTypeMapPK != null ? returnItemTypeMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemTypeMap)) {
            return false;
        }
        ReturnItemTypeMap other = (ReturnItemTypeMap) object;
        if ((this.returnItemTypeMapPK == null && other.returnItemTypeMapPK != null) || (this.returnItemTypeMapPK != null && !this.returnItemTypeMapPK.equals(other.returnItemTypeMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemTypeMap[ returnItemTypeMapPK=" + returnItemTypeMapPK + " ]";
    }
    
}
