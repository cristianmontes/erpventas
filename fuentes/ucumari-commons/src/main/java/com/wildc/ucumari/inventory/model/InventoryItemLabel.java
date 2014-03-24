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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item_label")
public class InventoryItemLabel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_LABEL_ID")
    private String inventoryItemLabelId;
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
    /*@OneToMany(mappedBy = "inventoryItemLabelId")
    private List<InventoryItemLabelAppl> inventoryItemLabelApplList;*/
    @JoinColumn(name = "INVENTORY_ITEM_LABEL_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_LABEL_TYPE_ID")
    @ManyToOne
    private InventoryItemLabelType inventoryItemLabelTypeId;

    public InventoryItemLabel() {
    }

    public InventoryItemLabel(String inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId;
    }

    public String getInventoryItemLabelId() {
        return inventoryItemLabelId;
    }

    public void setInventoryItemLabelId(String inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId;
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
/*
    public List<InventoryItemLabelAppl> getInventoryItemLabelApplList() {
        return inventoryItemLabelApplList;
    }

    public void setInventoryItemLabelApplList(List<InventoryItemLabelAppl> inventoryItemLabelApplList) {
        this.inventoryItemLabelApplList = inventoryItemLabelApplList;
    }*/

    public InventoryItemLabelType getInventoryItemLabelTypeId() {
        return inventoryItemLabelTypeId;
    }

    public void setInventoryItemLabelTypeId(InventoryItemLabelType inventoryItemLabelTypeId) {
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemLabelId != null ? inventoryItemLabelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemLabel)) {
            return false;
        }
        InventoryItemLabel other = (InventoryItemLabel) object;
        if ((this.inventoryItemLabelId == null && other.inventoryItemLabelId != null) || (this.inventoryItemLabelId != null && !this.inventoryItemLabelId.equals(other.inventoryItemLabelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemLabel[ inventoryItemLabelId=" + inventoryItemLabelId + " ]";
    }
    
}
