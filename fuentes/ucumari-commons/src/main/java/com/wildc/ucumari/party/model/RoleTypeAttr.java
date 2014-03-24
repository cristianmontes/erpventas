/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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

import com.wildc.ucumari.parameters.model.RoleType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "role_type_attr")
@NamedQueries({
    @NamedQuery(name = "RoleTypeAttr.findAll", query = "SELECT r FROM RoleTypeAttr r")})
public class RoleTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoleTypeAttrPK roleTypeAttrPK;
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
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;

    public RoleTypeAttr() {
    }

    public RoleTypeAttr(RoleTypeAttrPK roleTypeAttrPK) {
        this.roleTypeAttrPK = roleTypeAttrPK;
    }

    public RoleTypeAttr(String roleTypeId, String attrName) {
        this.roleTypeAttrPK = new RoleTypeAttrPK(roleTypeId, attrName);
    }

    public RoleTypeAttrPK getRoleTypeAttrPK() {
        return roleTypeAttrPK;
    }

    public void setRoleTypeAttrPK(RoleTypeAttrPK roleTypeAttrPK) {
        this.roleTypeAttrPK = roleTypeAttrPK;
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

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleTypeAttrPK != null ? roleTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleTypeAttr)) {
            return false;
        }
        RoleTypeAttr other = (RoleTypeAttr) object;
        if ((this.roleTypeAttrPK == null && other.roleTypeAttrPK != null) || (this.roleTypeAttrPK != null && !this.roleTypeAttrPK.equals(other.roleTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RoleTypeAttr[ roleTypeAttrPK=" + roleTypeAttrPK + " ]";
    }
    
}
