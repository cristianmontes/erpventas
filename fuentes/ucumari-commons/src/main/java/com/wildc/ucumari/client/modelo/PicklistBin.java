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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.order.model.OrderItemShipGroup;
import com.wildc.ucumari.shipment.model.Shipment;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "picklist_bin")
@NamedQueries({
    @NamedQuery(name = "PicklistBin.findAll", query = "SELECT p FROM PicklistBin p")})
public class PicklistBin implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "picklistBin")
    private List<PicklistItem> picklistItemList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PICKLIST_BIN_ID")
    private String picklistBinId;
    @Column(name = "BIN_LOCATION_NUMBER")
    private BigInteger binLocationNumber;
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
    @OneToMany(mappedBy = "picklistBinId")
    private List<Shipment> shipmentList;
    @JoinColumn(name = "PICKLIST_ID", referencedColumnName = "PICKLIST_ID")
    @ManyToOne
    private Picklist picklistId;
    @JoinColumns({
        @JoinColumn(name = "PRIMARY_ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "PRIMARY_SHIP_GROUP_SEQ_ID", referencedColumnName = "SHIP_GROUP_SEQ_ID")})
    @ManyToOne
    private OrderItemShipGroup orderItemShipGroup;

    public PicklistBin() {
    }

    public PicklistBin(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public BigInteger getBinLocationNumber() {
        return binLocationNumber;
    }

    public void setBinLocationNumber(BigInteger binLocationNumber) {
        this.binLocationNumber = binLocationNumber;
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

    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public Picklist getPicklistId() {
        return picklistId;
    }

    public void setPicklistId(Picklist picklistId) {
        this.picklistId = picklistId;
    }

    public OrderItemShipGroup getOrderItemShipGroup() {
        return orderItemShipGroup;
    }

    public void setOrderItemShipGroup(OrderItemShipGroup orderItemShipGroup) {
        this.orderItemShipGroup = orderItemShipGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistBinId != null ? picklistBinId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PicklistBin)) {
            return false;
        }
        PicklistBin other = (PicklistBin) object;
        if ((this.picklistBinId == null && other.picklistBinId != null) || (this.picklistBinId != null && !this.picklistBinId.equals(other.picklistBinId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PicklistBin[ picklistBinId=" + picklistBinId + " ]";
    }

    public List<PicklistItem> getPicklistItemList() {
        return picklistItemList;
    }

    public void setPicklistItemList(List<PicklistItem> picklistItemList) {
        this.picklistItemList = picklistItemList;
    }
    
}
