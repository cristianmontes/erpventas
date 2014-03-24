/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_contact_mech")
public class PartyContactMech implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyContactMechPK partyContactMechPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "ALLOW_SOLICITATION")
    private Character allowSolicitation;
    @Column(name = "EXTENSION")
    private String extension;
    @Column(name = "VERIFIED")
    private Character verified;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "YEARS_WITH_CONTACT_MECH")
    private BigInteger yearsWithContactMech;
    @Column(name = "MONTHS_WITH_CONTACT_MECH")
    private BigInteger monthsWithContactMech;
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
    /*
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne(optional = false)
    private PartyRole partyRole;*/
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;

    public PartyContactMech() {
    }

    public PartyContactMech(PartyContactMechPK partyContactMechPK) {
        this.partyContactMechPK = partyContactMechPK;
    }

    public PartyContactMech(String partyId, String contactMechId, Date fromDate) {
        this.partyContactMechPK = new PartyContactMechPK(partyId, contactMechId, fromDate);
    }

    public PartyContactMechPK getPartyContactMechPK() {
        return partyContactMechPK;
    }

    public void setPartyContactMechPK(PartyContactMechPK partyContactMechPK) {
        this.partyContactMechPK = partyContactMechPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Character getAllowSolicitation() {
        return allowSolicitation;
    }

    public void setAllowSolicitation(Character allowSolicitation) {
        this.allowSolicitation = allowSolicitation;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Character getVerified() {
        return verified;
    }

    public void setVerified(Character verified) {
        this.verified = verified;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigInteger getYearsWithContactMech() {
        return yearsWithContactMech;
    }

    public void setYearsWithContactMech(BigInteger yearsWithContactMech) {
        this.yearsWithContactMech = yearsWithContactMech;
    }

    public BigInteger getMonthsWithContactMech() {
        return monthsWithContactMech;
    }

    public void setMonthsWithContactMech(BigInteger monthsWithContactMech) {
        this.monthsWithContactMech = monthsWithContactMech;
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
/*
    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }*/

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyContactMechPK != null ? partyContactMechPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyContactMech)) {
            return false;
        }
        PartyContactMech other = (PartyContactMech) object;
        if ((this.partyContactMechPK == null && other.partyContactMechPK != null) || (this.partyContactMechPK != null && !this.partyContactMechPK.equals(other.partyContactMechPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyContactMech[ partyContactMechPK=" + partyContactMechPK + " ]";
    }
    
}
