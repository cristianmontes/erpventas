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
public class ValidContactMechRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_TYPE_ID")
    private String contactMechTypeId;

    public ValidContactMechRolePK() {
    }

    public ValidContactMechRolePK(String roleTypeId, String contactMechTypeId) {
        this.roleTypeId = roleTypeId;
        this.contactMechTypeId = contactMechTypeId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (contactMechTypeId != null ? contactMechTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValidContactMechRolePK)) {
            return false;
        }
        ValidContactMechRolePK other = (ValidContactMechRolePK) object;
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.contactMechTypeId == null && other.contactMechTypeId != null) || (this.contactMechTypeId != null && !this.contactMechTypeId.equals(other.contactMechTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ValidContactMechRolePK[ roleTypeId=" + roleTypeId + ", contactMechTypeId=" + contactMechTypeId + " ]";
    }
    
}
