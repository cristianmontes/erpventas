/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.payment.model.PayHistory;
import com.wildc.ucumari.agreement.model.AgreementEmploymentAppl;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "employment")
@NamedQueries({
    @NamedQuery(name = "Employment.findAll", query = "SELECT e FROM Employment e")})
public class Employment implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employment")
    private PayHistory payHistory;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmploymentPK employmentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "TERMINATION_REASON_ID")
    private String terminationReasonId;
    @Column(name = "TERMINATION_TYPE_ID")
    private String terminationTypeId;
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
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employment")
    private List<AgreementEmploymentAppl> agreementEmploymentApplList;

    public Employment() {
    }

    public Employment(EmploymentPK employmentPK) {
        this.employmentPK = employmentPK;
    }

    public Employment(String roleTypeIdFrom, String roleTypeIdTo, String partyIdFrom, String partyIdTo, Date fromDate) {
        this.employmentPK = new EmploymentPK(roleTypeIdFrom, roleTypeIdTo, partyIdFrom, partyIdTo, fromDate);
    }

    public EmploymentPK getEmploymentPK() {
        return employmentPK;
    }

    public void setEmploymentPK(EmploymentPK employmentPK) {
        this.employmentPK = employmentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getTerminationReasonId() {
        return terminationReasonId;
    }

    public void setTerminationReasonId(String terminationReasonId) {
        this.terminationReasonId = terminationReasonId;
    }

    public String getTerminationTypeId() {
        return terminationTypeId;
    }

    public void setTerminationTypeId(String terminationTypeId) {
        this.terminationTypeId = terminationTypeId;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    public PartyRole getPartyRole1() {
        return partyRole1;
    }

    public void setPartyRole1(PartyRole partyRole1) {
        this.partyRole1 = partyRole1;
    }

    public List<AgreementEmploymentAppl> getAgreementEmploymentApplList() {
        return agreementEmploymentApplList;
    }

    public void setAgreementEmploymentApplList(List<AgreementEmploymentAppl> agreementEmploymentApplList) {
        this.agreementEmploymentApplList = agreementEmploymentApplList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employmentPK != null ? employmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employment)) {
            return false;
        }
        Employment other = (Employment) object;
        if ((this.employmentPK == null && other.employmentPK != null) || (this.employmentPK != null && !this.employmentPK.equals(other.employmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Employment[ employmentPK=" + employmentPK + " ]";
    }

    public PayHistory getPayHistory() {
        return payHistory;
    }

    public void setPayHistory(PayHistory payHistory) {
        this.payHistory = payHistory;
    }
    
}
