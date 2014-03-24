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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_contact_mech")

public class ShipmentContactMech implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentContactMechPK shipmentContactMechPK;
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
    @JoinColumn(name = "SHIPMENT_CONTACT_MECH_TYPE_ID", referencedColumnName = "SHIPMENT_CONTACT_MECH_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentContactMechType shipmentContactMechType;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;

    public ShipmentContactMech() {
    }

    public ShipmentContactMech(ShipmentContactMechPK shipmentContactMechPK) {
        this.shipmentContactMechPK = shipmentContactMechPK;
    }

    public ShipmentContactMech(String shipmentId, String shipmentContactMechTypeId) {
        this.shipmentContactMechPK = new ShipmentContactMechPK(shipmentId, shipmentContactMechTypeId);
    }

    public ShipmentContactMechPK getShipmentContactMechPK() {
        return shipmentContactMechPK;
    }

    public void setShipmentContactMechPK(ShipmentContactMechPK shipmentContactMechPK) {
        this.shipmentContactMechPK = shipmentContactMechPK;
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

    public ShipmentContactMechType getShipmentContactMechType() {
        return shipmentContactMechType;
    }

    public void setShipmentContactMechType(ShipmentContactMechType shipmentContactMechType) {
        this.shipmentContactMechType = shipmentContactMechType;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
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
        hash += (shipmentContactMechPK != null ? shipmentContactMechPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentContactMech)) {
            return false;
        }
        ShipmentContactMech other = (ShipmentContactMech) object;
        if ((this.shipmentContactMechPK == null && other.shipmentContactMechPK != null) || (this.shipmentContactMechPK != null && !this.shipmentContactMechPK.equals(other.shipmentContactMechPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentContactMech[ shipmentContactMechPK=" + shipmentContactMechPK + " ]";
    }
    
}
