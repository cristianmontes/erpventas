/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.client.modelo.Employment;
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
@Table(name = "agreement_employment_appl")
@NamedQueries({
    @NamedQuery(name = "AgreementEmploymentAppl.findAll", query = "SELECT a FROM AgreementEmploymentAppl a")})
public class AgreementEmploymentAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementEmploymentApplPK agreementEmploymentApplPK;
    @Column(name = "AGREEMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agreementDate;
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
    @JoinColumns({
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID_FROM", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID_TO", insertable = false, updatable = false),
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID_FROM", insertable = false, updatable = false),
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID_TO", insertable = false, updatable = false),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Employment employment;
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AgreementItem agreementItem;

    public AgreementEmploymentAppl() {
    }

    public AgreementEmploymentAppl(AgreementEmploymentApplPK agreementEmploymentApplPK) {
        this.agreementEmploymentApplPK = agreementEmploymentApplPK;
    }

    public AgreementEmploymentAppl(String agreementId, String agreementItemSeqId, String partyIdFrom, String partyIdTo, String roleTypeIdFrom, String roleTypeIdTo, Date fromDate) {
        this.agreementEmploymentApplPK = new AgreementEmploymentApplPK(agreementId, agreementItemSeqId, partyIdFrom, partyIdTo, roleTypeIdFrom, roleTypeIdTo, fromDate);
    }

    public AgreementEmploymentApplPK getAgreementEmploymentApplPK() {
        return agreementEmploymentApplPK;
    }

    public void setAgreementEmploymentApplPK(AgreementEmploymentApplPK agreementEmploymentApplPK) {
        this.agreementEmploymentApplPK = agreementEmploymentApplPK;
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
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

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
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
        hash += (agreementEmploymentApplPK != null ? agreementEmploymentApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementEmploymentAppl)) {
            return false;
        }
        AgreementEmploymentAppl other = (AgreementEmploymentAppl) object;
        if ((this.agreementEmploymentApplPK == null && other.agreementEmploymentApplPK != null) || (this.agreementEmploymentApplPK != null && !this.agreementEmploymentApplPK.equals(other.agreementEmploymentApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementEmploymentAppl[ agreementEmploymentApplPK=" + agreementEmploymentApplPK + " ]";
    }
    
}
