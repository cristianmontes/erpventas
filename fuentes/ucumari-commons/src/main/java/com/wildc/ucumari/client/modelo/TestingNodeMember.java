/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "testing_node_member")
@NamedQueries({
    @NamedQuery(name = "TestingNodeMember.findAll", query = "SELECT t FROM TestingNodeMember t")})
public class TestingNodeMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TestingNodeMemberPK testingNodeMemberPK;
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
    @JoinColumn(name = "TESTING_NODE_ID", referencedColumnName = "TESTING_NODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TestingNode testingNode;
    @JoinColumn(name = "TESTING_ID", referencedColumnName = "TESTING_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Testing testing;

    public TestingNodeMember() {
    }

    public TestingNodeMember(TestingNodeMemberPK testingNodeMemberPK) {
        this.testingNodeMemberPK = testingNodeMemberPK;
    }

    public TestingNodeMember(String testingNodeId, String testingId, Date fromDate) {
        this.testingNodeMemberPK = new TestingNodeMemberPK(testingNodeId, testingId, fromDate);
    }

    public TestingNodeMemberPK getTestingNodeMemberPK() {
        return testingNodeMemberPK;
    }

    public void setTestingNodeMemberPK(TestingNodeMemberPK testingNodeMemberPK) {
        this.testingNodeMemberPK = testingNodeMemberPK;
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

    public TestingNode getTestingNode() {
        return testingNode;
    }

    public void setTestingNode(TestingNode testingNode) {
        this.testingNode = testingNode;
    }

    public Testing getTesting() {
        return testing;
    }

    public void setTesting(Testing testing) {
        this.testing = testing;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testingNodeMemberPK != null ? testingNodeMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestingNodeMember)) {
            return false;
        }
        TestingNodeMember other = (TestingNodeMember) object;
        if ((this.testingNodeMemberPK == null && other.testingNodeMemberPK != null) || (this.testingNodeMemberPK != null && !this.testingNodeMemberPK.equals(other.testingNodeMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestingNodeMember[ testingNodeMemberPK=" + testingNodeMemberPK + " ]";
    }
    
}
