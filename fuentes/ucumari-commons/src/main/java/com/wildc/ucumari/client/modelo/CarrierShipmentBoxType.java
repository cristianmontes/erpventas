/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.shipment.model.ShipmentBoxType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "carrier_shipment_box_type")
@NamedQueries({
    @NamedQuery(name = "CarrierShipmentBoxType.findAll", query = "SELECT c FROM CarrierShipmentBoxType c")})
public class CarrierShipmentBoxType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrierShipmentBoxType")
    private List<WarehouseDefaultBoxType> warehouseDefaultBoxTypeList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CarrierShipmentBoxTypePK carrierShipmentBoxTypePK;
    @Column(name = "PACKAGING_TYPE_CODE")
    private String packagingTypeCode;
    @Column(name = "OVERSIZE_CODE")
    private String oversizeCode;
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
    @JoinColumn(name = "SHIPMENT_BOX_TYPE_ID", referencedColumnName = "SHIPMENT_BOX_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentBoxType shipmentBoxType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public CarrierShipmentBoxType() {
    }

    public CarrierShipmentBoxType(CarrierShipmentBoxTypePK carrierShipmentBoxTypePK) {
        this.carrierShipmentBoxTypePK = carrierShipmentBoxTypePK;
    }

    public CarrierShipmentBoxType(String shipmentBoxTypeId, String partyId) {
        this.carrierShipmentBoxTypePK = new CarrierShipmentBoxTypePK(shipmentBoxTypeId, partyId);
    }

    public CarrierShipmentBoxTypePK getCarrierShipmentBoxTypePK() {
        return carrierShipmentBoxTypePK;
    }

    public void setCarrierShipmentBoxTypePK(CarrierShipmentBoxTypePK carrierShipmentBoxTypePK) {
        this.carrierShipmentBoxTypePK = carrierShipmentBoxTypePK;
    }

    public String getPackagingTypeCode() {
        return packagingTypeCode;
    }

    public void setPackagingTypeCode(String packagingTypeCode) {
        this.packagingTypeCode = packagingTypeCode;
    }

    public String getOversizeCode() {
        return oversizeCode;
    }

    public void setOversizeCode(String oversizeCode) {
        this.oversizeCode = oversizeCode;
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

    public ShipmentBoxType getShipmentBoxType() {
        return shipmentBoxType;
    }

    public void setShipmentBoxType(ShipmentBoxType shipmentBoxType) {
        this.shipmentBoxType = shipmentBoxType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carrierShipmentBoxTypePK != null ? carrierShipmentBoxTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrierShipmentBoxType)) {
            return false;
        }
        CarrierShipmentBoxType other = (CarrierShipmentBoxType) object;
        if ((this.carrierShipmentBoxTypePK == null && other.carrierShipmentBoxTypePK != null) || (this.carrierShipmentBoxTypePK != null && !this.carrierShipmentBoxTypePK.equals(other.carrierShipmentBoxTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CarrierShipmentBoxType[ carrierShipmentBoxTypePK=" + carrierShipmentBoxTypePK + " ]";
    }

    public List<WarehouseDefaultBoxType> getWarehouseDefaultBoxTypeList() {
        return warehouseDefaultBoxTypeList;
    }

    public void setWarehouseDefaultBoxTypeList(List<WarehouseDefaultBoxType> warehouseDefaultBoxTypeList) {
        this.warehouseDefaultBoxTypeList = warehouseDefaultBoxTypeList;
    }
    
}
