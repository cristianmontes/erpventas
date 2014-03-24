/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.client.modelo.WorkEffort;
import java.io.Serializable;
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
@Table(name = "agreement_work_effort_appl")
@NamedQueries({
    @NamedQuery(name = "AgreementWorkEffortAppl.findAll", query = "SELECT a FROM AgreementWorkEffortAppl a")})
public class AgreementWorkEffortAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementWorkEffortApplPK agreementWorkEffortApplPK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AgreementItem agreementItem;

    public AgreementWorkEffortAppl() {
    }

    public AgreementWorkEffortAppl(AgreementWorkEffortApplPK agreementWorkEffortApplPK) {
        this.agreementWorkEffortApplPK = agreementWorkEffortApplPK;
    }

    public AgreementWorkEffortAppl(String agreementId, String agreementItemSeqId, String workEffortId) {
        this.agreementWorkEffortApplPK = new AgreementWorkEffortApplPK(agreementId, agreementItemSeqId, workEffortId);
    }

    public AgreementWorkEffortApplPK getAgreementWorkEffortApplPK() {
        return agreementWorkEffortApplPK;
    }

    public void setAgreementWorkEffortApplPK(AgreementWorkEffortApplPK agreementWorkEffortApplPK) {
        this.agreementWorkEffortApplPK = agreementWorkEffortApplPK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementWorkEffortApplPK != null ? agreementWorkEffortApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementWorkEffortAppl)) {
            return false;
        }
        AgreementWorkEffortAppl other = (AgreementWorkEffortAppl) object;
        if ((this.agreementWorkEffortApplPK == null && other.agreementWorkEffortApplPK != null) || (this.agreementWorkEffortApplPK != null && !this.agreementWorkEffortApplPK.equals(other.agreementWorkEffortApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementWorkEffortAppl[ agreementWorkEffortApplPK=" + agreementWorkEffortApplPK + " ]";
    }
    
}
