/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "work_effort_review")
@NamedQueries({
    @NamedQuery(name = "WorkEffortReview.findAll", query = "SELECT w FROM WorkEffortReview w")})
public class WorkEffortReview implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortReviewPK workEffortReviewPK;
    @Column(name = "POSTED_ANONYMOUS")
    private Character postedAnonymous;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATING")
    private BigDecimal rating;
    @Lob
    @Column(name = "REVIEW_TEXT")
    private String reviewText;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;

    public WorkEffortReview() {
    }

    public WorkEffortReview(WorkEffortReviewPK workEffortReviewPK) {
        this.workEffortReviewPK = workEffortReviewPK;
    }

    public WorkEffortReview(String workEffortId, String userLoginId, Date reviewDate) {
        this.workEffortReviewPK = new WorkEffortReviewPK(workEffortId, userLoginId, reviewDate);
    }

    public WorkEffortReviewPK getWorkEffortReviewPK() {
        return workEffortReviewPK;
    }

    public void setWorkEffortReviewPK(WorkEffortReviewPK workEffortReviewPK) {
        this.workEffortReviewPK = workEffortReviewPK;
    }

    public Character getPostedAnonymous() {
        return postedAnonymous;
    }

    public void setPostedAnonymous(Character postedAnonymous) {
        this.postedAnonymous = postedAnonymous;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
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

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortReviewPK != null ? workEffortReviewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortReview)) {
            return false;
        }
        WorkEffortReview other = (WorkEffortReview) object;
        if ((this.workEffortReviewPK == null && other.workEffortReviewPK != null) || (this.workEffortReviewPK != null && !this.workEffortReviewPK.equals(other.workEffortReviewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortReview[ workEffortReviewPK=" + workEffortReviewPK + " ]";
    }
    
}
