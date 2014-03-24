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
public class TestEntityItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TEST_ENTITY_ID")
    private String testEntityId;
    @Basic(optional = false)
    @Column(name = "TEST_ENTITY_ITEM_SEQ_ID")
    private String testEntityItemSeqId;

    public TestEntityItemPK() {
    }

    public TestEntityItemPK(String testEntityId, String testEntityItemSeqId) {
        this.testEntityId = testEntityId;
        this.testEntityItemSeqId = testEntityItemSeqId;
    }

    public String getTestEntityId() {
        return testEntityId;
    }

    public void setTestEntityId(String testEntityId) {
        this.testEntityId = testEntityId;
    }

    public String getTestEntityItemSeqId() {
        return testEntityItemSeqId;
    }

    public void setTestEntityItemSeqId(String testEntityItemSeqId) {
        this.testEntityItemSeqId = testEntityItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testEntityId != null ? testEntityId.hashCode() : 0);
        hash += (testEntityItemSeqId != null ? testEntityItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestEntityItemPK)) {
            return false;
        }
        TestEntityItemPK other = (TestEntityItemPK) object;
        if ((this.testEntityId == null && other.testEntityId != null) || (this.testEntityId != null && !this.testEntityId.equals(other.testEntityId))) {
            return false;
        }
        if ((this.testEntityItemSeqId == null && other.testEntityItemSeqId != null) || (this.testEntityItemSeqId != null && !this.testEntityItemSeqId.equals(other.testEntityItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestEntityItemPK[ testEntityId=" + testEntityId + ", testEntityItemSeqId=" + testEntityItemSeqId + " ]";
    }
    
}
