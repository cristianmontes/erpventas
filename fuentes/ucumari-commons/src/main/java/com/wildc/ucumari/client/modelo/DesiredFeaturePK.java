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
public class DesiredFeaturePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DESIRED_FEATURE_ID")
    private String desiredFeatureId;
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;

    public DesiredFeaturePK() {
    }

    public DesiredFeaturePK(String desiredFeatureId, String requirementId) {
        this.desiredFeatureId = desiredFeatureId;
        this.requirementId = requirementId;
    }

    public String getDesiredFeatureId() {
        return desiredFeatureId;
    }

    public void setDesiredFeatureId(String desiredFeatureId) {
        this.desiredFeatureId = desiredFeatureId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (desiredFeatureId != null ? desiredFeatureId.hashCode() : 0);
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DesiredFeaturePK)) {
            return false;
        }
        DesiredFeaturePK other = (DesiredFeaturePK) object;
        if ((this.desiredFeatureId == null && other.desiredFeatureId != null) || (this.desiredFeatureId != null && !this.desiredFeatureId.equals(other.desiredFeatureId))) {
            return false;
        }
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DesiredFeaturePK[ desiredFeatureId=" + desiredFeatureId + ", requirementId=" + requirementId + " ]";
    }
    
}
