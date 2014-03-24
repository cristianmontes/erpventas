/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class GlAccountGroupMemberPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_GROUP_TYPE_ID")
    private String glAccountGroupTypeId;

    public GlAccountGroupMemberPK() {
    }

    public GlAccountGroupMemberPK(String glAccountId, String glAccountGroupTypeId) {
        this.glAccountId = glAccountId;
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getGlAccountGroupTypeId() {
        return glAccountGroupTypeId;
    }

    public void setGlAccountGroupTypeId(String glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        hash += (glAccountGroupTypeId != null ? glAccountGroupTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountGroupMemberPK)) {
            return false;
        }
        GlAccountGroupMemberPK other = (GlAccountGroupMemberPK) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        if ((this.glAccountGroupTypeId == null && other.glAccountGroupTypeId != null) || (this.glAccountGroupTypeId != null && !this.glAccountGroupTypeId.equals(other.glAccountGroupTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountGroupMemberPK[ glAccountId=" + glAccountId + ", glAccountGroupTypeId=" + glAccountGroupTypeId + " ]";
    }
    
}
