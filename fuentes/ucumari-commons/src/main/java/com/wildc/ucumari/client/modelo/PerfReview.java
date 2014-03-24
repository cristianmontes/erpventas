/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.payment.model.Payment;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "perf_review")
@NamedQueries({
    @NamedQuery(name = "PerfReview.findAll", query = "SELECT p FROM PerfReview p")})
public class PerfReview implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfReviewPK perfReviewPK;
    @Column(name = "MANAGER_ROLE_TYPE_ID")
    private String managerRoleTypeId;
    @Column(name = "EMPL_POSITION_ID")
    private String emplPositionId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfReview")
    private List<PerfReviewItem> perfReviewItemList;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "MANAGER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party managerPartyId;
    @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "EMPLOYEE_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;

    public PerfReview() {
    }

    public PerfReview(PerfReviewPK perfReviewPK) {
        this.perfReviewPK = perfReviewPK;
    }

    public PerfReview(String employeePartyId, String employeeRoleTypeId, String perfReviewId) {
        this.perfReviewPK = new PerfReviewPK(employeePartyId, employeeRoleTypeId, perfReviewId);
    }

    public PerfReviewPK getPerfReviewPK() {
        return perfReviewPK;
    }

    public void setPerfReviewPK(PerfReviewPK perfReviewPK) {
        this.perfReviewPK = perfReviewPK;
    }

    public String getManagerRoleTypeId() {
        return managerRoleTypeId;
    }

    public void setManagerRoleTypeId(String managerRoleTypeId) {
        this.managerRoleTypeId = managerRoleTypeId;
    }

    public String getEmplPositionId() {
        return emplPositionId;
    }

    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public List<PerfReviewItem> getPerfReviewItemList() {
        return perfReviewItemList;
    }

    public void setPerfReviewItemList(List<PerfReviewItem> perfReviewItemList) {
        this.perfReviewItemList = perfReviewItemList;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public Party getManagerPartyId() {
        return managerPartyId;
    }

    public void setManagerPartyId(Party managerPartyId) {
        this.managerPartyId = managerPartyId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfReviewPK != null ? perfReviewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfReview)) {
            return false;
        }
        PerfReview other = (PerfReview) object;
        if ((this.perfReviewPK == null && other.perfReviewPK != null) || (this.perfReviewPK != null && !this.perfReviewPK.equals(other.perfReviewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PerfReview[ perfReviewPK=" + perfReviewPK + " ]";
    }
    
}
