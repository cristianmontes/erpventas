/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "content_approval")
@NamedQueries({
    @NamedQuery(name = "ContentApproval.findAll", query = "SELECT c FROM ContentApproval c")})
public class ContentApproval implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_APPROVAL_ID")
    private String contentApprovalId;
    @Column(name = "CONTENT_REVISION_SEQ_ID")
    private String contentRevisionSeqId;
    @Column(name = "APPROVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvalDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content contentId;
    @JoinColumn(name = "APPROVAL_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem approvalStatusId;

    public ContentApproval() {
    }

    public ContentApproval(String contentApprovalId) {
        this.contentApprovalId = contentApprovalId;
    }

    public String getContentApprovalId() {
        return contentApprovalId;
    }

    public void setContentApprovalId(String contentApprovalId) {
        this.contentApprovalId = contentApprovalId;
    }

    public String getContentRevisionSeqId() {
        return contentRevisionSeqId;
    }

    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }

    public StatusItem getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(StatusItem approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentApprovalId != null ? contentApprovalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentApproval)) {
            return false;
        }
        ContentApproval other = (ContentApproval) object;
        if ((this.contentApprovalId == null && other.contentApprovalId != null) || (this.contentApprovalId != null && !this.contentApprovalId.equals(other.contentApprovalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentApproval[ contentApprovalId=" + contentApprovalId + " ]";
    }
    
}
