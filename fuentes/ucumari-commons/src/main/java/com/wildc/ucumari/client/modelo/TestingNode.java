/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "testing_node")
@NamedQueries({
    @NamedQuery(name = "TestingNode.findAll", query = "SELECT t FROM TestingNode t")})
public class TestingNode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TESTING_NODE_ID")
    private String testingNodeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testingNode")
    private List<TestingNodeMember> testingNodeMemberList;
    @OneToMany(mappedBy = "primaryParentNodeId")
    private List<TestingNode> testingNodeList;
    @JoinColumn(name = "PRIMARY_PARENT_NODE_ID", referencedColumnName = "TESTING_NODE_ID")
    @ManyToOne
    private TestingNode primaryParentNodeId;

    public TestingNode() {
    }

    public TestingNode(String testingNodeId) {
        this.testingNodeId = testingNodeId;
    }

    public String getTestingNodeId() {
        return testingNodeId;
    }

    public void setTestingNodeId(String testingNodeId) {
        this.testingNodeId = testingNodeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<TestingNodeMember> getTestingNodeMemberList() {
        return testingNodeMemberList;
    }

    public void setTestingNodeMemberList(List<TestingNodeMember> testingNodeMemberList) {
        this.testingNodeMemberList = testingNodeMemberList;
    }

    public List<TestingNode> getTestingNodeList() {
        return testingNodeList;
    }

    public void setTestingNodeList(List<TestingNode> testingNodeList) {
        this.testingNodeList = testingNodeList;
    }

    public TestingNode getPrimaryParentNodeId() {
        return primaryParentNodeId;
    }

    public void setPrimaryParentNodeId(TestingNode primaryParentNodeId) {
        this.primaryParentNodeId = primaryParentNodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testingNodeId != null ? testingNodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestingNode)) {
            return false;
        }
        TestingNode other = (TestingNode) object;
        if ((this.testingNodeId == null && other.testingNodeId != null) || (this.testingNodeId != null && !this.testingNodeId.equals(other.testingNodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestingNode[ testingNodeId=" + testingNodeId + " ]";
    }
    
}
