/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "gl_account_group_type")
@NamedQueries({
    @NamedQuery(name = "GlAccountGroupType.findAll", query = "SELECT g FROM GlAccountGroupType g")})
public class GlAccountGroupType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_GROUP_TYPE_ID")
    private String glAccountGroupTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccountGroupType")
    private List<GlAccountGroupMember> glAccountGroupMemberList;
    @OneToMany(mappedBy = "glAccountGroupTypeId")
    private List<GlAccountGroup> glAccountGroupList;

    public GlAccountGroupType() {
    }

    public GlAccountGroupType(String glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }

    public String getGlAccountGroupTypeId() {
        return glAccountGroupTypeId;
    }

    public void setGlAccountGroupTypeId(String glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
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

    public List<GlAccountGroupMember> getGlAccountGroupMemberList() {
        return glAccountGroupMemberList;
    }

    public void setGlAccountGroupMemberList(List<GlAccountGroupMember> glAccountGroupMemberList) {
        this.glAccountGroupMemberList = glAccountGroupMemberList;
    }

    public List<GlAccountGroup> getGlAccountGroupList() {
        return glAccountGroupList;
    }

    public void setGlAccountGroupList(List<GlAccountGroup> glAccountGroupList) {
        this.glAccountGroupList = glAccountGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountGroupTypeId != null ? glAccountGroupTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountGroupType)) {
            return false;
        }
        GlAccountGroupType other = (GlAccountGroupType) object;
        if ((this.glAccountGroupTypeId == null && other.glAccountGroupTypeId != null) || (this.glAccountGroupTypeId != null && !this.glAccountGroupTypeId.equals(other.glAccountGroupTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountGroupType[ glAccountGroupTypeId=" + glAccountGroupTypeId + " ]";
    }
    
}
