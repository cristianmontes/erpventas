/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "requirement_type")
@NamedQueries({
    @NamedQuery(name = "RequirementType.findAll", query = "SELECT r FROM RequirementType r")})
public class RequirementType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirementType")
    private List<RequirementTypeAttr> requirementTypeAttrList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_TYPE_ID")
    private String requirementTypeId;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<RequirementType> requirementTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "REQUIREMENT_TYPE_ID")
    @ManyToOne
    private RequirementType parentTypeId;
    @OneToMany(mappedBy = "requirementTypeId")
    private List<Requirement> requirementList;

    public RequirementType() {
    }

    public RequirementType(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }

    public String getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
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

    public List<RequirementType> getRequirementTypeList() {
        return requirementTypeList;
    }

    public void setRequirementTypeList(List<RequirementType> requirementTypeList) {
        this.requirementTypeList = requirementTypeList;
    }

    public RequirementType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(RequirementType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementTypeId != null ? requirementTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementType)) {
            return false;
        }
        RequirementType other = (RequirementType) object;
        if ((this.requirementTypeId == null && other.requirementTypeId != null) || (this.requirementTypeId != null && !this.requirementTypeId.equals(other.requirementTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementType[ requirementTypeId=" + requirementTypeId + " ]";
    }

    public List<RequirementTypeAttr> getRequirementTypeAttrList() {
        return requirementTypeAttrList;
    }

    public void setRequirementTypeAttrList(List<RequirementTypeAttr> requirementTypeAttrList) {
        this.requirementTypeAttrList = requirementTypeAttrList;
    }
    
}
