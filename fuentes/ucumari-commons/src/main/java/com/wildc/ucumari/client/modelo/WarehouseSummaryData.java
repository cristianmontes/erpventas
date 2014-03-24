/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "warehouse_summary_data")
@NamedQueries({
    @NamedQuery(name = "WarehouseSummaryData.findAll", query = "SELECT w FROM WarehouseSummaryData w")})
public class WarehouseSummaryData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Column(name = "REQUIRED_STOCK_MOVES")
    private BigInteger requiredStockMoves;
    @Column(name = "REQUESTED_INVENTORY_TRANSFERS")
    private BigInteger requestedInventoryTransfers;
    @Column(name = "NUMBER_BACK_ORDERS")
    private BigInteger numberBackOrders;
    @Column(name = "NUMBER_PRODUCTS_BACK_ORDERED")
    private BigInteger numberProductsBackOrdered;
    @Column(name = "ORDERS_READY_SHIP")
    private BigInteger ordersReadyShip;
    @Column(name = "OPEN_PICKLISTS")
    private BigInteger openPicklists;
    @Column(name = "PICKLISTS_SHIPPED")
    private BigInteger picklistsShipped;
    @Column(name = "NEW_PRODUCT_RUNS")
    private BigInteger newProductRuns;
    @Column(name = "SCHEDULED_PRODUCTION_RUNS")
    private BigInteger scheduledProductionRuns;
    @Column(name = "CONFIRMED_PRODUCTION_RUNS")
    private BigInteger confirmedProductionRuns;
    @Column(name = "ACTIVE_PRODUCTION_RUNS")
    private BigInteger activeProductionRuns;
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

    public WarehouseSummaryData() {
    }

    public WarehouseSummaryData(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public BigInteger getRequiredStockMoves() {
        return requiredStockMoves;
    }

    public void setRequiredStockMoves(BigInteger requiredStockMoves) {
        this.requiredStockMoves = requiredStockMoves;
    }

    public BigInteger getRequestedInventoryTransfers() {
        return requestedInventoryTransfers;
    }

    public void setRequestedInventoryTransfers(BigInteger requestedInventoryTransfers) {
        this.requestedInventoryTransfers = requestedInventoryTransfers;
    }

    public BigInteger getNumberBackOrders() {
        return numberBackOrders;
    }

    public void setNumberBackOrders(BigInteger numberBackOrders) {
        this.numberBackOrders = numberBackOrders;
    }

    public BigInteger getNumberProductsBackOrdered() {
        return numberProductsBackOrdered;
    }

    public void setNumberProductsBackOrdered(BigInteger numberProductsBackOrdered) {
        this.numberProductsBackOrdered = numberProductsBackOrdered;
    }

    public BigInteger getOrdersReadyShip() {
        return ordersReadyShip;
    }

    public void setOrdersReadyShip(BigInteger ordersReadyShip) {
        this.ordersReadyShip = ordersReadyShip;
    }

    public BigInteger getOpenPicklists() {
        return openPicklists;
    }

    public void setOpenPicklists(BigInteger openPicklists) {
        this.openPicklists = openPicklists;
    }

    public BigInteger getPicklistsShipped() {
        return picklistsShipped;
    }

    public void setPicklistsShipped(BigInteger picklistsShipped) {
        this.picklistsShipped = picklistsShipped;
    }

    public BigInteger getNewProductRuns() {
        return newProductRuns;
    }

    public void setNewProductRuns(BigInteger newProductRuns) {
        this.newProductRuns = newProductRuns;
    }

    public BigInteger getScheduledProductionRuns() {
        return scheduledProductionRuns;
    }

    public void setScheduledProductionRuns(BigInteger scheduledProductionRuns) {
        this.scheduledProductionRuns = scheduledProductionRuns;
    }

    public BigInteger getConfirmedProductionRuns() {
        return confirmedProductionRuns;
    }

    public void setConfirmedProductionRuns(BigInteger confirmedProductionRuns) {
        this.confirmedProductionRuns = confirmedProductionRuns;
    }

    public BigInteger getActiveProductionRuns() {
        return activeProductionRuns;
    }

    public void setActiveProductionRuns(BigInteger activeProductionRuns) {
        this.activeProductionRuns = activeProductionRuns;
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
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WarehouseSummaryData)) {
            return false;
        }
        WarehouseSummaryData other = (WarehouseSummaryData) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WarehouseSummaryData[ facilityId=" + facilityId + " ]";
    }
    
}
