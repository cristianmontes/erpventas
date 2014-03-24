/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class CustRequestRolePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7371832090501968751L;
	@Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public CustRequestRolePK() {
    }

    public CustRequestRolePK(String custRequestId, String partyId, String roleTypeId) {
        this.custRequestId = custRequestId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
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
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestRolePK)) {
            return false;
        }
        CustRequestRolePK other = (CustRequestRolePK) object;
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
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
        return "com.wildc.ucumari.client.modelo.CustRequestRolePK[ custRequestId=" + custRequestId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
