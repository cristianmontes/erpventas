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
@Table(name = "gl_reconciliation")
@NamedQueries({
    @NamedQuery(name = "GlReconciliation.findAll", query = "SELECT g FROM GlReconciliation g")})
public class GlReconciliation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_RECONCILIATION_ID")
    private String glReconciliationId;
    @Column(name = "GL_RECONCILIATION_NAME")
    private String glReconciliationName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RECONCILED_BALANCE")
    private BigDecimal reconciledBalance;
    @Column(name = "RECONCILED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reconciledDate;
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
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glReconciliation")
    private List<GlReconciliationEntry> glReconciliationEntryList;

    public GlReconciliation() {
    }

    public GlReconciliation(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }

    public String getGlReconciliationId() {
        return glReconciliationId;
    }

    public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }

    public String getGlReconciliationName() {
        return glReconciliationName;
    }

    public void setGlReconciliationName(String glReconciliationName) {
        this.glReconciliationName = glReconciliationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public BigDecimal getReconciledBalance() {
        return reconciledBalance;
    }

    public void setReconciledBalance(BigDecimal reconciledBalance) {
        this.reconciledBalance = reconciledBalance;
    }

    public Date getReconciledDate() {
        return reconciledDate;
    }

    public void setReconciledDate(Date reconciledDate) {
        this.reconciledDate = reconciledDate;
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

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    public List<GlReconciliationEntry> getGlReconciliationEntryList() {
        return glReconciliationEntryList;
    }

    public void setGlReconciliationEntryList(List<GlReconciliationEntry> glReconciliationEntryList) {
        this.glReconciliationEntryList = glReconciliationEntryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glReconciliationId != null ? glReconciliationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlReconciliation)) {
            return false;
        }
        GlReconciliation other = (GlReconciliation) object;
        if ((this.glReconciliationId == null && other.glReconciliationId != null) || (this.glReconciliationId != null && !this.glReconciliationId.equals(other.glReconciliationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlReconciliation[ glReconciliationId=" + glReconciliationId + " ]";
    }
    
}
