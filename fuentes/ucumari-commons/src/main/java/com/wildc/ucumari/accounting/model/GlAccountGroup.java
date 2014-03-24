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
@Table(name = "gl_account_group")
@NamedQueries({
    @NamedQuery(name = "GlAccountGroup.findAll", query = "SELECT g FROM GlAccountGroup g")})
public class GlAccountGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_GROUP_ID")
    private String glAccountGroupId;
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
    @OneToMany(mappedBy = "glAccountGroupId")
    private List<GlAccountGroupMember> glAccountGroupMemberList;
    @JoinColumn(name = "GL_ACCOUNT_GROUP_TYPE_ID", referencedColumnName = "GL_ACCOUNT_GROUP_TYPE_ID")
    @ManyToOne
    private GlAccountGroupType glAccountGroupTypeId;

    public GlAccountGroup() {
    }

    public GlAccountGroup(String glAccountGroupId) {
        this.glAccountGroupId = glAccountGroupId;
    }

    public String getGlAccountGroupId() {
        return glAccountGroupId;
    }

    public void setGlAccountGroupId(String glAccountGroupId) {
        this.glAccountGroupId = glAccountGroupId;
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

    public GlAccountGroupType getGlAccountGroupTypeId() {
        return glAccountGroupTypeId;
    }

    public void setGlAccountGroupTypeId(GlAccountGroupType glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountGroupId != null ? glAccountGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountGroup)) {
            return false;
        }
        GlAccountGroup other = (GlAccountGroup) object;
        if ((this.glAccountGroupId == null && other.glAccountGroupId != null) || (this.glAccountGroupId != null && !this.glAccountGroupId.equals(other.glAccountGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountGroup[ glAccountGroupId=" + glAccountGroupId + " ]";
    }
    
}
