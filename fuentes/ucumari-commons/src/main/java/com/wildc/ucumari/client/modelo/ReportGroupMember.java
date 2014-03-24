/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "report_group_member")
@NamedQueries({
    @NamedQuery(name = "ReportGroupMember.findAll", query = "SELECT r FROM ReportGroupMember r")})
public class ReportGroupMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReportGroupMemberPK reportGroupMemberPK;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "REPORT_ID", referencedColumnName = "REPORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReportRegistry reportRegistry;

    public ReportGroupMember() {
    }

    public ReportGroupMember(ReportGroupMemberPK reportGroupMemberPK) {
        this.reportGroupMemberPK = reportGroupMemberPK;
    }

    public ReportGroupMember(String reportGroupId, String reportId) {
        this.reportGroupMemberPK = new ReportGroupMemberPK(reportGroupId, reportId);
    }

    public ReportGroupMemberPK getReportGroupMemberPK() {
        return reportGroupMemberPK;
    }

    public void setReportGroupMemberPK(ReportGroupMemberPK reportGroupMemberPK) {
        this.reportGroupMemberPK = reportGroupMemberPK;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public ReportRegistry getReportRegistry() {
        return reportRegistry;
    }

    public void setReportRegistry(ReportRegistry reportRegistry) {
        this.reportRegistry = reportRegistry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportGroupMemberPK != null ? reportGroupMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportGroupMember)) {
            return false;
        }
        ReportGroupMember other = (ReportGroupMember) object;
        if ((this.reportGroupMemberPK == null && other.reportGroupMemberPK != null) || (this.reportGroupMemberPK != null && !this.reportGroupMemberPK.equals(other.reportGroupMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReportGroupMember[ reportGroupMemberPK=" + reportGroupMemberPK + " ]";
    }
    
}
