/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ReportGroupMemberPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "REPORT_GROUP_ID")
    private String reportGroupId;
    @Basic(optional = false)
    @Column(name = "REPORT_ID")
    private String reportId;

    public ReportGroupMemberPK() {
    }

    public ReportGroupMemberPK(String reportGroupId, String reportId) {
        this.reportGroupId = reportGroupId;
        this.reportId = reportId;
    }

    public String getReportGroupId() {
        return reportGroupId;
    }

    public void setReportGroupId(String reportGroupId) {
        this.reportGroupId = reportGroupId;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportGroupId != null ? reportGroupId.hashCode() : 0);
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportGroupMemberPK)) {
            return false;
        }
        ReportGroupMemberPK other = (ReportGroupMemberPK) object;
        if ((this.reportGroupId == null && other.reportGroupId != null) || (this.reportGroupId != null && !this.reportGroupId.equals(other.reportGroupId))) {
            return false;
        }
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReportGroupMemberPK[ reportGroupId=" + reportGroupId + ", reportId=" + reportId + " ]";
    }
    
}
