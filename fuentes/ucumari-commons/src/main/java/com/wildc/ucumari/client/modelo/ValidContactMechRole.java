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

import com.wildc.ucumari.contact.model.ContactMechType;
import com.wildc.ucumari.parameters.model.RoleType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "valid_contact_mech_role")
@NamedQueries({
    @NamedQuery(name = "ValidContactMechRole.findAll", query = "SELECT v FROM ValidContactMechRole v")})
public class ValidContactMechRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ValidContactMechRolePK validContactMechRolePK;
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
    @JoinColumn(name = "CONTACT_MECH_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMechType contactMechType;

    public ValidContactMechRole() {
    }

    public ValidContactMechRole(ValidContactMechRolePK validContactMechRolePK) {
        this.validContactMechRolePK = validContactMechRolePK;
    }

    public ValidContactMechRole(String roleTypeId, String contactMechTypeId) {
        this.validContactMechRolePK = new ValidContactMechRolePK(roleTypeId, contactMechTypeId);
    }

    public ValidContactMechRolePK getValidContactMechRolePK() {
        return validContactMechRolePK;
    }

    public void setValidContactMechRolePK(ValidContactMechRolePK validContactMechRolePK) {
        this.validContactMechRolePK = validContactMechRolePK;
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

    public ContactMechType getContactMechType() {
        return contactMechType;
    }

    public void setContactMechType(ContactMechType contactMechType) {
        this.contactMechType = contactMechType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (validContactMechRolePK != null ? validContactMechRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValidContactMechRole)) {
            return false;
        }
        ValidContactMechRole other = (ValidContactMechRole) object;
        if ((this.validContactMechRolePK == null && other.validContactMechRolePK != null) || (this.validContactMechRolePK != null && !this.validContactMechRolePK.equals(other.validContactMechRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ValidContactMechRole[ validContactMechRolePK=" + validContactMechRolePK + " ]";
    }
    
}
