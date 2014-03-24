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
@Table(name = "paycheck_item_type")
public class PaycheckItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYCHECK_ITEM_TYPE_ID")
    private String paycheckItemTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DEFAULT_SEQ_NUM")
    private String defaultSeqNum;
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
    @JoinColumn(name = "PAYCHECK_ITEM_CLASS_ID", referencedColumnName = "PAYCHECK_ITEM_CLASS_ID")
    @ManyToOne
    private PaycheckItemClass paycheckItemClassId;
    /*@OneToMany(mappedBy = "paycheckItemTypeId")
    private List<PaycheckItem> paycheckItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paycheckItemType")
    private List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocList;*/

    public PaycheckItemType() {
    }

    public PaycheckItemType(String paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
    }

    public String getPaycheckItemTypeId() {
        return paycheckItemTypeId;
    }

    public void setPaycheckItemTypeId(String paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultSeqNum() {
        return defaultSeqNum;
    }

    public void setDefaultSeqNum(String defaultSeqNum) {
        this.defaultSeqNum = defaultSeqNum;
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

    public PaycheckItemClass getPaycheckItemClassId() {
        return paycheckItemClassId;
    }

    public void setPaycheckItemClassId(PaycheckItemClass paycheckItemClassId) {
        this.paycheckItemClassId = paycheckItemClassId;
    }
/*
    public List<PaycheckItem> getPaycheckItemList() {
        return paycheckItemList;
    }

    public void setPaycheckItemList(List<PaycheckItem> paycheckItemList) {
        this.paycheckItemList = paycheckItemList;
    }

    public List<PaycheckTypeItemTypeAssoc> getPaycheckTypeItemTypeAssocList() {
        return paycheckTypeItemTypeAssocList;
    }

    public void setPaycheckTypeItemTypeAssocList(List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocList) {
        this.paycheckTypeItemTypeAssocList = paycheckTypeItemTypeAssocList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paycheckItemTypeId != null ? paycheckItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItemType)) {
            return false;
        }
        PaycheckItemType other = (PaycheckItemType) object;
        if ((this.paycheckItemTypeId == null && other.paycheckItemTypeId != null) || (this.paycheckItemTypeId != null && !this.paycheckItemTypeId.equals(other.paycheckItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItemType[ paycheckItemTypeId=" + paycheckItemTypeId + " ]";
    }
    
}
