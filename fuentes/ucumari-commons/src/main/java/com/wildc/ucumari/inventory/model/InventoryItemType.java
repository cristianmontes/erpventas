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
@Table(name = "inventory_item_type")
public class InventoryItemType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItemType")
    private List<InventoryItemTypeAttr> inventoryItemTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_TYPE_ID")
    private String inventoryItemTypeId;
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
    /*@OneToMany(mappedBy = "inventoryItemTypeId")
    private List<InventoryItem> inventoryItemList;
    @OneToMany(mappedBy = "defaultInventoryItemTypeId")
    private List<Facility> facilityList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<InventoryItemType> inventoryItemTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_TYPE_ID")
    @ManyToOne
    private InventoryItemType parentTypeId;*/

    public InventoryItemType() {
    }

    public InventoryItemType(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
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
    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }*/
/*
    public List<InventoryItemType> getInventoryItemTypeList() {
        return inventoryItemTypeList;
    }

    public void setInventoryItemTypeList(List<InventoryItemType> inventoryItemTypeList) {
        this.inventoryItemTypeList = inventoryItemTypeList;
    }

    public InventoryItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(InventoryItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTypeId != null ? inventoryItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemType)) {
            return false;
        }
        InventoryItemType other = (InventoryItemType) object;
        if ((this.inventoryItemTypeId == null && other.inventoryItemTypeId != null) || (this.inventoryItemTypeId != null && !this.inventoryItemTypeId.equals(other.inventoryItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemType[ inventoryItemTypeId=" + inventoryItemTypeId + " ]";
    }
/*
    public List<InventoryItemTypeAttr> getInventoryItemTypeAttrList() {
        return inventoryItemTypeAttrList;
    }

    public void setInventoryItemTypeAttrList(List<InventoryItemTypeAttr> inventoryItemTypeAttrList) {
        this.inventoryItemTypeAttrList = inventoryItemTypeAttrList;
    }*/
    
}
