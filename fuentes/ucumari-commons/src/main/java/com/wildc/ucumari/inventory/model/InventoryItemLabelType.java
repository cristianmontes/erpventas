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
@Table(name = "inventory_item_label_type")
public class InventoryItemLabelType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_LABEL_TYPE_ID")
    private String inventoryItemLabelTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItemLabelType")
    private List<InventoryItemLabelAppl> inventoryItemLabelApplList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<InventoryItemLabelType> inventoryItemLabelTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_LABEL_TYPE_ID")
    @ManyToOne
    private InventoryItemLabelType parentTypeId;
    /*@OneToMany(mappedBy = "inventoryItemLabelTypeId")
    private List<InventoryItemLabel> inventoryItemLabelList;*/

    public InventoryItemLabelType() {
    }

    public InventoryItemLabelType(String inventoryItemLabelTypeId) {
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId;
    }

    public String getInventoryItemLabelTypeId() {
        return inventoryItemLabelTypeId;
    }

    public void setInventoryItemLabelTypeId(String inventoryItemLabelTypeId) {
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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
    }

    public List<InventoryItemLabelType> getInventoryItemLabelTypeList() {
        return inventoryItemLabelTypeList;
    }

    public void setInventoryItemLabelTypeList(List<InventoryItemLabelType> inventoryItemLabelTypeList) {
        this.inventoryItemLabelTypeList = inventoryItemLabelTypeList;
    }*/

    public InventoryItemLabelType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(InventoryItemLabelType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<InventoryItemLabel> getInventoryItemLabelList() {
        return inventoryItemLabelList;
    }

    public void setInventoryItemLabelList(List<InventoryItemLabel> inventoryItemLabelList) {
        this.inventoryItemLabelList = inventoryItemLabelList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemLabelTypeId != null ? inventoryItemLabelTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemLabelType)) {
            return false;
        }
        InventoryItemLabelType other = (InventoryItemLabelType) object;
        if ((this.inventoryItemLabelTypeId == null && other.inventoryItemLabelTypeId != null) || (this.inventoryItemLabelTypeId != null && !this.inventoryItemLabelTypeId.equals(other.inventoryItemLabelTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemLabelType[ inventoryItemLabelTypeId=" + inventoryItemLabelTypeId + " ]";
    }
    
}
