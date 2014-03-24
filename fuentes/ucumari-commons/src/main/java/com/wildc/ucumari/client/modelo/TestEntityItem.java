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
@Table(name = "test_entity_item")
@NamedQueries({
    @NamedQuery(name = "TestEntityItem.findAll", query = "SELECT t FROM TestEntityItem t")})
public class TestEntityItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TestEntityItemPK testEntityItemPK;
    @Column(name = "ITEM_VALUE")
    private String itemValue;
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
    @JoinColumn(name = "TEST_ENTITY_ID", referencedColumnName = "TEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TestEntity testEntity;

    public TestEntityItem() {
    }

    public TestEntityItem(TestEntityItemPK testEntityItemPK) {
        this.testEntityItemPK = testEntityItemPK;
    }

    public TestEntityItem(String testEntityId, String testEntityItemSeqId) {
        this.testEntityItemPK = new TestEntityItemPK(testEntityId, testEntityItemSeqId);
    }

    public TestEntityItemPK getTestEntityItemPK() {
        return testEntityItemPK;
    }

    public void setTestEntityItemPK(TestEntityItemPK testEntityItemPK) {
        this.testEntityItemPK = testEntityItemPK;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
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

    public TestEntity getTestEntity() {
        return testEntity;
    }

    public void setTestEntity(TestEntity testEntity) {
        this.testEntity = testEntity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testEntityItemPK != null ? testEntityItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestEntityItem)) {
            return false;
        }
        TestEntityItem other = (TestEntityItem) object;
        if ((this.testEntityItemPK == null && other.testEntityItemPK != null) || (this.testEntityItemPK != null && !this.testEntityItemPK.equals(other.testEntityItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestEntityItem[ testEntityItemPK=" + testEntityItemPK + " ]";
    }
    
}
