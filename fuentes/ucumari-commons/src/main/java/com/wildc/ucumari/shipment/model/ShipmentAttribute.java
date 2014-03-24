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
@Table(name = "shipment_attribute")
@NamedQueries({
    @NamedQuery(name = "ShipmentAttribute.findAll", query = "SELECT s FROM ShipmentAttribute s")})
public class ShipmentAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentAttributePK shipmentAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;

    public ShipmentAttribute() {
    }

    public ShipmentAttribute(ShipmentAttributePK shipmentAttributePK) {
        this.shipmentAttributePK = shipmentAttributePK;
    }

    public ShipmentAttribute(String shipmentId, String attrName) {
        this.shipmentAttributePK = new ShipmentAttributePK(shipmentId, attrName);
    }

    public ShipmentAttributePK getShipmentAttributePK() {
        return shipmentAttributePK;
    }

    public void setShipmentAttributePK(ShipmentAttributePK shipmentAttributePK) {
        this.shipmentAttributePK = shipmentAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentAttributePK != null ? shipmentAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentAttribute)) {
            return false;
        }
        ShipmentAttribute other = (ShipmentAttribute) object;
        if ((this.shipmentAttributePK == null && other.shipmentAttributePK != null) || (this.shipmentAttributePK != null && !this.shipmentAttributePK.equals(other.shipmentAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentAttribute[ shipmentAttributePK=" + shipmentAttributePK + " ]";
    }
    
}
