/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.parameters.model.CustomTimePeriod;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "gl_account_history")
@NamedQueries({
    @NamedQuery(name = "GlAccountHistory.findAll", query = "SELECT g FROM GlAccountHistory g")})
public class GlAccountHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAccountHistoryPK glAccountHistoryPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POSTED_DEBITS")
    private BigDecimal postedDebits;
    @Column(name = "POSTED_CREDITS")
    private BigDecimal postedCredits;
    @Column(name = "ENDING_BALANCE")
    private BigDecimal endingBalance;
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
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccount glAccount;
    @JoinColumn(name = "CUSTOM_TIME_PERIOD_ID", referencedColumnName = "CUSTOM_TIME_PERIOD_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustomTimePeriod customTimePeriod;

    public GlAccountHistory() {
    }

    public GlAccountHistory(GlAccountHistoryPK glAccountHistoryPK) {
        this.glAccountHistoryPK = glAccountHistoryPK;
    }

    public GlAccountHistory(String glAccountId, String organizationPartyId, String customTimePeriodId) {
        this.glAccountHistoryPK = new GlAccountHistoryPK(glAccountId, organizationPartyId, customTimePeriodId);
    }

    public GlAccountHistoryPK getGlAccountHistoryPK() {
        return glAccountHistoryPK;
    }

    public void setGlAccountHistoryPK(GlAccountHistoryPK glAccountHistoryPK) {
        this.glAccountHistoryPK = glAccountHistoryPK;
    }

    public BigDecimal getPostedDebits() {
        return postedDebits;
    }

    public void setPostedDebits(BigDecimal postedDebits) {
        this.postedDebits = postedDebits;
    }

    public BigDecimal getPostedCredits() {
        return postedCredits;
    }

    public void setPostedCredits(BigDecimal postedCredits) {
        this.postedCredits = postedCredits;
    }

    public BigDecimal getEndingBalance() {
        return endingBalance;
    }

    public void setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
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

    public GlAccount getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }

    public CustomTimePeriod getCustomTimePeriod() {
        return customTimePeriod;
    }

    public void setCustomTimePeriod(CustomTimePeriod customTimePeriod) {
        this.customTimePeriod = customTimePeriod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountHistoryPK != null ? glAccountHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountHistory)) {
            return false;
        }
        GlAccountHistory other = (GlAccountHistory) object;
        if ((this.glAccountHistoryPK == null && other.glAccountHistoryPK != null) || (this.glAccountHistoryPK != null && !this.glAccountHistoryPK.equals(other.glAccountHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountHistory[ glAccountHistoryPK=" + glAccountHistoryPK + " ]";
    }
    
}
