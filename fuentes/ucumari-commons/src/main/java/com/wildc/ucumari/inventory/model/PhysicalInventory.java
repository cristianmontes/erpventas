/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "physical_inventory")
public class PhysicalInventory implements Serializable {
    /*@OneToMany(mappedBy = "physicalInventoryId")
    private List<InventoryItemDetail> inventoryItemDetailList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private String physicalInventoryId;
    @Column(name = "PHYSICAL_INVENTORY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date physicalInventoryDate;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "GENERAL_COMMENTS")
    private String generalComments;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "physicalInventory")
    private List<InventoryItemVariance> inventoryItemVarianceList;
    @OneToMany(mappedBy = "physicalInventoryId")
    private List<AcctgTrans> acctgTransList;*/

    public PhysicalInventory() {
    }

    public PhysicalInventory(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public Date getPhysicalInventoryDate() {
        return physicalInventoryDate;
    }

    public void setPhysicalInventoryDate(Date physicalInventoryDate) {
        this.physicalInventoryDate = physicalInventoryDate;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
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
/*
    public List<InventoryItemVariance> getInventoryItemVarianceList() {
        return inventoryItemVarianceList;
    }

    public void setInventoryItemVarianceList(List<InventoryItemVariance> inventoryItemVarianceList) {
        this.inventoryItemVarianceList = inventoryItemVarianceList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (physicalInventoryId != null ? physicalInventoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhysicalInventory)) {
            return false;
        }
        PhysicalInventory other = (PhysicalInventory) object;
        if ((this.physicalInventoryId == null && other.physicalInventoryId != null) || (this.physicalInventoryId != null && !this.physicalInventoryId.equals(other.physicalInventoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PhysicalInventory[ physicalInventoryId=" + physicalInventoryId + " ]";
    }
/*
    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }*/
    
}
