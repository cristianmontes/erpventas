/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "paycheck_item_class")
public class PaycheckItemClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYCHECK_ITEM_CLASS_ID")
    private String paycheckItemClassId;
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
    /*@OneToMany(mappedBy = "paycheckItemClassId")
    private List<PaycheckItemType> paycheckItemTypeList;*/

    public PaycheckItemClass() {
    }

    public PaycheckItemClass(String paycheckItemClassId) {
        this.paycheckItemClassId = paycheckItemClassId;
    }

    public String getPaycheckItemClassId() {
        return paycheckItemClassId;
    }

    public void setPaycheckItemClassId(String paycheckItemClassId) {
        this.paycheckItemClassId = paycheckItemClassId;
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
    public List<PaycheckItemType> getPaycheckItemTypeList() {
        return paycheckItemTypeList;
    }

    public void setPaycheckItemTypeList(List<PaycheckItemType> paycheckItemTypeList) {
        this.paycheckItemTypeList = paycheckItemTypeList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paycheckItemClassId != null ? paycheckItemClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItemClass)) {
            return false;
        }
        PaycheckItemClass other = (PaycheckItemClass) object;
        if ((this.paycheckItemClassId == null && other.paycheckItemClassId != null) || (this.paycheckItemClassId != null && !this.paycheckItemClassId.equals(other.paycheckItemClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItemClass[ paycheckItemClassId=" + paycheckItemClassId + " ]";
    }
    
}
