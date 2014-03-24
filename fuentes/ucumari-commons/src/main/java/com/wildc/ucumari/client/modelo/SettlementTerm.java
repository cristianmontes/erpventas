/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.accounting.model.AcctgTransEntry;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "settlement_term")
@NamedQueries({
    @NamedQuery(name = "SettlementTerm.findAll", query = "SELECT s FROM SettlementTerm s")})
public class SettlementTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SETTLEMENT_TERM_ID")
    private String settlementTermId;
    @Column(name = "TERM_NAME")
    private String termName;
    @Column(name = "TERM_VALUE")
    private BigInteger termValue;
    @Column(name = "UOM_ID")
    private String uomId;
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
    @OneToMany(mappedBy = "settlementTermId")
    private List<AcctgTransEntry> acctgTransEntryList;

    public SettlementTerm() {
    }

    public SettlementTerm(String settlementTermId) {
        this.settlementTermId = settlementTermId;
    }

    public String getSettlementTermId() {
        return settlementTermId;
    }

    public void setSettlementTermId(String settlementTermId) {
        this.settlementTermId = settlementTermId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public BigInteger getTermValue() {
        return termValue;
    }

    public void setTermValue(BigInteger termValue) {
        this.termValue = termValue;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settlementTermId != null ? settlementTermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettlementTerm)) {
            return false;
        }
        SettlementTerm other = (SettlementTerm) object;
        if ((this.settlementTermId == null && other.settlementTermId != null) || (this.settlementTermId != null && !this.settlementTermId.equals(other.settlementTermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SettlementTerm[ settlementTermId=" + settlementTermId + " ]";
    }
    
}
