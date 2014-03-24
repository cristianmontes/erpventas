/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "shipment_method_type")

public class ShipmentMethodType implements Serializable {
    /*@OneToMany(mappedBy = "shipmentMethodTypeId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentMethodType")
    private List<ProductStoreVendorShipment> productStoreVendorShipmentList;
    */
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_METHOD_TYPE_ID")
    private String shipmentMethodTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    /*@OneToMany(mappedBy = "shipmentMethodTypeId")
    private List<Picklist> picklistList;
    @OneToMany(mappedBy = "defaultShipMethodId")
    private List<ProductStore> productStoreList;
    @OneToMany(mappedBy = "shipmentMethodTypeId")
    private List<CarrierReturnService> carrierReturnServiceList;
    @OneToMany(mappedBy = "shipmentMethodTypeId")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentMethodType")
    private List<CarrierShipmentMethod> carrierShipmentMethodList;*/
    

    public ShipmentMethodType() {
    }

    public ShipmentMethodType(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public List<Picklist> getPicklistList() {
        return picklistList;
    }

    public void setPicklistList(List<Picklist> picklistList) {
        this.picklistList = picklistList;
    }

    public List<ProductStore> getProductStoreList() {
        return productStoreList;
    }

    public void setProductStoreList(List<ProductStore> productStoreList) {
        this.productStoreList = productStoreList;
    }

    public List<CarrierReturnService> getCarrierReturnServiceList() {
        return carrierReturnServiceList;
    }

    public void setCarrierReturnServiceList(List<CarrierReturnService> carrierReturnServiceList) {
        this.carrierReturnServiceList = carrierReturnServiceList;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<CarrierShipmentMethod> getCarrierShipmentMethodList() {
        return carrierShipmentMethodList;
    }

    public void setCarrierShipmentMethodList(List<CarrierShipmentMethod> carrierShipmentMethodList) {
        this.carrierShipmentMethodList = carrierShipmentMethodList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentMethodTypeId != null ? shipmentMethodTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentMethodType)) {
            return false;
        }
        ShipmentMethodType other = (ShipmentMethodType) object;
        if ((this.shipmentMethodTypeId == null && other.shipmentMethodTypeId != null) || (this.shipmentMethodTypeId != null && !this.shipmentMethodTypeId.equals(other.shipmentMethodTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentMethodType[ shipmentMethodTypeId=" + shipmentMethodTypeId + " ]";
    }
/*
    public List<ProductStoreVendorShipment> getProductStoreVendorShipmentList() {
        return productStoreVendorShipmentList;
    }

    public void setProductStoreVendorShipmentList(List<ProductStoreVendorShipment> productStoreVendorShipmentList) {
        this.productStoreVendorShipmentList = productStoreVendorShipmentList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }*/
    
}
