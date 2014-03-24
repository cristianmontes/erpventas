/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class TestingNodeMemberPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TESTING_NODE_ID")
    private String testingNodeId;
    @Basic(optional = false)
    @Column(name = "TESTING_ID")
    private String testingId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public TestingNodeMemberPK() {
    }

    public TestingNodeMemberPK(String testingNodeId, String testingId, Date fromDate) {
        this.testingNodeId = testingNodeId;
        this.testingId = testingId;
        this.fromDate = fromDate;
    }

    public String getTestingNodeId() {
        return testingNodeId;
    }

    public void setTestingNodeId(String testingNodeId) {
        this.testingNodeId = testingNodeId;
    }

    public String getTestingId() {
        return testingId;
    }

    public void setTestingId(String testingId) {
        this.testingId = testingId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testingNodeId != null ? testingNodeId.hashCode() : 0);
        hash += (testingId != null ? testingId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestingNodeMemberPK)) {
            return false;
        }
        TestingNodeMemberPK other = (TestingNodeMemberPK) object;
        if ((this.testingNodeId == null && other.testingNodeId != null) || (this.testingNodeId != null && !this.testingNodeId.equals(other.testingNodeId))) {
            return false;
        }
        if ((this.testingId == null && other.testingId != null) || (this.testingId != null && !this.testingId.equals(other.testingId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestingNodeMemberPK[ testingNodeId=" + testingNodeId + ", testingId=" + testingId + ", fromDate=" + fromDate + " ]";
    }
    
}
