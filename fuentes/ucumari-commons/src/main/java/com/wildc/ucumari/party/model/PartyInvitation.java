/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.parameters.model.StatusItem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "party_invitation")
@NamedQueries({
    @NamedQuery(name = "PartyInvitation.findAll", query = "SELECT p FROM PartyInvitation p")})
public class PartyInvitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_INVITATION_ID")
    private String partyInvitationId;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "TO_NAME")
    private String toName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "LAST_INVITE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastInviteDate;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdFrom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyInvitation")
    private List<PartyInvitationRoleAssoc> partyInvitationRoleAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyInvitation")
    private List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList;

    public PartyInvitation() {
    }

    public PartyInvitation(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
    }

    public String getPartyInvitationId() {
        return partyInvitationId;
    }

    public void setPartyInvitationId(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getLastInviteDate() {
        return lastInviteDate;
    }

    public void setLastInviteDate(Date lastInviteDate) {
        this.lastInviteDate = lastInviteDate;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(Party partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public List<PartyInvitationRoleAssoc> getPartyInvitationRoleAssocList() {
        return partyInvitationRoleAssocList;
    }

    public void setPartyInvitationRoleAssocList(List<PartyInvitationRoleAssoc> partyInvitationRoleAssocList) {
        this.partyInvitationRoleAssocList = partyInvitationRoleAssocList;
    }

    public List<PartyInvitationGroupAssoc> getPartyInvitationGroupAssocList() {
        return partyInvitationGroupAssocList;
    }

    public void setPartyInvitationGroupAssocList(List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList) {
        this.partyInvitationGroupAssocList = partyInvitationGroupAssocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyInvitationId != null ? partyInvitationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyInvitation)) {
            return false;
        }
        PartyInvitation other = (PartyInvitation) object;
        if ((this.partyInvitationId == null && other.partyInvitationId != null) || (this.partyInvitationId != null && !this.partyInvitationId.equals(other.partyInvitationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyInvitation[ partyInvitationId=" + partyInvitationId + " ]";
    }
    
}
