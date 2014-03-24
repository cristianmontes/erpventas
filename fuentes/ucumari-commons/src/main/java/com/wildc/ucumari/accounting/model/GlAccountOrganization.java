/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "gl_account_organization")
@NamedQueries({
    @NamedQuery(name = "GlAccountOrganization.findAll", query = "SELECT g FROM GlAccountOrganization g")})
public class GlAccountOrganization implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAccountOrganizationPK glAccountOrganizationPK;
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POSTED_BALANCE")
    private BigDecimal postedBalance;
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
    @OneToMany(mappedBy = "glAccountOrganization")
    private List<AcctgTransEntry> acctgTransEntryList;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccount glAccount;

    public GlAccountOrganization() {
    }

    public GlAccountOrganization(GlAccountOrganizationPK glAccountOrganizationPK) {
        this.glAccountOrganizationPK = glAccountOrganizationPK;
    }

    public GlAccountOrganization(String glAccountId, String organizationPartyId) {
        this.glAccountOrganizationPK = new GlAccountOrganizationPK(glAccountId, organizationPartyId);
    }

    public GlAccountOrganizationPK getGlAccountOrganizationPK() {
        return glAccountOrganizationPK;
    }

    public void setGlAccountOrganizationPK(GlAccountOrganizationPK glAccountOrganizationPK) {
        this.glAccountOrganizationPK = glAccountOrganizationPK;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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

    public BigDecimal getPostedBalance() {
        return postedBalance;
    }

    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
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

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountOrganizationPK != null ? glAccountOrganizationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountOrganization)) {
            return false;
        }
        GlAccountOrganization other = (GlAccountOrganization) object;
        if ((this.glAccountOrganizationPK == null && other.glAccountOrganizationPK != null) || (this.glAccountOrganizationPK != null && !this.glAccountOrganizationPK.equals(other.glAccountOrganizationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountOrganization[ glAccountOrganizationPK=" + glAccountOrganizationPK + " ]";
    }
    
}
