/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.party.model.Party;

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
@Table(name = "agreement_type_for_role_type")
@NamedQueries({
    @NamedQuery(name = "AgreementTypeForRoleType.findAll", query = "SELECT a FROM AgreementTypeForRoleType a")})
public class AgreementTypeForRoleType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementTypeForRoleTypePK agreementTypeForRoleTypePK;
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
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;
    @JoinColumn(name = "AGREEMENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementType agreementType;

    public AgreementTypeForRoleType() {
    }

    public AgreementTypeForRoleType(AgreementTypeForRoleTypePK agreementTypeForRoleTypePK) {
        this.agreementTypeForRoleTypePK = agreementTypeForRoleTypePK;
    }

    public AgreementTypeForRoleType(String organizationPartyId, String roleTypeId, String agreementTypeId) {
        this.agreementTypeForRoleTypePK = new AgreementTypeForRoleTypePK(organizationPartyId, roleTypeId, agreementTypeId);
    }

    public AgreementTypeForRoleTypePK getAgreementTypeForRoleTypePK() {
        return agreementTypeForRoleTypePK;
    }

    public void setAgreementTypeForRoleTypePK(AgreementTypeForRoleTypePK agreementTypeForRoleTypePK) {
        this.agreementTypeForRoleTypePK = agreementTypeForRoleTypePK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTypeForRoleTypePK != null ? agreementTypeForRoleTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTypeForRoleType)) {
            return false;
        }
        AgreementTypeForRoleType other = (AgreementTypeForRoleType) object;
        if ((this.agreementTypeForRoleTypePK == null && other.agreementTypeForRoleTypePK != null) || (this.agreementTypeForRoleTypePK != null && !this.agreementTypeForRoleTypePK.equals(other.agreementTypeForRoleTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTypeForRoleType[ agreementTypeForRoleTypePK=" + agreementTypeForRoleTypePK + " ]";
    }
    
}
