/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_type")
public class CustRequestType implements Serializable {
    /*OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequestType")
    private List<CustRequestTypeAttr> custRequestTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_TYPE_ID")
    private String custRequestTypeId;
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
    @OneToMany(mappedBy = "custRequestTypeId")
    private List<CustRequest> custRequestList;
    /*@OneToMany(mappedBy = "custRequestTypeId")
    private List<CustRequestCategory> custRequestCategoryList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<CustRequestType> custRequestTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "CUST_REQUEST_TYPE_ID")
    @ManyToOne
    private CustRequestType parentTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    /*@OneToMany(mappedBy = "custRequestTypeId")
    private List<CustRequestResolution> custRequestResolutionList;*/

    public CustRequestType() {
    }

    public CustRequestType(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    public String getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
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

    public List<CustRequest> getCustRequestList() {
        return custRequestList;
    }

    public void setCustRequestList(List<CustRequest> custRequestList) {
        this.custRequestList = custRequestList;
    }
/*
    public List<CustRequestCategory> getCustRequestCategoryList() {
        return custRequestCategoryList;
    }

    public void setCustRequestCategoryList(List<CustRequestCategory> custRequestCategoryList) {
        this.custRequestCategoryList = custRequestCategoryList;
    }

    public List<CustRequestType> getCustRequestTypeList() {
        return custRequestTypeList;
    }

    public void setCustRequestTypeList(List<CustRequestType> custRequestTypeList) {
        this.custRequestTypeList = custRequestTypeList;
    }*/

    public CustRequestType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(CustRequestType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }
/*
    public List<CustRequestResolution> getCustRequestResolutionList() {
        return custRequestResolutionList;
    }

    public void setCustRequestResolutionList(List<CustRequestResolution> custRequestResolutionList) {
        this.custRequestResolutionList = custRequestResolutionList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestTypeId != null ? custRequestTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestType)) {
            return false;
        }
        CustRequestType other = (CustRequestType) object;
        if ((this.custRequestTypeId == null && other.custRequestTypeId != null) || (this.custRequestTypeId != null && !this.custRequestTypeId.equals(other.custRequestTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestType[ custRequestTypeId=" + custRequestTypeId + " ]";
    }
/*
    public List<CustRequestTypeAttr> getCustRequestTypeAttrList() {
        return custRequestTypeAttrList;
    }

    public void setCustRequestTypeAttrList(List<CustRequestTypeAttr> custRequestTypeAttrList) {
        this.custRequestTypeAttrList = custRequestTypeAttrList;
    }*/
    
}
