/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
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
@Table(name = "perf_review_item")
@NamedQueries({
    @NamedQuery(name = "PerfReviewItem.findAll", query = "SELECT p FROM PerfReviewItem p")})
public class PerfReviewItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfReviewItemPK perfReviewItemPK;
    @Column(name = "PERF_RATING_TYPE_ID")
    private String perfRatingTypeId;
    @Column(name = "PERF_REVIEW_ITEM_TYPE_ID")
    private String perfReviewItemTypeId;
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
    @JoinColumns({
        @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "EMPLOYEE_PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "EMPLOYEE_ROLE_TYPE_ID", referencedColumnName = "EMPLOYEE_ROLE_TYPE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PERF_REVIEW_ID", referencedColumnName = "PERF_REVIEW_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PerfReview perfReview;
    @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "EMPLOYEE_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;

    public PerfReviewItem() {
    }

    public PerfReviewItem(PerfReviewItemPK perfReviewItemPK) {
        this.perfReviewItemPK = perfReviewItemPK;
    }

    public PerfReviewItem(String employeePartyId, String employeeRoleTypeId, String perfReviewId, String perfReviewItemSeqId) {
        this.perfReviewItemPK = new PerfReviewItemPK(employeePartyId, employeeRoleTypeId, perfReviewId, perfReviewItemSeqId);
    }

    public PerfReviewItemPK getPerfReviewItemPK() {
        return perfReviewItemPK;
    }

    public void setPerfReviewItemPK(PerfReviewItemPK perfReviewItemPK) {
        this.perfReviewItemPK = perfReviewItemPK;
    }

    public String getPerfRatingTypeId() {
        return perfRatingTypeId;
    }

    public void setPerfRatingTypeId(String perfRatingTypeId) {
        this.perfRatingTypeId = perfRatingTypeId;
    }

    public String getPerfReviewItemTypeId() {
        return perfReviewItemTypeId;
    }

    public void setPerfReviewItemTypeId(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
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

    public PerfReview getPerfReview() {
        return perfReview;
    }

    public void setPerfReview(PerfReview perfReview) {
        this.perfReview = perfReview;
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
        hash += (perfReviewItemPK != null ? perfReviewItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfReviewItem)) {
            return false;
        }
        PerfReviewItem other = (PerfReviewItem) object;
        if ((this.perfReviewItemPK == null && other.perfReviewItemPK != null) || (this.perfReviewItemPK != null && !this.perfReviewItemPK.equals(other.perfReviewItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PerfReviewItem[ perfReviewItemPK=" + perfReviewItemPK + " ]";
    }
    
}
