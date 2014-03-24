/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "requirement_type_attr")
@NamedQueries({
    @NamedQuery(name = "RequirementTypeAttr.findAll", query = "SELECT r FROM RequirementTypeAttr r")})
public class RequirementTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequirementTypeAttrPK requirementTypeAttrPK;
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
    @JoinColumn(name = "REQUIREMENT_TYPE_ID", referencedColumnName = "REQUIREMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RequirementType requirementType;

    public RequirementTypeAttr() {
    }

    public RequirementTypeAttr(RequirementTypeAttrPK requirementTypeAttrPK) {
        this.requirementTypeAttrPK = requirementTypeAttrPK;
    }

    public RequirementTypeAttr(String requirementTypeId, String attrName) {
        this.requirementTypeAttrPK = new RequirementTypeAttrPK(requirementTypeId, attrName);
    }

    public RequirementTypeAttrPK getRequirementTypeAttrPK() {
        return requirementTypeAttrPK;
    }

    public void setRequirementTypeAttrPK(RequirementTypeAttrPK requirementTypeAttrPK) {
        this.requirementTypeAttrPK = requirementTypeAttrPK;
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

    public RequirementType getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(RequirementType requirementType) {
        this.requirementType = requirementType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementTypeAttrPK != null ? requirementTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementTypeAttr)) {
            return false;
        }
        RequirementTypeAttr other = (RequirementTypeAttr) object;
        if ((this.requirementTypeAttrPK == null && other.requirementTypeAttrPK != null) || (this.requirementTypeAttrPK != null && !this.requirementTypeAttrPK.equals(other.requirementTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementTypeAttr[ requirementTypeAttrPK=" + requirementTypeAttrPK + " ]";
    }
    
}
