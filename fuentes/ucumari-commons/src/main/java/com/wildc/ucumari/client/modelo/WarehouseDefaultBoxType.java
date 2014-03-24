/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "warehouse_default_box_type")
@NamedQueries({
    @NamedQuery(name = "WarehouseDefaultBoxType.findAll", query = "SELECT w FROM WarehouseDefaultBoxType w")})
public class WarehouseDefaultBoxType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WarehouseDefaultBoxTypePK warehouseDefaultBoxTypePK;
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
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_BOX_TYPE_ID", referencedColumnName = "SHIPMENT_BOX_TYPE_ID"),
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CarrierShipmentBoxType carrierShipmentBoxType;

    public WarehouseDefaultBoxType() {
    }

    public WarehouseDefaultBoxType(WarehouseDefaultBoxTypePK warehouseDefaultBoxTypePK) {
        this.warehouseDefaultBoxTypePK = warehouseDefaultBoxTypePK;
    }

    public WarehouseDefaultBoxType(String facilityId, String partyId) {
        this.warehouseDefaultBoxTypePK = new WarehouseDefaultBoxTypePK(facilityId, partyId);
    }

    public WarehouseDefaultBoxTypePK getWarehouseDefaultBoxTypePK() {
        return warehouseDefaultBoxTypePK;
    }

    public void setWarehouseDefaultBoxTypePK(WarehouseDefaultBoxTypePK warehouseDefaultBoxTypePK) {
        this.warehouseDefaultBoxTypePK = warehouseDefaultBoxTypePK;
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

    public CarrierShipmentBoxType getCarrierShipmentBoxType() {
        return carrierShipmentBoxType;
    }

    public void setCarrierShipmentBoxType(CarrierShipmentBoxType carrierShipmentBoxType) {
        this.carrierShipmentBoxType = carrierShipmentBoxType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (warehouseDefaultBoxTypePK != null ? warehouseDefaultBoxTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WarehouseDefaultBoxType)) {
            return false;
        }
        WarehouseDefaultBoxType other = (WarehouseDefaultBoxType) object;
        if ((this.warehouseDefaultBoxTypePK == null && other.warehouseDefaultBoxTypePK != null) || (this.warehouseDefaultBoxTypePK != null && !this.warehouseDefaultBoxTypePK.equals(other.warehouseDefaultBoxTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WarehouseDefaultBoxType[ warehouseDefaultBoxTypePK=" + warehouseDefaultBoxTypePK + " ]";
    }
    
}
