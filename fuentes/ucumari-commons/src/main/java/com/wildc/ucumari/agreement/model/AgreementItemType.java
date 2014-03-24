/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

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
@Table(name = "agreement_item_type")
public class AgreementItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_TYPE_ID")
    private String agreementItemTypeId;
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
    /*@OneToMany(mappedBy = "agreementItemTypeId")
    private List<AgreementItem> agreementItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItemType")
    private List<AgreementItemToTermMap> agreementItemToTermMapList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<AgreementItemType> agreementItemTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "AGREEMENT_ITEM_TYPE_ID")
    @ManyToOne
    private AgreementItemType parentTypeId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItemType")
    private List<AgreementItemTypeAttr> agreementItemTypeAttrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementItemType")
    private List<AgreementToItemMap> agreementToItemMapList;*/

    public AgreementItemType() {
    }

    public AgreementItemType(String agreementItemTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
    }

    public String getAgreementItemTypeId() {
        return agreementItemTypeId;
    }

    public void setAgreementItemTypeId(String agreementItemTypeId) {
        this.agreementItemTypeId = agreementItemTypeId;
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
/*
    public List<AgreementItem> getAgreementItemList() {
        return agreementItemList;
    }

    public void setAgreementItemList(List<AgreementItem> agreementItemList) {
        this.agreementItemList = agreementItemList;
    }

    public List<AgreementItemToTermMap> getAgreementItemToTermMapList() {
        return agreementItemToTermMapList;
    }

    public void setAgreementItemToTermMapList(List<AgreementItemToTermMap> agreementItemToTermMapList) {
        this.agreementItemToTermMapList = agreementItemToTermMapList;
    }

    public List<AgreementItemType> getAgreementItemTypeList() {
        return agreementItemTypeList;
    }

    public void setAgreementItemTypeList(List<AgreementItemType> agreementItemTypeList) {
        this.agreementItemTypeList = agreementItemTypeList;
    }*/

    public AgreementItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(AgreementItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<AgreementItemTypeAttr> getAgreementItemTypeAttrList() {
        return agreementItemTypeAttrList;
    }

    public void setAgreementItemTypeAttrList(List<AgreementItemTypeAttr> agreementItemTypeAttrList) {
        this.agreementItemTypeAttrList = agreementItemTypeAttrList;
    }

    public List<AgreementToItemMap> getAgreementToItemMapList() {
        return agreementToItemMapList;
    }

    public void setAgreementToItemMapList(List<AgreementToItemMap> agreementToItemMapList) {
        this.agreementToItemMapList = agreementToItemMapList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementItemTypeId != null ? agreementItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementItemType)) {
            return false;
        }
        AgreementItemType other = (AgreementItemType) object;
        if ((this.agreementItemTypeId == null && other.agreementItemTypeId != null) || (this.agreementItemTypeId != null && !this.agreementItemTypeId.equals(other.agreementItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementItemType[ agreementItemTypeId=" + agreementItemTypeId + " ]";
    }
    
}
