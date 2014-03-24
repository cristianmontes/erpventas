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

import com.wildc.ucumari.facility.model.Facility;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "container")
public class Container implements Serializable {
    /*@OneToMany(mappedBy = "containerIdTo")
    private List<InventoryTransfer> inventoryTransferList;
    @OneToMany(mappedBy = "containerId")
    private List<InventoryTransfer> inventoryTransferList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "container")
    private List<ContainerGeoPoint> containerGeoPointList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTAINER_ID")
    private String containerId;
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
    /*@OneToMany(mappedBy = "containerId")
    private List<InventoryItem> inventoryItemList;*/
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "CONTAINER_TYPE_ID", referencedColumnName = "CONTAINER_TYPE_ID")
    @ManyToOne
    private ContainerType containerTypeId;

    public Container() {
    }

    public Container(String containerId) {
        this.containerId = containerId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
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
    }*/

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public ContainerType getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(ContainerType containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (containerId != null ? containerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Container)) {
            return false;
        }
        Container other = (Container) object;
        if ((this.containerId == null && other.containerId != null) || (this.containerId != null && !this.containerId.equals(other.containerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Container[ containerId=" + containerId + " ]";
    }
/*
    public List<ContainerGeoPoint> getContainerGeoPointList() {
        return containerGeoPointList;
    }

    public void setContainerGeoPointList(List<ContainerGeoPoint> containerGeoPointList) {
        this.containerGeoPointList = containerGeoPointList;
    }

    public List<InventoryTransfer> getInventoryTransferList() {
        return inventoryTransferList;
    }

    public void setInventoryTransferList(List<InventoryTransfer> inventoryTransferList) {
        this.inventoryTransferList = inventoryTransferList;
    }

    public List<InventoryTransfer> getInventoryTransferList1() {
        return inventoryTransferList1;
    }

    public void setInventoryTransferList1(List<InventoryTransfer> inventoryTransferList1) {
        this.inventoryTransferList1 = inventoryTransferList1;
    }*/
    
}
