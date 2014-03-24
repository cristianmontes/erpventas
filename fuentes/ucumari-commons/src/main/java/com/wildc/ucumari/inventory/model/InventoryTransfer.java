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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.ItemIssuance;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_transfer")
@NamedQueries({
    @NamedQuery(name = "InventoryTransfer.findAll", query = "SELECT i FROM InventoryTransfer i")})
public class InventoryTransfer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_TRANSFER_ID")
    private String inventoryTransferId;
    @Column(name = "LOCATION_SEQ_ID")
    private String locationSeqId;
    @Column(name = "LOCATION_SEQ_ID_TO")
    private String locationSeqIdTo;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "RECEIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiveDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "FACILITY_ID_TO", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityIdTo;
    @JoinColumn(name = "CONTAINER_ID_TO", referencedColumnName = "CONTAINER_ID")
    @ManyToOne
    private Container containerIdTo;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    @JoinColumn(name = "ITEM_ISSUANCE_ID", referencedColumnName = "ITEM_ISSUANCE_ID")
    @ManyToOne
    private ItemIssuance itemIssuanceId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "CONTAINER_ID", referencedColumnName = "CONTAINER_ID")
    @ManyToOne
    private Container containerId;

    public InventoryTransfer() {
    }

    public InventoryTransfer(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId;
    }

    public String getInventoryTransferId() {
        return inventoryTransferId;
    }

    public void setInventoryTransferId(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    public String getLocationSeqIdTo() {
        return locationSeqIdTo;
    }

    public void setLocationSeqIdTo(String locationSeqIdTo) {
        this.locationSeqIdTo = locationSeqIdTo;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public Facility getFacilityIdTo() {
        return facilityIdTo;
    }

    public void setFacilityIdTo(Facility facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

    public Container getContainerIdTo() {
        return containerIdTo;
    }

    public void setContainerIdTo(Container containerIdTo) {
        this.containerIdTo = containerIdTo;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public ItemIssuance getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(ItemIssuance itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Container getContainerId() {
        return containerId;
    }

    public void setContainerId(Container containerId) {
        this.containerId = containerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryTransferId != null ? inventoryTransferId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryTransfer)) {
            return false;
        }
        InventoryTransfer other = (InventoryTransfer) object;
        if ((this.inventoryTransferId == null && other.inventoryTransferId != null) || (this.inventoryTransferId != null && !this.inventoryTransferId.equals(other.inventoryTransferId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryTransfer[ inventoryTransferId=" + inventoryTransferId + " ]";
    }
    
}
