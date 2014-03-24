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
@Table(name = "requirement_attribute")
@NamedQueries({
    @NamedQuery(name = "RequirementAttribute.findAll", query = "SELECT r FROM RequirementAttribute r")})
public class RequirementAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequirementAttributePK requirementAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;

    public RequirementAttribute() {
    }

    public RequirementAttribute(RequirementAttributePK requirementAttributePK) {
        this.requirementAttributePK = requirementAttributePK;
    }

    public RequirementAttribute(String requirementId, String attrName) {
        this.requirementAttributePK = new RequirementAttributePK(requirementId, attrName);
    }

    public RequirementAttributePK getRequirementAttributePK() {
        return requirementAttributePK;
    }

    public void setRequirementAttributePK(RequirementAttributePK requirementAttributePK) {
        this.requirementAttributePK = requirementAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementAttributePK != null ? requirementAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementAttribute)) {
            return false;
        }
        RequirementAttribute other = (RequirementAttribute) object;
        if ((this.requirementAttributePK == null && other.requirementAttributePK != null) || (this.requirementAttributePK != null && !this.requirementAttributePK.equals(other.requirementAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementAttribute[ requirementAttributePK=" + requirementAttributePK + " ]";
    }
    
}
