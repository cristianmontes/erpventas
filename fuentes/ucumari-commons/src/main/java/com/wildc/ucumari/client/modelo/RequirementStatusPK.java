/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class RequirementStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;

    public RequirementStatusPK() {
    }

    public RequirementStatusPK(String requirementId, String statusId) {
        this.requirementId = requirementId;
        this.statusId = statusId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementStatusPK)) {
            return false;
        }
        RequirementStatusPK other = (RequirementStatusPK) object;
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementStatusPK[ requirementId=" + requirementId + ", statusId=" + statusId + " ]";
    }
    
}
