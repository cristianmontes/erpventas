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
@Table(name = "party_invitation_role_assoc")
@NamedQueries({
    @NamedQuery(name = "PartyInvitationRoleAssoc.findAll", query = "SELECT p FROM PartyInvitationRoleAssoc p")})
public class PartyInvitationRoleAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyInvitationRoleAssocPK partyInvitationRoleAssocPK;
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
    @JoinColumn(name = "PARTY_INVITATION_ID", referencedColumnName = "PARTY_INVITATION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyInvitation partyInvitation;

    public PartyInvitationRoleAssoc() {
    }

    public PartyInvitationRoleAssoc(PartyInvitationRoleAssocPK partyInvitationRoleAssocPK) {
        this.partyInvitationRoleAssocPK = partyInvitationRoleAssocPK;
    }

    public PartyInvitationRoleAssoc(String partyInvitationId, String roleTypeId) {
        this.partyInvitationRoleAssocPK = new PartyInvitationRoleAssocPK(partyInvitationId, roleTypeId);
    }

    public PartyInvitationRoleAssocPK getPartyInvitationRoleAssocPK() {
        return partyInvitationRoleAssocPK;
    }

    public void setPartyInvitationRoleAssocPK(PartyInvitationRoleAssocPK partyInvitationRoleAssocPK) {
        this.partyInvitationRoleAssocPK = partyInvitationRoleAssocPK;
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

    public PartyInvitation getPartyInvitation() {
        return partyInvitation;
    }

    public void setPartyInvitation(PartyInvitation partyInvitation) {
        this.partyInvitation = partyInvitation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyInvitationRoleAssocPK != null ? partyInvitationRoleAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyInvitationRoleAssoc)) {
            return false;
        }
        PartyInvitationRoleAssoc other = (PartyInvitationRoleAssoc) object;
        if ((this.partyInvitationRoleAssocPK == null && other.partyInvitationRoleAssocPK != null) || (this.partyInvitationRoleAssocPK != null && !this.partyInvitationRoleAssocPK.equals(other.partyInvitationRoleAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyInvitationRoleAssoc[ partyInvitationRoleAssocPK=" + partyInvitationRoleAssocPK + " ]";
    }
    
}
