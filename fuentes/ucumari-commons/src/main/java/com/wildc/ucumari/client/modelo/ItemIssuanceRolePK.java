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
public class ItemIssuanceRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ITEM_ISSUANCE_ID")
    private String itemIssuanceId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public ItemIssuanceRolePK() {
    }

    public ItemIssuanceRolePK(String itemIssuanceId, String partyId, String roleTypeId) {
        this.itemIssuanceId = itemIssuanceId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemIssuanceId != null ? itemIssuanceId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemIssuanceRolePK)) {
            return false;
        }
        ItemIssuanceRolePK other = (ItemIssuanceRolePK) object;
        if ((this.itemIssuanceId == null && other.itemIssuanceId != null) || (this.itemIssuanceId != null && !this.itemIssuanceId.equals(other.itemIssuanceId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ItemIssuanceRolePK[ itemIssuanceId=" + itemIssuanceId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
