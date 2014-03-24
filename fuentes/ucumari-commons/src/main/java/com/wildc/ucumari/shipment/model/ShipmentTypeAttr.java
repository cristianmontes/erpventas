/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "shipment_type_attr")
@NamedQueries({
    @NamedQuery(name = "ShipmentTypeAttr.findAll", query = "SELECT s FROM ShipmentTypeAttr s")})
public class ShipmentTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentTypeAttrPK shipmentTypeAttrPK;
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
    @JoinColumn(name = "SHIPMENT_TYPE_ID", referencedColumnName = "SHIPMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentType shipmentType;

    public ShipmentTypeAttr() {
    }

    public ShipmentTypeAttr(ShipmentTypeAttrPK shipmentTypeAttrPK) {
        this.shipmentTypeAttrPK = shipmentTypeAttrPK;
    }

    public ShipmentTypeAttr(String shipmentTypeId, String attrName) {
        this.shipmentTypeAttrPK = new ShipmentTypeAttrPK(shipmentTypeId, attrName);
    }

    public ShipmentTypeAttrPK getShipmentTypeAttrPK() {
        return shipmentTypeAttrPK;
    }

    public void setShipmentTypeAttrPK(ShipmentTypeAttrPK shipmentTypeAttrPK) {
        this.shipmentTypeAttrPK = shipmentTypeAttrPK;
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

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentTypeAttrPK != null ? shipmentTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentTypeAttr)) {
            return false;
        }
        ShipmentTypeAttr other = (ShipmentTypeAttr) object;
        if ((this.shipmentTypeAttrPK == null && other.shipmentTypeAttrPK != null) || (this.shipmentTypeAttrPK != null && !this.shipmentTypeAttrPK.equals(other.shipmentTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentTypeAttr[ shipmentTypeAttrPK=" + shipmentTypeAttrPK + " ]";
    }
    
}
