/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "gl_reconciliation_entry")
@NamedQueries({
    @NamedQuery(name = "GlReconciliationEntry.findAll", query = "SELECT g FROM GlReconciliationEntry g")})
public class GlReconciliationEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlReconciliationEntryPK glReconciliationEntryPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RECONCILED_AMOUNT")
    private BigDecimal reconciledAmount;
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
    @JoinColumn(name = "GL_RECONCILIATION_ID", referencedColumnName = "GL_RECONCILIATION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlReconciliation glReconciliation;
    @JoinColumns({
        @JoinColumn(name = "ACCTG_TRANS_ID", referencedColumnName = "ACCTG_TRANS_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ACCTG_TRANS_ENTRY_SEQ_ID", referencedColumnName = "ACCTG_TRANS_ENTRY_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AcctgTransEntry acctgTransEntry;

    public GlReconciliationEntry() {
    }

    public GlReconciliationEntry(GlReconciliationEntryPK glReconciliationEntryPK) {
        this.glReconciliationEntryPK = glReconciliationEntryPK;
    }

    public GlReconciliationEntry(String glReconciliationId, String acctgTransId, String acctgTransEntrySeqId) {
        this.glReconciliationEntryPK = new GlReconciliationEntryPK(glReconciliationId, acctgTransId, acctgTransEntrySeqId);
    }

    public GlReconciliationEntryPK getGlReconciliationEntryPK() {
        return glReconciliationEntryPK;
    }

    public void setGlReconciliationEntryPK(GlReconciliationEntryPK glReconciliationEntryPK) {
        this.glReconciliationEntryPK = glReconciliationEntryPK;
    }

    public BigDecimal getReconciledAmount() {
        return reconciledAmount;
    }

    public void setReconciledAmount(BigDecimal reconciledAmount) {
        this.reconciledAmount = reconciledAmount;
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

    public GlReconciliation getGlReconciliation() {
        return glReconciliation;
    }

    public void setGlReconciliation(GlReconciliation glReconciliation) {
        this.glReconciliation = glReconciliation;
    }

    public AcctgTransEntry getAcctgTransEntry() {
        return acctgTransEntry;
    }

    public void setAcctgTransEntry(AcctgTransEntry acctgTransEntry) {
        this.acctgTransEntry = acctgTransEntry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glReconciliationEntryPK != null ? glReconciliationEntryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlReconciliationEntry)) {
            return false;
        }
        GlReconciliationEntry other = (GlReconciliationEntry) object;
        if ((this.glReconciliationEntryPK == null && other.glReconciliationEntryPK != null) || (this.glReconciliationEntryPK != null && !this.glReconciliationEntryPK.equals(other.glReconciliationEntryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlReconciliationEntry[ glReconciliationEntryPK=" + glReconciliationEntryPK + " ]";
    }
    
}
