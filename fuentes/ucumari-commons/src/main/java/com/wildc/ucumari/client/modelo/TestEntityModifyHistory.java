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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "test_entity_modify_history")
@NamedQueries({
    @NamedQuery(name = "TestEntityModifyHistory.findAll", query = "SELECT t FROM TestEntityModifyHistory t")})
public class TestEntityModifyHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEST_ENTITY_HISTORY_ID")
    private String testEntityHistoryId;
    @Column(name = "TEST_ID")
    private String testId;
    @Column(name = "MODIFY_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyTimestamp;
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

    public TestEntityModifyHistory() {
    }

    public TestEntityModifyHistory(String testEntityHistoryId) {
        this.testEntityHistoryId = testEntityHistoryId;
    }

    public String getTestEntityHistoryId() {
        return testEntityHistoryId;
    }

    public void setTestEntityHistoryId(String testEntityHistoryId) {
        this.testEntityHistoryId = testEntityHistoryId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Date getModifyTimestamp() {
        return modifyTimestamp;
    }

    public void setModifyTimestamp(Date modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testEntityHistoryId != null ? testEntityHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestEntityModifyHistory)) {
            return false;
        }
        TestEntityModifyHistory other = (TestEntityModifyHistory) object;
        if ((this.testEntityHistoryId == null && other.testEntityHistoryId != null) || (this.testEntityHistoryId != null && !this.testEntityHistoryId.equals(other.testEntityHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestEntityModifyHistory[ testEntityHistoryId=" + testEntityHistoryId + " ]";
    }
    
}
