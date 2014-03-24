/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "gl_account_type_default")
@NamedQueries({
    @NamedQuery(name = "GlAccountTypeDefault.findAll", query = "SELECT g FROM GlAccountTypeDefault g")})
public class GlAccountTypeDefault implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAccountTypeDefaultPK glAccountTypeDefaultPK;
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
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccountType glAccountType;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public GlAccountTypeDefault() {
    }

    public GlAccountTypeDefault(GlAccountTypeDefaultPK glAccountTypeDefaultPK) {
        this.glAccountTypeDefaultPK = glAccountTypeDefaultPK;
    }

    public GlAccountTypeDefault(String glAccountTypeId, String organizationPartyId) {
        this.glAccountTypeDefaultPK = new GlAccountTypeDefaultPK(glAccountTypeId, organizationPartyId);
    }

    public GlAccountTypeDefaultPK getGlAccountTypeDefaultPK() {
        return glAccountTypeDefaultPK;
    }

    public void setGlAccountTypeDefaultPK(GlAccountTypeDefaultPK glAccountTypeDefaultPK) {
        this.glAccountTypeDefaultPK = glAccountTypeDefaultPK;
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

    public GlAccountType getGlAccountType() {
        return glAccountType;
    }

    public void setGlAccountType(GlAccountType glAccountType) {
        this.glAccountType = glAccountType;
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
        hash += (glAccountTypeDefaultPK != null ? glAccountTypeDefaultPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountTypeDefault)) {
            return false;
        }
        GlAccountTypeDefault other = (GlAccountTypeDefault) object;
        if ((this.glAccountTypeDefaultPK == null && other.glAccountTypeDefaultPK != null) || (this.glAccountTypeDefaultPK != null && !this.glAccountTypeDefaultPK.equals(other.glAccountTypeDefaultPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountTypeDefault[ glAccountTypeDefaultPK=" + glAccountTypeDefaultPK + " ]";
    }
    
}
