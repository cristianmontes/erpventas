/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.shipment.model.ShipmentRouteSegment;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "delivery")
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d")})
public class Delivery implements Serializable {
    @OneToMany(mappedBy = "deliveryId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DELIVERY_ID")
    private String deliveryId;
    @Column(name = "ACTUAL_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualStartDate;
    @Column(name = "ACTUAL_ARRIVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualArrivalDate;
    @Column(name = "ESTIMATED_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedStartDate;
    @Column(name = "ESTIMATED_ARRIVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedArrivalDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "START_MILEAGE")
    private BigDecimal startMileage;
    @Column(name = "END_MILEAGE")
    private BigDecimal endMileage;
    @Column(name = "FUEL_USED")
    private BigDecimal fuelUsed;
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
    @JoinColumn(name = "ORIGIN_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility originFacilityId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "DEST_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility destFacilityId;

    public Delivery() {
    }

    public Delivery(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(Date actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public Date getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(Date estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public Date getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public BigDecimal getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(BigDecimal startMileage) {
        this.startMileage = startMileage;
    }

    public BigDecimal getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(BigDecimal endMileage) {
        this.endMileage = endMileage;
    }

    public BigDecimal getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(BigDecimal fuelUsed) {
        this.fuelUsed = fuelUsed;
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

    public Facility getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(Facility originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public FixedAsset getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(FixedAsset fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public Facility getDestFacilityId() {
        return destFacilityId;
    }

    public void setDestFacilityId(Facility destFacilityId) {
        this.destFacilityId = destFacilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryId != null ? deliveryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryId == null && other.deliveryId != null) || (this.deliveryId != null && !this.deliveryId.equals(other.deliveryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Delivery[ deliveryId=" + deliveryId + " ]";
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }
    
}
