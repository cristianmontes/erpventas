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
@Table(name = "agreement_type")
public class AgreementType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TYPE_ID")
    private String agreementTypeId;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementType")
    private List<AgreementInvoiceItemType> agreementInvoiceItemTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementType")
    private List<AgreementTypeAttr> agreementTypeAttrList;
    @OneToMany(mappedBy = "agreementTypeId")
    private List<AgreementDocumentTypeMap> agreementDocumentTypeMapList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<AgreementType> agreementTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID")
    @ManyToOne
    private AgreementType parentTypeId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementType")
    private List<AgreementTypeForRoleType> agreementTypeForRoleTypeList;
    @OneToMany(mappedBy = "agreementTypeId")
    private List<Agreement> agreementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementType")
    private List<AgreementToItemMap> agreementToItemMapList;*/

    public AgreementType() {
    }

    public AgreementType(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
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
    public List<AgreementInvoiceItemType> getAgreementInvoiceItemTypeList() {
        return agreementInvoiceItemTypeList;
    }

    public void setAgreementInvoiceItemTypeList(List<AgreementInvoiceItemType> agreementInvoiceItemTypeList) {
        this.agreementInvoiceItemTypeList = agreementInvoiceItemTypeList;
    }

    public List<AgreementTypeAttr> getAgreementTypeAttrList() {
        return agreementTypeAttrList;
    }

    public void setAgreementTypeAttrList(List<AgreementTypeAttr> agreementTypeAttrList) {
        this.agreementTypeAttrList = agreementTypeAttrList;
    }

    public List<AgreementDocumentTypeMap> getAgreementDocumentTypeMapList() {
        return agreementDocumentTypeMapList;
    }

    public void setAgreementDocumentTypeMapList(List<AgreementDocumentTypeMap> agreementDocumentTypeMapList) {
        this.agreementDocumentTypeMapList = agreementDocumentTypeMapList;
    }

    public List<AgreementType> getAgreementTypeList() {
        return agreementTypeList;
    }

    public void setAgreementTypeList(List<AgreementType> agreementTypeList) {
        this.agreementTypeList = agreementTypeList;
    }*/

    public AgreementType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(AgreementType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<AgreementTypeForRoleType> getAgreementTypeForRoleTypeList() {
        return agreementTypeForRoleTypeList;
    }

    public void setAgreementTypeForRoleTypeList(List<AgreementTypeForRoleType> agreementTypeForRoleTypeList) {
        this.agreementTypeForRoleTypeList = agreementTypeForRoleTypeList;
    }

    public List<Agreement> getAgreementList() {
        return agreementList;
    }

    public void setAgreementList(List<Agreement> agreementList) {
        this.agreementList = agreementList;
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
        hash += (agreementTypeId != null ? agreementTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementType)) {
            return false;
        }
        AgreementType other = (AgreementType) object;
        if ((this.agreementTypeId == null && other.agreementTypeId != null) || (this.agreementTypeId != null && !this.agreementTypeId.equals(other.agreementTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementType[ agreementTypeId=" + agreementTypeId + " ]";
    }
    
}
