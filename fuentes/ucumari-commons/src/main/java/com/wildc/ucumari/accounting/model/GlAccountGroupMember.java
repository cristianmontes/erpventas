/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "gl_account_group_member")
@NamedQueries({
    @NamedQuery(name = "GlAccountGroupMember.findAll", query = "SELECT g FROM GlAccountGroupMember g")})
public class GlAccountGroupMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAccountGroupMemberPK glAccountGroupMemberPK;
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
    @JoinColumn(name = "GL_ACCOUNT_GROUP_TYPE_ID", referencedColumnName = "GL_ACCOUNT_GROUP_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccountGroupType glAccountGroupType;
    @JoinColumn(name = "GL_ACCOUNT_GROUP_ID", referencedColumnName = "GL_ACCOUNT_GROUP_ID")
    @ManyToOne
    private GlAccountGroup glAccountGroupId;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccount glAccount;

    public GlAccountGroupMember() {
    }

    public GlAccountGroupMember(GlAccountGroupMemberPK glAccountGroupMemberPK) {
        this.glAccountGroupMemberPK = glAccountGroupMemberPK;
    }

    public GlAccountGroupMember(String glAccountId, String glAccountGroupTypeId) {
        this.glAccountGroupMemberPK = new GlAccountGroupMemberPK(glAccountId, glAccountGroupTypeId);
    }

    public GlAccountGroupMemberPK getGlAccountGroupMemberPK() {
        return glAccountGroupMemberPK;
    }

    public void setGlAccountGroupMemberPK(GlAccountGroupMemberPK glAccountGroupMemberPK) {
        this.glAccountGroupMemberPK = glAccountGroupMemberPK;
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

    public GlAccountGroupType getGlAccountGroupType() {
        return glAccountGroupType;
    }

    public void setGlAccountGroupType(GlAccountGroupType glAccountGroupType) {
        this.glAccountGroupType = glAccountGroupType;
    }

    public GlAccountGroup getGlAccountGroupId() {
        return glAccountGroupId;
    }

    public void setGlAccountGroupId(GlAccountGroup glAccountGroupId) {
        this.glAccountGroupId = glAccountGroupId;
    }

    public GlAccount getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountGroupMemberPK != null ? glAccountGroupMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountGroupMember)) {
            return false;
        }
        GlAccountGroupMember other = (GlAccountGroupMember) object;
        if ((this.glAccountGroupMemberPK == null && other.glAccountGroupMemberPK != null) || (this.glAccountGroupMemberPK != null && !this.glAccountGroupMemberPK.equals(other.glAccountGroupMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountGroupMember[ glAccountGroupMemberPK=" + glAccountGroupMemberPK + " ]";
    }
    
}
