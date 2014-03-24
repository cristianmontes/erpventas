/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "unemployment_claim")
@NamedQueries({
    @NamedQuery(name = "UnemploymentClaim.findAll", query = "SELECT u FROM UnemploymentClaim u")})
public class UnemploymentClaim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNEMPLOYMENT_CLAIM_ID")
    private String unemploymentClaimId;
    @Column(name = "UNEMPLOYMENT_CLAIM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unemploymentClaimDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "PARTY_ID_FROM")
    private String partyIdFrom;
    @Column(name = "PARTY_ID_TO")
    private String partyIdTo;
    @Column(name = "ROLE_TYPE_ID_FROM")
    private String roleTypeIdFrom;
    @Column(name = "ROLE_TYPE_ID_TO")
    private String roleTypeIdTo;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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

    public UnemploymentClaim() {
    }

    public UnemploymentClaim(String unemploymentClaimId) {
        this.unemploymentClaimId = unemploymentClaimId;
    }

    public String getUnemploymentClaimId() {
        return unemploymentClaimId;
    }

    public void setUnemploymentClaimId(String unemploymentClaimId) {
        this.unemploymentClaimId = unemploymentClaimId;
    }

    public Date getUnemploymentClaimDate() {
        return unemploymentClaimDate;
    }

    public void setUnemploymentClaimDate(Date unemploymentClaimDate) {
        this.unemploymentClaimDate = unemploymentClaimDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getRoleTypeIdFrom() {
        return roleTypeIdFrom;
    }

    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }

    public String getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unemploymentClaimId != null ? unemploymentClaimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemploymentClaim)) {
            return false;
        }
        UnemploymentClaim other = (UnemploymentClaim) object;
        if ((this.unemploymentClaimId == null && other.unemploymentClaimId != null) || (this.unemploymentClaimId != null && !this.unemploymentClaimId.equals(other.unemploymentClaimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UnemploymentClaim[ unemploymentClaimId=" + unemploymentClaimId + " ]";
    }
    
}
