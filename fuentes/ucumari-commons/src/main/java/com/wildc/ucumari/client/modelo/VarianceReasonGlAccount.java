/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.accounting.model.GlAccount;
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
@Table(name = "variance_reason_gl_account")
@NamedQueries({
    @NamedQuery(name = "VarianceReasonGlAccount.findAll", query = "SELECT v FROM VarianceReasonGlAccount v")})
public class VarianceReasonGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VarianceReasonGlAccountPK varianceReasonGlAccountPK;
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
    @JoinColumn(name = "VARIANCE_REASON_ID", referencedColumnName = "VARIANCE_REASON_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VarianceReason varianceReason;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public VarianceReasonGlAccount() {
    }

    public VarianceReasonGlAccount(VarianceReasonGlAccountPK varianceReasonGlAccountPK) {
        this.varianceReasonGlAccountPK = varianceReasonGlAccountPK;
    }

    public VarianceReasonGlAccount(String varianceReasonId, String organizationPartyId) {
        this.varianceReasonGlAccountPK = new VarianceReasonGlAccountPK(varianceReasonId, organizationPartyId);
    }

    public VarianceReasonGlAccountPK getVarianceReasonGlAccountPK() {
        return varianceReasonGlAccountPK;
    }

    public void setVarianceReasonGlAccountPK(VarianceReasonGlAccountPK varianceReasonGlAccountPK) {
        this.varianceReasonGlAccountPK = varianceReasonGlAccountPK;
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

    public VarianceReason getVarianceReason() {
        return varianceReason;
    }

    public void setVarianceReason(VarianceReason varianceReason) {
        this.varianceReason = varianceReason;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (varianceReasonGlAccountPK != null ? varianceReasonGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VarianceReasonGlAccount)) {
            return false;
        }
        VarianceReasonGlAccount other = (VarianceReasonGlAccount) object;
        if ((this.varianceReasonGlAccountPK == null && other.varianceReasonGlAccountPK != null) || (this.varianceReasonGlAccountPK != null && !this.varianceReasonGlAccountPK.equals(other.varianceReasonGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VarianceReasonGlAccount[ varianceReasonGlAccountPK=" + varianceReasonGlAccountPK + " ]";
    }
    
}
