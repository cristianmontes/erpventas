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
@Table(name = "warehouse_summary_pick_move")
@NamedQueries({
    @NamedQuery(name = "WarehouseSummaryPickMove.findAll", query = "SELECT w FROM WarehouseSummaryPickMove w")})
public class WarehouseSummaryPickMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WSPICKMOVE_ID")
    private String wspickmoveId;
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Column(name = "SHIPMENT_METHOD_TYPE")
    private String shipmentMethodType;
    @Column(name = "ORDER_READY_TO_PICK_INFO")
    private BigInteger orderReadyToPickInfo;
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

    public WarehouseSummaryPickMove() {
    }

    public WarehouseSummaryPickMove(String wspickmoveId) {
        this.wspickmoveId = wspickmoveId;
    }

    public String getWspickmoveId() {
        return wspickmoveId;
    }

    public void setWspickmoveId(String wspickmoveId) {
        this.wspickmoveId = wspickmoveId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getShipmentMethodType() {
        return shipmentMethodType;
    }

    public void setShipmentMethodType(String shipmentMethodType) {
        this.shipmentMethodType = shipmentMethodType;
    }

    public BigInteger getOrderReadyToPickInfo() {
        return orderReadyToPickInfo;
    }

    public void setOrderReadyToPickInfo(BigInteger orderReadyToPickInfo) {
        this.orderReadyToPickInfo = orderReadyToPickInfo;
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
        hash += (wspickmoveId != null ? wspickmoveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WarehouseSummaryPickMove)) {
            return false;
        }
        WarehouseSummaryPickMove other = (WarehouseSummaryPickMove) object;
        if ((this.wspickmoveId == null && other.wspickmoveId != null) || (this.wspickmoveId != null && !this.wspickmoveId.equals(other.wspickmoveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WarehouseSummaryPickMove[ wspickmoveId=" + wspickmoveId + " ]";
    }
    
}
