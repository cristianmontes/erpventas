/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "testing")
@NamedQueries({
    @NamedQuery(name = "Testing.findAll", query = "SELECT t FROM Testing t")})
public class Testing implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TESTING_ID")
    private String testingId;
    @Column(name = "TESTING_NAME")
    private String testingName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "TESTING_SIZE")
    private BigInteger testingSize;
    @Column(name = "TESTING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testingDate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testing")
    private List<TestingNodeMember> testingNodeMemberList;
    @JoinColumn(name = "TESTING_TYPE_ID", referencedColumnName = "TESTING_TYPE_ID")
    @ManyToOne
    private TestingType testingTypeId;

    public Testing() {
    }

    public Testing(String testingId) {
        this.testingId = testingId;
    }

    public String getTestingId() {
        return testingId;
    }

    public void setTestingId(String testingId) {
        this.testingId = testingId;
    }

    public String getTestingName() {
        return testingName;
    }

    public void setTestingName(String testingName) {
        this.testingName = testingName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigInteger getTestingSize() {
        return testingSize;
    }

    public void setTestingSize(BigInteger testingSize) {
        this.testingSize = testingSize;
    }

    public Date getTestingDate() {
        return testingDate;
    }

    public void setTestingDate(Date testingDate) {
        this.testingDate = testingDate;
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

    public TestingType getTestingTypeId() {
        return testingTypeId;
    }

    public void setTestingTypeId(TestingType testingTypeId) {
        this.testingTypeId = testingTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testingId != null ? testingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Testing)) {
            return false;
        }
        Testing other = (Testing) object;
        if ((this.testingId == null && other.testingId != null) || (this.testingId != null && !this.testingId.equals(other.testingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Testing[ testingId=" + testingId + " ]";
    }
    
}
